/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: DocumentTypeRefObjectKeyData.java
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

/** DocumentTypeRefObject's Key Data class. */
public class DocumentTypeRefObjectKeyData  extends BaseObjectData
{
  /** DOCUMENT_TYPE_REF.document_type_id field */
  public    Integer DocumentTypeId  = null;
  protected boolean _DocumentTypeIdSet = false;
  private String _objName = "DocumentTypeRefObjectKeyData";
  /** default constructor */
  public DocumentTypeRefObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public DocumentTypeRefObjectKeyData (DocumentTypeRefObjectKeyData other)
  {
    if (other == null) return;
    this.DocumentTypeId = other.DocumentTypeId;
    this._DocumentTypeIdSet = other._DocumentTypeIdSet;
  }
  /** set the fields value: DocumentTypeId (DOCUMENT_TYPE_REF.document_type_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DocumentTypeId") 
  public void setDocumentTypeId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DocumentTypeId", "setDocumentTypeId");
    }
    this.DocumentTypeId = value;
    this._DocumentTypeIdSet = true;
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

  /** get the value of the field: DocumentTypeId (DOCUMENT_TYPE_REF.document_type_id)
   * @return Integer the value
   */
  public Integer getDocumentTypeId () {
    return this.DocumentTypeId;
  }
  /** Change the field to not being actively set: DocumentTypeId (DOCUMENT_TYPE_REF.document_type_id)
   */
  public void unsetDocumentTypeId () {
    this._DocumentTypeIdSet = false;
  }
  /** See if the field is actively set: DocumentTypeId (DOCUMENT_TYPE_REF.document_type_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetDocumentTypeId () {
    return this._DocumentTypeIdSet;
  }
  public String toString() {
    return DocumentTypeRefObjectKeyHelper.toMap(this, null).toString();
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
    
  /** DOCUMENT_TYPE_REF.document_type_id field */
    if(!nonNullOnly || (DocumentTypeId != null))  _DocumentTypeIdSet = flag;
  }
}
