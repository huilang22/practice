/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: EnhancedNoteObjectData.java
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
  
/** EnhancedNoteObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class EnhancedNoteObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public EnhancedNoteObjectKeyData Key = null;
  /** NOTE.parent_code field */
  public    Integer ParentCode  = null;
  protected boolean _ParentCodeSet = false;
  /** NOTE.parent_id1 field */
  public    BigInteger ParentId1  = null;
  protected boolean _ParentId1Set = false;
  /** NOTE.parent_id2 field */
  public    Integer ParentId2  = null;
  protected boolean _ParentId2Set = false;
  /** NOTE.legacy_note_code field */
  public    String LegacyNoteCode  = null;
  protected boolean _LegacyNoteCodeSet = false;
  /** NOTE.note_source field */
  public    Integer NoteSource  = null;
  protected boolean _NoteSourceSet = false;
  /** NOTE.is_permanent field */
  public    Boolean IsPermanent  = null;
  protected boolean _IsPermanentSet = false;
  /** NOTE.chg_who field */
  public    String ChgWho  = null;
  protected boolean _ChgWhoSet = false;
  /** NOTE.chg_dt field */
  public    Date ChgDt  = null;
  protected boolean _ChgDtSet = false;
  /** NOTE.note_text field */
  public    String NoteText  = null;
  protected boolean _NoteTextSet = false;
  /** NOTE.note_template_id field */
  public    Integer NoteTemplateId  = null;
  protected boolean _NoteTemplateIdSet = false;
  /** NOTE.note_type_id field */
  public    Integer NoteTypeId  = null;
  protected boolean _NoteTypeIdSet = false;
  /** NOTE.note_reason_id field */
  public    Integer NoteReasonId  = null;
  protected boolean _NoteReasonIdSet = false;
  private String _objName = "EnhancedNoteObjectData";
  /** Default constructor */
  public EnhancedNoteObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public EnhancedNoteObjectData (EnhancedNoteObjectData other)
  {

    if (other == null) return;
    this.Key = new EnhancedNoteObjectKeyData (other.Key);
    this.ParentCode = other.ParentCode;
    this._ParentCodeSet = other._ParentCodeSet;
    this.ParentId1 = other.ParentId1;
    this._ParentId1Set = other._ParentId1Set;
    this.ParentId2 = other.ParentId2;
    this._ParentId2Set = other._ParentId2Set;
    this.LegacyNoteCode = other.LegacyNoteCode;
    this._LegacyNoteCodeSet = other._LegacyNoteCodeSet;
    this.NoteSource = other.NoteSource;
    this._NoteSourceSet = other._NoteSourceSet;
    this.IsPermanent = other.IsPermanent;
    this._IsPermanentSet = other._IsPermanentSet;
    this.ChgWho = other.ChgWho;
    this._ChgWhoSet = other._ChgWhoSet;
    this.ChgDt = other.ChgDt;
    this._ChgDtSet = other._ChgDtSet;
    this.NoteText = other.NoteText;
    this._NoteTextSet = other._NoteTextSet;
    this.NoteTemplateId = other.NoteTemplateId;
    this._NoteTemplateIdSet = other._NoteTemplateIdSet;
    this.NoteTypeId = other.NoteTypeId;
    this._NoteTypeIdSet = other._NoteTypeIdSet;
    this.NoteReasonId = other.NoteReasonId;
    this._NoteReasonIdSet = other._NoteReasonIdSet;
  }

  /** get the Key for this object
   * @return EnhancedNoteObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public EnhancedNoteObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (EnhancedNoteObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: NoteId (NOTE.note_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
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
    if (this.Key == null) this.Key = new EnhancedNoteObjectKeyData ();
    this.Key.NoteId = value;
    this.Key._NoteIdSet = true;
  }
  /** get the value of the field: NoteId (NOTE.note_id)
   * @return BigInteger the value
   */
  public BigInteger getNoteId () {
    if (this.Key == null) return null;
    return this.Key.NoteId;
  }
  /** Change the field to not being actively set: NoteId (NOTE.note_id)
   */
  public void unsetNoteId () {
    if (this.Key == null) return;
    this.Key._NoteIdSet = false;
  }
  /** See if the field is actively set: NoteId (NOTE.note_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetNoteId () {
    if (this.Key == null) return false;
    return this.Key._NoteIdSet;
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

  /** set the fields value: ParentCode (NOTE.parent_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ParentCode") 
  public void setParentCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ParentCode", "setParentCode");
    }
    this.ParentCode = value;
    this._ParentCodeSet = true;
  }

  /** Retrieves the ParentCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ParentCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentCode field
   */
   public String getParentCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getParentCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ParentCode field from a formatted string
   *
   * @param _value the ParentCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ParentCode field
   */
   public void setParentCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setParentCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentCodeFromFormattedString");
   }

  /** get the value of the field: ParentCode (NOTE.parent_code)
   * @return Integer the value
   */
  public Integer getParentCode () {
    return this.ParentCode;
  }
  /** Change the field to not being actively set: ParentCode (NOTE.parent_code)
   */
  public void unsetParentCode () {
    this._ParentCodeSet = false;
  }
  /** See if the field is actively set: ParentCode (NOTE.parent_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetParentCode () {
    return this._ParentCodeSet;
  }
  /** set the fields value: ParentId1 (NOTE.parent_id1)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ParentId1") 
  public void setParentId1 (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ParentId1", "setParentId1");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ParentId1", "setParentId1");
    }
    this.ParentId1 = value;
    this._ParentId1Set = true;
  }

  /** Retrieves the ParentId1 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ParentId1 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentId1 field
   */
   public String getParentId1AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentId1AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentId1AsFormattedString");
       return fmtMgr.formatBigInteger(this.getParentId1(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentId1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentId1AsFormattedString");
       throw x;
     }
   }
  /** Sets the ParentId1 field from a formatted string
   *
   * @param _value the ParentId1 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ParentId1 field
   */
   public void setParentId1FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentId1FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setParentId1(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentId1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentId1FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentId1FromFormattedString");
   }

  /**
   * Retrieves the ParentId1 field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ParentId1 field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentId1 field
   */
  public String getParentId1AsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentId1AsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentId1AsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getParentId1(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentId1");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentId1AsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the ParentId1 field value from a formatted currency string
   *
   * @param _value the ParentId1 field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ParentId1 field
   */
  public void setParentId1FromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setParentId1FromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setParentId1(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentId1");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentId1FromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentId1FromFormattedCurrencyString");
  }

  /** get the value of the field: ParentId1 (NOTE.parent_id1)
   * @return BigInteger the value
   */
  public BigInteger getParentId1 () {
    return this.ParentId1;
  }
  /** Change the field to not being actively set: ParentId1 (NOTE.parent_id1)
   */
  public void unsetParentId1 () {
    this._ParentId1Set = false;
  }
  /** See if the field is actively set: ParentId1 (NOTE.parent_id1)
   * @return boolean whether the field is actively set
   */
  public boolean issetParentId1 () {
    return this._ParentId1Set;
  }
  /** set the fields value: ParentId2 (NOTE.parent_id2)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ParentId2") 
  public void setParentId2 (Integer value) throws ServiceException
  {
    this.ParentId2 = value;
    this._ParentId2Set = true;
  }

  /** Retrieves the ParentId2 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ParentId2 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentId2 field
   */
   public String getParentId2AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentId2AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentId2AsFormattedString");
       return fmtMgr.formatNumber(this.getParentId2(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentId2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentId2AsFormattedString");
       throw x;
     }
   }
  /** Sets the ParentId2 field from a formatted string
   *
   * @param _value the ParentId2 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ParentId2 field
   */
   public void setParentId2FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentId2FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setParentId2(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentId2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentId2FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentId2FromFormattedString");
   }

  /** get the value of the field: ParentId2 (NOTE.parent_id2)
   * @return Integer the value
   */
  public Integer getParentId2 () {
    return this.ParentId2;
  }
  /** Change the field to not being actively set: ParentId2 (NOTE.parent_id2)
   */
  public void unsetParentId2 () {
    this._ParentId2Set = false;
  }
  /** See if the field is actively set: ParentId2 (NOTE.parent_id2)
   * @return boolean whether the field is actively set
   */
  public boolean issetParentId2 () {
    return this._ParentId2Set;
  }
  /** set the fields value: LegacyNoteCode (NOTE.legacy_note_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("LegacyNoteCode") 
  public void setLegacyNoteCode (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 4))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "LegacyNoteCode", "setLegacyNoteCode");
    }
    this.LegacyNoteCode = value;
    this._LegacyNoteCodeSet = true;
  }

  /** Retrieves the LegacyNoteCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LegacyNoteCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LegacyNoteCode field
   */
   public String getLegacyNoteCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLegacyNoteCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLegacyNoteCodeAsFormattedString");
       return fmtMgr.formatString(this.getLegacyNoteCode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LegacyNoteCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLegacyNoteCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the LegacyNoteCode field from a formatted string
   *
   * @param _value the LegacyNoteCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LegacyNoteCode field
   */
   public void setLegacyNoteCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLegacyNoteCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLegacyNoteCode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LegacyNoteCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLegacyNoteCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLegacyNoteCodeFromFormattedString");
   }

  /** get the value of the field: LegacyNoteCode (NOTE.legacy_note_code)
   * @return String the value
   */
  public String getLegacyNoteCode () {
    return this.LegacyNoteCode;
  }
  /** Change the field to not being actively set: LegacyNoteCode (NOTE.legacy_note_code)
   */
  public void unsetLegacyNoteCode () {
    this._LegacyNoteCodeSet = false;
  }
  /** See if the field is actively set: LegacyNoteCode (NOTE.legacy_note_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetLegacyNoteCode () {
    return this._LegacyNoteCodeSet;
  }
  /** set the fields value: NoteSource (NOTE.note_source)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NoteSource") 
  public void setNoteSource (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "NoteSource", "setNoteSource");
    }
    this.NoteSource = value;
    this._NoteSourceSet = true;
  }

  /** Retrieves the NoteSource field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NoteSource field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NoteSource field
   */
   public String getNoteSourceAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteSourceAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteSourceAsFormattedString");
       return fmtMgr.formatNumber(this.getNoteSource(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NoteSource");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNoteSourceAsFormattedString");
       throw x;
     }
   }
  /** Sets the NoteSource field from a formatted string
   *
   * @param _value the NoteSource field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NoteSource field
   */
   public void setNoteSourceFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteSourceFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNoteSource(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NoteSource");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNoteSourceFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNoteSourceFromFormattedString");
   }

  /** get the value of the field: NoteSource (NOTE.note_source)
   * @return Integer the value
   */
  public Integer getNoteSource () {
    return this.NoteSource;
  }
  /** Change the field to not being actively set: NoteSource (NOTE.note_source)
   */
  public void unsetNoteSource () {
    this._NoteSourceSet = false;
  }
  /** See if the field is actively set: NoteSource (NOTE.note_source)
   * @return boolean whether the field is actively set
   */
  public boolean issetNoteSource () {
    return this._NoteSourceSet;
  }
  /** set the fields value: IsPermanent (NOTE.is_permanent)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsPermanent") 
  public void setIsPermanent (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsPermanent", "setIsPermanent");
    }
    this.IsPermanent = value;
    this._IsPermanentSet = true;
  }

  /** Retrieves the IsPermanent field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsPermanent field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsPermanent field
   */
   public String getIsPermanentAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsPermanentAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsPermanentAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsPermanent());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsPermanent");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsPermanentAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsPermanent field from a formatted string
   *
   * @param _value the IsPermanent field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsPermanent field
   */
   public void setIsPermanentFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsPermanentFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsPermanent(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsPermanent");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsPermanentFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsPermanentFromFormattedString");
   }

  /** get the value of the field: IsPermanent (NOTE.is_permanent)
   * @return Boolean the value
   */
  public Boolean getIsPermanent () {
    return this.IsPermanent;
  }
  /** Change the field to not being actively set: IsPermanent (NOTE.is_permanent)
   */
  public void unsetIsPermanent () {
    this._IsPermanentSet = false;
  }
  /** See if the field is actively set: IsPermanent (NOTE.is_permanent)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsPermanent () {
    return this._IsPermanentSet;
  }
  /** set the fields value: ChgWho (NOTE.chg_who)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChgWho") 
  public void setChgWho (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChgWho", "setChgWho");
    }
    if (value != null && !DataHelper.validLength (value, 32))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ChgWho", "setChgWho");
    }
    this.ChgWho = value;
    this._ChgWhoSet = true;
  }

  /** Retrieves the ChgWho field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChgWho field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgWho field
   */
   public String getChgWhoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgWhoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgWhoAsFormattedString");
       return fmtMgr.formatString(this.getChgWho());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgWho");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgWhoAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChgWho field from a formatted string
   *
   * @param _value the ChgWho field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgWho field
   */
   public void setChgWhoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgWhoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChgWho(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgWho");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgWhoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgWhoFromFormattedString");
   }

  /** get the value of the field: ChgWho (NOTE.chg_who)
   * @return String the value
   */
  public String getChgWho () {
    return this.ChgWho;
  }
  /** Change the field to not being actively set: ChgWho (NOTE.chg_who)
   */
  public void unsetChgWho () {
    this._ChgWhoSet = false;
  }
  /** See if the field is actively set: ChgWho (NOTE.chg_who)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgWho () {
    return this._ChgWhoSet;
  }
  /** set the fields value: ChgDt (NOTE.chg_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChgDt") 
  public void setChgDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChgDt", "setChgDt");
    }
    this.ChgDt = value;
    this._ChgDtSet = true;
  }

  /** Retrieves the ChgDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChgDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDt field
   */
   public String getChgDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDtAsFormattedString");
       return fmtMgr.formatDate(this.getChgDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChgDt field from a formatted string
   *
   * @param _value the ChgDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDt field
   */
   public void setChgDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChgDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDtFromFormattedString");
   }

  /**
   * Retrieves the ChgDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDt field
   */
  public String getChgDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getChgDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDt field value from a formatted date/time string
   *
   * @param _value the ChgDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDt field
   */
  public void setChgDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setChgDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ChgDt (NOTE.chg_dt)
   * @return Date the value
   */
  public Date getChgDt () {
    return this.ChgDt;
  }
  /** Change the field to not being actively set: ChgDt (NOTE.chg_dt)
   */
  public void unsetChgDt () {
    this._ChgDtSet = false;
  }
  /** See if the field is actively set: ChgDt (NOTE.chg_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgDt () {
    return this._ChgDtSet;
  }
  /** set the fields value: NoteText (NOTE.note_text)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NoteText") 
  public void setNoteText (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "NoteText", "setNoteText");
    }
    if (value != null && !DataHelper.validLength (value, 1333))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "NoteText", "setNoteText");
    }
    this.NoteText = value;
    this._NoteTextSet = true;
  }

  /** Retrieves the NoteText field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NoteText field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NoteText field
   */
   public String getNoteTextAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteTextAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteTextAsFormattedString");
       return fmtMgr.formatString(this.getNoteText());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NoteText");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNoteTextAsFormattedString");
       throw x;
     }
   }
  /** Sets the NoteText field from a formatted string
   *
   * @param _value the NoteText field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NoteText field
   */
   public void setNoteTextFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteTextFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNoteText(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NoteText");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNoteTextFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNoteTextFromFormattedString");
   }

  /** get the value of the field: NoteText (NOTE.note_text)
   * @return String the value
   */
  public String getNoteText () {
    return this.NoteText;
  }
  /** Change the field to not being actively set: NoteText (NOTE.note_text)
   */
  public void unsetNoteText () {
    this._NoteTextSet = false;
  }
  /** See if the field is actively set: NoteText (NOTE.note_text)
   * @return boolean whether the field is actively set
   */
  public boolean issetNoteText () {
    return this._NoteTextSet;
  }
  /** set the fields value: NoteTemplateId (NOTE.note_template_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NoteTemplateId") 
  public void setNoteTemplateId (Integer value) throws ServiceException
  {
    this.NoteTemplateId = value;
    this._NoteTemplateIdSet = true;
  }

  /** Retrieves the NoteTemplateId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NoteTemplateId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NoteTemplateId field
   */
   public String getNoteTemplateIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteTemplateIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteTemplateIdAsFormattedString");
       return fmtMgr.formatNumber(this.getNoteTemplateId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NoteTemplateId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNoteTemplateIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the NoteTemplateId field from a formatted string
   *
   * @param _value the NoteTemplateId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NoteTemplateId field
   */
   public void setNoteTemplateIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteTemplateIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNoteTemplateId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NoteTemplateId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNoteTemplateIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNoteTemplateIdFromFormattedString");
   }

  /** get the value of the field: NoteTemplateId (NOTE.note_template_id)
   * @return Integer the value
   */
  public Integer getNoteTemplateId () {
    return this.NoteTemplateId;
  }
  /** Change the field to not being actively set: NoteTemplateId (NOTE.note_template_id)
   */
  public void unsetNoteTemplateId () {
    this._NoteTemplateIdSet = false;
  }
  /** See if the field is actively set: NoteTemplateId (NOTE.note_template_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetNoteTemplateId () {
    return this._NoteTemplateIdSet;
  }
  /** set the fields value: NoteTypeId (NOTE.note_type_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NoteTypeId") 
  public void setNoteTypeId (Integer value) throws ServiceException
  {
    this.NoteTypeId = value;
    this._NoteTypeIdSet = true;
  }

  /** Retrieves the NoteTypeId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NoteTypeId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NoteTypeId field
   */
   public String getNoteTypeIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteTypeIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteTypeIdAsFormattedString");
       return fmtMgr.formatNumber(this.getNoteTypeId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NoteTypeId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNoteTypeIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the NoteTypeId field from a formatted string
   *
   * @param _value the NoteTypeId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NoteTypeId field
   */
   public void setNoteTypeIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteTypeIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNoteTypeId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NoteTypeId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNoteTypeIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNoteTypeIdFromFormattedString");
   }

  /** get the value of the field: NoteTypeId (NOTE.note_type_id)
   * @return Integer the value
   */
  public Integer getNoteTypeId () {
    return this.NoteTypeId;
  }
  /** Change the field to not being actively set: NoteTypeId (NOTE.note_type_id)
   */
  public void unsetNoteTypeId () {
    this._NoteTypeIdSet = false;
  }
  /** See if the field is actively set: NoteTypeId (NOTE.note_type_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetNoteTypeId () {
    return this._NoteTypeIdSet;
  }
  /** set the fields value: NoteReasonId (NOTE.note_reason_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NoteReasonId") 
  public void setNoteReasonId (Integer value) throws ServiceException
  {
    this.NoteReasonId = value;
    this._NoteReasonIdSet = true;
  }

  /** Retrieves the NoteReasonId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NoteReasonId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NoteReasonId field
   */
   public String getNoteReasonIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteReasonIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteReasonIdAsFormattedString");
       return fmtMgr.formatNumber(this.getNoteReasonId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NoteReasonId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNoteReasonIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the NoteReasonId field from a formatted string
   *
   * @param _value the NoteReasonId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NoteReasonId field
   */
   public void setNoteReasonIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteReasonIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNoteReasonId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NoteReasonId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNoteReasonIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNoteReasonIdFromFormattedString");
   }

  /** get the value of the field: NoteReasonId (NOTE.note_reason_id)
   * @return Integer the value
   */
  public Integer getNoteReasonId () {
    return this.NoteReasonId;
  }
  /** Change the field to not being actively set: NoteReasonId (NOTE.note_reason_id)
   */
  public void unsetNoteReasonId () {
    this._NoteReasonIdSet = false;
  }
  /** See if the field is actively set: NoteReasonId (NOTE.note_reason_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetNoteReasonId () {
    return this._NoteReasonIdSet;
  }
  public String toString() {
    return EnhancedNoteObjectHelper.toMap(this, null).toString();
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
  /** NOTE.parent_code field */
    if(!nonNullOnly || (ParentCode != null))  _ParentCodeSet = flag;
  /** NOTE.parent_id1 field */
    if(!nonNullOnly || (ParentId1 != null))  _ParentId1Set = flag;
  /** NOTE.parent_id2 field */
    if(!nonNullOnly || (ParentId2 != null))  _ParentId2Set = flag;
  /** NOTE.legacy_note_code field */
    if(!nonNullOnly || (LegacyNoteCode != null))  _LegacyNoteCodeSet = flag;
  /** NOTE.note_source field */
    if(!nonNullOnly || (NoteSource != null))  _NoteSourceSet = flag;
  /** NOTE.is_permanent field */
    if(!nonNullOnly || (IsPermanent != null))  _IsPermanentSet = flag;
  /** NOTE.chg_who field */
    if(!nonNullOnly || (ChgWho != null))  _ChgWhoSet = flag;
  /** NOTE.chg_dt field */
    if(!nonNullOnly || (ChgDt != null))  _ChgDtSet = flag;
  /** NOTE.note_text field */
    if(!nonNullOnly || (NoteText != null))  _NoteTextSet = flag;
  /** NOTE.note_template_id field */
    if(!nonNullOnly || (NoteTemplateId != null))  _NoteTemplateIdSet = flag;
  /** NOTE.note_type_id field */
    if(!nonNullOnly || (NoteTypeId != null))  _NoteTypeIdSet = flag;
  /** NOTE.note_reason_id field */
    if(!nonNullOnly || (NoteReasonId != null))  _NoteReasonIdSet = flag;
  }
}
