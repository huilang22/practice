/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherStatusMovementObjectData.java
 * Definition File: Catalog/VoucherStatusMovement.xml
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
  
/** VoucherStatusMovementObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class VoucherStatusMovementObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public VoucherStatusMovementObjectKeyData Key = null;
  /** VOUCHER_STATUS_MOVEMENT.state_to field */
  public    BigInteger StateTo  = null;
  protected boolean _StateToSet = false;
  private String _objName = "VoucherStatusMovementObjectData";
  /** Default constructor */
  public VoucherStatusMovementObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public VoucherStatusMovementObjectData (VoucherStatusMovementObjectData other)
  {

    if (other == null) return;
    this.Key = new VoucherStatusMovementObjectKeyData (other.Key);
    this.StateTo = other.StateTo;
    this._StateToSet = other._StateToSet;
  }

  /** get the Key for this object
   * @return VoucherStatusMovementObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public VoucherStatusMovementObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (VoucherStatusMovementObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: StateFrom (VOUCHER_STATUS_MOVEMENT.state_from)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setStateFrom (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "StateFrom", "setStateFrom");
    }
    if (value != null && !DataHelper.validLength (value, 1))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "StateFrom", "setStateFrom");
    }
    if (this.Key == null) this.Key = new VoucherStatusMovementObjectKeyData ();
    this.Key.StateFrom = value;
    this.Key._StateFromSet = true;
  }
  /** get the value of the field: StateFrom (VOUCHER_STATUS_MOVEMENT.state_from)
   * @return BigInteger the value
   */
  public BigInteger getStateFrom () {
    if (this.Key == null) return null;
    return this.Key.StateFrom;
  }
  /** Change the field to not being actively set: StateFrom (VOUCHER_STATUS_MOVEMENT.state_from)
   */
  public void unsetStateFrom () {
    if (this.Key == null) return;
    this.Key._StateFromSet = false;
  }
  /** See if the field is actively set: StateFrom (VOUCHER_STATUS_MOVEMENT.state_from)
   * @return boolean whether the field is actively set
   */
  public boolean issetStateFrom () {
    if (this.Key == null) return false;
    return this.Key._StateFromSet;
  }

  /** Retrieves the StateFrom field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StateFrom field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StateFrom field
   */
   public String getStateFromAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateFromAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStateFromAsFormattedString");
       return fmtMgr.formatBigInteger(this.getStateFrom(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StateFrom");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStateFromAsFormattedString");
       throw x;
     }
   }
  /** Sets the StateFrom field from a formatted string
   *
   * @param _value the StateFrom field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StateFrom field
   */
   public void setStateFromFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateFromFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStateFrom(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StateFrom");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStateFromFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStateFromFromFormattedString");
   }

  /** set the fields value: StateTo (VOUCHER_STATUS_MOVEMENT.state_to)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StateTo") 
  public void setStateTo (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "StateTo", "setStateTo");
    }
    if (value != null && !DataHelper.validLength (value, 1))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "StateTo", "setStateTo");
    }
    this.StateTo = value;
    this._StateToSet = true;
  }

  /** Retrieves the StateTo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StateTo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StateTo field
   */
   public String getStateToAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateToAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStateToAsFormattedString");
       return fmtMgr.formatBigInteger(this.getStateTo(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StateTo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStateToAsFormattedString");
       throw x;
     }
   }
  /** Sets the StateTo field from a formatted string
   *
   * @param _value the StateTo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StateTo field
   */
   public void setStateToFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateToFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStateTo(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StateTo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStateToFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStateToFromFormattedString");
   }

  /** get the value of the field: StateTo (VOUCHER_STATUS_MOVEMENT.state_to)
   * @return BigInteger the value
   */
  public BigInteger getStateTo () {
    return this.StateTo;
  }
  /** Change the field to not being actively set: StateTo (VOUCHER_STATUS_MOVEMENT.state_to)
   */
  public void unsetStateTo () {
    this._StateToSet = false;
  }
  /** See if the field is actively set: StateTo (VOUCHER_STATUS_MOVEMENT.state_to)
   * @return boolean whether the field is actively set
   */
  public boolean issetStateTo () {
    return this._StateToSet;
  }
  public String toString() {
    return VoucherStatusMovementObjectHelper.toMap(this, null).toString();
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
  /** VOUCHER_STATUS_MOVEMENT.state_to field */
    if(!nonNullOnly || (StateTo != null))  _StateToSet = flag;
  }
}
