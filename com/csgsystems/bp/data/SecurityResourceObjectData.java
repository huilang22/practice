/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SecurityResourceObjectData.java
 * Definition File: Admin/SecurityResource.xml
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
  
/** SecurityResourceObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class SecurityResourceObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public SecurityResourceObjectKeyData Key = null;
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
  /** SEC_MASTER_RESOURCE.mr_id field */
  public    BigInteger MrId  = null;
  protected boolean _MrIdSet = false;
  /** SEC_MASTER_RESOURCE.mr_name field */
  public    String MrName  = null;
  protected boolean _MrNameSet = false;
  /** SEC_MASTER_RESOURCE.mr_canonical_name field */
  public    String MrCanonicalName  = null;
  protected boolean _MrCanonicalNameSet = false;
  /** SEC_MASTER_RESOURCE.mr_resource_realm field */
  public    String MrResourceRealm  = null;
  protected boolean _MrResourceRealmSet = false;
  /** SEC_MASTER_RESOURCE.mr_resource_type field */
  public    String MrResourceType  = null;
  protected boolean _MrResourceTypeSet = false;
  /** SEC_MASTER_RESOURCE.mr_actions field */
  public    String MrActions  = null;
  protected boolean _MrActionsSet = false;
  /** SEC_SUB_SYSTEM.sub_id field */
  public    BigInteger SubId  = null;
  protected boolean _SubIdSet = false;
  /** SEC_SUB_SYSTEM.sub_name field */
  public    String SubName  = null;
  protected boolean _SubNameSet = false;
  /** SEC_SUB_SYSTEM.sub_rar_id field */
  public    BigInteger SubRarId  = null;
  protected boolean _SubRarIdSet = false;
  /** SEC_SUB_SYSTEM.sub_parent_id field */
  public    BigInteger SubParentId  = null;
  protected boolean _SubParentIdSet = false;
  /** SEC_SUB_SYSTEM.sub_update_count field */
  public    BigInteger SubUpdateCount  = null;
  protected boolean _SubUpdateCountSet = false;
  /** SEC_SUB_SYSTEM.sub_create_date field */
  public    Date SubCreateDate  = null;
  protected boolean _SubCreateDateSet = false;
  /** SEC_SUB_SYSTEM.sub_modify_date field */
  public    Date SubModifyDate  = null;
  protected boolean _SubModifyDateSet = false;
  /** SEC_SUB_SYSTEM.sub_modify_user field */
  public    String SubModifyUser  = null;
  protected boolean _SubModifyUserSet = false;
  /** SEC_RESOURCE_TYPE.rty_id field */
  public    BigInteger RtyId  = null;
  protected boolean _RtyIdSet = false;
  /** SEC_RESOURCE_TYPE.rty_name field */
  public    String RtyName  = null;
  protected boolean _RtyNameSet = false;
  /** SEC_RESOURCE_TYPE.rty_update_count field */
  public    BigInteger RtyUpdateCount  = null;
  protected boolean _RtyUpdateCountSet = false;
  /** SEC_RESOURCE_TYPE.rty_create_date field */
  public    Date RtyCreateDate  = null;
  protected boolean _RtyCreateDateSet = false;
  /** SEC_RESOURCE_TYPE.rty_modify_date field */
  public    Date RtyModifyDate  = null;
  protected boolean _RtyModifyDateSet = false;
  /** SEC_RESOURCE_TYPE.rty_modify_user field */
  public    String RtyModifyUser  = null;
  protected boolean _RtyModifyUserSet = false;
  /** SEC_RESOURCE_REALM.rar_id field */
  public    BigInteger RarId  = null;
  protected boolean _RarIdSet = false;
  /** SEC_RESOURCE_REALM.rar_name field */
  public    String RarName  = null;
  protected boolean _RarNameSet = false;
  /** SEC_RESOURCE_REALM.rar_update_count field */
  public    BigInteger RarUpdateCount  = null;
  protected boolean _RarUpdateCountSet = false;
  /** SEC_RESOURCE_REALM.rar_create_date field */
  public    Date RarCreateDate  = null;
  protected boolean _RarCreateDateSet = false;
  /** SEC_RESOURCE_REALM.rar_modify_date field */
  public    Date RarModifyDate  = null;
  protected boolean _RarModifyDateSet = false;
  /** SEC_RESOURCE_REALM.rar_modify_user field */
  public    String RarModifyUser  = null;
  protected boolean _RarModifyUserSet = false;
  private String _objName = "SecurityResourceObjectData";
  /** Default constructor */
  public SecurityResourceObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public SecurityResourceObjectData (SecurityResourceObjectData other)
  {

    if (other == null) return;
    this.Key = new SecurityResourceObjectKeyData (other.Key);
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
    this.MrId = other.MrId;
    this._MrIdSet = other._MrIdSet;
    this.MrName = other.MrName;
    this._MrNameSet = other._MrNameSet;
    this.MrCanonicalName = other.MrCanonicalName;
    this._MrCanonicalNameSet = other._MrCanonicalNameSet;
    this.MrResourceRealm = other.MrResourceRealm;
    this._MrResourceRealmSet = other._MrResourceRealmSet;
    this.MrResourceType = other.MrResourceType;
    this._MrResourceTypeSet = other._MrResourceTypeSet;
    this.MrActions = other.MrActions;
    this._MrActionsSet = other._MrActionsSet;
    this.SubId = other.SubId;
    this._SubIdSet = other._SubIdSet;
    this.SubName = other.SubName;
    this._SubNameSet = other._SubNameSet;
    this.SubRarId = other.SubRarId;
    this._SubRarIdSet = other._SubRarIdSet;
    this.SubParentId = other.SubParentId;
    this._SubParentIdSet = other._SubParentIdSet;
    this.SubUpdateCount = other.SubUpdateCount;
    this._SubUpdateCountSet = other._SubUpdateCountSet;
    this.SubCreateDate = other.SubCreateDate;
    this._SubCreateDateSet = other._SubCreateDateSet;
    this.SubModifyDate = other.SubModifyDate;
    this._SubModifyDateSet = other._SubModifyDateSet;
    this.SubModifyUser = other.SubModifyUser;
    this._SubModifyUserSet = other._SubModifyUserSet;
    this.RtyId = other.RtyId;
    this._RtyIdSet = other._RtyIdSet;
    this.RtyName = other.RtyName;
    this._RtyNameSet = other._RtyNameSet;
    this.RtyUpdateCount = other.RtyUpdateCount;
    this._RtyUpdateCountSet = other._RtyUpdateCountSet;
    this.RtyCreateDate = other.RtyCreateDate;
    this._RtyCreateDateSet = other._RtyCreateDateSet;
    this.RtyModifyDate = other.RtyModifyDate;
    this._RtyModifyDateSet = other._RtyModifyDateSet;
    this.RtyModifyUser = other.RtyModifyUser;
    this._RtyModifyUserSet = other._RtyModifyUserSet;
    this.RarId = other.RarId;
    this._RarIdSet = other._RarIdSet;
    this.RarName = other.RarName;
    this._RarNameSet = other._RarNameSet;
    this.RarUpdateCount = other.RarUpdateCount;
    this._RarUpdateCountSet = other._RarUpdateCountSet;
    this.RarCreateDate = other.RarCreateDate;
    this._RarCreateDateSet = other._RarCreateDateSet;
    this.RarModifyDate = other.RarModifyDate;
    this._RarModifyDateSet = other._RarModifyDateSet;
    this.RarModifyUser = other.RarModifyUser;
    this._RarModifyUserSet = other._RarModifyUserSet;
  }

  /** get the Key for this object
   * @return SecurityResourceObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public SecurityResourceObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (SecurityResourceObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: ResId (SEC_FX_RESOURCE.res_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
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
    if (this.Key == null) this.Key = new SecurityResourceObjectKeyData ();
    this.Key.ResId = value;
    this.Key._ResIdSet = true;
  }
  /** get the value of the field: ResId (SEC_FX_RESOURCE.res_id)
   * @return BigInteger the value
   */
  public BigInteger getResId () {
    if (this.Key == null) return null;
    return this.Key.ResId;
  }
  /** Change the field to not being actively set: ResId (SEC_FX_RESOURCE.res_id)
   */
  public void unsetResId () {
    if (this.Key == null) return;
    this.Key._ResIdSet = false;
  }
  /** See if the field is actively set: ResId (SEC_FX_RESOURCE.res_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetResId () {
    if (this.Key == null) return false;
    return this.Key._ResIdSet;
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
  /** set the fields value: MrId (SEC_MASTER_RESOURCE.mr_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MrId") 
  public void setMrId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MrId", "setMrId");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "MrId", "setMrId");
    }
    this.MrId = value;
    this._MrIdSet = true;
  }

  /** Retrieves the MrId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MrId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MrId field
   */
   public String getMrIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMrIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMrIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getMrId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MrId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMrIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the MrId field from a formatted string
   *
   * @param _value the MrId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MrId field
   */
   public void setMrIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMrIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMrId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MrId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMrIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMrIdFromFormattedString");
   }

  /** get the value of the field: MrId (SEC_MASTER_RESOURCE.mr_id)
   * @return BigInteger the value
   */
  public BigInteger getMrId () {
    return this.MrId;
  }
  /** Change the field to not being actively set: MrId (SEC_MASTER_RESOURCE.mr_id)
   */
  public void unsetMrId () {
    this._MrIdSet = false;
  }
  /** See if the field is actively set: MrId (SEC_MASTER_RESOURCE.mr_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetMrId () {
    return this._MrIdSet;
  }
  /** set the fields value: MrName (SEC_MASTER_RESOURCE.mr_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MrName") 
  public void setMrName (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MrName", "setMrName");
    }
    if (value != null && !DataHelper.validLength (value, 150))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "MrName", "setMrName");
    }
    this.MrName = value;
    this._MrNameSet = true;
  }

  /** Retrieves the MrName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MrName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MrName field
   */
   public String getMrNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMrNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMrNameAsFormattedString");
       return fmtMgr.formatString(this.getMrName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MrName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMrNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the MrName field from a formatted string
   *
   * @param _value the MrName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MrName field
   */
   public void setMrNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMrNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMrName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MrName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMrNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMrNameFromFormattedString");
   }

  /** get the value of the field: MrName (SEC_MASTER_RESOURCE.mr_name)
   * @return String the value
   */
  public String getMrName () {
    return this.MrName;
  }
  /** Change the field to not being actively set: MrName (SEC_MASTER_RESOURCE.mr_name)
   */
  public void unsetMrName () {
    this._MrNameSet = false;
  }
  /** See if the field is actively set: MrName (SEC_MASTER_RESOURCE.mr_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetMrName () {
    return this._MrNameSet;
  }
  /** set the fields value: MrCanonicalName (SEC_MASTER_RESOURCE.mr_canonical_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MrCanonicalName") 
  public void setMrCanonicalName (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MrCanonicalName", "setMrCanonicalName");
    }
    if (value != null && !DataHelper.validLength (value, 250))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "MrCanonicalName", "setMrCanonicalName");
    }
    this.MrCanonicalName = value;
    this._MrCanonicalNameSet = true;
  }

  /** Retrieves the MrCanonicalName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MrCanonicalName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MrCanonicalName field
   */
   public String getMrCanonicalNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMrCanonicalNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMrCanonicalNameAsFormattedString");
       return fmtMgr.formatString(this.getMrCanonicalName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MrCanonicalName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMrCanonicalNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the MrCanonicalName field from a formatted string
   *
   * @param _value the MrCanonicalName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MrCanonicalName field
   */
   public void setMrCanonicalNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMrCanonicalNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMrCanonicalName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MrCanonicalName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMrCanonicalNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMrCanonicalNameFromFormattedString");
   }

  /** get the value of the field: MrCanonicalName (SEC_MASTER_RESOURCE.mr_canonical_name)
   * @return String the value
   */
  public String getMrCanonicalName () {
    return this.MrCanonicalName;
  }
  /** Change the field to not being actively set: MrCanonicalName (SEC_MASTER_RESOURCE.mr_canonical_name)
   */
  public void unsetMrCanonicalName () {
    this._MrCanonicalNameSet = false;
  }
  /** See if the field is actively set: MrCanonicalName (SEC_MASTER_RESOURCE.mr_canonical_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetMrCanonicalName () {
    return this._MrCanonicalNameSet;
  }
  /** set the fields value: MrResourceRealm (SEC_MASTER_RESOURCE.mr_resource_realm)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MrResourceRealm") 
  public void setMrResourceRealm (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MrResourceRealm", "setMrResourceRealm");
    }
    if (value != null && !DataHelper.validLength (value, 100))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "MrResourceRealm", "setMrResourceRealm");
    }
    this.MrResourceRealm = value;
    this._MrResourceRealmSet = true;
  }

  /** Retrieves the MrResourceRealm field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MrResourceRealm field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MrResourceRealm field
   */
   public String getMrResourceRealmAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMrResourceRealmAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMrResourceRealmAsFormattedString");
       return fmtMgr.formatString(this.getMrResourceRealm());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MrResourceRealm");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMrResourceRealmAsFormattedString");
       throw x;
     }
   }
  /** Sets the MrResourceRealm field from a formatted string
   *
   * @param _value the MrResourceRealm field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MrResourceRealm field
   */
   public void setMrResourceRealmFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMrResourceRealmFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMrResourceRealm(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MrResourceRealm");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMrResourceRealmFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMrResourceRealmFromFormattedString");
   }

  /** get the value of the field: MrResourceRealm (SEC_MASTER_RESOURCE.mr_resource_realm)
   * @return String the value
   */
  public String getMrResourceRealm () {
    return this.MrResourceRealm;
  }
  /** Change the field to not being actively set: MrResourceRealm (SEC_MASTER_RESOURCE.mr_resource_realm)
   */
  public void unsetMrResourceRealm () {
    this._MrResourceRealmSet = false;
  }
  /** See if the field is actively set: MrResourceRealm (SEC_MASTER_RESOURCE.mr_resource_realm)
   * @return boolean whether the field is actively set
   */
  public boolean issetMrResourceRealm () {
    return this._MrResourceRealmSet;
  }
  /** set the fields value: MrResourceType (SEC_MASTER_RESOURCE.mr_resource_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MrResourceType") 
  public void setMrResourceType (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MrResourceType", "setMrResourceType");
    }
    if (value != null && !DataHelper.validLength (value, 100))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "MrResourceType", "setMrResourceType");
    }
    this.MrResourceType = value;
    this._MrResourceTypeSet = true;
  }

  /** Retrieves the MrResourceType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MrResourceType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MrResourceType field
   */
   public String getMrResourceTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMrResourceTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMrResourceTypeAsFormattedString");
       return fmtMgr.formatString(this.getMrResourceType());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MrResourceType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMrResourceTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the MrResourceType field from a formatted string
   *
   * @param _value the MrResourceType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MrResourceType field
   */
   public void setMrResourceTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMrResourceTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMrResourceType(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MrResourceType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMrResourceTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMrResourceTypeFromFormattedString");
   }

  /** get the value of the field: MrResourceType (SEC_MASTER_RESOURCE.mr_resource_type)
   * @return String the value
   */
  public String getMrResourceType () {
    return this.MrResourceType;
  }
  /** Change the field to not being actively set: MrResourceType (SEC_MASTER_RESOURCE.mr_resource_type)
   */
  public void unsetMrResourceType () {
    this._MrResourceTypeSet = false;
  }
  /** See if the field is actively set: MrResourceType (SEC_MASTER_RESOURCE.mr_resource_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetMrResourceType () {
    return this._MrResourceTypeSet;
  }
  /** set the fields value: MrActions (SEC_MASTER_RESOURCE.mr_actions)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MrActions") 
  public void setMrActions (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 100))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "MrActions", "setMrActions");
    }
    this.MrActions = value;
    this._MrActionsSet = true;
  }

  /** Retrieves the MrActions field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MrActions field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MrActions field
   */
   public String getMrActionsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMrActionsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMrActionsAsFormattedString");
       return fmtMgr.formatString(this.getMrActions());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MrActions");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMrActionsAsFormattedString");
       throw x;
     }
   }
  /** Sets the MrActions field from a formatted string
   *
   * @param _value the MrActions field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MrActions field
   */
   public void setMrActionsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMrActionsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMrActions(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MrActions");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMrActionsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMrActionsFromFormattedString");
   }

  /** get the value of the field: MrActions (SEC_MASTER_RESOURCE.mr_actions)
   * @return String the value
   */
  public String getMrActions () {
    return this.MrActions;
  }
  /** Change the field to not being actively set: MrActions (SEC_MASTER_RESOURCE.mr_actions)
   */
  public void unsetMrActions () {
    this._MrActionsSet = false;
  }
  /** See if the field is actively set: MrActions (SEC_MASTER_RESOURCE.mr_actions)
   * @return boolean whether the field is actively set
   */
  public boolean issetMrActions () {
    return this._MrActionsSet;
  }
  /** set the fields value: SubId (SEC_SUB_SYSTEM.sub_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SubId") 
  public void setSubId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SubId", "setSubId");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "SubId", "setSubId");
    }
    this.SubId = value;
    this._SubIdSet = true;
  }

  /** Retrieves the SubId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SubId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SubId field
   */
   public String getSubIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSubIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getSubId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SubId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSubIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the SubId field from a formatted string
   *
   * @param _value the SubId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SubId field
   */
   public void setSubIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSubId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SubId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSubIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSubIdFromFormattedString");
   }

  /** get the value of the field: SubId (SEC_SUB_SYSTEM.sub_id)
   * @return BigInteger the value
   */
  public BigInteger getSubId () {
    return this.SubId;
  }
  /** Change the field to not being actively set: SubId (SEC_SUB_SYSTEM.sub_id)
   */
  public void unsetSubId () {
    this._SubIdSet = false;
  }
  /** See if the field is actively set: SubId (SEC_SUB_SYSTEM.sub_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetSubId () {
    return this._SubIdSet;
  }
  /** set the fields value: SubName (SEC_SUB_SYSTEM.sub_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SubName") 
  public void setSubName (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SubName", "setSubName");
    }
    if (value != null && !DataHelper.validLength (value, 200))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "SubName", "setSubName");
    }
    this.SubName = value;
    this._SubNameSet = true;
  }

  /** Retrieves the SubName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SubName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SubName field
   */
   public String getSubNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSubNameAsFormattedString");
       return fmtMgr.formatString(this.getSubName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SubName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSubNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the SubName field from a formatted string
   *
   * @param _value the SubName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SubName field
   */
   public void setSubNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSubName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SubName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSubNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSubNameFromFormattedString");
   }

  /** get the value of the field: SubName (SEC_SUB_SYSTEM.sub_name)
   * @return String the value
   */
  public String getSubName () {
    return this.SubName;
  }
  /** Change the field to not being actively set: SubName (SEC_SUB_SYSTEM.sub_name)
   */
  public void unsetSubName () {
    this._SubNameSet = false;
  }
  /** See if the field is actively set: SubName (SEC_SUB_SYSTEM.sub_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetSubName () {
    return this._SubNameSet;
  }
  /** set the fields value: SubRarId (SEC_SUB_SYSTEM.sub_rar_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SubRarId") 
  public void setSubRarId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SubRarId", "setSubRarId");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "SubRarId", "setSubRarId");
    }
    this.SubRarId = value;
    this._SubRarIdSet = true;
  }

  /** Retrieves the SubRarId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SubRarId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SubRarId field
   */
   public String getSubRarIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubRarIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSubRarIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getSubRarId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SubRarId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSubRarIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the SubRarId field from a formatted string
   *
   * @param _value the SubRarId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SubRarId field
   */
   public void setSubRarIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubRarIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSubRarId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SubRarId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSubRarIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSubRarIdFromFormattedString");
   }

  /** get the value of the field: SubRarId (SEC_SUB_SYSTEM.sub_rar_id)
   * @return BigInteger the value
   */
  public BigInteger getSubRarId () {
    return this.SubRarId;
  }
  /** Change the field to not being actively set: SubRarId (SEC_SUB_SYSTEM.sub_rar_id)
   */
  public void unsetSubRarId () {
    this._SubRarIdSet = false;
  }
  /** See if the field is actively set: SubRarId (SEC_SUB_SYSTEM.sub_rar_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetSubRarId () {
    return this._SubRarIdSet;
  }
  /** set the fields value: SubParentId (SEC_SUB_SYSTEM.sub_parent_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SubParentId") 
  public void setSubParentId (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "SubParentId", "setSubParentId");
    }
    this.SubParentId = value;
    this._SubParentIdSet = true;
  }

  /** Retrieves the SubParentId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SubParentId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SubParentId field
   */
   public String getSubParentIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubParentIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSubParentIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getSubParentId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SubParentId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSubParentIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the SubParentId field from a formatted string
   *
   * @param _value the SubParentId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SubParentId field
   */
   public void setSubParentIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubParentIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSubParentId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SubParentId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSubParentIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSubParentIdFromFormattedString");
   }

  /** get the value of the field: SubParentId (SEC_SUB_SYSTEM.sub_parent_id)
   * @return BigInteger the value
   */
  public BigInteger getSubParentId () {
    return this.SubParentId;
  }
  /** Change the field to not being actively set: SubParentId (SEC_SUB_SYSTEM.sub_parent_id)
   */
  public void unsetSubParentId () {
    this._SubParentIdSet = false;
  }
  /** See if the field is actively set: SubParentId (SEC_SUB_SYSTEM.sub_parent_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetSubParentId () {
    return this._SubParentIdSet;
  }
  /** set the fields value: SubUpdateCount (SEC_SUB_SYSTEM.sub_update_count)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SubUpdateCount") 
  public void setSubUpdateCount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SubUpdateCount", "setSubUpdateCount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "SubUpdateCount", "setSubUpdateCount");
    }
    this.SubUpdateCount = value;
    this._SubUpdateCountSet = true;
  }

  /** Retrieves the SubUpdateCount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SubUpdateCount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SubUpdateCount field
   */
   public String getSubUpdateCountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubUpdateCountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSubUpdateCountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getSubUpdateCount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SubUpdateCount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSubUpdateCountAsFormattedString");
       throw x;
     }
   }
  /** Sets the SubUpdateCount field from a formatted string
   *
   * @param _value the SubUpdateCount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SubUpdateCount field
   */
   public void setSubUpdateCountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubUpdateCountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSubUpdateCount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SubUpdateCount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSubUpdateCountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSubUpdateCountFromFormattedString");
   }

  /** get the value of the field: SubUpdateCount (SEC_SUB_SYSTEM.sub_update_count)
   * @return BigInteger the value
   */
  public BigInteger getSubUpdateCount () {
    return this.SubUpdateCount;
  }
  /** Change the field to not being actively set: SubUpdateCount (SEC_SUB_SYSTEM.sub_update_count)
   */
  public void unsetSubUpdateCount () {
    this._SubUpdateCountSet = false;
  }
  /** See if the field is actively set: SubUpdateCount (SEC_SUB_SYSTEM.sub_update_count)
   * @return boolean whether the field is actively set
   */
  public boolean issetSubUpdateCount () {
    return this._SubUpdateCountSet;
  }
  /** set the fields value: SubCreateDate (SEC_SUB_SYSTEM.sub_create_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SubCreateDate") 
  public void setSubCreateDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SubCreateDate", "setSubCreateDate");
    }
    this.SubCreateDate = value;
    this._SubCreateDateSet = true;
  }

  /** Retrieves the SubCreateDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SubCreateDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SubCreateDate field
   */
   public String getSubCreateDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubCreateDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSubCreateDateAsFormattedString");
       return fmtMgr.formatDate(this.getSubCreateDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SubCreateDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSubCreateDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the SubCreateDate field from a formatted string
   *
   * @param _value the SubCreateDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SubCreateDate field
   */
   public void setSubCreateDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubCreateDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSubCreateDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SubCreateDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSubCreateDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSubCreateDateFromFormattedString");
   }

  /**
   * Retrieves the SubCreateDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SubCreateDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the SubCreateDate field
   */
  public String getSubCreateDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubCreateDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSubCreateDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getSubCreateDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SubCreateDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSubCreateDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the SubCreateDate field value from a formatted date/time string
   *
   * @param _value the SubCreateDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SubCreateDate field
   */
  public void setSubCreateDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSubCreateDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setSubCreateDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SubCreateDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSubCreateDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: SubCreateDate (SEC_SUB_SYSTEM.sub_create_date)
   * @return Date the value
   */
  public Date getSubCreateDate () {
    return this.SubCreateDate;
  }
  /** Change the field to not being actively set: SubCreateDate (SEC_SUB_SYSTEM.sub_create_date)
   */
  public void unsetSubCreateDate () {
    this._SubCreateDateSet = false;
  }
  /** See if the field is actively set: SubCreateDate (SEC_SUB_SYSTEM.sub_create_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetSubCreateDate () {
    return this._SubCreateDateSet;
  }
  /** set the fields value: SubModifyDate (SEC_SUB_SYSTEM.sub_modify_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SubModifyDate") 
  public void setSubModifyDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SubModifyDate", "setSubModifyDate");
    }
    this.SubModifyDate = value;
    this._SubModifyDateSet = true;
  }

  /** Retrieves the SubModifyDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SubModifyDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SubModifyDate field
   */
   public String getSubModifyDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubModifyDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSubModifyDateAsFormattedString");
       return fmtMgr.formatDate(this.getSubModifyDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SubModifyDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSubModifyDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the SubModifyDate field from a formatted string
   *
   * @param _value the SubModifyDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SubModifyDate field
   */
   public void setSubModifyDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubModifyDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSubModifyDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SubModifyDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSubModifyDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSubModifyDateFromFormattedString");
   }

  /**
   * Retrieves the SubModifyDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SubModifyDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the SubModifyDate field
   */
  public String getSubModifyDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubModifyDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSubModifyDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getSubModifyDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SubModifyDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSubModifyDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the SubModifyDate field value from a formatted date/time string
   *
   * @param _value the SubModifyDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SubModifyDate field
   */
  public void setSubModifyDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSubModifyDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setSubModifyDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SubModifyDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSubModifyDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: SubModifyDate (SEC_SUB_SYSTEM.sub_modify_date)
   * @return Date the value
   */
  public Date getSubModifyDate () {
    return this.SubModifyDate;
  }
  /** Change the field to not being actively set: SubModifyDate (SEC_SUB_SYSTEM.sub_modify_date)
   */
  public void unsetSubModifyDate () {
    this._SubModifyDateSet = false;
  }
  /** See if the field is actively set: SubModifyDate (SEC_SUB_SYSTEM.sub_modify_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetSubModifyDate () {
    return this._SubModifyDateSet;
  }
  /** set the fields value: SubModifyUser (SEC_SUB_SYSTEM.sub_modify_user)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SubModifyUser") 
  public void setSubModifyUser (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SubModifyUser", "setSubModifyUser");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "SubModifyUser", "setSubModifyUser");
    }
    this.SubModifyUser = value;
    this._SubModifyUserSet = true;
  }

  /** Retrieves the SubModifyUser field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SubModifyUser field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SubModifyUser field
   */
   public String getSubModifyUserAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubModifyUserAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSubModifyUserAsFormattedString");
       return fmtMgr.formatString(this.getSubModifyUser());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SubModifyUser");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSubModifyUserAsFormattedString");
       throw x;
     }
   }
  /** Sets the SubModifyUser field from a formatted string
   *
   * @param _value the SubModifyUser field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SubModifyUser field
   */
   public void setSubModifyUserFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubModifyUserFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSubModifyUser(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SubModifyUser");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSubModifyUserFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSubModifyUserFromFormattedString");
   }

  /** get the value of the field: SubModifyUser (SEC_SUB_SYSTEM.sub_modify_user)
   * @return String the value
   */
  public String getSubModifyUser () {
    return this.SubModifyUser;
  }
  /** Change the field to not being actively set: SubModifyUser (SEC_SUB_SYSTEM.sub_modify_user)
   */
  public void unsetSubModifyUser () {
    this._SubModifyUserSet = false;
  }
  /** See if the field is actively set: SubModifyUser (SEC_SUB_SYSTEM.sub_modify_user)
   * @return boolean whether the field is actively set
   */
  public boolean issetSubModifyUser () {
    return this._SubModifyUserSet;
  }
  /** set the fields value: RtyId (SEC_RESOURCE_TYPE.rty_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RtyId") 
  public void setRtyId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RtyId", "setRtyId");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "RtyId", "setRtyId");
    }
    this.RtyId = value;
    this._RtyIdSet = true;
  }

  /** Retrieves the RtyId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RtyId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RtyId field
   */
   public String getRtyIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRtyIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRtyIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getRtyId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RtyId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRtyIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the RtyId field from a formatted string
   *
   * @param _value the RtyId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RtyId field
   */
   public void setRtyIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRtyIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRtyId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RtyId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRtyIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRtyIdFromFormattedString");
   }

  /** get the value of the field: RtyId (SEC_RESOURCE_TYPE.rty_id)
   * @return BigInteger the value
   */
  public BigInteger getRtyId () {
    return this.RtyId;
  }
  /** Change the field to not being actively set: RtyId (SEC_RESOURCE_TYPE.rty_id)
   */
  public void unsetRtyId () {
    this._RtyIdSet = false;
  }
  /** See if the field is actively set: RtyId (SEC_RESOURCE_TYPE.rty_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetRtyId () {
    return this._RtyIdSet;
  }
  /** set the fields value: RtyName (SEC_RESOURCE_TYPE.rty_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RtyName") 
  public void setRtyName (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RtyName", "setRtyName");
    }
    if (value != null && !DataHelper.validLength (value, 500))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "RtyName", "setRtyName");
    }
    this.RtyName = value;
    this._RtyNameSet = true;
  }

  /** Retrieves the RtyName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RtyName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RtyName field
   */
   public String getRtyNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRtyNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRtyNameAsFormattedString");
       return fmtMgr.formatString(this.getRtyName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RtyName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRtyNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the RtyName field from a formatted string
   *
   * @param _value the RtyName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RtyName field
   */
   public void setRtyNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRtyNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRtyName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RtyName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRtyNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRtyNameFromFormattedString");
   }

  /** get the value of the field: RtyName (SEC_RESOURCE_TYPE.rty_name)
   * @return String the value
   */
  public String getRtyName () {
    return this.RtyName;
  }
  /** Change the field to not being actively set: RtyName (SEC_RESOURCE_TYPE.rty_name)
   */
  public void unsetRtyName () {
    this._RtyNameSet = false;
  }
  /** See if the field is actively set: RtyName (SEC_RESOURCE_TYPE.rty_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetRtyName () {
    return this._RtyNameSet;
  }
  /** set the fields value: RtyUpdateCount (SEC_RESOURCE_TYPE.rty_update_count)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RtyUpdateCount") 
  public void setRtyUpdateCount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RtyUpdateCount", "setRtyUpdateCount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "RtyUpdateCount", "setRtyUpdateCount");
    }
    this.RtyUpdateCount = value;
    this._RtyUpdateCountSet = true;
  }

  /** Retrieves the RtyUpdateCount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RtyUpdateCount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RtyUpdateCount field
   */
   public String getRtyUpdateCountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRtyUpdateCountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRtyUpdateCountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getRtyUpdateCount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RtyUpdateCount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRtyUpdateCountAsFormattedString");
       throw x;
     }
   }
  /** Sets the RtyUpdateCount field from a formatted string
   *
   * @param _value the RtyUpdateCount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RtyUpdateCount field
   */
   public void setRtyUpdateCountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRtyUpdateCountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRtyUpdateCount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RtyUpdateCount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRtyUpdateCountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRtyUpdateCountFromFormattedString");
   }

  /** get the value of the field: RtyUpdateCount (SEC_RESOURCE_TYPE.rty_update_count)
   * @return BigInteger the value
   */
  public BigInteger getRtyUpdateCount () {
    return this.RtyUpdateCount;
  }
  /** Change the field to not being actively set: RtyUpdateCount (SEC_RESOURCE_TYPE.rty_update_count)
   */
  public void unsetRtyUpdateCount () {
    this._RtyUpdateCountSet = false;
  }
  /** See if the field is actively set: RtyUpdateCount (SEC_RESOURCE_TYPE.rty_update_count)
   * @return boolean whether the field is actively set
   */
  public boolean issetRtyUpdateCount () {
    return this._RtyUpdateCountSet;
  }
  /** set the fields value: RtyCreateDate (SEC_RESOURCE_TYPE.rty_create_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RtyCreateDate") 
  public void setRtyCreateDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RtyCreateDate", "setRtyCreateDate");
    }
    this.RtyCreateDate = value;
    this._RtyCreateDateSet = true;
  }

  /** Retrieves the RtyCreateDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RtyCreateDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RtyCreateDate field
   */
   public String getRtyCreateDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRtyCreateDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRtyCreateDateAsFormattedString");
       return fmtMgr.formatDate(this.getRtyCreateDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RtyCreateDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRtyCreateDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the RtyCreateDate field from a formatted string
   *
   * @param _value the RtyCreateDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RtyCreateDate field
   */
   public void setRtyCreateDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRtyCreateDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRtyCreateDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RtyCreateDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRtyCreateDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRtyCreateDateFromFormattedString");
   }

  /**
   * Retrieves the RtyCreateDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RtyCreateDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the RtyCreateDate field
   */
  public String getRtyCreateDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRtyCreateDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRtyCreateDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getRtyCreateDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RtyCreateDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRtyCreateDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the RtyCreateDate field value from a formatted date/time string
   *
   * @param _value the RtyCreateDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RtyCreateDate field
   */
  public void setRtyCreateDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRtyCreateDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setRtyCreateDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RtyCreateDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRtyCreateDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: RtyCreateDate (SEC_RESOURCE_TYPE.rty_create_date)
   * @return Date the value
   */
  public Date getRtyCreateDate () {
    return this.RtyCreateDate;
  }
  /** Change the field to not being actively set: RtyCreateDate (SEC_RESOURCE_TYPE.rty_create_date)
   */
  public void unsetRtyCreateDate () {
    this._RtyCreateDateSet = false;
  }
  /** See if the field is actively set: RtyCreateDate (SEC_RESOURCE_TYPE.rty_create_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetRtyCreateDate () {
    return this._RtyCreateDateSet;
  }
  /** set the fields value: RtyModifyDate (SEC_RESOURCE_TYPE.rty_modify_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RtyModifyDate") 
  public void setRtyModifyDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RtyModifyDate", "setRtyModifyDate");
    }
    this.RtyModifyDate = value;
    this._RtyModifyDateSet = true;
  }

  /** Retrieves the RtyModifyDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RtyModifyDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RtyModifyDate field
   */
   public String getRtyModifyDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRtyModifyDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRtyModifyDateAsFormattedString");
       return fmtMgr.formatDate(this.getRtyModifyDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RtyModifyDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRtyModifyDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the RtyModifyDate field from a formatted string
   *
   * @param _value the RtyModifyDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RtyModifyDate field
   */
   public void setRtyModifyDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRtyModifyDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRtyModifyDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RtyModifyDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRtyModifyDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRtyModifyDateFromFormattedString");
   }

  /**
   * Retrieves the RtyModifyDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RtyModifyDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the RtyModifyDate field
   */
  public String getRtyModifyDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRtyModifyDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRtyModifyDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getRtyModifyDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RtyModifyDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRtyModifyDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the RtyModifyDate field value from a formatted date/time string
   *
   * @param _value the RtyModifyDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RtyModifyDate field
   */
  public void setRtyModifyDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRtyModifyDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setRtyModifyDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RtyModifyDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRtyModifyDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: RtyModifyDate (SEC_RESOURCE_TYPE.rty_modify_date)
   * @return Date the value
   */
  public Date getRtyModifyDate () {
    return this.RtyModifyDate;
  }
  /** Change the field to not being actively set: RtyModifyDate (SEC_RESOURCE_TYPE.rty_modify_date)
   */
  public void unsetRtyModifyDate () {
    this._RtyModifyDateSet = false;
  }
  /** See if the field is actively set: RtyModifyDate (SEC_RESOURCE_TYPE.rty_modify_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetRtyModifyDate () {
    return this._RtyModifyDateSet;
  }
  /** set the fields value: RtyModifyUser (SEC_RESOURCE_TYPE.rty_modify_user)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RtyModifyUser") 
  public void setRtyModifyUser (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RtyModifyUser", "setRtyModifyUser");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "RtyModifyUser", "setRtyModifyUser");
    }
    this.RtyModifyUser = value;
    this._RtyModifyUserSet = true;
  }

  /** Retrieves the RtyModifyUser field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RtyModifyUser field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RtyModifyUser field
   */
   public String getRtyModifyUserAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRtyModifyUserAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRtyModifyUserAsFormattedString");
       return fmtMgr.formatString(this.getRtyModifyUser());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RtyModifyUser");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRtyModifyUserAsFormattedString");
       throw x;
     }
   }
  /** Sets the RtyModifyUser field from a formatted string
   *
   * @param _value the RtyModifyUser field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RtyModifyUser field
   */
   public void setRtyModifyUserFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRtyModifyUserFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRtyModifyUser(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RtyModifyUser");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRtyModifyUserFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRtyModifyUserFromFormattedString");
   }

  /** get the value of the field: RtyModifyUser (SEC_RESOURCE_TYPE.rty_modify_user)
   * @return String the value
   */
  public String getRtyModifyUser () {
    return this.RtyModifyUser;
  }
  /** Change the field to not being actively set: RtyModifyUser (SEC_RESOURCE_TYPE.rty_modify_user)
   */
  public void unsetRtyModifyUser () {
    this._RtyModifyUserSet = false;
  }
  /** See if the field is actively set: RtyModifyUser (SEC_RESOURCE_TYPE.rty_modify_user)
   * @return boolean whether the field is actively set
   */
  public boolean issetRtyModifyUser () {
    return this._RtyModifyUserSet;
  }
  /** set the fields value: RarId (SEC_RESOURCE_REALM.rar_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RarId") 
  public void setRarId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RarId", "setRarId");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "RarId", "setRarId");
    }
    this.RarId = value;
    this._RarIdSet = true;
  }

  /** Retrieves the RarId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RarId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RarId field
   */
   public String getRarIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRarIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRarIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getRarId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RarId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRarIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the RarId field from a formatted string
   *
   * @param _value the RarId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RarId field
   */
   public void setRarIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRarIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRarId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RarId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRarIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRarIdFromFormattedString");
   }

  /** get the value of the field: RarId (SEC_RESOURCE_REALM.rar_id)
   * @return BigInteger the value
   */
  public BigInteger getRarId () {
    return this.RarId;
  }
  /** Change the field to not being actively set: RarId (SEC_RESOURCE_REALM.rar_id)
   */
  public void unsetRarId () {
    this._RarIdSet = false;
  }
  /** See if the field is actively set: RarId (SEC_RESOURCE_REALM.rar_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetRarId () {
    return this._RarIdSet;
  }
  /** set the fields value: RarName (SEC_RESOURCE_REALM.rar_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RarName") 
  public void setRarName (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RarName", "setRarName");
    }
    if (value != null && !DataHelper.validLength (value, 200))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "RarName", "setRarName");
    }
    this.RarName = value;
    this._RarNameSet = true;
  }

  /** Retrieves the RarName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RarName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RarName field
   */
   public String getRarNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRarNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRarNameAsFormattedString");
       return fmtMgr.formatString(this.getRarName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RarName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRarNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the RarName field from a formatted string
   *
   * @param _value the RarName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RarName field
   */
   public void setRarNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRarNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRarName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RarName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRarNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRarNameFromFormattedString");
   }

  /** get the value of the field: RarName (SEC_RESOURCE_REALM.rar_name)
   * @return String the value
   */
  public String getRarName () {
    return this.RarName;
  }
  /** Change the field to not being actively set: RarName (SEC_RESOURCE_REALM.rar_name)
   */
  public void unsetRarName () {
    this._RarNameSet = false;
  }
  /** See if the field is actively set: RarName (SEC_RESOURCE_REALM.rar_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetRarName () {
    return this._RarNameSet;
  }
  /** set the fields value: RarUpdateCount (SEC_RESOURCE_REALM.rar_update_count)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RarUpdateCount") 
  public void setRarUpdateCount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RarUpdateCount", "setRarUpdateCount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "RarUpdateCount", "setRarUpdateCount");
    }
    this.RarUpdateCount = value;
    this._RarUpdateCountSet = true;
  }

  /** Retrieves the RarUpdateCount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RarUpdateCount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RarUpdateCount field
   */
   public String getRarUpdateCountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRarUpdateCountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRarUpdateCountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getRarUpdateCount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RarUpdateCount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRarUpdateCountAsFormattedString");
       throw x;
     }
   }
  /** Sets the RarUpdateCount field from a formatted string
   *
   * @param _value the RarUpdateCount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RarUpdateCount field
   */
   public void setRarUpdateCountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRarUpdateCountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRarUpdateCount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RarUpdateCount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRarUpdateCountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRarUpdateCountFromFormattedString");
   }

  /** get the value of the field: RarUpdateCount (SEC_RESOURCE_REALM.rar_update_count)
   * @return BigInteger the value
   */
  public BigInteger getRarUpdateCount () {
    return this.RarUpdateCount;
  }
  /** Change the field to not being actively set: RarUpdateCount (SEC_RESOURCE_REALM.rar_update_count)
   */
  public void unsetRarUpdateCount () {
    this._RarUpdateCountSet = false;
  }
  /** See if the field is actively set: RarUpdateCount (SEC_RESOURCE_REALM.rar_update_count)
   * @return boolean whether the field is actively set
   */
  public boolean issetRarUpdateCount () {
    return this._RarUpdateCountSet;
  }
  /** set the fields value: RarCreateDate (SEC_RESOURCE_REALM.rar_create_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RarCreateDate") 
  public void setRarCreateDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RarCreateDate", "setRarCreateDate");
    }
    this.RarCreateDate = value;
    this._RarCreateDateSet = true;
  }

  /** Retrieves the RarCreateDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RarCreateDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RarCreateDate field
   */
   public String getRarCreateDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRarCreateDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRarCreateDateAsFormattedString");
       return fmtMgr.formatDate(this.getRarCreateDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RarCreateDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRarCreateDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the RarCreateDate field from a formatted string
   *
   * @param _value the RarCreateDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RarCreateDate field
   */
   public void setRarCreateDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRarCreateDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRarCreateDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RarCreateDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRarCreateDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRarCreateDateFromFormattedString");
   }

  /**
   * Retrieves the RarCreateDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RarCreateDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the RarCreateDate field
   */
  public String getRarCreateDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRarCreateDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRarCreateDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getRarCreateDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RarCreateDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRarCreateDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the RarCreateDate field value from a formatted date/time string
   *
   * @param _value the RarCreateDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RarCreateDate field
   */
  public void setRarCreateDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRarCreateDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setRarCreateDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RarCreateDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRarCreateDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: RarCreateDate (SEC_RESOURCE_REALM.rar_create_date)
   * @return Date the value
   */
  public Date getRarCreateDate () {
    return this.RarCreateDate;
  }
  /** Change the field to not being actively set: RarCreateDate (SEC_RESOURCE_REALM.rar_create_date)
   */
  public void unsetRarCreateDate () {
    this._RarCreateDateSet = false;
  }
  /** See if the field is actively set: RarCreateDate (SEC_RESOURCE_REALM.rar_create_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetRarCreateDate () {
    return this._RarCreateDateSet;
  }
  /** set the fields value: RarModifyDate (SEC_RESOURCE_REALM.rar_modify_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RarModifyDate") 
  public void setRarModifyDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RarModifyDate", "setRarModifyDate");
    }
    this.RarModifyDate = value;
    this._RarModifyDateSet = true;
  }

  /** Retrieves the RarModifyDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RarModifyDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RarModifyDate field
   */
   public String getRarModifyDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRarModifyDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRarModifyDateAsFormattedString");
       return fmtMgr.formatDate(this.getRarModifyDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RarModifyDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRarModifyDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the RarModifyDate field from a formatted string
   *
   * @param _value the RarModifyDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RarModifyDate field
   */
   public void setRarModifyDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRarModifyDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRarModifyDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RarModifyDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRarModifyDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRarModifyDateFromFormattedString");
   }

  /**
   * Retrieves the RarModifyDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RarModifyDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the RarModifyDate field
   */
  public String getRarModifyDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRarModifyDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRarModifyDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getRarModifyDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RarModifyDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRarModifyDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the RarModifyDate field value from a formatted date/time string
   *
   * @param _value the RarModifyDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RarModifyDate field
   */
  public void setRarModifyDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRarModifyDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setRarModifyDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RarModifyDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRarModifyDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: RarModifyDate (SEC_RESOURCE_REALM.rar_modify_date)
   * @return Date the value
   */
  public Date getRarModifyDate () {
    return this.RarModifyDate;
  }
  /** Change the field to not being actively set: RarModifyDate (SEC_RESOURCE_REALM.rar_modify_date)
   */
  public void unsetRarModifyDate () {
    this._RarModifyDateSet = false;
  }
  /** See if the field is actively set: RarModifyDate (SEC_RESOURCE_REALM.rar_modify_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetRarModifyDate () {
    return this._RarModifyDateSet;
  }
  /** set the fields value: RarModifyUser (SEC_RESOURCE_REALM.rar_modify_user)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RarModifyUser") 
  public void setRarModifyUser (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RarModifyUser", "setRarModifyUser");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "RarModifyUser", "setRarModifyUser");
    }
    this.RarModifyUser = value;
    this._RarModifyUserSet = true;
  }

  /** Retrieves the RarModifyUser field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RarModifyUser field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RarModifyUser field
   */
   public String getRarModifyUserAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRarModifyUserAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRarModifyUserAsFormattedString");
       return fmtMgr.formatString(this.getRarModifyUser());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RarModifyUser");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRarModifyUserAsFormattedString");
       throw x;
     }
   }
  /** Sets the RarModifyUser field from a formatted string
   *
   * @param _value the RarModifyUser field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RarModifyUser field
   */
   public void setRarModifyUserFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRarModifyUserFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRarModifyUser(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RarModifyUser");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRarModifyUserFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRarModifyUserFromFormattedString");
   }

  /** get the value of the field: RarModifyUser (SEC_RESOURCE_REALM.rar_modify_user)
   * @return String the value
   */
  public String getRarModifyUser () {
    return this.RarModifyUser;
  }
  /** Change the field to not being actively set: RarModifyUser (SEC_RESOURCE_REALM.rar_modify_user)
   */
  public void unsetRarModifyUser () {
    this._RarModifyUserSet = false;
  }
  /** See if the field is actively set: RarModifyUser (SEC_RESOURCE_REALM.rar_modify_user)
   * @return boolean whether the field is actively set
   */
  public boolean issetRarModifyUser () {
    return this._RarModifyUserSet;
  }
  public String toString() {
    return SecurityResourceObjectHelper.toMap(this, null).toString();
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
  /** SEC_MASTER_RESOURCE.mr_id field */
    if(!nonNullOnly || (MrId != null))  _MrIdSet = flag;
  /** SEC_MASTER_RESOURCE.mr_name field */
    if(!nonNullOnly || (MrName != null))  _MrNameSet = flag;
  /** SEC_MASTER_RESOURCE.mr_canonical_name field */
    if(!nonNullOnly || (MrCanonicalName != null))  _MrCanonicalNameSet = flag;
  /** SEC_MASTER_RESOURCE.mr_resource_realm field */
    if(!nonNullOnly || (MrResourceRealm != null))  _MrResourceRealmSet = flag;
  /** SEC_MASTER_RESOURCE.mr_resource_type field */
    if(!nonNullOnly || (MrResourceType != null))  _MrResourceTypeSet = flag;
  /** SEC_MASTER_RESOURCE.mr_actions field */
    if(!nonNullOnly || (MrActions != null))  _MrActionsSet = flag;
  /** SEC_SUB_SYSTEM.sub_id field */
    if(!nonNullOnly || (SubId != null))  _SubIdSet = flag;
  /** SEC_SUB_SYSTEM.sub_name field */
    if(!nonNullOnly || (SubName != null))  _SubNameSet = flag;
  /** SEC_SUB_SYSTEM.sub_rar_id field */
    if(!nonNullOnly || (SubRarId != null))  _SubRarIdSet = flag;
  /** SEC_SUB_SYSTEM.sub_parent_id field */
    if(!nonNullOnly || (SubParentId != null))  _SubParentIdSet = flag;
  /** SEC_SUB_SYSTEM.sub_update_count field */
    if(!nonNullOnly || (SubUpdateCount != null))  _SubUpdateCountSet = flag;
  /** SEC_SUB_SYSTEM.sub_create_date field */
    if(!nonNullOnly || (SubCreateDate != null))  _SubCreateDateSet = flag;
  /** SEC_SUB_SYSTEM.sub_modify_date field */
    if(!nonNullOnly || (SubModifyDate != null))  _SubModifyDateSet = flag;
  /** SEC_SUB_SYSTEM.sub_modify_user field */
    if(!nonNullOnly || (SubModifyUser != null))  _SubModifyUserSet = flag;
  /** SEC_RESOURCE_TYPE.rty_id field */
    if(!nonNullOnly || (RtyId != null))  _RtyIdSet = flag;
  /** SEC_RESOURCE_TYPE.rty_name field */
    if(!nonNullOnly || (RtyName != null))  _RtyNameSet = flag;
  /** SEC_RESOURCE_TYPE.rty_update_count field */
    if(!nonNullOnly || (RtyUpdateCount != null))  _RtyUpdateCountSet = flag;
  /** SEC_RESOURCE_TYPE.rty_create_date field */
    if(!nonNullOnly || (RtyCreateDate != null))  _RtyCreateDateSet = flag;
  /** SEC_RESOURCE_TYPE.rty_modify_date field */
    if(!nonNullOnly || (RtyModifyDate != null))  _RtyModifyDateSet = flag;
  /** SEC_RESOURCE_TYPE.rty_modify_user field */
    if(!nonNullOnly || (RtyModifyUser != null))  _RtyModifyUserSet = flag;
  /** SEC_RESOURCE_REALM.rar_id field */
    if(!nonNullOnly || (RarId != null))  _RarIdSet = flag;
  /** SEC_RESOURCE_REALM.rar_name field */
    if(!nonNullOnly || (RarName != null))  _RarNameSet = flag;
  /** SEC_RESOURCE_REALM.rar_update_count field */
    if(!nonNullOnly || (RarUpdateCount != null))  _RarUpdateCountSet = flag;
  /** SEC_RESOURCE_REALM.rar_create_date field */
    if(!nonNullOnly || (RarCreateDate != null))  _RarCreateDateSet = flag;
  /** SEC_RESOURCE_REALM.rar_modify_date field */
    if(!nonNullOnly || (RarModifyDate != null))  _RarModifyDateSet = flag;
  /** SEC_RESOURCE_REALM.rar_modify_user field */
    if(!nonNullOnly || (RarModifyUser != null))  _RarModifyUserSet = flag;
  }
}
