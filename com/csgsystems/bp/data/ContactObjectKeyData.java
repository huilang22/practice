/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ContactObjectKeyData.java
 * Definition File: Customer/Contact.xml
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

/** ContactObject's Key Data class. */
public class ContactObjectKeyData  extends BaseObjectData
{
  /** CONTACTS.contact_id field */
  public    Integer ContactId  = null;
  protected boolean _ContactIdSet = false;
  private String _objName = "ContactObjectKeyData";
  /** default constructor */
  public ContactObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public ContactObjectKeyData (ContactObjectKeyData other)
  {
    if (other == null) return;
    this.ContactId = other.ContactId;
    this._ContactIdSet = other._ContactIdSet;
  }
  /** set the fields value: ContactId (CONTACTS.contact_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ContactId") 
  public void setContactId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ContactId", "setContactId");
    }
    this.ContactId = value;
    this._ContactIdSet = true;
  }

  /** Retrieves the ContactId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ContactId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContactId field
   */
   public String getContactIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContactIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContactIdAsFormattedString");
       return fmtMgr.formatNumber(this.getContactId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContactId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getContactIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ContactId field from a formatted string
   *
   * @param _value the ContactId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ContactId field
   */
   public void setContactIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContactIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setContactId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContactId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setContactIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContactIdFromFormattedString");
   }

  /** get the value of the field: ContactId (CONTACTS.contact_id)
   * @return Integer the value
   */
  public Integer getContactId () {
    return this.ContactId;
  }
  /** Change the field to not being actively set: ContactId (CONTACTS.contact_id)
   */
  public void unsetContactId () {
    this._ContactIdSet = false;
  }
  /** See if the field is actively set: ContactId (CONTACTS.contact_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetContactId () {
    return this._ContactIdSet;
  }
  public String toString() {
    return ContactObjectKeyHelper.toMap(this, null).toString();
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
    
  /** CONTACTS.contact_id field */
    if(!nonNullOnly || (ContactId != null))  _ContactIdSet = flag;
  }
}
