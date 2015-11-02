/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ClearingHouseContactsObjectKeyData.java
 * Definition File: Customer/ClearingHouseContacts.xml
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

/** ClearingHouseContactsObject's Key Data class. */
public class ClearingHouseContactsObjectKeyData  extends BaseObjectData
{
  /** CLEARING_HOUSE_CONTACTS.ext_contact_id field */
  public    Integer ExtContactId  = null;
  protected boolean _ExtContactIdSet = false;
  private String _objName = "ClearingHouseContactsObjectKeyData";
  /** default constructor */
  public ClearingHouseContactsObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public ClearingHouseContactsObjectKeyData (ClearingHouseContactsObjectKeyData other)
  {
    if (other == null) return;
    this.ExtContactId = other.ExtContactId;
    this._ExtContactIdSet = other._ExtContactIdSet;
  }
  /** set the fields value: ExtContactId (CLEARING_HOUSE_CONTACTS.ext_contact_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ExtContactId") 
  public void setExtContactId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ExtContactId", "setExtContactId");
    }
    this.ExtContactId = value;
    this._ExtContactIdSet = true;
  }

  /** Retrieves the ExtContactId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ExtContactId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExtContactId field
   */
   public String getExtContactIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtContactIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExtContactIdAsFormattedString");
       return fmtMgr.formatNumber(this.getExtContactId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExtContactId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getExtContactIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ExtContactId field from a formatted string
   *
   * @param _value the ExtContactId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExtContactId field
   */
   public void setExtContactIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtContactIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setExtContactId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExtContactId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setExtContactIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExtContactIdFromFormattedString");
   }

  /** get the value of the field: ExtContactId (CLEARING_HOUSE_CONTACTS.ext_contact_id)
   * @return Integer the value
   */
  public Integer getExtContactId () {
    return this.ExtContactId;
  }
  /** Change the field to not being actively set: ExtContactId (CLEARING_HOUSE_CONTACTS.ext_contact_id)
   */
  public void unsetExtContactId () {
    this._ExtContactIdSet = false;
  }
  /** See if the field is actively set: ExtContactId (CLEARING_HOUSE_CONTACTS.ext_contact_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetExtContactId () {
    return this._ExtContactIdSet;
  }
  public String toString() {
    return ClearingHouseContactsObjectKeyHelper.toMap(this, null).toString();
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
    
  /** CLEARING_HOUSE_CONTACTS.ext_contact_id field */
    if(!nonNullOnly || (ExtContactId != null))  _ExtContactIdSet = flag;
  }
}
