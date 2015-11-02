/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PaymentProfileObjectKeyData.java
 * Definition File: Customer/PaymentProfile.xml
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

/** PaymentProfileObject's Key Data class. */
public class PaymentProfileObjectKeyData  extends BaseObjectData
{
  /** PAYMENT_PROFILE.profile_id field */
  public    BigInteger ProfileId  = null;
  protected boolean _ProfileIdSet = false;
  private String _objName = "PaymentProfileObjectKeyData";
  /** default constructor */
  public PaymentProfileObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public PaymentProfileObjectKeyData (PaymentProfileObjectKeyData other)
  {
    if (other == null) return;
    this.ProfileId = other.ProfileId;
    this._ProfileIdSet = other._ProfileIdSet;
  }
  /** set the fields value: ProfileId (PAYMENT_PROFILE.profile_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProfileId") 
  public void setProfileId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ProfileId", "setProfileId");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ProfileId", "setProfileId");
    }
    this.ProfileId = value;
    this._ProfileIdSet = true;
  }

  /** Retrieves the ProfileId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProfileId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProfileId field
   */
   public String getProfileIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProfileIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProfileIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getProfileId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProfileId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProfileIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProfileId field from a formatted string
   *
   * @param _value the ProfileId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProfileId field
   */
   public void setProfileIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProfileIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProfileId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProfileId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProfileIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProfileIdFromFormattedString");
   }

  /** get the value of the field: ProfileId (PAYMENT_PROFILE.profile_id)
   * @return BigInteger the value
   */
  public BigInteger getProfileId () {
    return this.ProfileId;
  }
  /** Change the field to not being actively set: ProfileId (PAYMENT_PROFILE.profile_id)
   */
  public void unsetProfileId () {
    this._ProfileIdSet = false;
  }
  /** See if the field is actively set: ProfileId (PAYMENT_PROFILE.profile_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetProfileId () {
    return this._ProfileIdSet;
  }
  public String toString() {
    return PaymentProfileObjectKeyHelper.toMap(this, null).toString();
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
    
  /** PAYMENT_PROFILE.profile_id field */
    if(!nonNullOnly || (ProfileId != null))  _ProfileIdSet = flag;
  }
}
