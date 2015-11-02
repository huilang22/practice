/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: NoteTextObjectKeyData.java
 * Definition File: Admin/NoteText.xml
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

/** NoteTextObject's Key Data class. */
public class NoteTextObjectKeyData  extends BaseObjectData
{
  /** NOTE_TEMPLATE_VALUES.legacy_note_code field */
  public    String Code  = null;
  protected boolean _CodeSet = false;
  /** NOTE_TEMPLATE_VALUES.note_template field */
  public    String Text  = null;
  protected boolean _TextSet = false;
  private String _objName = "NoteTextObjectKeyData";
  /** default constructor */
  public NoteTextObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public NoteTextObjectKeyData (NoteTextObjectKeyData other)
  {
    if (other == null) return;
    this.Code = other.Code;
    this._CodeSet = other._CodeSet;
    this.Text = other.Text;
    this._TextSet = other._TextSet;
  }
  /** set the fields value: Code (NOTE_TEMPLATE_VALUES.legacy_note_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Code") 
  public void setCode (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 4))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Code", "setCode");
    }
    this.Code = value;
    this._CodeSet = true;
  }

  /** Retrieves the Code field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Code field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Code field
   */
   public String getCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCodeAsFormattedString");
       return fmtMgr.formatString(this.getCode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Code");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the Code field from a formatted string
   *
   * @param _value the Code field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Code field
   */
   public void setCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Code");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCodeFromFormattedString");
   }

  /** get the value of the field: Code (NOTE_TEMPLATE_VALUES.legacy_note_code)
   * @return String the value
   */
  public String getCode () {
    return this.Code;
  }
  /** Change the field to not being actively set: Code (NOTE_TEMPLATE_VALUES.legacy_note_code)
   */
  public void unsetCode () {
    this._CodeSet = false;
  }
  /** See if the field is actively set: Code (NOTE_TEMPLATE_VALUES.legacy_note_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCode () {
    return this._CodeSet;
  }
  /** set the fields value: Text (NOTE_TEMPLATE_VALUES.note_template)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Text") 
  public void setText (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Text", "setText");
    }
    if (value != null && !DataHelper.validLength (value, 500))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Text", "setText");
    }
    this.Text = value;
    this._TextSet = true;
  }

  /** Retrieves the Text field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Text field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Text field
   */
   public String getTextAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTextAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTextAsFormattedString");
       return fmtMgr.formatString(this.getText());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Text");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTextAsFormattedString");
       throw x;
     }
   }
  /** Sets the Text field from a formatted string
   *
   * @param _value the Text field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Text field
   */
   public void setTextFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTextFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setText(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Text");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTextFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTextFromFormattedString");
   }

  /** get the value of the field: Text (NOTE_TEMPLATE_VALUES.note_template)
   * @return String the value
   */
  public String getText () {
    return this.Text;
  }
  /** Change the field to not being actively set: Text (NOTE_TEMPLATE_VALUES.note_template)
   */
  public void unsetText () {
    this._TextSet = false;
  }
  /** See if the field is actively set: Text (NOTE_TEMPLATE_VALUES.note_template)
   * @return boolean whether the field is actively set
   */
  public boolean issetText () {
    return this._TextSet;
  }
  public String toString() {
    return NoteTextObjectKeyHelper.toMap(this, null).toString();
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
    
  /** NOTE_TEMPLATE_VALUES.legacy_note_code field */
    if(!nonNullOnly || (Code != null))  _CodeSet = flag;
  /** NOTE_TEMPLATE_VALUES.note_template field */
    if(!nonNullOnly || (Text != null))  _TextSet = flag;
  }
}
