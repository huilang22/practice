/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CustomerDocumentObjectKeyData.java
 * Definition File: Customer/CustomerDocument.xml
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

/** CustomerDocumentObject's Key Data class. */
public class CustomerDocumentObjectKeyData  extends BaseObjectData
{
  /** CUSTOMER_DOCUMENT.document_id field */
  public    Integer DocumentId  = null;
  protected boolean _DocumentIdSet = false;
  private String _objName = "CustomerDocumentObjectKeyData";
  /** default constructor */
  public CustomerDocumentObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public CustomerDocumentObjectKeyData (CustomerDocumentObjectKeyData other)
  {
    if (other == null) return;
    this.DocumentId = other.DocumentId;
    this._DocumentIdSet = other._DocumentIdSet;
  }
  /** set the fields value: DocumentId (CUSTOMER_DOCUMENT.document_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DocumentId") 
  public void setDocumentId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DocumentId", "setDocumentId");
    }
    this.DocumentId = value;
    this._DocumentIdSet = true;
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

  /** get the value of the field: DocumentId (CUSTOMER_DOCUMENT.document_id)
   * @return Integer the value
   */
  public Integer getDocumentId () {
    return this.DocumentId;
  }
  /** Change the field to not being actively set: DocumentId (CUSTOMER_DOCUMENT.document_id)
   */
  public void unsetDocumentId () {
    this._DocumentIdSet = false;
  }
  /** See if the field is actively set: DocumentId (CUSTOMER_DOCUMENT.document_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetDocumentId () {
    return this._DocumentIdSet;
  }
  public String toString() {
    return CustomerDocumentObjectKeyHelper.toMap(this, null).toString();
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
    
  /** CUSTOMER_DOCUMENT.document_id field */
    if(!nonNullOnly || (DocumentId != null))  _DocumentIdSet = flag;
  }
}
