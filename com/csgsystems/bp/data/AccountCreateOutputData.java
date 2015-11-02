/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountCreateOutputData.java
 * Definition File: Customer/Account.xml
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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;

import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.format.FieldFormatMgr;

import com.csgsystems.api.enumeration.EnumeratedDataMgr;
import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;

/** class to support methods which have more than one output field. */
@XmlRootElement(namespace ="http://.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class AccountCreateOutputData implements ArubaObjectData, Serializable
{
  /** acOut object */
  public AccountXIDObjectData acOut = null;

  /** AccountServerId field */
  public    Integer AccountServerId  = null;
  protected boolean _AccountServerIdSet = false;
  private String _objName = "AccountCreateOutputData";
  /** default constructor */
  public AccountCreateOutputData ()
  {
  }
  /** copy constructor
   * @param other the object to copy.
   */
  public AccountCreateOutputData (AccountCreateOutputData other)
  {
    if (other == null) return;
    if (other.acOut != null)
    {
      this.acOut = new AccountXIDObjectData (other.acOut);
    }

    this.AccountServerId = other.AccountServerId;
    this._AccountServerIdSet = other._AccountServerIdSet;
  }
  /** get the object for AccountXIDObject
   * @return AccountData the object
   */
  public AccountXIDObjectData getAccount ()
  {
    return this.acOut;
  }
  /** set the object for Account
   * @param value the new object
   */
  public void setAccount (AccountXIDObjectData value)
  {
    this.acOut = value;
  }
  /** set the fields value: AccountServerId
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAccountServerId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountServerId", "setAccountServerId");
    }
    this.AccountServerId = value;
    this._AccountServerIdSet = true;
  }
  /** get the value of the field: AccountServerId
   * @return Integer the value
   */
  public Integer getAccountServerId ()
  {
    return this.AccountServerId;
  }
  /** Change the field to not being actively set: AccountServerId
   */
  public void unsetAccountServerId ()
  {
    this._AccountServerIdSet = false;
  }
  /** See if the field is actively set: AccountServerId
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountServerId ()
  {
    return this._AccountServerIdSet;
  }

  /** Retrieves the AccountServerId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountServerId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountServerId field
   */
   public String getAccountServerIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountServerIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountServerIdAsFormattedString");
       return fmtMgr.formatNumber(this.getAccountServerId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountServerId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountServerIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountServerId field from a formatted string
   *
   * @param _value the AccountServerId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountServerId field
   */
   public void setAccountServerIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountServerIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountServerId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountServerId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountServerIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountServerIdFromFormattedString");
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
    
  /** acOut object */
  
      if (acOut != null) acOut.resetFlags(flag, nonNullOnly);
    
  /** AccountServerId field */
    if (!nonNullOnly || (AccountServerId != null)) _AccountServerIdSet = flag;
  }
}
