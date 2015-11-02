/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CsrAccountSegmentObjectKeyData.java
 * Definition File: Admin/CsrAccountSegment.xml
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

/** CsrAccountSegmentObject's Key Data class. */
public class CsrAccountSegmentObjectKeyData  extends BaseObjectData
{
  /** CSR_ACCT_SEG.csr_name field */
  public    String CsrName  = null;
  protected boolean _CsrNameSet = false;
  /** CSR_ACCT_SEG.acct_seg_id field */
  public    Integer AcctSegId  = null;
  protected boolean _AcctSegIdSet = false;
  private String _objName = "CsrAccountSegmentObjectKeyData";
  /** default constructor */
  public CsrAccountSegmentObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public CsrAccountSegmentObjectKeyData (CsrAccountSegmentObjectKeyData other)
  {
    if (other == null) return;
    this.CsrName = other.CsrName;
    this._CsrNameSet = other._CsrNameSet;
    this.AcctSegId = other.AcctSegId;
    this._AcctSegIdSet = other._AcctSegIdSet;
  }
  /** set the fields value: CsrName (CSR_ACCT_SEG.csr_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CsrName") 
  public void setCsrName (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CsrName", "setCsrName");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CsrName", "setCsrName");
    }
    this.CsrName = value;
    this._CsrNameSet = true;
  }

  /** Retrieves the CsrName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CsrName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CsrName field
   */
   public String getCsrNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrNameAsFormattedString");
       return fmtMgr.formatString(this.getCsrName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CsrName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCsrNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the CsrName field from a formatted string
   *
   * @param _value the CsrName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CsrName field
   */
   public void setCsrNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCsrName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CsrName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCsrNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCsrNameFromFormattedString");
   }

  /** get the value of the field: CsrName (CSR_ACCT_SEG.csr_name)
   * @return String the value
   */
  public String getCsrName () {
    return this.CsrName;
  }
  /** Change the field to not being actively set: CsrName (CSR_ACCT_SEG.csr_name)
   */
  public void unsetCsrName () {
    this._CsrNameSet = false;
  }
  /** See if the field is actively set: CsrName (CSR_ACCT_SEG.csr_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetCsrName () {
    return this._CsrNameSet;
  }
  /** set the fields value: AcctSegId (CSR_ACCT_SEG.acct_seg_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AcctSegId") 
  public void setAcctSegId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AcctSegId", "setAcctSegId");
    }
    this.AcctSegId = value;
    this._AcctSegIdSet = true;
  }

  /** Retrieves the AcctSegId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AcctSegId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AcctSegId field
   */
   public String getAcctSegIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcctSegIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAcctSegIdAsFormattedString");
       return fmtMgr.formatNumber(this.getAcctSegId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcctSegId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAcctSegIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AcctSegId field from a formatted string
   *
   * @param _value the AcctSegId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AcctSegId field
   */
   public void setAcctSegIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcctSegIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAcctSegId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcctSegId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAcctSegIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAcctSegIdFromFormattedString");
   }

  /** get the value of the field: AcctSegId (CSR_ACCT_SEG.acct_seg_id)
   * @return Integer the value
   */
  public Integer getAcctSegId () {
    return this.AcctSegId;
  }
  /** Change the field to not being actively set: AcctSegId (CSR_ACCT_SEG.acct_seg_id)
   */
  public void unsetAcctSegId () {
    this._AcctSegIdSet = false;
  }
  /** See if the field is actively set: AcctSegId (CSR_ACCT_SEG.acct_seg_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAcctSegId () {
    return this._AcctSegIdSet;
  }
  public String toString() {
    return CsrAccountSegmentObjectKeyHelper.toMap(this, null).toString();
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
    
  /** CSR_ACCT_SEG.csr_name field */
    if(!nonNullOnly || (CsrName != null))  _CsrNameSet = flag;
  /** CSR_ACCT_SEG.acct_seg_id field */
    if(!nonNullOnly || (AcctSegId != null))  _AcctSegIdSet = flag;
  }
}
