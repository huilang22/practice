/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: NoteTextObjectData.java
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
  
/** NoteTextObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class NoteTextObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public NoteTextObjectKeyData Key = null;
  private String _objName = "NoteTextObjectData";
  /** Default constructor */
  public NoteTextObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public NoteTextObjectData (NoteTextObjectData other)
  {

    if (other == null) return;
    this.Key = new NoteTextObjectKeyData (other.Key);
  }

  /** get the Key for this object
   * @return NoteTextObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public NoteTextObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (NoteTextObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: Code (NOTE_TEMPLATE_VALUES.legacy_note_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCode (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Code", "setCode");
    }
    if (value != null && !DataHelper.validLength (value, 4))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Code", "setCode");
    }
    if (this.Key == null) this.Key = new NoteTextObjectKeyData ();
    this.Key.Code = value;
    this.Key._CodeSet = true;
  }
  /** get the value of the field: Code (NOTE_TEMPLATE_VALUES.legacy_note_code)
   * @return String the value
   */
  public String getCode () {
    if (this.Key == null) return null;
    return this.Key.Code;
  }
  /** Change the field to not being actively set: Code (NOTE_TEMPLATE_VALUES.legacy_note_code)
   */
  public void unsetCode () {
    if (this.Key == null) return;
    this.Key._CodeSet = false;
  }
  /** See if the field is actively set: Code (NOTE_TEMPLATE_VALUES.legacy_note_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCode () {
    if (this.Key == null) return false;
    return this.Key._CodeSet;
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

  /** set the fields value: Text (NOTE_TEMPLATE_VALUES.note_template)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
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
    if (this.Key == null) this.Key = new NoteTextObjectKeyData ();
    this.Key.Text = value;
    this.Key._TextSet = true;
  }
  /** get the value of the field: Text (NOTE_TEMPLATE_VALUES.note_template)
   * @return String the value
   */
  public String getText () {
    if (this.Key == null) return null;
    return this.Key.Text;
  }
  /** Change the field to not being actively set: Text (NOTE_TEMPLATE_VALUES.note_template)
   */
  public void unsetText () {
    if (this.Key == null) return;
    this.Key._TextSet = false;
  }
  /** See if the field is actively set: Text (NOTE_TEMPLATE_VALUES.note_template)
   * @return boolean whether the field is actively set
   */
  public boolean issetText () {
    if (this.Key == null) return false;
    return this.Key._TextSet;
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

  public String toString() {
    return NoteTextObjectHelper.toMap(this, null).toString();
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
  }
}
