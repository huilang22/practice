/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CROObjectKeyData.java
 * Definition File: Admin/CorridorRateOverride.xml
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

/** CROObject's Key Data class. */
public class CROObjectKeyData  extends BaseObjectData
{
  /** RATE_USAGE_OVERRIDES.seqnum field */
  public    Integer Seqnum  = null;
  protected boolean _SeqnumSet = false;
  private String _objName = "CROObjectKeyData";
  /** default constructor */
  public CROObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public CROObjectKeyData (CROObjectKeyData other)
  {
    if (other == null) return;
    this.Seqnum = other.Seqnum;
    this._SeqnumSet = other._SeqnumSet;
  }
  /** set the fields value: Seqnum (RATE_USAGE_OVERRIDES.seqnum)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Seqnum") 
  public void setSeqnum (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Seqnum", "setSeqnum");
    }
    this.Seqnum = value;
    this._SeqnumSet = true;
  }

  /** Retrieves the Seqnum field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Seqnum field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Seqnum field
   */
   public String getSeqnumAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSeqnumAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSeqnumAsFormattedString");
       return fmtMgr.formatNumber(this.getSeqnum(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Seqnum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSeqnumAsFormattedString");
       throw x;
     }
   }
  /** Sets the Seqnum field from a formatted string
   *
   * @param _value the Seqnum field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Seqnum field
   */
   public void setSeqnumFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSeqnumFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSeqnum(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Seqnum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSeqnumFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSeqnumFromFormattedString");
   }

  /** get the value of the field: Seqnum (RATE_USAGE_OVERRIDES.seqnum)
   * @return Integer the value
   */
  public Integer getSeqnum () {
    return this.Seqnum;
  }
  /** Change the field to not being actively set: Seqnum (RATE_USAGE_OVERRIDES.seqnum)
   */
  public void unsetSeqnum () {
    this._SeqnumSet = false;
  }
  /** See if the field is actively set: Seqnum (RATE_USAGE_OVERRIDES.seqnum)
   * @return boolean whether the field is actively set
   */
  public boolean issetSeqnum () {
    return this._SeqnumSet;
  }
  public String toString() {
    return CROObjectKeyHelper.toMap(this, null).toString();
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
    
  /** RATE_USAGE_OVERRIDES.seqnum field */
    if(!nonNullOnly || (Seqnum != null))  _SeqnumSet = flag;
  }
}
