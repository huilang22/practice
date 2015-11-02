/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherStatusObjectData.java
 * Definition File: Catalog/VoucherStatus.xml
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
  
/** VoucherStatusObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class VoucherStatusObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public VoucherStatusObjectKeyData Key = null;
  /** VOUCHER_STATUS.status_info field */
  public    String StatusInfo  = null;
  protected boolean _StatusInfoSet = false;
  private String _objName = "VoucherStatusObjectData";
  /** Default constructor */
  public VoucherStatusObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public VoucherStatusObjectData (VoucherStatusObjectData other)
  {

    if (other == null) return;
    this.Key = new VoucherStatusObjectKeyData (other.Key);
    this.StatusInfo = other.StatusInfo;
    this._StatusInfoSet = other._StatusInfoSet;
  }

  /** get the Key for this object
   * @return VoucherStatusObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public VoucherStatusObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (VoucherStatusObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: Status (VOUCHER_STATUS.status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setStatus (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Status", "setStatus");
    }
    if (value != null && !DataHelper.validLength (value, 1))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Status", "setStatus");
    }
    if (this.Key == null) this.Key = new VoucherStatusObjectKeyData ();
    this.Key.Status = value;
    this.Key._StatusSet = true;
  }
  /** get the value of the field: Status (VOUCHER_STATUS.status)
   * @return BigInteger the value
   */
  public BigInteger getStatus () {
    if (this.Key == null) return null;
    return this.Key.Status;
  }
  /** Change the field to not being actively set: Status (VOUCHER_STATUS.status)
   */
  public void unsetStatus () {
    if (this.Key == null) return;
    this.Key._StatusSet = false;
  }
  /** See if the field is actively set: Status (VOUCHER_STATUS.status)
   * @return boolean whether the field is actively set
   */
  public boolean issetStatus () {
    if (this.Key == null) return false;
    return this.Key._StatusSet;
  }

  /** Retrieves the Status field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Status field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Status field
   */
   public String getStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusAsFormattedString");
       return fmtMgr.formatBigInteger(this.getStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Status");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the Status field from a formatted string
   *
   * @param _value the Status field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Status field
   */
   public void setStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStatus(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Status");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusFromFormattedString");
   }

  /** set the fields value: StatusInfo (VOUCHER_STATUS.status_info)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StatusInfo") 
  public void setStatusInfo (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 100))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "StatusInfo", "setStatusInfo");
    }
    this.StatusInfo = value;
    this._StatusInfoSet = true;
  }

  /** Retrieves the StatusInfo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StatusInfo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatusInfo field
   */
   public String getStatusInfoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusInfoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusInfoAsFormattedString");
       return fmtMgr.formatString(this.getStatusInfo());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatusInfo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatusInfoAsFormattedString");
       throw x;
     }
   }
  /** Sets the StatusInfo field from a formatted string
   *
   * @param _value the StatusInfo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StatusInfo field
   */
   public void setStatusInfoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusInfoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStatusInfo(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatusInfo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusInfoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusInfoFromFormattedString");
   }

  /** get the value of the field: StatusInfo (VOUCHER_STATUS.status_info)
   * @return String the value
   */
  public String getStatusInfo () {
    return this.StatusInfo;
  }
  /** Change the field to not being actively set: StatusInfo (VOUCHER_STATUS.status_info)
   */
  public void unsetStatusInfo () {
    this._StatusInfoSet = false;
  }
  /** See if the field is actively set: StatusInfo (VOUCHER_STATUS.status_info)
   * @return boolean whether the field is actively set
   */
  public boolean issetStatusInfo () {
    return this._StatusInfoSet;
  }
  public String toString() {
    return VoucherStatusObjectHelper.toMap(this, null).toString();
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
  /** VOUCHER_STATUS.status_info field */
    if(!nonNullOnly || (StatusInfo != null))  _StatusInfoSet = flag;
  }
}
