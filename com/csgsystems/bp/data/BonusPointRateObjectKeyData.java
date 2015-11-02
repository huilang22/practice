/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BonusPointRateObjectKeyData.java
 * Definition File: Admin/BonusPointRate.xml
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

/** BonusPointRateObject's Key Data class. */
public class BonusPointRateObjectKeyData  extends BaseObjectData
{
  /** RATE_BONUS_POINT.bonus_point_id field */
  public    Integer BonusPointId  = null;
  protected boolean _BonusPointIdSet = false;
  /** RATE_BONUS_POINT.currency_code field */
  public    Integer CurrencyCode  = null;
  protected boolean _CurrencyCodeSet = false;
  private String _objName = "BonusPointRateObjectKeyData";
  /** default constructor */
  public BonusPointRateObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public BonusPointRateObjectKeyData (BonusPointRateObjectKeyData other)
  {
    if (other == null) return;
    this.BonusPointId = other.BonusPointId;
    this._BonusPointIdSet = other._BonusPointIdSet;
    this.CurrencyCode = other.CurrencyCode;
    this._CurrencyCodeSet = other._CurrencyCodeSet;
  }
  /** set the fields value: BonusPointId (RATE_BONUS_POINT.bonus_point_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BonusPointId") 
  public void setBonusPointId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BonusPointId", "setBonusPointId");
    }
    this.BonusPointId = value;
    this._BonusPointIdSet = true;
  }

  /** Retrieves the BonusPointId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BonusPointId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BonusPointId field
   */
   public String getBonusPointIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointIdAsFormattedString");
       return fmtMgr.formatNumber(this.getBonusPointId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BonusPointId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBonusPointIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the BonusPointId field from a formatted string
   *
   * @param _value the BonusPointId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BonusPointId field
   */
   public void setBonusPointIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBonusPointId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BonusPointId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBonusPointIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBonusPointIdFromFormattedString");
   }

  /** get the value of the field: BonusPointId (RATE_BONUS_POINT.bonus_point_id)
   * @return Integer the value
   */
  public Integer getBonusPointId () {
    return this.BonusPointId;
  }
  /** Change the field to not being actively set: BonusPointId (RATE_BONUS_POINT.bonus_point_id)
   */
  public void unsetBonusPointId () {
    this._BonusPointIdSet = false;
  }
  /** See if the field is actively set: BonusPointId (RATE_BONUS_POINT.bonus_point_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetBonusPointId () {
    return this._BonusPointIdSet;
  }
  /** set the fields value: CurrencyCode (RATE_BONUS_POINT.currency_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CurrencyCode") 
  public void setCurrencyCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CurrencyCode", "setCurrencyCode");
    }
    this.CurrencyCode = value;
    this._CurrencyCodeSet = true;
  }

  /** Retrieves the CurrencyCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CurrencyCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CurrencyCode field
   */
   public String getCurrencyCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getCurrencyCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CurrencyCode field from a formatted string
   *
   * @param _value the CurrencyCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CurrencyCode field
   */
   public void setCurrencyCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCurrencyCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyCodeFromFormattedString");
   }

  /** get the value of the field: CurrencyCode (RATE_BONUS_POINT.currency_code)
   * @return Integer the value
   */
  public Integer getCurrencyCode () {
    return this.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (RATE_BONUS_POINT.currency_code)
   */
  public void unsetCurrencyCode () {
    this._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (RATE_BONUS_POINT.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode () {
    return this._CurrencyCodeSet;
  }
  public String toString() {
    return BonusPointRateObjectKeyHelper.toMap(this, null).toString();
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
    
  /** RATE_BONUS_POINT.bonus_point_id field */
    if(!nonNullOnly || (BonusPointId != null))  _BonusPointIdSet = flag;
  /** RATE_BONUS_POINT.currency_code field */
    if(!nonNullOnly || (CurrencyCode != null))  _CurrencyCodeSet = flag;
  }
}
