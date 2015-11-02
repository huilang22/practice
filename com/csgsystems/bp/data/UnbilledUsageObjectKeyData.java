/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: UnbilledUsageObjectKeyData.java
 * Definition File: Customer/UnbilledUsage.xml
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

/** UnbilledUsageObject's Key Data class. */
public class UnbilledUsageObjectKeyData  extends BaseObjectData
{
  /** CDR_DATA.msg_id field */
  public    Integer MsgId  = null;
  protected boolean _MsgIdSet = false;
  /** CDR_DATA.msg_id2 field */
  public    Integer MsgId2  = null;
  protected boolean _MsgId2Set = false;
  /** CDR_DATA.msg_id_serv field */
  public    Integer MsgIdServ  = null;
  protected boolean _MsgIdServSet = false;
  /** CDR_DATA.split_row_num field */
  public    Integer SplitRowNum  = null;
  protected boolean _SplitRowNumSet = false;
  private String _objName = "UnbilledUsageObjectKeyData";
  /** default constructor */
  public UnbilledUsageObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public UnbilledUsageObjectKeyData (UnbilledUsageObjectKeyData other)
  {
    if (other == null) return;
    this.MsgId = other.MsgId;
    this._MsgIdSet = other._MsgIdSet;
    this.MsgId2 = other.MsgId2;
    this._MsgId2Set = other._MsgId2Set;
    this.MsgIdServ = other.MsgIdServ;
    this._MsgIdServSet = other._MsgIdServSet;
    this.SplitRowNum = other.SplitRowNum;
    this._SplitRowNumSet = other._SplitRowNumSet;
  }
  /** set the fields value: MsgId (CDR_DATA.msg_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MsgId") 
  public void setMsgId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MsgId", "setMsgId");
    }
    this.MsgId = value;
    this._MsgIdSet = true;
  }

  /** Retrieves the MsgId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MsgId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgId field
   */
   public String getMsgIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgIdAsFormattedString");
       return fmtMgr.formatNumber(this.getMsgId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the MsgId field from a formatted string
   *
   * @param _value the MsgId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MsgId field
   */
   public void setMsgIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMsgId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgIdFromFormattedString");
   }

  /** get the value of the field: MsgId (CDR_DATA.msg_id)
   * @return Integer the value
   */
  public Integer getMsgId () {
    return this.MsgId;
  }
  /** Change the field to not being actively set: MsgId (CDR_DATA.msg_id)
   */
  public void unsetMsgId () {
    this._MsgIdSet = false;
  }
  /** See if the field is actively set: MsgId (CDR_DATA.msg_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetMsgId () {
    return this._MsgIdSet;
  }
  /** set the fields value: MsgId2 (CDR_DATA.msg_id2)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MsgId2") 
  public void setMsgId2 (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MsgId2", "setMsgId2");
    }
    this.MsgId2 = value;
    this._MsgId2Set = true;
  }

  /** Retrieves the MsgId2 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MsgId2 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgId2 field
   */
   public String getMsgId2AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgId2AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgId2AsFormattedString");
       return fmtMgr.formatNumber(this.getMsgId2(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgId2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgId2AsFormattedString");
       throw x;
     }
   }
  /** Sets the MsgId2 field from a formatted string
   *
   * @param _value the MsgId2 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MsgId2 field
   */
   public void setMsgId2FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgId2FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMsgId2(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgId2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgId2FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgId2FromFormattedString");
   }

  /** get the value of the field: MsgId2 (CDR_DATA.msg_id2)
   * @return Integer the value
   */
  public Integer getMsgId2 () {
    return this.MsgId2;
  }
  /** Change the field to not being actively set: MsgId2 (CDR_DATA.msg_id2)
   */
  public void unsetMsgId2 () {
    this._MsgId2Set = false;
  }
  /** See if the field is actively set: MsgId2 (CDR_DATA.msg_id2)
   * @return boolean whether the field is actively set
   */
  public boolean issetMsgId2 () {
    return this._MsgId2Set;
  }
  /** set the fields value: MsgIdServ (CDR_DATA.msg_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MsgIdServ") 
  public void setMsgIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MsgIdServ", "setMsgIdServ");
    }
    this.MsgIdServ = value;
    this._MsgIdServSet = true;
  }

  /** Retrieves the MsgIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MsgIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgIdServ field
   */
   public String getMsgIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getMsgIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the MsgIdServ field from a formatted string
   *
   * @param _value the MsgIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MsgIdServ field
   */
   public void setMsgIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMsgIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgIdServFromFormattedString");
   }

  /** get the value of the field: MsgIdServ (CDR_DATA.msg_id_serv)
   * @return Integer the value
   */
  public Integer getMsgIdServ () {
    return this.MsgIdServ;
  }
  /** Change the field to not being actively set: MsgIdServ (CDR_DATA.msg_id_serv)
   */
  public void unsetMsgIdServ () {
    this._MsgIdServSet = false;
  }
  /** See if the field is actively set: MsgIdServ (CDR_DATA.msg_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetMsgIdServ () {
    return this._MsgIdServSet;
  }
  /** set the fields value: SplitRowNum (CDR_DATA.split_row_num)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SplitRowNum") 
  public void setSplitRowNum (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SplitRowNum", "setSplitRowNum");
    }
    this.SplitRowNum = value;
    this._SplitRowNumSet = true;
  }

  /** Retrieves the SplitRowNum field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SplitRowNum field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SplitRowNum field
   */
   public String getSplitRowNumAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSplitRowNumAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSplitRowNumAsFormattedString");
       return fmtMgr.formatNumber(this.getSplitRowNum(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SplitRowNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSplitRowNumAsFormattedString");
       throw x;
     }
   }
  /** Sets the SplitRowNum field from a formatted string
   *
   * @param _value the SplitRowNum field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SplitRowNum field
   */
   public void setSplitRowNumFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSplitRowNumFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSplitRowNum(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SplitRowNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSplitRowNumFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSplitRowNumFromFormattedString");
   }

  /** get the value of the field: SplitRowNum (CDR_DATA.split_row_num)
   * @return Integer the value
   */
  public Integer getSplitRowNum () {
    return this.SplitRowNum;
  }
  /** Change the field to not being actively set: SplitRowNum (CDR_DATA.split_row_num)
   */
  public void unsetSplitRowNum () {
    this._SplitRowNumSet = false;
  }
  /** See if the field is actively set: SplitRowNum (CDR_DATA.split_row_num)
   * @return boolean whether the field is actively set
   */
  public boolean issetSplitRowNum () {
    return this._SplitRowNumSet;
  }
  public String toString() {
    return UnbilledUsageObjectKeyHelper.toMap(this, null).toString();
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
    
  /** CDR_DATA.msg_id field */
    if(!nonNullOnly || (MsgId != null))  _MsgIdSet = flag;
  /** CDR_DATA.msg_id2 field */
    if(!nonNullOnly || (MsgId2 != null))  _MsgId2Set = flag;
  /** CDR_DATA.msg_id_serv field */
    if(!nonNullOnly || (MsgIdServ != null))  _MsgIdServSet = flag;
  /** CDR_DATA.split_row_num field */
    if(!nonNullOnly || (SplitRowNum != null))  _SplitRowNumSet = flag;
  }
}
