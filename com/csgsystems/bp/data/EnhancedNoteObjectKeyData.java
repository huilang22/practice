/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: EnhancedNoteObjectKeyData.java
 * Definition File: Customer/EnhancedNote.xml
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

/** EnhancedNoteObject's Key Data class. */
public class EnhancedNoteObjectKeyData  extends BaseObjectData
{
  /** NOTE.note_id field */
  public    BigInteger NoteId  = null;
  protected boolean _NoteIdSet = false;
  private String _objName = "EnhancedNoteObjectKeyData";
  /** default constructor */
  public EnhancedNoteObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public EnhancedNoteObjectKeyData (EnhancedNoteObjectKeyData other)
  {
    if (other == null) return;
    this.NoteId = other.NoteId;
    this._NoteIdSet = other._NoteIdSet;
  }
  /** set the fields value: NoteId (NOTE.note_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NoteId") 
  public void setNoteId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "NoteId", "setNoteId");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "NoteId", "setNoteId");
    }
    this.NoteId = value;
    this._NoteIdSet = true;
  }

  /** Retrieves the NoteId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NoteId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NoteId field
   */
   public String getNoteIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getNoteId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NoteId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNoteIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the NoteId field from a formatted string
   *
   * @param _value the NoteId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NoteId field
   */
   public void setNoteIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNoteId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NoteId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNoteIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNoteIdFromFormattedString");
   }

  /** get the value of the field: NoteId (NOTE.note_id)
   * @return BigInteger the value
   */
  public BigInteger getNoteId () {
    return this.NoteId;
  }
  /** Change the field to not being actively set: NoteId (NOTE.note_id)
   */
  public void unsetNoteId () {
    this._NoteIdSet = false;
  }
  /** See if the field is actively set: NoteId (NOTE.note_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetNoteId () {
    return this._NoteIdSet;
  }
  public String toString() {
    return EnhancedNoteObjectKeyHelper.toMap(this, null).toString();
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
    
  /** NOTE.note_id field */
    if(!nonNullOnly || (NoteId != null))  _NoteIdSet = flag;
  }
}
