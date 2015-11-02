/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: DocumentTypeRefObjectData.java
 * Definition File: Admin/DocumentTypeRef.xml
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
  
/** DocumentTypeRefObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class DocumentTypeRefObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public DocumentTypeRefObjectKeyData Key = null;
  /** DOCUMENT_TYPE_REF.repository_location field */
  public    String RepositoryLocation  = null;
  protected boolean _RepositoryLocationSet = false;
  /** DOCUMENT_TYPE_REF.use_document_repository field */
  public    Boolean UseDocumentRepository  = null;
  protected boolean _UseDocumentRepositorySet = false;
  /** DOCUMENT_TYPE_REF.disp_fn_fmt field */
  public    String DispFnFmt  = null;
  protected boolean _DispFnFmtSet = false;
  /** DOCUMENT_TYPE_REF.source_type field */
  public    Integer SourceType  = null;
  protected boolean _SourceTypeSet = false;
  /** DOCUMENT_TYPE_REF.max_instances field */
  public    Integer MaxInstances  = null;
  protected boolean _MaxInstancesSet = false;
  /** DOCUMENT_TYPE_REF.document_category field */
  public    Integer DocumentCategory  = null;
  protected boolean _DocumentCategorySet = false;
  /** DOCUMENT_TYPE_REF.dispatch_flag field */
  public    Boolean DispatchFlag  = null;
  protected boolean _DispatchFlagSet = false;
  /** DOCUMENT_TYPE_REF.max_age field */
  public    Integer MaxAge  = null;
  protected boolean _MaxAgeSet = false;
  /** DOCUMENT_TYPE_REF.max_age_units field */
  public    Integer MaxAgeUnits  = null;
  protected boolean _MaxAgeUnitsSet = false;
  /** DOCUMENT_TYPE_REF.prodn_mode field */
  public    Integer ProdnMode  = null;
  protected boolean _ProdnModeSet = false;
  private String _objName = "DocumentTypeRefObjectData";
  /** Default constructor */
  public DocumentTypeRefObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public DocumentTypeRefObjectData (DocumentTypeRefObjectData other)
  {

    if (other == null) return;
    this.Key = new DocumentTypeRefObjectKeyData (other.Key);
    this.RepositoryLocation = other.RepositoryLocation;
    this._RepositoryLocationSet = other._RepositoryLocationSet;
    this.UseDocumentRepository = other.UseDocumentRepository;
    this._UseDocumentRepositorySet = other._UseDocumentRepositorySet;
    this.DispFnFmt = other.DispFnFmt;
    this._DispFnFmtSet = other._DispFnFmtSet;
    this.SourceType = other.SourceType;
    this._SourceTypeSet = other._SourceTypeSet;
    this.MaxInstances = other.MaxInstances;
    this._MaxInstancesSet = other._MaxInstancesSet;
    this.DocumentCategory = other.DocumentCategory;
    this._DocumentCategorySet = other._DocumentCategorySet;
    this.DispatchFlag = other.DispatchFlag;
    this._DispatchFlagSet = other._DispatchFlagSet;
    this.MaxAge = other.MaxAge;
    this._MaxAgeSet = other._MaxAgeSet;
    this.MaxAgeUnits = other.MaxAgeUnits;
    this._MaxAgeUnitsSet = other._MaxAgeUnitsSet;
    this.ProdnMode = other.ProdnMode;
    this._ProdnModeSet = other._ProdnModeSet;
  }

  /** get the Key for this object
   * @return DocumentTypeRefObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public DocumentTypeRefObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (DocumentTypeRefObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: DocumentTypeId (DOCUMENT_TYPE_REF.document_type_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setDocumentTypeId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DocumentTypeId", "setDocumentTypeId");
    }
    if (this.Key == null) this.Key = new DocumentTypeRefObjectKeyData ();
    this.Key.DocumentTypeId = value;
    this.Key._DocumentTypeIdSet = true;
  }
  /** get the value of the field: DocumentTypeId (DOCUMENT_TYPE_REF.document_type_id)
   * @return Integer the value
   */
  public Integer getDocumentTypeId () {
    if (this.Key == null) return null;
    return this.Key.DocumentTypeId;
  }
  /** Change the field to not being actively set: DocumentTypeId (DOCUMENT_TYPE_REF.document_type_id)
   */
  public void unsetDocumentTypeId () {
    if (this.Key == null) return;
    this.Key._DocumentTypeIdSet = false;
  }
  /** See if the field is actively set: DocumentTypeId (DOCUMENT_TYPE_REF.document_type_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetDocumentTypeId () {
    if (this.Key == null) return false;
    return this.Key._DocumentTypeIdSet;
  }

  /** Retrieves the DocumentTypeId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DocumentTypeId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DocumentTypeId field
   */
   public String getDocumentTypeIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDocumentTypeIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDocumentTypeIdAsFormattedString");
       return fmtMgr.formatNumber(this.getDocumentTypeId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DocumentTypeId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDocumentTypeIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the DocumentTypeId field from a formatted string
   *
   * @param _value the DocumentTypeId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DocumentTypeId field
   */
   public void setDocumentTypeIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDocumentTypeIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDocumentTypeId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DocumentTypeId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDocumentTypeIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDocumentTypeIdFromFormattedString");
   }

  /** set the fields value: RepositoryLocation (DOCUMENT_TYPE_REF.repository_location)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RepositoryLocation") 
  public void setRepositoryLocation (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 255))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "RepositoryLocation", "setRepositoryLocation");
    }
    this.RepositoryLocation = value;
    this._RepositoryLocationSet = true;
  }

  /** Retrieves the RepositoryLocation field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RepositoryLocation field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RepositoryLocation field
   */
   public String getRepositoryLocationAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRepositoryLocationAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRepositoryLocationAsFormattedString");
       return fmtMgr.formatString(this.getRepositoryLocation());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RepositoryLocation");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRepositoryLocationAsFormattedString");
       throw x;
     }
   }
  /** Sets the RepositoryLocation field from a formatted string
   *
   * @param _value the RepositoryLocation field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RepositoryLocation field
   */
   public void setRepositoryLocationFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRepositoryLocationFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRepositoryLocation(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RepositoryLocation");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRepositoryLocationFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRepositoryLocationFromFormattedString");
   }

  /** get the value of the field: RepositoryLocation (DOCUMENT_TYPE_REF.repository_location)
   * @return String the value
   */
  public String getRepositoryLocation () {
    return this.RepositoryLocation;
  }
  /** Change the field to not being actively set: RepositoryLocation (DOCUMENT_TYPE_REF.repository_location)
   */
  public void unsetRepositoryLocation () {
    this._RepositoryLocationSet = false;
  }
  /** See if the field is actively set: RepositoryLocation (DOCUMENT_TYPE_REF.repository_location)
   * @return boolean whether the field is actively set
   */
  public boolean issetRepositoryLocation () {
    return this._RepositoryLocationSet;
  }
  /** set the fields value: UseDocumentRepository (DOCUMENT_TYPE_REF.use_document_repository)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UseDocumentRepository") 
  public void setUseDocumentRepository (Boolean value) throws ServiceException
  {
    this.UseDocumentRepository = value;
    this._UseDocumentRepositorySet = true;
  }

  /** Retrieves the UseDocumentRepository field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UseDocumentRepository field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UseDocumentRepository field
   */
   public String getUseDocumentRepositoryAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseDocumentRepositoryAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUseDocumentRepositoryAsFormattedString");
       return fmtMgr.formatBoolean(this.getUseDocumentRepository());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UseDocumentRepository");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUseDocumentRepositoryAsFormattedString");
       throw x;
     }
   }
  /** Sets the UseDocumentRepository field from a formatted string
   *
   * @param _value the UseDocumentRepository field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UseDocumentRepository field
   */
   public void setUseDocumentRepositoryFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseDocumentRepositoryFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUseDocumentRepository(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UseDocumentRepository");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUseDocumentRepositoryFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUseDocumentRepositoryFromFormattedString");
   }

  /** get the value of the field: UseDocumentRepository (DOCUMENT_TYPE_REF.use_document_repository)
   * @return Boolean the value
   */
  public Boolean getUseDocumentRepository () {
    return this.UseDocumentRepository;
  }
  /** Change the field to not being actively set: UseDocumentRepository (DOCUMENT_TYPE_REF.use_document_repository)
   */
  public void unsetUseDocumentRepository () {
    this._UseDocumentRepositorySet = false;
  }
  /** See if the field is actively set: UseDocumentRepository (DOCUMENT_TYPE_REF.use_document_repository)
   * @return boolean whether the field is actively set
   */
  public boolean issetUseDocumentRepository () {
    return this._UseDocumentRepositorySet;
  }
  /** set the fields value: DispFnFmt (DOCUMENT_TYPE_REF.disp_fn_fmt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DispFnFmt") 
  public void setDispFnFmt (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 80))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DispFnFmt", "setDispFnFmt");
    }
    this.DispFnFmt = value;
    this._DispFnFmtSet = true;
  }

  /** Retrieves the DispFnFmt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DispFnFmt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DispFnFmt field
   */
   public String getDispFnFmtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDispFnFmtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDispFnFmtAsFormattedString");
       return fmtMgr.formatString(this.getDispFnFmt());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DispFnFmt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDispFnFmtAsFormattedString");
       throw x;
     }
   }
  /** Sets the DispFnFmt field from a formatted string
   *
   * @param _value the DispFnFmt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DispFnFmt field
   */
   public void setDispFnFmtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDispFnFmtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDispFnFmt(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DispFnFmt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDispFnFmtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDispFnFmtFromFormattedString");
   }

  /** get the value of the field: DispFnFmt (DOCUMENT_TYPE_REF.disp_fn_fmt)
   * @return String the value
   */
  public String getDispFnFmt () {
    return this.DispFnFmt;
  }
  /** Change the field to not being actively set: DispFnFmt (DOCUMENT_TYPE_REF.disp_fn_fmt)
   */
  public void unsetDispFnFmt () {
    this._DispFnFmtSet = false;
  }
  /** See if the field is actively set: DispFnFmt (DOCUMENT_TYPE_REF.disp_fn_fmt)
   * @return boolean whether the field is actively set
   */
  public boolean issetDispFnFmt () {
    return this._DispFnFmtSet;
  }
  /** set the fields value: SourceType (DOCUMENT_TYPE_REF.source_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SourceType") 
  public void setSourceType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SourceType", "setSourceType");
    }
    this.SourceType = value;
    this._SourceTypeSet = true;
  }

  /** Retrieves the SourceType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SourceType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SourceType field
   */
   public String getSourceTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSourceTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getSourceType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SourceType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSourceTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the SourceType field from a formatted string
   *
   * @param _value the SourceType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SourceType field
   */
   public void setSourceTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSourceType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SourceType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSourceTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSourceTypeFromFormattedString");
   }

  /** get the value of the field: SourceType (DOCUMENT_TYPE_REF.source_type)
   * @return Integer the value
   */
  public Integer getSourceType () {
    return this.SourceType;
  }
  /** Change the field to not being actively set: SourceType (DOCUMENT_TYPE_REF.source_type)
   */
  public void unsetSourceType () {
    this._SourceTypeSet = false;
  }
  /** See if the field is actively set: SourceType (DOCUMENT_TYPE_REF.source_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetSourceType () {
    return this._SourceTypeSet;
  }
  /** set the fields value: MaxInstances (DOCUMENT_TYPE_REF.max_instances)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MaxInstances") 
  public void setMaxInstances (Integer value) throws ServiceException
  {
    this.MaxInstances = value;
    this._MaxInstancesSet = true;
  }

  /** Retrieves the MaxInstances field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MaxInstances field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MaxInstances field
   */
   public String getMaxInstancesAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMaxInstancesAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMaxInstancesAsFormattedString");
       return fmtMgr.formatNumber(this.getMaxInstances(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MaxInstances");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMaxInstancesAsFormattedString");
       throw x;
     }
   }
  /** Sets the MaxInstances field from a formatted string
   *
   * @param _value the MaxInstances field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MaxInstances field
   */
   public void setMaxInstancesFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMaxInstancesFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMaxInstances(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MaxInstances");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMaxInstancesFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMaxInstancesFromFormattedString");
   }

  /** get the value of the field: MaxInstances (DOCUMENT_TYPE_REF.max_instances)
   * @return Integer the value
   */
  public Integer getMaxInstances () {
    return this.MaxInstances;
  }
  /** Change the field to not being actively set: MaxInstances (DOCUMENT_TYPE_REF.max_instances)
   */
  public void unsetMaxInstances () {
    this._MaxInstancesSet = false;
  }
  /** See if the field is actively set: MaxInstances (DOCUMENT_TYPE_REF.max_instances)
   * @return boolean whether the field is actively set
   */
  public boolean issetMaxInstances () {
    return this._MaxInstancesSet;
  }
  /** set the fields value: DocumentCategory (DOCUMENT_TYPE_REF.document_category)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DocumentCategory") 
  public void setDocumentCategory (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DocumentCategory", "setDocumentCategory");
    }
    this.DocumentCategory = value;
    this._DocumentCategorySet = true;
  }

  /** Retrieves the DocumentCategory field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DocumentCategory field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DocumentCategory field
   */
   public String getDocumentCategoryAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDocumentCategoryAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDocumentCategoryAsFormattedString");
       return fmtMgr.formatNumber(this.getDocumentCategory(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DocumentCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDocumentCategoryAsFormattedString");
       throw x;
     }
   }
  /** Sets the DocumentCategory field from a formatted string
   *
   * @param _value the DocumentCategory field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DocumentCategory field
   */
   public void setDocumentCategoryFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDocumentCategoryFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDocumentCategory(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DocumentCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDocumentCategoryFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDocumentCategoryFromFormattedString");
   }

  /** get the value of the field: DocumentCategory (DOCUMENT_TYPE_REF.document_category)
   * @return Integer the value
   */
  public Integer getDocumentCategory () {
    return this.DocumentCategory;
  }
  /** Change the field to not being actively set: DocumentCategory (DOCUMENT_TYPE_REF.document_category)
   */
  public void unsetDocumentCategory () {
    this._DocumentCategorySet = false;
  }
  /** See if the field is actively set: DocumentCategory (DOCUMENT_TYPE_REF.document_category)
   * @return boolean whether the field is actively set
   */
  public boolean issetDocumentCategory () {
    return this._DocumentCategorySet;
  }
  /** set the fields value: DispatchFlag (DOCUMENT_TYPE_REF.dispatch_flag)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DispatchFlag") 
  public void setDispatchFlag (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DispatchFlag", "setDispatchFlag");
    }
    this.DispatchFlag = value;
    this._DispatchFlagSet = true;
  }

  /** Retrieves the DispatchFlag field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DispatchFlag field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DispatchFlag field
   */
   public String getDispatchFlagAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDispatchFlagAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDispatchFlagAsFormattedString");
       return fmtMgr.formatBoolean(this.getDispatchFlag());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DispatchFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDispatchFlagAsFormattedString");
       throw x;
     }
   }
  /** Sets the DispatchFlag field from a formatted string
   *
   * @param _value the DispatchFlag field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DispatchFlag field
   */
   public void setDispatchFlagFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDispatchFlagFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDispatchFlag(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DispatchFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDispatchFlagFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDispatchFlagFromFormattedString");
   }

  /** get the value of the field: DispatchFlag (DOCUMENT_TYPE_REF.dispatch_flag)
   * @return Boolean the value
   */
  public Boolean getDispatchFlag () {
    return this.DispatchFlag;
  }
  /** Change the field to not being actively set: DispatchFlag (DOCUMENT_TYPE_REF.dispatch_flag)
   */
  public void unsetDispatchFlag () {
    this._DispatchFlagSet = false;
  }
  /** See if the field is actively set: DispatchFlag (DOCUMENT_TYPE_REF.dispatch_flag)
   * @return boolean whether the field is actively set
   */
  public boolean issetDispatchFlag () {
    return this._DispatchFlagSet;
  }
  /** set the fields value: MaxAge (DOCUMENT_TYPE_REF.max_age)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MaxAge") 
  public void setMaxAge (Integer value) throws ServiceException
  {
    this.MaxAge = value;
    this._MaxAgeSet = true;
  }

  /** Retrieves the MaxAge field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MaxAge field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MaxAge field
   */
   public String getMaxAgeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMaxAgeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMaxAgeAsFormattedString");
       return fmtMgr.formatNumber(this.getMaxAge(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MaxAge");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMaxAgeAsFormattedString");
       throw x;
     }
   }
  /** Sets the MaxAge field from a formatted string
   *
   * @param _value the MaxAge field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MaxAge field
   */
   public void setMaxAgeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMaxAgeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMaxAge(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MaxAge");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMaxAgeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMaxAgeFromFormattedString");
   }

  /** get the value of the field: MaxAge (DOCUMENT_TYPE_REF.max_age)
   * @return Integer the value
   */
  public Integer getMaxAge () {
    return this.MaxAge;
  }
  /** Change the field to not being actively set: MaxAge (DOCUMENT_TYPE_REF.max_age)
   */
  public void unsetMaxAge () {
    this._MaxAgeSet = false;
  }
  /** See if the field is actively set: MaxAge (DOCUMENT_TYPE_REF.max_age)
   * @return boolean whether the field is actively set
   */
  public boolean issetMaxAge () {
    return this._MaxAgeSet;
  }
  /** set the fields value: MaxAgeUnits (DOCUMENT_TYPE_REF.max_age_units)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MaxAgeUnits") 
  public void setMaxAgeUnits (Integer value) throws ServiceException
  {
    this.MaxAgeUnits = value;
    this._MaxAgeUnitsSet = true;
  }

  /** Retrieves the MaxAgeUnits field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MaxAgeUnits field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MaxAgeUnits field
   */
   public String getMaxAgeUnitsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMaxAgeUnitsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMaxAgeUnitsAsFormattedString");
       return fmtMgr.formatNumber(this.getMaxAgeUnits(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MaxAgeUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMaxAgeUnitsAsFormattedString");
       throw x;
     }
   }
  /** Sets the MaxAgeUnits field from a formatted string
   *
   * @param _value the MaxAgeUnits field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MaxAgeUnits field
   */
   public void setMaxAgeUnitsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMaxAgeUnitsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMaxAgeUnits(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MaxAgeUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMaxAgeUnitsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMaxAgeUnitsFromFormattedString");
   }

  /** get the value of the field: MaxAgeUnits (DOCUMENT_TYPE_REF.max_age_units)
   * @return Integer the value
   */
  public Integer getMaxAgeUnits () {
    return this.MaxAgeUnits;
  }
  /** Change the field to not being actively set: MaxAgeUnits (DOCUMENT_TYPE_REF.max_age_units)
   */
  public void unsetMaxAgeUnits () {
    this._MaxAgeUnitsSet = false;
  }
  /** See if the field is actively set: MaxAgeUnits (DOCUMENT_TYPE_REF.max_age_units)
   * @return boolean whether the field is actively set
   */
  public boolean issetMaxAgeUnits () {
    return this._MaxAgeUnitsSet;
  }
  /** set the fields value: ProdnMode (DOCUMENT_TYPE_REF.prodn_mode)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProdnMode") 
  public void setProdnMode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ProdnMode", "setProdnMode");
    }
    this.ProdnMode = value;
    this._ProdnModeSet = true;
  }

  /** Retrieves the ProdnMode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProdnMode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProdnMode field
   */
   public String getProdnModeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProdnModeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProdnModeAsFormattedString");
       return fmtMgr.formatNumber(this.getProdnMode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProdnMode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProdnModeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProdnMode field from a formatted string
   *
   * @param _value the ProdnMode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProdnMode field
   */
   public void setProdnModeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProdnModeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProdnMode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProdnMode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProdnModeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProdnModeFromFormattedString");
   }

  /** get the value of the field: ProdnMode (DOCUMENT_TYPE_REF.prodn_mode)
   * @return Integer the value
   */
  public Integer getProdnMode () {
    return this.ProdnMode;
  }
  /** Change the field to not being actively set: ProdnMode (DOCUMENT_TYPE_REF.prodn_mode)
   */
  public void unsetProdnMode () {
    this._ProdnModeSet = false;
  }
  /** See if the field is actively set: ProdnMode (DOCUMENT_TYPE_REF.prodn_mode)
   * @return boolean whether the field is actively set
   */
  public boolean issetProdnMode () {
    return this._ProdnModeSet;
  }
  public String toString() {
    return DocumentTypeRefObjectHelper.toMap(this, null).toString();
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
  /** DOCUMENT_TYPE_REF.repository_location field */
    if(!nonNullOnly || (RepositoryLocation != null))  _RepositoryLocationSet = flag;
  /** DOCUMENT_TYPE_REF.use_document_repository field */
    if(!nonNullOnly || (UseDocumentRepository != null))  _UseDocumentRepositorySet = flag;
  /** DOCUMENT_TYPE_REF.disp_fn_fmt field */
    if(!nonNullOnly || (DispFnFmt != null))  _DispFnFmtSet = flag;
  /** DOCUMENT_TYPE_REF.source_type field */
    if(!nonNullOnly || (SourceType != null))  _SourceTypeSet = flag;
  /** DOCUMENT_TYPE_REF.max_instances field */
    if(!nonNullOnly || (MaxInstances != null))  _MaxInstancesSet = flag;
  /** DOCUMENT_TYPE_REF.document_category field */
    if(!nonNullOnly || (DocumentCategory != null))  _DocumentCategorySet = flag;
  /** DOCUMENT_TYPE_REF.dispatch_flag field */
    if(!nonNullOnly || (DispatchFlag != null))  _DispatchFlagSet = flag;
  /** DOCUMENT_TYPE_REF.max_age field */
    if(!nonNullOnly || (MaxAge != null))  _MaxAgeSet = flag;
  /** DOCUMENT_TYPE_REF.max_age_units field */
    if(!nonNullOnly || (MaxAgeUnits != null))  _MaxAgeUnitsSet = flag;
  /** DOCUMENT_TYPE_REF.prodn_mode field */
    if(!nonNullOnly || (ProdnMode != null))  _ProdnModeSet = flag;
  }
}
