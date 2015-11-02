/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: EDObjectKeyData.java
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

/** EDObject's Key Data class. */
public class EDObjectKeyData  extends BaseObjectData
{
  /** ENUMERATION_DEF.enumeration_id field */
  public    Integer EnumerationId  = null;
  protected boolean _EnumerationIdSet = false;
  private String _objName = "EDObjectKeyData";
  /** default constructor */
  public EDObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public EDObjectKeyData (EDObjectKeyData other)
  {
    if (other == null) return;
    this.EnumerationId = other.EnumerationId;
    this._EnumerationIdSet = other._EnumerationIdSet;
  }
  /** set the fields value: EnumerationId (ENUMERATION_DEF.enumeration_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EnumerationId") 
  public void setEnumerationId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "EnumerationId", "setEnumerationId");
    }
    this.EnumerationId = value;
    this._EnumerationIdSet = true;
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

  /** get the value of the field: EnumerationId (ENUMERATION_DEF.enumeration_id)
   * @return Integer the value
   */
  public Integer getEnumerationId () {
    return this.EnumerationId;
  }
  /** Change the field to not being actively set: EnumerationId (ENUMERATION_DEF.enumeration_id)
   */
  public void unsetEnumerationId () {
    this._EnumerationIdSet = false;
  }
  /** See if the field is actively set: EnumerationId (ENUMERATION_DEF.enumeration_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetEnumerationId () {
    return this._EnumerationIdSet;
  }
  public String toString() {
    return EDObjectKeyHelper.toMap(this, null).toString();
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
    
  /** ENUMERATION_DEF.enumeration_id field */
    if(!nonNullOnly || (EnumerationId != null))  _EnumerationIdSet = flag;
  }
}
