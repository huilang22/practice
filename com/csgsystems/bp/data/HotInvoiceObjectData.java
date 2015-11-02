/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HotInvoiceObjectData.java
 * Definition File: Customer/InterimBill.xml
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
  
/** HotInvoiceObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class HotInvoiceObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public HotInvoiceObjectKeyData Key = null;
  /** HotReqId field */
  public    Integer HotReqId  = null;
  protected boolean _HotReqIdSet = false;
  /** HotReqReturnCustom field */
  public    Integer HotReqReturnCustom  = null;
  protected boolean _HotReqReturnCustomSet = false;
  /** HotReqReturnStatus field */
  public    Integer HotReqReturnStatus  = null;
  protected boolean _HotReqReturnStatusSet = false;
  /** HotReqBillRefNo field */
  public    Integer HotReqBillRefNo  = null;
  protected boolean _HotReqBillRefNoSet = false;
  /** HotReqBillRefResets field */
  public    Integer HotReqBillRefResets  = null;
  protected boolean _HotReqBillRefResetsSet = false;
  private String _objName = "HotInvoiceObjectData";
  /** Default constructor */
  public HotInvoiceObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public HotInvoiceObjectData (HotInvoiceObjectData other)
  {

    if (other == null) return;
    this.Key = new HotInvoiceObjectKeyData (other.Key);
    this.HotReqId = other.HotReqId;
    this._HotReqIdSet = other._HotReqIdSet;
    this.HotReqReturnCustom = other.HotReqReturnCustom;
    this._HotReqReturnCustomSet = other._HotReqReturnCustomSet;
    this.HotReqReturnStatus = other.HotReqReturnStatus;
    this._HotReqReturnStatusSet = other._HotReqReturnStatusSet;
    this.HotReqBillRefNo = other.HotReqBillRefNo;
    this._HotReqBillRefNoSet = other._HotReqBillRefNoSet;
    this.HotReqBillRefResets = other.HotReqBillRefResets;
    this._HotReqBillRefResetsSet = other._HotReqBillRefResetsSet;
  }

  /** get the Key for this object
   * @return HotInvoiceObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public HotInvoiceObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (HotInvoiceObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: HotReqStatusQueue
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null, or the value's length exceeds the maximum length for the field (33)
   */
  public void setHotReqStatusQueue (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "HotReqStatusQueue", "setHotReqStatusQueue");
    }
    if (value != null && !DataHelper.validLength (value, 33))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "HotReqStatusQueue", "setHotReqStatusQueue");
    }
    if (this.Key == null) this.Key = new HotInvoiceObjectKeyData ();
    this.Key.HotReqStatusQueue = value;
    this.Key._HotReqStatusQueueSet = true;
  }
  /** get the value of the field: HotReqStatusQueue
   * @return String the value
   */
  public String getHotReqStatusQueue ()
  {
    if (this.Key == null) return null;
    return this.Key.HotReqStatusQueue;
  }
  /** Change the field to not being actively set: HotReqStatusQueue
   */
  public void unsetHotReqStatusQueue ()
  {
    if (this.Key == null) return;
    this.Key._HotReqStatusQueueSet = false;
  }
  /** See if the field is actively set: HotReqStatusQueue
   * @return boolean whether the field is actively set
   */
  public boolean issetHotReqStatusQueue ()
  {
    if (this.Key == null) return false;
    return this.Key._HotReqStatusQueueSet;
  }
  /** set the fields value: HotReqId
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setHotReqId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "HotReqId", "setHotReqId");
    }
    this.HotReqId = value;
    this._HotReqIdSet = true;
  }
  /** get the value of the field: HotReqId
   * @return Integer the value
   */
  public Integer getHotReqId ()
  {
    return this.HotReqId;
  }
  /** Change the field to not being actively set: HotReqId
   */
  public void unsetHotReqId ()
  {
    this._HotReqIdSet = false;
  }
  /** See if the field is actively set: HotReqId
   * @return boolean whether the field is actively set
   */
  public boolean issetHotReqId ()
  {
    return this._HotReqIdSet;
  }

  /** Retrieves the HotReqId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The HotReqId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the HotReqId field
   */
   public String getHotReqIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHotReqIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHotReqIdAsFormattedString");
       return fmtMgr.formatNumber(this.getHotReqId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HotReqId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getHotReqIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the HotReqId field from a formatted string
   *
   * @param _value the HotReqId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the HotReqId field
   */
   public void setHotReqIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHotReqIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setHotReqId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HotReqId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setHotReqIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setHotReqIdFromFormattedString");
   }

  /** set the fields value: HotReqReturnCustom
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setHotReqReturnCustom (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "HotReqReturnCustom", "setHotReqReturnCustom");
    }
    this.HotReqReturnCustom = value;
    this._HotReqReturnCustomSet = true;
  }
  /** get the value of the field: HotReqReturnCustom
   * @return Integer the value
   */
  public Integer getHotReqReturnCustom ()
  {
    return this.HotReqReturnCustom;
  }
  /** Change the field to not being actively set: HotReqReturnCustom
   */
  public void unsetHotReqReturnCustom ()
  {
    this._HotReqReturnCustomSet = false;
  }
  /** See if the field is actively set: HotReqReturnCustom
   * @return boolean whether the field is actively set
   */
  public boolean issetHotReqReturnCustom ()
  {
    return this._HotReqReturnCustomSet;
  }

  /** Retrieves the HotReqReturnCustom field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The HotReqReturnCustom field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the HotReqReturnCustom field
   */
   public String getHotReqReturnCustomAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHotReqReturnCustomAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHotReqReturnCustomAsFormattedString");
       return fmtMgr.formatNumber(this.getHotReqReturnCustom(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HotReqReturnCustom");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getHotReqReturnCustomAsFormattedString");
       throw x;
     }
   }
  /** Sets the HotReqReturnCustom field from a formatted string
   *
   * @param _value the HotReqReturnCustom field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the HotReqReturnCustom field
   */
   public void setHotReqReturnCustomFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHotReqReturnCustomFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setHotReqReturnCustom(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HotReqReturnCustom");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setHotReqReturnCustomFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setHotReqReturnCustomFromFormattedString");
   }

  /** set the fields value: HotReqReturnStatus
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setHotReqReturnStatus (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "HotReqReturnStatus", "setHotReqReturnStatus");
    }
    this.HotReqReturnStatus = value;
    this._HotReqReturnStatusSet = true;
  }
  /** get the value of the field: HotReqReturnStatus
   * @return Integer the value
   */
  public Integer getHotReqReturnStatus ()
  {
    return this.HotReqReturnStatus;
  }
  /** Change the field to not being actively set: HotReqReturnStatus
   */
  public void unsetHotReqReturnStatus ()
  {
    this._HotReqReturnStatusSet = false;
  }
  /** See if the field is actively set: HotReqReturnStatus
   * @return boolean whether the field is actively set
   */
  public boolean issetHotReqReturnStatus ()
  {
    return this._HotReqReturnStatusSet;
  }

  /** Retrieves the HotReqReturnStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The HotReqReturnStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the HotReqReturnStatus field
   */
   public String getHotReqReturnStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHotReqReturnStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHotReqReturnStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getHotReqReturnStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HotReqReturnStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getHotReqReturnStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the HotReqReturnStatus field from a formatted string
   *
   * @param _value the HotReqReturnStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the HotReqReturnStatus field
   */
   public void setHotReqReturnStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHotReqReturnStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setHotReqReturnStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HotReqReturnStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setHotReqReturnStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setHotReqReturnStatusFromFormattedString");
   }

  /** set the fields value: HotReqBillRefNo
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setHotReqBillRefNo (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "HotReqBillRefNo", "setHotReqBillRefNo");
    }
    this.HotReqBillRefNo = value;
    this._HotReqBillRefNoSet = true;
  }
  /** get the value of the field: HotReqBillRefNo
   * @return Integer the value
   */
  public Integer getHotReqBillRefNo ()
  {
    return this.HotReqBillRefNo;
  }
  /** Change the field to not being actively set: HotReqBillRefNo
   */
  public void unsetHotReqBillRefNo ()
  {
    this._HotReqBillRefNoSet = false;
  }
  /** See if the field is actively set: HotReqBillRefNo
   * @return boolean whether the field is actively set
   */
  public boolean issetHotReqBillRefNo ()
  {
    return this._HotReqBillRefNoSet;
  }

  /** Retrieves the HotReqBillRefNo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The HotReqBillRefNo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the HotReqBillRefNo field
   */
   public String getHotReqBillRefNoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHotReqBillRefNoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHotReqBillRefNoAsFormattedString");
       return fmtMgr.formatNumber(this.getHotReqBillRefNo(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HotReqBillRefNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getHotReqBillRefNoAsFormattedString");
       throw x;
     }
   }
  /** Sets the HotReqBillRefNo field from a formatted string
   *
   * @param _value the HotReqBillRefNo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the HotReqBillRefNo field
   */
   public void setHotReqBillRefNoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHotReqBillRefNoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setHotReqBillRefNo(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HotReqBillRefNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setHotReqBillRefNoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setHotReqBillRefNoFromFormattedString");
   }

  /** set the fields value: HotReqBillRefResets
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setHotReqBillRefResets (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "HotReqBillRefResets", "setHotReqBillRefResets");
    }
    this.HotReqBillRefResets = value;
    this._HotReqBillRefResetsSet = true;
  }
  /** get the value of the field: HotReqBillRefResets
   * @return Integer the value
   */
  public Integer getHotReqBillRefResets ()
  {
    return this.HotReqBillRefResets;
  }
  /** Change the field to not being actively set: HotReqBillRefResets
   */
  public void unsetHotReqBillRefResets ()
  {
    this._HotReqBillRefResetsSet = false;
  }
  /** See if the field is actively set: HotReqBillRefResets
   * @return boolean whether the field is actively set
   */
  public boolean issetHotReqBillRefResets ()
  {
    return this._HotReqBillRefResetsSet;
  }

  /** Retrieves the HotReqBillRefResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The HotReqBillRefResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the HotReqBillRefResets field
   */
   public String getHotReqBillRefResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHotReqBillRefResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHotReqBillRefResetsAsFormattedString");
       return fmtMgr.formatNumber(this.getHotReqBillRefResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HotReqBillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getHotReqBillRefResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the HotReqBillRefResets field from a formatted string
   *
   * @param _value the HotReqBillRefResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the HotReqBillRefResets field
   */
   public void setHotReqBillRefResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHotReqBillRefResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setHotReqBillRefResets(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HotReqBillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setHotReqBillRefResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setHotReqBillRefResetsFromFormattedString");
   }

  public String toString() {
    return HotInvoiceObjectHelper.toMap(this, null).toString();
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
  /** HotReqId field */
    if (!nonNullOnly || (HotReqId != null)) _HotReqIdSet = flag;
  /** HotReqReturnCustom field */
    if (!nonNullOnly || (HotReqReturnCustom != null)) _HotReqReturnCustomSet = flag;
  /** HotReqReturnStatus field */
    if (!nonNullOnly || (HotReqReturnStatus != null)) _HotReqReturnStatusSet = flag;
  /** HotReqBillRefNo field */
    if (!nonNullOnly || (HotReqBillRefNo != null)) _HotReqBillRefNoSet = flag;
  /** HotReqBillRefResets field */
    if (!nonNullOnly || (HotReqBillRefResets != null)) _HotReqBillRefResetsSet = flag;
  }
}
