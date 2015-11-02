/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CsrGroupOutputData.java
 * Definition File: Admin/Csr.xml
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
public class CsrGroupOutputData implements ArubaObjectData, Serializable
{
  /** UserGroup field */
  public    String[] UserGroup  = null;
  protected boolean _UserGroupSet = false;
  /** UserName field */
  public    String UserName  = null;
  protected boolean _UserNameSet = false;
  private String _objName = "CsrGroupOutputData";
  /** default constructor */
  public CsrGroupOutputData ()
  {
  }
  /** copy constructor
   * @param other the object to copy.
   */
  public CsrGroupOutputData (CsrGroupOutputData other)
  {
    if (other == null) return;
    this.UserGroup = other.UserGroup;
    this._UserGroupSet = other._UserGroupSet;
    this.UserName = other.UserName;
    this._UserNameSet = other._UserNameSet;
  }
  /** set the fields value: UserGroup
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setUserGroup (String[] value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UserGroup", "setUserGroup");
    }
    this.UserGroup = value;
    this._UserGroupSet = true;
  }
  /** get the value of the field: UserGroup
   * @return String the value
   */
  public String[] getUserGroup ()
  {
    return this.UserGroup;
  }
  /** Change the field to not being actively set: UserGroup
   */
  public void unsetUserGroup ()
  {
    this._UserGroupSet = false;
  }
  /** See if the field is actively set: UserGroup
   * @return boolean whether the field is actively set
   */
  public boolean issetUserGroup ()
  {
    return this._UserGroupSet;
  }

  /** set the fields value: UserName
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setUserName (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UserName", "setUserName");
    }
    this.UserName = value;
    this._UserNameSet = true;
  }
  /** get the value of the field: UserName
   * @return String the value
   */
  public String getUserName ()
  {
    return this.UserName;
  }
  /** Change the field to not being actively set: UserName
   */
  public void unsetUserName ()
  {
    this._UserNameSet = false;
  }
  /** See if the field is actively set: UserName
   * @return boolean whether the field is actively set
   */
  public boolean issetUserName ()
  {
    return this._UserNameSet;
  }

  /** Retrieves the UserName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UserName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UserName field
   */
   public String getUserNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUserNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUserNameAsFormattedString");
       return fmtMgr.formatString(this.getUserName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UserName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUserNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the UserName field from a formatted string
   *
   * @param _value the UserName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UserName field
   */
   public void setUserNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUserNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUserName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UserName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUserNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUserNameFromFormattedString");
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
    
  /** UserGroup field */
    if (!nonNullOnly || (UserGroup != null)) _UserGroupSet = flag;
  /** UserName field */
    if (!nonNullOnly || (UserName != null)) _UserNameSet = flag;
  }
}
