/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ExtendedDataObjectData.java
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
  
/** ExtendedDataObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class ExtendedDataObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public ExtendedDataObjectKeyData Key = null;
  /** EXT_PARAM_TYPE_ASSOC.grouping_id field */
  public    String GroupingId  = null;
  protected boolean _GroupingIdSet = false;
  /** EXT_PARAM_TYPE_ASSOC.default_value field */
  public    String DefaultValue  = null;
  protected boolean _DefaultValueSet = false;
  /** EXT_PARAM_TYPE_ASSOC.is_required field */
  public    Boolean IsRequired  = null;
  protected boolean _IsRequiredSet = false;
  /** EXT_PARAM_TYPE_ASSOC.attribute_display_order field */
  public    Integer AttributeDisplayOrder  = null;
  protected boolean _AttributeDisplayOrderSet = false;
  /** EXT_PARAM_TYPE_ASSOC.is_searchable field */
  public    Boolean IsSearchable  = null;
  protected boolean _IsSearchableSet = false;
  /** EXT_PARAM_TYPE_ASSOC.config_tag_id field */
  public    String ConfigTagId  = null;
  protected boolean _ConfigTagIdSet = false;
  private String _objName = "ExtendedDataObjectData";
  /** Default constructor */
  public ExtendedDataObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public ExtendedDataObjectData (ExtendedDataObjectData other)
  {

    if (other == null) return;
    this.Key = new ExtendedDataObjectKeyData (other.Key);
    this.GroupingId = other.GroupingId;
    this._GroupingIdSet = other._GroupingIdSet;
    this.DefaultValue = other.DefaultValue;
    this._DefaultValueSet = other._DefaultValueSet;
    this.IsRequired = other.IsRequired;
    this._IsRequiredSet = other._IsRequiredSet;
    this.AttributeDisplayOrder = other.AttributeDisplayOrder;
    this._AttributeDisplayOrderSet = other._AttributeDisplayOrderSet;
    this.IsSearchable = other.IsSearchable;
    this._IsSearchableSet = other._IsSearchableSet;
    this.ConfigTagId = other.ConfigTagId;
    this._ConfigTagIdSet = other._ConfigTagIdSet;
  }

  /** get the Key for this object
   * @return ExtendedDataObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public ExtendedDataObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (ExtendedDataObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: BaseTable (EXT_PARAM_TYPE_ASSOC.base_table)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
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
    if (this.Key == null) this.Key = new ExtendedDataObjectKeyData ();
    this.Key.BaseTable = value;
    this.Key._BaseTableSet = true;
  }
  /** get the value of the field: BaseTable (EXT_PARAM_TYPE_ASSOC.base_table)
   * @return String the value
   */
  public String getBaseTable () {
    if (this.Key == null) return null;
    return this.Key.BaseTable;
  }
  /** Change the field to not being actively set: BaseTable (EXT_PARAM_TYPE_ASSOC.base_table)
   */
  public void unsetBaseTable () {
    if (this.Key == null) return;
    this.Key._BaseTableSet = false;
  }
  /** See if the field is actively set: BaseTable (EXT_PARAM_TYPE_ASSOC.base_table)
   * @return boolean whether the field is actively set
   */
  public boolean issetBaseTable () {
    if (this.Key == null) return false;
    return this.Key._BaseTableSet;
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

  /** set the fields value: EntityType (EXT_PARAM_TYPE_ASSOC.entity_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setEntityType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "EntityType", "setEntityType");
    }
    if (this.Key == null) this.Key = new ExtendedDataObjectKeyData ();
    this.Key.EntityType = value;
    this.Key._EntityTypeSet = true;
  }
  /** get the value of the field: EntityType (EXT_PARAM_TYPE_ASSOC.entity_type)
   * @return Integer the value
   */
  public Integer getEntityType () {
    if (this.Key == null) return null;
    return this.Key.EntityType;
  }
  /** Change the field to not being actively set: EntityType (EXT_PARAM_TYPE_ASSOC.entity_type)
   */
  public void unsetEntityType () {
    if (this.Key == null) return;
    this.Key._EntityTypeSet = false;
  }
  /** See if the field is actively set: EntityType (EXT_PARAM_TYPE_ASSOC.entity_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetEntityType () {
    if (this.Key == null) return false;
    return this.Key._EntityTypeSet;
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

  /** set the fields value: ParamId (EXT_PARAM_TYPE_ASSOC.param_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setParamId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ParamId", "setParamId");
    }
    if (this.Key == null) this.Key = new ExtendedDataObjectKeyData ();
    this.Key.ParamId = value;
    this.Key._ParamIdSet = true;
  }
  /** get the value of the field: ParamId (EXT_PARAM_TYPE_ASSOC.param_id)
   * @return Integer the value
   */
  public Integer getParamId () {
    if (this.Key == null) return null;
    return this.Key.ParamId;
  }
  /** Change the field to not being actively set: ParamId (EXT_PARAM_TYPE_ASSOC.param_id)
   */
  public void unsetParamId () {
    if (this.Key == null) return;
    this.Key._ParamIdSet = false;
  }
  /** See if the field is actively set: ParamId (EXT_PARAM_TYPE_ASSOC.param_id)
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

  /** set the fields value: GroupingId (EXT_PARAM_TYPE_ASSOC.grouping_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("GroupingId") 
  public void setGroupingId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 32))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "GroupingId", "setGroupingId");
    }
    this.GroupingId = value;
    this._GroupingIdSet = true;
  }

  /** Retrieves the GroupingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The GroupingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GroupingId field
   */
   public String getGroupingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupingIdAsFormattedString");
       return fmtMgr.formatString(this.getGroupingId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GroupingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getGroupingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the GroupingId field from a formatted string
   *
   * @param _value the GroupingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the GroupingId field
   */
   public void setGroupingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setGroupingId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GroupingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setGroupingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGroupingIdFromFormattedString");
   }

  /** get the value of the field: GroupingId (EXT_PARAM_TYPE_ASSOC.grouping_id)
   * @return String the value
   */
  public String getGroupingId () {
    return this.GroupingId;
  }
  /** Change the field to not being actively set: GroupingId (EXT_PARAM_TYPE_ASSOC.grouping_id)
   */
  public void unsetGroupingId () {
    this._GroupingIdSet = false;
  }
  /** See if the field is actively set: GroupingId (EXT_PARAM_TYPE_ASSOC.grouping_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetGroupingId () {
    return this._GroupingIdSet;
  }
  /** set the fields value: DefaultValue (EXT_PARAM_TYPE_ASSOC.default_value)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DefaultValue") 
  public void setDefaultValue (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 32))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DefaultValue", "setDefaultValue");
    }
    this.DefaultValue = value;
    this._DefaultValueSet = true;
  }

  /** Retrieves the DefaultValue field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DefaultValue field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DefaultValue field
   */
   public String getDefaultValueAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDefaultValueAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDefaultValueAsFormattedString");
       return fmtMgr.formatString(this.getDefaultValue());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DefaultValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDefaultValueAsFormattedString");
       throw x;
     }
   }
  /** Sets the DefaultValue field from a formatted string
   *
   * @param _value the DefaultValue field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DefaultValue field
   */
   public void setDefaultValueFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDefaultValueFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDefaultValue(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DefaultValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDefaultValueFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDefaultValueFromFormattedString");
   }

  /** get the value of the field: DefaultValue (EXT_PARAM_TYPE_ASSOC.default_value)
   * @return String the value
   */
  public String getDefaultValue () {
    return this.DefaultValue;
  }
  /** Change the field to not being actively set: DefaultValue (EXT_PARAM_TYPE_ASSOC.default_value)
   */
  public void unsetDefaultValue () {
    this._DefaultValueSet = false;
  }
  /** See if the field is actively set: DefaultValue (EXT_PARAM_TYPE_ASSOC.default_value)
   * @return boolean whether the field is actively set
   */
  public boolean issetDefaultValue () {
    return this._DefaultValueSet;
  }
  /** set the fields value: IsRequired (EXT_PARAM_TYPE_ASSOC.is_required)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsRequired") 
  public void setIsRequired (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsRequired", "setIsRequired");
    }
    this.IsRequired = value;
    this._IsRequiredSet = true;
  }

  /** Retrieves the IsRequired field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsRequired field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsRequired field
   */
   public String getIsRequiredAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsRequiredAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsRequiredAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsRequired());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsRequired");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsRequiredAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsRequired field from a formatted string
   *
   * @param _value the IsRequired field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsRequired field
   */
   public void setIsRequiredFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsRequiredFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsRequired(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsRequired");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsRequiredFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsRequiredFromFormattedString");
   }

  /** get the value of the field: IsRequired (EXT_PARAM_TYPE_ASSOC.is_required)
   * @return Boolean the value
   */
  public Boolean getIsRequired () {
    return this.IsRequired;
  }
  /** Change the field to not being actively set: IsRequired (EXT_PARAM_TYPE_ASSOC.is_required)
   */
  public void unsetIsRequired () {
    this._IsRequiredSet = false;
  }
  /** See if the field is actively set: IsRequired (EXT_PARAM_TYPE_ASSOC.is_required)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsRequired () {
    return this._IsRequiredSet;
  }
  /** set the fields value: AttributeDisplayOrder (EXT_PARAM_TYPE_ASSOC.attribute_display_order)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AttributeDisplayOrder") 
  public void setAttributeDisplayOrder (Integer value) throws ServiceException
  {
    this.AttributeDisplayOrder = value;
    this._AttributeDisplayOrderSet = true;
  }

  /** Retrieves the AttributeDisplayOrder field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AttributeDisplayOrder field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AttributeDisplayOrder field
   */
   public String getAttributeDisplayOrderAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAttributeDisplayOrderAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAttributeDisplayOrderAsFormattedString");
       return fmtMgr.formatNumber(this.getAttributeDisplayOrder(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AttributeDisplayOrder");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAttributeDisplayOrderAsFormattedString");
       throw x;
     }
   }
  /** Sets the AttributeDisplayOrder field from a formatted string
   *
   * @param _value the AttributeDisplayOrder field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AttributeDisplayOrder field
   */
   public void setAttributeDisplayOrderFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAttributeDisplayOrderFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAttributeDisplayOrder(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AttributeDisplayOrder");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAttributeDisplayOrderFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAttributeDisplayOrderFromFormattedString");
   }

  /** get the value of the field: AttributeDisplayOrder (EXT_PARAM_TYPE_ASSOC.attribute_display_order)
   * @return Integer the value
   */
  public Integer getAttributeDisplayOrder () {
    return this.AttributeDisplayOrder;
  }
  /** Change the field to not being actively set: AttributeDisplayOrder (EXT_PARAM_TYPE_ASSOC.attribute_display_order)
   */
  public void unsetAttributeDisplayOrder () {
    this._AttributeDisplayOrderSet = false;
  }
  /** See if the field is actively set: AttributeDisplayOrder (EXT_PARAM_TYPE_ASSOC.attribute_display_order)
   * @return boolean whether the field is actively set
   */
  public boolean issetAttributeDisplayOrder () {
    return this._AttributeDisplayOrderSet;
  }
  /** set the fields value: IsSearchable (EXT_PARAM_TYPE_ASSOC.is_searchable)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsSearchable") 
  public void setIsSearchable (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsSearchable", "setIsSearchable");
    }
    this.IsSearchable = value;
    this._IsSearchableSet = true;
  }

  /** Retrieves the IsSearchable field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsSearchable field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsSearchable field
   */
   public String getIsSearchableAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsSearchableAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsSearchableAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsSearchable());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsSearchable");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsSearchableAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsSearchable field from a formatted string
   *
   * @param _value the IsSearchable field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsSearchable field
   */
   public void setIsSearchableFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsSearchableFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsSearchable(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsSearchable");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsSearchableFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsSearchableFromFormattedString");
   }

  /** get the value of the field: IsSearchable (EXT_PARAM_TYPE_ASSOC.is_searchable)
   * @return Boolean the value
   */
  public Boolean getIsSearchable () {
    return this.IsSearchable;
  }
  /** Change the field to not being actively set: IsSearchable (EXT_PARAM_TYPE_ASSOC.is_searchable)
   */
  public void unsetIsSearchable () {
    this._IsSearchableSet = false;
  }
  /** See if the field is actively set: IsSearchable (EXT_PARAM_TYPE_ASSOC.is_searchable)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsSearchable () {
    return this._IsSearchableSet;
  }
  /** set the fields value: ConfigTagId (EXT_PARAM_TYPE_ASSOC.config_tag_id)
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

  /** get the value of the field: ConfigTagId (EXT_PARAM_TYPE_ASSOC.config_tag_id)
   * @return String the value
   */
  public String getConfigTagId () {
    return this.ConfigTagId;
  }
  /** Change the field to not being actively set: ConfigTagId (EXT_PARAM_TYPE_ASSOC.config_tag_id)
   */
  public void unsetConfigTagId () {
    this._ConfigTagIdSet = false;
  }
  /** See if the field is actively set: ConfigTagId (EXT_PARAM_TYPE_ASSOC.config_tag_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetConfigTagId () {
    return this._ConfigTagIdSet;
  }
  public String toString() {
    return ExtendedDataObjectHelper.toMap(this, null).toString();
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
  /** EXT_PARAM_TYPE_ASSOC.grouping_id field */
    if(!nonNullOnly || (GroupingId != null))  _GroupingIdSet = flag;
  /** EXT_PARAM_TYPE_ASSOC.default_value field */
    if(!nonNullOnly || (DefaultValue != null))  _DefaultValueSet = flag;
  /** EXT_PARAM_TYPE_ASSOC.is_required field */
    if(!nonNullOnly || (IsRequired != null))  _IsRequiredSet = flag;
  /** EXT_PARAM_TYPE_ASSOC.attribute_display_order field */
    if(!nonNullOnly || (AttributeDisplayOrder != null))  _AttributeDisplayOrderSet = flag;
  /** EXT_PARAM_TYPE_ASSOC.is_searchable field */
    if(!nonNullOnly || (IsSearchable != null))  _IsSearchableSet = flag;
  /** EXT_PARAM_TYPE_ASSOC.config_tag_id field */
    if(!nonNullOnly || (ConfigTagId != null))  _ConfigTagIdSet = flag;
  }
}
