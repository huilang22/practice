/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CustomerDtUrlGetObjectData.java
 * Definition File: Customer/CustomerDtUrl.xml
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
  
/** CustomerDtUrlGetObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class CustomerDtUrlGetObjectData extends BaseObjectData implements Serializable
{

  /** DocumentId field */
  public    Integer DocumentId  = null;
  protected boolean _DocumentIdSet = false;
  /** DocumentTypeId field */
  public    Integer DocumentTypeId  = null;
  protected boolean _DocumentTypeIdSet = false;
  /** SourceId field */
  public    Integer SourceId  = null;
  protected boolean _SourceIdSet = false;
  /** SourceId2 field */
  public    Integer SourceId2  = null;
  protected boolean _SourceId2Set = false;
  /** DisFilename field */
  public    String DisFilename  = null;
  protected boolean _DisFilenameSet = false;
  /** CustomerDocURL field */
  public    String CustomerDocURL  = null;
  protected boolean _CustomerDocURLSet = false;
  private String _objName = "CustomerDtUrlGetObjectData";
  /** Default constructor */
  public CustomerDtUrlGetObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public CustomerDtUrlGetObjectData (CustomerDtUrlGetObjectData other)
  {

    if (other == null) return;
    this.DocumentId = other.DocumentId;
    this._DocumentIdSet = other._DocumentIdSet;
    this.DocumentTypeId = other.DocumentTypeId;
    this._DocumentTypeIdSet = other._DocumentTypeIdSet;
    this.SourceId = other.SourceId;
    this._SourceIdSet = other._SourceIdSet;
    this.SourceId2 = other.SourceId2;
    this._SourceId2Set = other._SourceId2Set;
    this.DisFilename = other.DisFilename;
    this._DisFilenameSet = other._DisFilenameSet;
    this.CustomerDocURL = other.CustomerDocURL;
    this._CustomerDocURLSet = other._CustomerDocURLSet;
  }

  /** set the fields value: DocumentId
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setDocumentId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DocumentId", "setDocumentId");
    }
    this.DocumentId = value;
    this._DocumentIdSet = true;
  }
  /** get the value of the field: DocumentId
   * @return Integer the value
   */
  public Integer getDocumentId ()
  {
    return this.DocumentId;
  }
  /** Change the field to not being actively set: DocumentId
   */
  public void unsetDocumentId ()
  {
    this._DocumentIdSet = false;
  }
  /** See if the field is actively set: DocumentId
   * @return boolean whether the field is actively set
   */
  public boolean issetDocumentId ()
  {
    return this._DocumentIdSet;
  }

  /** Retrieves the DocumentId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DocumentId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DocumentId field
   */
   public String getDocumentIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDocumentIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDocumentIdAsFormattedString");
       return fmtMgr.formatNumber(this.getDocumentId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DocumentId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDocumentIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the DocumentId field from a formatted string
   *
   * @param _value the DocumentId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DocumentId field
   */
   public void setDocumentIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDocumentIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDocumentId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DocumentId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDocumentIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDocumentIdFromFormattedString");
   }

  /** set the fields value: DocumentTypeId
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setDocumentTypeId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DocumentTypeId", "setDocumentTypeId");
    }
    this.DocumentTypeId = value;
    this._DocumentTypeIdSet = true;
  }
  /** get the value of the field: DocumentTypeId
   * @return Integer the value
   */
  public Integer getDocumentTypeId ()
  {
    return this.DocumentTypeId;
  }
  /** Change the field to not being actively set: DocumentTypeId
   */
  public void unsetDocumentTypeId ()
  {
    this._DocumentTypeIdSet = false;
  }
  /** See if the field is actively set: DocumentTypeId
   * @return boolean whether the field is actively set
   */
  public boolean issetDocumentTypeId ()
  {
    return this._DocumentTypeIdSet;
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

  /** set the fields value: SourceId
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setSourceId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SourceId", "setSourceId");
    }
    this.SourceId = value;
    this._SourceIdSet = true;
  }
  /** get the value of the field: SourceId
   * @return Integer the value
   */
  public Integer getSourceId ()
  {
    return this.SourceId;
  }
  /** Change the field to not being actively set: SourceId
   */
  public void unsetSourceId ()
  {
    this._SourceIdSet = false;
  }
  /** See if the field is actively set: SourceId
   * @return boolean whether the field is actively set
   */
  public boolean issetSourceId ()
  {
    return this._SourceIdSet;
  }

  /** Retrieves the SourceId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SourceId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SourceId field
   */
   public String getSourceIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSourceIdAsFormattedString");
       return fmtMgr.formatNumber(this.getSourceId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SourceId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSourceIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the SourceId field from a formatted string
   *
   * @param _value the SourceId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SourceId field
   */
   public void setSourceIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSourceId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SourceId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSourceIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSourceIdFromFormattedString");
   }

  /** set the fields value: SourceId2
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setSourceId2 (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SourceId2", "setSourceId2");
    }
    this.SourceId2 = value;
    this._SourceId2Set = true;
  }
  /** get the value of the field: SourceId2
   * @return Integer the value
   */
  public Integer getSourceId2 ()
  {
    return this.SourceId2;
  }
  /** Change the field to not being actively set: SourceId2
   */
  public void unsetSourceId2 ()
  {
    this._SourceId2Set = false;
  }
  /** See if the field is actively set: SourceId2
   * @return boolean whether the field is actively set
   */
  public boolean issetSourceId2 ()
  {
    return this._SourceId2Set;
  }

  /** Retrieves the SourceId2 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SourceId2 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SourceId2 field
   */
   public String getSourceId2AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceId2AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSourceId2AsFormattedString");
       return fmtMgr.formatNumber(this.getSourceId2(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SourceId2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSourceId2AsFormattedString");
       throw x;
     }
   }
  /** Sets the SourceId2 field from a formatted string
   *
   * @param _value the SourceId2 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SourceId2 field
   */
   public void setSourceId2FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceId2FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSourceId2(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SourceId2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSourceId2FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSourceId2FromFormattedString");
   }

  /** set the fields value: DisFilename
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setDisFilename (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DisFilename", "setDisFilename");
    }
    this.DisFilename = value;
    this._DisFilenameSet = true;
  }
  /** get the value of the field: DisFilename
   * @return String the value
   */
  public String getDisFilename ()
  {
    return this.DisFilename;
  }
  /** Change the field to not being actively set: DisFilename
   */
  public void unsetDisFilename ()
  {
    this._DisFilenameSet = false;
  }
  /** See if the field is actively set: DisFilename
   * @return boolean whether the field is actively set
   */
  public boolean issetDisFilename ()
  {
    return this._DisFilenameSet;
  }

  /** Retrieves the DisFilename field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DisFilename field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DisFilename field
   */
   public String getDisFilenameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisFilenameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDisFilenameAsFormattedString");
       return fmtMgr.formatString(this.getDisFilename());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DisFilename");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDisFilenameAsFormattedString");
       throw x;
     }
   }
  /** Sets the DisFilename field from a formatted string
   *
   * @param _value the DisFilename field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DisFilename field
   */
   public void setDisFilenameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisFilenameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDisFilename(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DisFilename");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDisFilenameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDisFilenameFromFormattedString");
   }

  /** set the fields value: CustomerDocURL
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCustomerDocURL (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CustomerDocURL", "setCustomerDocURL");
    }
    this.CustomerDocURL = value;
    this._CustomerDocURLSet = true;
  }
  /** get the value of the field: CustomerDocURL
   * @return String the value
   */
  public String getCustomerDocURL ()
  {
    return this.CustomerDocURL;
  }
  /** Change the field to not being actively set: CustomerDocURL
   */
  public void unsetCustomerDocURL ()
  {
    this._CustomerDocURLSet = false;
  }
  /** See if the field is actively set: CustomerDocURL
   * @return boolean whether the field is actively set
   */
  public boolean issetCustomerDocURL ()
  {
    return this._CustomerDocURLSet;
  }

  /** Retrieves the CustomerDocURL field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustomerDocURL field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustomerDocURL field
   */
   public String getCustomerDocURLAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerDocURLAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerDocURLAsFormattedString");
       return fmtMgr.formatString(this.getCustomerDocURL());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustomerDocURL");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustomerDocURLAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustomerDocURL field from a formatted string
   *
   * @param _value the CustomerDocURL field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustomerDocURL field
   */
   public void setCustomerDocURLFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerDocURLFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustomerDocURL(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustomerDocURL");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustomerDocURLFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustomerDocURLFromFormattedString");
   }

  public String toString() {
    return CustomerDtUrlGetObjectHelper.toMap(this, null).toString();
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
    
  /** DocumentId field */
    if (!nonNullOnly || (DocumentId != null)) _DocumentIdSet = flag;
  /** DocumentTypeId field */
    if (!nonNullOnly || (DocumentTypeId != null)) _DocumentTypeIdSet = flag;
  /** SourceId field */
    if (!nonNullOnly || (SourceId != null)) _SourceIdSet = flag;
  /** SourceId2 field */
    if (!nonNullOnly || (SourceId2 != null)) _SourceId2Set = flag;
  /** DisFilename field */
    if (!nonNullOnly || (DisFilename != null)) _DisFilenameSet = flag;
  /** CustomerDocURL field */
    if (!nonNullOnly || (CustomerDocURL != null)) _CustomerDocURLSet = flag;
  }
}
