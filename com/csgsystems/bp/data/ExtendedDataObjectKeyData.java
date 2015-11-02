/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ExtendedDataObjectKeyData.java
 * Definition File: Admin/ExtendedDataAssociation.xml
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

/** ExtendedDataObject's Key Data class. */
public class ExtendedDataObjectKeyData  extends BaseObjectData
{
  /** EXT_PARAM_TYPE_ASSOC.base_table field */
  public    String BaseTable  = null;
  protected boolean _BaseTableSet = false;
  /** EXT_PARAM_TYPE_ASSOC.entity_type field */
  public    Integer EntityType  = null;
  protected boolean _EntityTypeSet = false;
  /** EXT_PARAM_TYPE_ASSOC.param_id field */
  public    Integer ParamId  = null;
  protected boolean _ParamIdSet = false;
  private String _objName = "ExtendedDataObjectKeyData";
  /** default constructor */
  public ExtendedDataObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public ExtendedDataObjectKeyData (ExtendedDataObjectKeyData other)
  {
    if (other == null) return;
    this.BaseTable = other.BaseTable;
    this._BaseTableSet = other._BaseTableSet;
    this.EntityType = other.EntityType;
    this._EntityTypeSet = other._EntityTypeSet;
    this.ParamId = other.ParamId;
    this._ParamIdSet = other._ParamIdSet;
  }
  /** set the fields value: BaseTable (EXT_PARAM_TYPE_ASSOC.base_table)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BaseTable") 
  public void setBaseTable (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BaseTable", "setBaseTable");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BaseTable", "setBaseTable");
    }
    this.BaseTable = value;
    this._BaseTableSet = true;
  }

  /** Retrieves the BaseTable field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BaseTable field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BaseTable field
   */
   public String getBaseTableAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBaseTableAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBaseTableAsFormattedString");
       return fmtMgr.formatString(this.getBaseTable());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BaseTable");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBaseTableAsFormattedString");
       throw x;
     }
   }
  /** Sets the BaseTable field from a formatted string
   *
   * @param _value the BaseTable field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BaseTable field
   */
   public void setBaseTableFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBaseTableFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBaseTable(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BaseTable");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBaseTableFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBaseTableFromFormattedString");
   }

  /** get the value of the field: BaseTable (EXT_PARAM_TYPE_ASSOC.base_table)
   * @return String the value
   */
  public String getBaseTable () {
    return this.BaseTable;
  }
  /** Change the field to not being actively set: BaseTable (EXT_PARAM_TYPE_ASSOC.base_table)
   */
  public void unsetBaseTable () {
    this._BaseTableSet = false;
  }
  /** See if the field is actively set: BaseTable (EXT_PARAM_TYPE_ASSOC.base_table)
   * @return boolean whether the field is actively set
   */
  public boolean issetBaseTable () {
    return this._BaseTableSet;
  }
  /** set the fields value: EntityType (EXT_PARAM_TYPE_ASSOC.entity_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EntityType") 
  public void setEntityType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "EntityType", "setEntityType");
    }
    this.EntityType = value;
    this._EntityTypeSet = true;
  }

  /** Retrieves the EntityType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EntityType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EntityType field
   */
   public String getEntityTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEntityTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEntityTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getEntityType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EntityType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEntityTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the EntityType field from a formatted string
   *
   * @param _value the EntityType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EntityType field
   */
   public void setEntityTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEntityTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEntityType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EntityType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEntityTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEntityTypeFromFormattedString");
   }

  /** get the value of the field: EntityType (EXT_PARAM_TYPE_ASSOC.entity_type)
   * @return Integer the value
   */
  public Integer getEntityType () {
    return this.EntityType;
  }
  /** Change the field to not being actively set: EntityType (EXT_PARAM_TYPE_ASSOC.entity_type)
   */
  public void unsetEntityType () {
    this._EntityTypeSet = false;
  }
  /** See if the field is actively set: EntityType (EXT_PARAM_TYPE_ASSOC.entity_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetEntityType () {
    return this._EntityTypeSet;
  }
  /** set the fields value: ParamId (EXT_PARAM_TYPE_ASSOC.param_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ParamId") 
  public void setParamId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ParamId", "setParamId");
    }
    this.ParamId = value;
    this._ParamIdSet = true;
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

  /** get the value of the field: ParamId (EXT_PARAM_TYPE_ASSOC.param_id)
   * @return Integer the value
   */
  public Integer getParamId () {
    return this.ParamId;
  }
  /** Change the field to not being actively set: ParamId (EXT_PARAM_TYPE_ASSOC.param_id)
   */
  public void unsetParamId () {
    this._ParamIdSet = false;
  }
  /** See if the field is actively set: ParamId (EXT_PARAM_TYPE_ASSOC.param_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetParamId () {
    return this._ParamIdSet;
  }
  public String toString() {
    return ExtendedDataObjectKeyHelper.toMap(this, null).toString();
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
    
  /** EXT_PARAM_TYPE_ASSOC.base_table field */
    if(!nonNullOnly || (BaseTable != null))  _BaseTableSet = flag;
  /** EXT_PARAM_TYPE_ASSOC.entity_type field */
    if(!nonNullOnly || (EntityType != null))  _EntityTypeSet = flag;
  /** EXT_PARAM_TYPE_ASSOC.param_id field */
    if(!nonNullOnly || (ParamId != null))  _ParamIdSet = flag;
  }
}
