/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CsrAccountSegmentObjectData.java
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
  
/** CsrAccountSegmentObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class CsrAccountSegmentObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public CsrAccountSegmentObjectKeyData Key = null;
  /** CSR_ACCT_SEG.is_csr_default field */
  public    Boolean IsCsrDefault  = null;
  protected boolean _IsCsrDefaultSet = false;
  /** CSR_ACCT_SEG.config_tag_id field */
  public    String ConfigTagId  = null;
  protected boolean _ConfigTagIdSet = false;
  private String _objName = "CsrAccountSegmentObjectData";
  /** Default constructor */
  public CsrAccountSegmentObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public CsrAccountSegmentObjectData (CsrAccountSegmentObjectData other)
  {

    if (other == null) return;
    this.Key = new CsrAccountSegmentObjectKeyData (other.Key);
    this.IsCsrDefault = other.IsCsrDefault;
    this._IsCsrDefaultSet = other._IsCsrDefaultSet;
    this.ConfigTagId = other.ConfigTagId;
    this._ConfigTagIdSet = other._ConfigTagIdSet;
  }

  /** get the Key for this object
   * @return CsrAccountSegmentObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public CsrAccountSegmentObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (CsrAccountSegmentObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: CsrName (CSR_ACCT_SEG.csr_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
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
    if (this.Key == null) this.Key = new CsrAccountSegmentObjectKeyData ();
    this.Key.CsrName = value;
    this.Key._CsrNameSet = true;
  }
  /** get the value of the field: CsrName (CSR_ACCT_SEG.csr_name)
   * @return String the value
   */
  public String getCsrName () {
    if (this.Key == null) return null;
    return this.Key.CsrName;
  }
  /** Change the field to not being actively set: CsrName (CSR_ACCT_SEG.csr_name)
   */
  public void unsetCsrName () {
    if (this.Key == null) return;
    this.Key._CsrNameSet = false;
  }
  /** See if the field is actively set: CsrName (CSR_ACCT_SEG.csr_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetCsrName () {
    if (this.Key == null) return false;
    return this.Key._CsrNameSet;
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

  /** set the fields value: AcctSegId (CSR_ACCT_SEG.acct_seg_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAcctSegId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AcctSegId", "setAcctSegId");
    }
    if (this.Key == null) this.Key = new CsrAccountSegmentObjectKeyData ();
    this.Key.AcctSegId = value;
    this.Key._AcctSegIdSet = true;
  }
  /** get the value of the field: AcctSegId (CSR_ACCT_SEG.acct_seg_id)
   * @return Integer the value
   */
  public Integer getAcctSegId () {
    if (this.Key == null) return null;
    return this.Key.AcctSegId;
  }
  /** Change the field to not being actively set: AcctSegId (CSR_ACCT_SEG.acct_seg_id)
   */
  public void unsetAcctSegId () {
    if (this.Key == null) return;
    this.Key._AcctSegIdSet = false;
  }
  /** See if the field is actively set: AcctSegId (CSR_ACCT_SEG.acct_seg_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAcctSegId () {
    if (this.Key == null) return false;
    return this.Key._AcctSegIdSet;
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

  /** set the fields value: IsCsrDefault (CSR_ACCT_SEG.is_csr_default)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsCsrDefault") 
  public void setIsCsrDefault (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsCsrDefault", "setIsCsrDefault");
    }
    this.IsCsrDefault = value;
    this._IsCsrDefaultSet = true;
  }

  /** Retrieves the IsCsrDefault field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsCsrDefault field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsCsrDefault field
   */
   public String getIsCsrDefaultAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsCsrDefaultAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsCsrDefaultAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsCsrDefault());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsCsrDefault");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsCsrDefaultAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsCsrDefault field from a formatted string
   *
   * @param _value the IsCsrDefault field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsCsrDefault field
   */
   public void setIsCsrDefaultFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsCsrDefaultFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsCsrDefault(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsCsrDefault");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsCsrDefaultFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsCsrDefaultFromFormattedString");
   }

  /** get the value of the field: IsCsrDefault (CSR_ACCT_SEG.is_csr_default)
   * @return Boolean the value
   */
  public Boolean getIsCsrDefault () {
    return this.IsCsrDefault;
  }
  /** Change the field to not being actively set: IsCsrDefault (CSR_ACCT_SEG.is_csr_default)
   */
  public void unsetIsCsrDefault () {
    this._IsCsrDefaultSet = false;
  }
  /** See if the field is actively set: IsCsrDefault (CSR_ACCT_SEG.is_csr_default)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsCsrDefault () {
    return this._IsCsrDefaultSet;
  }
  /** set the fields value: ConfigTagId (CSR_ACCT_SEG.config_tag_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ConfigTagId") 
  public void setConfigTagId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 32))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ConfigTagId", "setConfigTagId");
    }
    this.ConfigTagId = value;
    this._ConfigTagIdSet = true;
  }

  /** Retrieves the ConfigTagId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ConfigTagId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ConfigTagId field
   */
   public String getConfigTagIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConfigTagIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getConfigTagIdAsFormattedString");
       return fmtMgr.formatString(this.getConfigTagId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ConfigTagId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getConfigTagIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ConfigTagId field from a formatted string
   *
   * @param _value the ConfigTagId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ConfigTagId field
   */
   public void setConfigTagIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConfigTagIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setConfigTagId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ConfigTagId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setConfigTagIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setConfigTagIdFromFormattedString");
   }

  /** get the value of the field: ConfigTagId (CSR_ACCT_SEG.config_tag_id)
   * @return String the value
   */
  public String getConfigTagId () {
    return this.ConfigTagId;
  }
  /** Change the field to not being actively set: ConfigTagId (CSR_ACCT_SEG.config_tag_id)
   */
  public void unsetConfigTagId () {
    this._ConfigTagIdSet = false;
  }
  /** See if the field is actively set: ConfigTagId (CSR_ACCT_SEG.config_tag_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetConfigTagId () {
    return this._ConfigTagIdSet;
  }
  public String toString() {
    return CsrAccountSegmentObjectHelper.toMap(this, null).toString();
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
  /** CSR_ACCT_SEG.is_csr_default field */
    if(!nonNullOnly || (IsCsrDefault != null))  _IsCsrDefaultSet = flag;
  /** CSR_ACCT_SEG.config_tag_id field */
    if(!nonNullOnly || (ConfigTagId != null))  _ConfigTagIdSet = flag;
  }
}
