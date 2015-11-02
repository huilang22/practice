/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: EDObjectData.java
 * Definition File: Admin/ExtendedDataEnumeration.xml
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
  
/** EDObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class EDObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public EDObjectKeyData Key = null;
  /** ENUMERATION_DEF.enumeration_name field */
  public    String EnumerationName  = null;
  protected boolean _EnumerationNameSet = false;
  /** ENUMERATION_DEF.enumeration_key field */
  public    String EnumerationKey  = null;
  protected boolean _EnumerationKeySet = false;
  /** ENUMERATION_DEF.ref_table_name field */
  public    String RefTableName  = null;
  protected boolean _RefTableNameSet = false;
  /** ENUMERATION_DEF.enumeration_sort_basis field */
  public    Integer EnumerationSortBasis  = null;
  protected boolean _EnumerationSortBasisSet = false;
  /** ENUMERATION_DEF.enumeration_sort_order field */
  public    Integer EnumerationSortOrder  = null;
  protected boolean _EnumerationSortOrderSet = false;
  /** ENUMERATION_DEF.config_tag_id field */
  public    String ConfigTagId  = null;
  protected boolean _ConfigTagIdSet = false;
  private String _objName = "EDObjectData";
  /** Default constructor */
  public EDObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public EDObjectData (EDObjectData other)
  {

    if (other == null) return;
    this.Key = new EDObjectKeyData (other.Key);
    this.EnumerationName = other.EnumerationName;
    this._EnumerationNameSet = other._EnumerationNameSet;
    this.EnumerationKey = other.EnumerationKey;
    this._EnumerationKeySet = other._EnumerationKeySet;
    this.RefTableName = other.RefTableName;
    this._RefTableNameSet = other._RefTableNameSet;
    this.EnumerationSortBasis = other.EnumerationSortBasis;
    this._EnumerationSortBasisSet = other._EnumerationSortBasisSet;
    this.EnumerationSortOrder = other.EnumerationSortOrder;
    this._EnumerationSortOrderSet = other._EnumerationSortOrderSet;
    this.ConfigTagId = other.ConfigTagId;
    this._ConfigTagIdSet = other._ConfigTagIdSet;
  }

  /** get the Key for this object
   * @return EDObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public EDObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (EDObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: EnumerationId (ENUMERATION_DEF.enumeration_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setEnumerationId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "EnumerationId", "setEnumerationId");
    }
    if (this.Key == null) this.Key = new EDObjectKeyData ();
    this.Key.EnumerationId = value;
    this.Key._EnumerationIdSet = true;
  }
  /** get the value of the field: EnumerationId (ENUMERATION_DEF.enumeration_id)
   * @return Integer the value
   */
  public Integer getEnumerationId () {
    if (this.Key == null) return null;
    return this.Key.EnumerationId;
  }
  /** Change the field to not being actively set: EnumerationId (ENUMERATION_DEF.enumeration_id)
   */
  public void unsetEnumerationId () {
    if (this.Key == null) return;
    this.Key._EnumerationIdSet = false;
  }
  /** See if the field is actively set: EnumerationId (ENUMERATION_DEF.enumeration_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetEnumerationId () {
    if (this.Key == null) return false;
    return this.Key._EnumerationIdSet;
  }

  /** Retrieves the EnumerationId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EnumerationId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EnumerationId field
   */
   public String getEnumerationIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEnumerationIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEnumerationIdAsFormattedString");
       return fmtMgr.formatNumber(this.getEnumerationId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EnumerationId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEnumerationIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the EnumerationId field from a formatted string
   *
   * @param _value the EnumerationId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EnumerationId field
   */
   public void setEnumerationIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEnumerationIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEnumerationId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EnumerationId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEnumerationIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEnumerationIdFromFormattedString");
   }

  /** set the fields value: EnumerationName (ENUMERATION_DEF.enumeration_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EnumerationName") 
  public void setEnumerationName (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "EnumerationName", "setEnumerationName");
    }
    if (value != null && !DataHelper.validLength (value, 32))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "EnumerationName", "setEnumerationName");
    }
    this.EnumerationName = value;
    this._EnumerationNameSet = true;
  }

  /** Retrieves the EnumerationName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EnumerationName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EnumerationName field
   */
   public String getEnumerationNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEnumerationNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEnumerationNameAsFormattedString");
       return fmtMgr.formatString(this.getEnumerationName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EnumerationName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEnumerationNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the EnumerationName field from a formatted string
   *
   * @param _value the EnumerationName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EnumerationName field
   */
   public void setEnumerationNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEnumerationNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEnumerationName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EnumerationName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEnumerationNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEnumerationNameFromFormattedString");
   }

  /** get the value of the field: EnumerationName (ENUMERATION_DEF.enumeration_name)
   * @return String the value
   */
  public String getEnumerationName () {
    return this.EnumerationName;
  }
  /** Change the field to not being actively set: EnumerationName (ENUMERATION_DEF.enumeration_name)
   */
  public void unsetEnumerationName () {
    this._EnumerationNameSet = false;
  }
  /** See if the field is actively set: EnumerationName (ENUMERATION_DEF.enumeration_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetEnumerationName () {
    return this._EnumerationNameSet;
  }
  /** set the fields value: EnumerationKey (ENUMERATION_DEF.enumeration_key)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EnumerationKey") 
  public void setEnumerationKey (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "EnumerationKey", "setEnumerationKey");
    }
    if (value != null && !DataHelper.validLength (value, 32))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "EnumerationKey", "setEnumerationKey");
    }
    this.EnumerationKey = value;
    this._EnumerationKeySet = true;
  }

  /** Retrieves the EnumerationKey field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EnumerationKey field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EnumerationKey field
   */
   public String getEnumerationKeyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEnumerationKeyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEnumerationKeyAsFormattedString");
       return fmtMgr.formatString(this.getEnumerationKey());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EnumerationKey");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEnumerationKeyAsFormattedString");
       throw x;
     }
   }
  /** Sets the EnumerationKey field from a formatted string
   *
   * @param _value the EnumerationKey field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EnumerationKey field
   */
   public void setEnumerationKeyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEnumerationKeyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEnumerationKey(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EnumerationKey");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEnumerationKeyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEnumerationKeyFromFormattedString");
   }

  /** get the value of the field: EnumerationKey (ENUMERATION_DEF.enumeration_key)
   * @return String the value
   */
  public String getEnumerationKey () {
    return this.EnumerationKey;
  }
  /** Change the field to not being actively set: EnumerationKey (ENUMERATION_DEF.enumeration_key)
   */
  public void unsetEnumerationKey () {
    this._EnumerationKeySet = false;
  }
  /** See if the field is actively set: EnumerationKey (ENUMERATION_DEF.enumeration_key)
   * @return boolean whether the field is actively set
   */
  public boolean issetEnumerationKey () {
    return this._EnumerationKeySet;
  }
  /** set the fields value: RefTableName (ENUMERATION_DEF.ref_table_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RefTableName") 
  public void setRefTableName (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "RefTableName", "setRefTableName");
    }
    this.RefTableName = value;
    this._RefTableNameSet = true;
  }

  /** Retrieves the RefTableName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RefTableName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RefTableName field
   */
   public String getRefTableNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefTableNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRefTableNameAsFormattedString");
       return fmtMgr.formatString(this.getRefTableName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RefTableName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRefTableNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the RefTableName field from a formatted string
   *
   * @param _value the RefTableName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RefTableName field
   */
   public void setRefTableNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefTableNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRefTableName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RefTableName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRefTableNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRefTableNameFromFormattedString");
   }

  /** get the value of the field: RefTableName (ENUMERATION_DEF.ref_table_name)
   * @return String the value
   */
  public String getRefTableName () {
    return this.RefTableName;
  }
  /** Change the field to not being actively set: RefTableName (ENUMERATION_DEF.ref_table_name)
   */
  public void unsetRefTableName () {
    this._RefTableNameSet = false;
  }
  /** See if the field is actively set: RefTableName (ENUMERATION_DEF.ref_table_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetRefTableName () {
    return this._RefTableNameSet;
  }
  /** set the fields value: EnumerationSortBasis (ENUMERATION_DEF.enumeration_sort_basis)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EnumerationSortBasis") 
  public void setEnumerationSortBasis (Integer value) throws ServiceException
  {
    this.EnumerationSortBasis = value;
    this._EnumerationSortBasisSet = true;
  }

  /** Retrieves the EnumerationSortBasis field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EnumerationSortBasis field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EnumerationSortBasis field
   */
   public String getEnumerationSortBasisAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEnumerationSortBasisAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEnumerationSortBasisAsFormattedString");
       return fmtMgr.formatNumber(this.getEnumerationSortBasis(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EnumerationSortBasis");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEnumerationSortBasisAsFormattedString");
       throw x;
     }
   }
  /** Sets the EnumerationSortBasis field from a formatted string
   *
   * @param _value the EnumerationSortBasis field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EnumerationSortBasis field
   */
   public void setEnumerationSortBasisFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEnumerationSortBasisFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEnumerationSortBasis(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EnumerationSortBasis");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEnumerationSortBasisFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEnumerationSortBasisFromFormattedString");
   }

  /** get the value of the field: EnumerationSortBasis (ENUMERATION_DEF.enumeration_sort_basis)
   * @return Integer the value
   */
  public Integer getEnumerationSortBasis () {
    return this.EnumerationSortBasis;
  }
  /** Change the field to not being actively set: EnumerationSortBasis (ENUMERATION_DEF.enumeration_sort_basis)
   */
  public void unsetEnumerationSortBasis () {
    this._EnumerationSortBasisSet = false;
  }
  /** See if the field is actively set: EnumerationSortBasis (ENUMERATION_DEF.enumeration_sort_basis)
   * @return boolean whether the field is actively set
   */
  public boolean issetEnumerationSortBasis () {
    return this._EnumerationSortBasisSet;
  }
  /** set the fields value: EnumerationSortOrder (ENUMERATION_DEF.enumeration_sort_order)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EnumerationSortOrder") 
  public void setEnumerationSortOrder (Integer value) throws ServiceException
  {
    this.EnumerationSortOrder = value;
    this._EnumerationSortOrderSet = true;
  }

  /** Retrieves the EnumerationSortOrder field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EnumerationSortOrder field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EnumerationSortOrder field
   */
   public String getEnumerationSortOrderAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEnumerationSortOrderAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEnumerationSortOrderAsFormattedString");
       return fmtMgr.formatNumber(this.getEnumerationSortOrder(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EnumerationSortOrder");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEnumerationSortOrderAsFormattedString");
       throw x;
     }
   }
  /** Sets the EnumerationSortOrder field from a formatted string
   *
   * @param _value the EnumerationSortOrder field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EnumerationSortOrder field
   */
   public void setEnumerationSortOrderFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEnumerationSortOrderFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEnumerationSortOrder(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EnumerationSortOrder");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEnumerationSortOrderFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEnumerationSortOrderFromFormattedString");
   }

  /** get the value of the field: EnumerationSortOrder (ENUMERATION_DEF.enumeration_sort_order)
   * @return Integer the value
   */
  public Integer getEnumerationSortOrder () {
    return this.EnumerationSortOrder;
  }
  /** Change the field to not being actively set: EnumerationSortOrder (ENUMERATION_DEF.enumeration_sort_order)
   */
  public void unsetEnumerationSortOrder () {
    this._EnumerationSortOrderSet = false;
  }
  /** See if the field is actively set: EnumerationSortOrder (ENUMERATION_DEF.enumeration_sort_order)
   * @return boolean whether the field is actively set
   */
  public boolean issetEnumerationSortOrder () {
    return this._EnumerationSortOrderSet;
  }
  /** set the fields value: ConfigTagId (ENUMERATION_DEF.config_tag_id)
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

  /** get the value of the field: ConfigTagId (ENUMERATION_DEF.config_tag_id)
   * @return String the value
   */
  public String getConfigTagId () {
    return this.ConfigTagId;
  }
  /** Change the field to not being actively set: ConfigTagId (ENUMERATION_DEF.config_tag_id)
   */
  public void unsetConfigTagId () {
    this._ConfigTagIdSet = false;
  }
  /** See if the field is actively set: ConfigTagId (ENUMERATION_DEF.config_tag_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetConfigTagId () {
    return this._ConfigTagIdSet;
  }
  public String toString() {
    return EDObjectHelper.toMap(this, null).toString();
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
  /** ENUMERATION_DEF.enumeration_name field */
    if(!nonNullOnly || (EnumerationName != null))  _EnumerationNameSet = flag;
  /** ENUMERATION_DEF.enumeration_key field */
    if(!nonNullOnly || (EnumerationKey != null))  _EnumerationKeySet = flag;
  /** ENUMERATION_DEF.ref_table_name field */
    if(!nonNullOnly || (RefTableName != null))  _RefTableNameSet = flag;
  /** ENUMERATION_DEF.enumeration_sort_basis field */
    if(!nonNullOnly || (EnumerationSortBasis != null))  _EnumerationSortBasisSet = flag;
  /** ENUMERATION_DEF.enumeration_sort_order field */
    if(!nonNullOnly || (EnumerationSortOrder != null))  _EnumerationSortOrderSet = flag;
  /** ENUMERATION_DEF.config_tag_id field */
    if(!nonNullOnly || (ConfigTagId != null))  _ConfigTagIdSet = flag;
  }
}
