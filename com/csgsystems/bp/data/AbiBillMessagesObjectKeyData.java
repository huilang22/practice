/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AbiBillMessagesObjectKeyData.java
 * Definition File: Customer/AbiBillMessages.xml
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

/** AbiBillMessagesObject's Key Data class. */
public class AbiBillMessagesObjectKeyData  extends BaseObjectData
{
  /** ABI_BILL_MESSAGES.message_id field */
  public    Integer MessageId  = null;
  protected boolean _MessageIdSet = false;
  private String _objName = "AbiBillMessagesObjectKeyData";
  /** default constructor */
  public AbiBillMessagesObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public AbiBillMessagesObjectKeyData (AbiBillMessagesObjectKeyData other)
  {
    if (other == null) return;
    this.MessageId = other.MessageId;
    this._MessageIdSet = other._MessageIdSet;
  }
  /** set the fields value: MessageId (ABI_BILL_MESSAGES.message_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MessageId") 
  public void setMessageId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MessageId", "setMessageId");
    }
    this.MessageId = value;
    this._MessageIdSet = true;
  }

  /** Retrieves the MessageId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MessageId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MessageId field
   */
   public String getMessageIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMessageIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMessageIdAsFormattedString");
       return fmtMgr.formatNumber(this.getMessageId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MessageId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMessageIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the MessageId field from a formatted string
   *
   * @param _value the MessageId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MessageId field
   */
   public void setMessageIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMessageIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMessageId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MessageId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMessageIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMessageIdFromFormattedString");
   }

  /** get the value of the field: MessageId (ABI_BILL_MESSAGES.message_id)
   * @return Integer the value
   */
  public Integer getMessageId () {
    return this.MessageId;
  }
  /** Change the field to not being actively set: MessageId (ABI_BILL_MESSAGES.message_id)
   */
  public void unsetMessageId () {
    this._MessageIdSet = false;
  }
  /** See if the field is actively set: MessageId (ABI_BILL_MESSAGES.message_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetMessageId () {
    return this._MessageIdSet;
  }
  public String toString() {
    return AbiBillMessagesObjectKeyHelper.toMap(this, null).toString();
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
    
  /** ABI_BILL_MESSAGES.message_id field */
    if(!nonNullOnly || (MessageId != null))  _MessageIdSet = flag;
  }
}
