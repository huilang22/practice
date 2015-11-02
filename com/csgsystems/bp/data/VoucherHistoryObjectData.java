/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherHistoryObjectData.java
 * Definition File: Catalog/VoucherHistory.xml
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
  
/** VoucherHistoryObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class VoucherHistoryObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public VoucherHistoryObjectKeyData Key = null;
  /** VOUCHER_HISTORY.chg_who field */
  public    String ChgWho  = null;
  protected boolean _ChgWhoSet = false;
  /** VOUCHER_HISTORY.status field */
  public    BigInteger Status  = null;
  protected boolean _StatusSet = false;
  /** VOUCHER_HISTORY.location_code field */
  public    BigInteger LocationCode  = null;
  protected boolean _LocationCodeSet = false;
  /** VOUCHER_HISTORY.modification_remark1 field */
  public    String ModificationRemark1  = null;
  protected boolean _ModificationRemark1Set = false;
  /** VOUCHER_HISTORY.modification_remark2 field */
  public    String ModificationRemark2  = null;
  protected boolean _ModificationRemark2Set = false;
  /** VOUCHER_HISTORY.modification_remark3 field */
  public    String ModificationRemark3  = null;
  protected boolean _ModificationRemark3Set = false;
  /** VOUCHER_HISTORY.modification_remark4 field */
  public    String ModificationRemark4  = null;
  protected boolean _ModificationRemark4Set = false;
  /** VOUCHER_HISTORY.modification_remark5 field */
  public    String ModificationRemark5  = null;
  protected boolean _ModificationRemark5Set = false;
  private String _objName = "VoucherHistoryObjectData";
  /** Default constructor */
  public VoucherHistoryObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public VoucherHistoryObjectData (VoucherHistoryObjectData other)
  {

    if (other == null) return;
    this.Key = new VoucherHistoryObjectKeyData (other.Key);
    this.ChgWho = other.ChgWho;
    this._ChgWhoSet = other._ChgWhoSet;
    this.Status = other.Status;
    this._StatusSet = other._StatusSet;
    this.LocationCode = other.LocationCode;
    this._LocationCodeSet = other._LocationCodeSet;
    this.ModificationRemark1 = other.ModificationRemark1;
    this._ModificationRemark1Set = other._ModificationRemark1Set;
    this.ModificationRemark2 = other.ModificationRemark2;
    this._ModificationRemark2Set = other._ModificationRemark2Set;
    this.ModificationRemark3 = other.ModificationRemark3;
    this._ModificationRemark3Set = other._ModificationRemark3Set;
    this.ModificationRemark4 = other.ModificationRemark4;
    this._ModificationRemark4Set = other._ModificationRemark4Set;
    this.ModificationRemark5 = other.ModificationRemark5;
    this._ModificationRemark5Set = other._ModificationRemark5Set;
  }

  /** get the Key for this object
   * @return VoucherHistoryObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public VoucherHistoryObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (VoucherHistoryObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: VoucherId (VOUCHER_HISTORY.voucher_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setVoucherId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "VoucherId", "setVoucherId");
    }
    if (value != null && !DataHelper.validLength (value, 50))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "VoucherId", "setVoucherId");
    }
    if (this.Key == null) this.Key = new VoucherHistoryObjectKeyData ();
    this.Key.VoucherId = value;
    this.Key._VoucherIdSet = true;
  }
  /** get the value of the field: VoucherId (VOUCHER_HISTORY.voucher_id)
   * @return String the value
   */
  public String getVoucherId () {
    if (this.Key == null) return null;
    return this.Key.VoucherId;
  }
  /** Change the field to not being actively set: VoucherId (VOUCHER_HISTORY.voucher_id)
   */
  public void unsetVoucherId () {
    if (this.Key == null) return;
    this.Key._VoucherIdSet = false;
  }
  /** See if the field is actively set: VoucherId (VOUCHER_HISTORY.voucher_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetVoucherId () {
    if (this.Key == null) return false;
    return this.Key._VoucherIdSet;
  }

  /** Retrieves the VoucherId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The VoucherId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the VoucherId field
   */
   public String getVoucherIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherIdAsFormattedString");
       return fmtMgr.formatString(this.getVoucherId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("VoucherId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getVoucherIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the VoucherId field from a formatted string
   *
   * @param _value the VoucherId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the VoucherId field
   */
   public void setVoucherIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setVoucherId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("VoucherId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setVoucherIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setVoucherIdFromFormattedString");
   }

  /** set the fields value: ChgDate (VOUCHER_HISTORY.chg_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setChgDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChgDate", "setChgDate");
    }
    if (this.Key == null) this.Key = new VoucherHistoryObjectKeyData ();
    this.Key.ChgDate = value;
    this.Key._ChgDateSet = true;
  }
  /** get the value of the field: ChgDate (VOUCHER_HISTORY.chg_date)
   * @return Date the value
   */
  public Date getChgDate () {
    if (this.Key == null) return null;
    return this.Key.ChgDate;
  }
  /** Change the field to not being actively set: ChgDate (VOUCHER_HISTORY.chg_date)
   */
  public void unsetChgDate () {
    if (this.Key == null) return;
    this.Key._ChgDateSet = false;
  }
  /** See if the field is actively set: ChgDate (VOUCHER_HISTORY.chg_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgDate () {
    if (this.Key == null) return false;
    return this.Key._ChgDateSet;
  }

  /** Retrieves the ChgDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChgDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDate field
   */
   public String getChgDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateAsFormattedString");
       return fmtMgr.formatDate(this.getChgDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChgDate field from a formatted string
   *
   * @param _value the ChgDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDate field
   */
   public void setChgDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChgDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDateFromFormattedString");
   }

  /**
   * Retrieves the ChgDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDate field
   */
  public String getChgDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getChgDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDate field value from a formatted date/time string
   *
   * @param _value the ChgDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDate field
   */
  public void setChgDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setChgDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** set the fields value: ChgWho (VOUCHER_HISTORY.chg_who)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChgWho") 
  public void setChgWho (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 50))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ChgWho", "setChgWho");
    }
    this.ChgWho = value;
    this._ChgWhoSet = true;
  }

  /** Retrieves the ChgWho field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChgWho field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgWho field
   */
   public String getChgWhoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgWhoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgWhoAsFormattedString");
       return fmtMgr.formatString(this.getChgWho());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgWho");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgWhoAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChgWho field from a formatted string
   *
   * @param _value the ChgWho field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgWho field
   */
   public void setChgWhoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgWhoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChgWho(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgWho");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgWhoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgWhoFromFormattedString");
   }

  /** get the value of the field: ChgWho (VOUCHER_HISTORY.chg_who)
   * @return String the value
   */
  public String getChgWho () {
    return this.ChgWho;
  }
  /** Change the field to not being actively set: ChgWho (VOUCHER_HISTORY.chg_who)
   */
  public void unsetChgWho () {
    this._ChgWhoSet = false;
  }
  /** See if the field is actively set: ChgWho (VOUCHER_HISTORY.chg_who)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgWho () {
    return this._ChgWhoSet;
  }
  /** set the fields value: Status (VOUCHER_HISTORY.status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Status") 
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
    this.Status = value;
    this._StatusSet = true;
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

  /** get the value of the field: Status (VOUCHER_HISTORY.status)
   * @return BigInteger the value
   */
  public BigInteger getStatus () {
    return this.Status;
  }
  /** Change the field to not being actively set: Status (VOUCHER_HISTORY.status)
   */
  public void unsetStatus () {
    this._StatusSet = false;
  }
  /** See if the field is actively set: Status (VOUCHER_HISTORY.status)
   * @return boolean whether the field is actively set
   */
  public boolean issetStatus () {
    return this._StatusSet;
  }
  /** set the fields value: LocationCode (VOUCHER_HISTORY.location_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("LocationCode") 
  public void setLocationCode (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 6))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "LocationCode", "setLocationCode");
    }
    this.LocationCode = value;
    this._LocationCodeSet = true;
  }

  /** Retrieves the LocationCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LocationCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LocationCode field
   */
   public String getLocationCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLocationCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLocationCodeAsFormattedString");
       return fmtMgr.formatBigInteger(this.getLocationCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LocationCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLocationCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the LocationCode field from a formatted string
   *
   * @param _value the LocationCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LocationCode field
   */
   public void setLocationCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLocationCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLocationCode(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LocationCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLocationCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLocationCodeFromFormattedString");
   }

  /** get the value of the field: LocationCode (VOUCHER_HISTORY.location_code)
   * @return BigInteger the value
   */
  public BigInteger getLocationCode () {
    return this.LocationCode;
  }
  /** Change the field to not being actively set: LocationCode (VOUCHER_HISTORY.location_code)
   */
  public void unsetLocationCode () {
    this._LocationCodeSet = false;
  }
  /** See if the field is actively set: LocationCode (VOUCHER_HISTORY.location_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetLocationCode () {
    return this._LocationCodeSet;
  }
  /** set the fields value: ModificationRemark1 (VOUCHER_HISTORY.modification_remark1)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ModificationRemark1") 
  public void setModificationRemark1 (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 100))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ModificationRemark1", "setModificationRemark1");
    }
    this.ModificationRemark1 = value;
    this._ModificationRemark1Set = true;
  }

  /** Retrieves the ModificationRemark1 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ModificationRemark1 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ModificationRemark1 field
   */
   public String getModificationRemark1AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getModificationRemark1AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getModificationRemark1AsFormattedString");
       return fmtMgr.formatString(this.getModificationRemark1());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ModificationRemark1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getModificationRemark1AsFormattedString");
       throw x;
     }
   }
  /** Sets the ModificationRemark1 field from a formatted string
   *
   * @param _value the ModificationRemark1 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ModificationRemark1 field
   */
   public void setModificationRemark1FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getModificationRemark1FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setModificationRemark1(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ModificationRemark1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setModificationRemark1FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setModificationRemark1FromFormattedString");
   }

  /** get the value of the field: ModificationRemark1 (VOUCHER_HISTORY.modification_remark1)
   * @return String the value
   */
  public String getModificationRemark1 () {
    return this.ModificationRemark1;
  }
  /** Change the field to not being actively set: ModificationRemark1 (VOUCHER_HISTORY.modification_remark1)
   */
  public void unsetModificationRemark1 () {
    this._ModificationRemark1Set = false;
  }
  /** See if the field is actively set: ModificationRemark1 (VOUCHER_HISTORY.modification_remark1)
   * @return boolean whether the field is actively set
   */
  public boolean issetModificationRemark1 () {
    return this._ModificationRemark1Set;
  }
  /** set the fields value: ModificationRemark2 (VOUCHER_HISTORY.modification_remark2)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ModificationRemark2") 
  public void setModificationRemark2 (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 100))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ModificationRemark2", "setModificationRemark2");
    }
    this.ModificationRemark2 = value;
    this._ModificationRemark2Set = true;
  }

  /** Retrieves the ModificationRemark2 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ModificationRemark2 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ModificationRemark2 field
   */
   public String getModificationRemark2AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getModificationRemark2AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getModificationRemark2AsFormattedString");
       return fmtMgr.formatString(this.getModificationRemark2());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ModificationRemark2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getModificationRemark2AsFormattedString");
       throw x;
     }
   }
  /** Sets the ModificationRemark2 field from a formatted string
   *
   * @param _value the ModificationRemark2 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ModificationRemark2 field
   */
   public void setModificationRemark2FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getModificationRemark2FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setModificationRemark2(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ModificationRemark2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setModificationRemark2FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setModificationRemark2FromFormattedString");
   }

  /** get the value of the field: ModificationRemark2 (VOUCHER_HISTORY.modification_remark2)
   * @return String the value
   */
  public String getModificationRemark2 () {
    return this.ModificationRemark2;
  }
  /** Change the field to not being actively set: ModificationRemark2 (VOUCHER_HISTORY.modification_remark2)
   */
  public void unsetModificationRemark2 () {
    this._ModificationRemark2Set = false;
  }
  /** See if the field is actively set: ModificationRemark2 (VOUCHER_HISTORY.modification_remark2)
   * @return boolean whether the field is actively set
   */
  public boolean issetModificationRemark2 () {
    return this._ModificationRemark2Set;
  }
  /** set the fields value: ModificationRemark3 (VOUCHER_HISTORY.modification_remark3)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ModificationRemark3") 
  public void setModificationRemark3 (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 100))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ModificationRemark3", "setModificationRemark3");
    }
    this.ModificationRemark3 = value;
    this._ModificationRemark3Set = true;
  }

  /** Retrieves the ModificationRemark3 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ModificationRemark3 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ModificationRemark3 field
   */
   public String getModificationRemark3AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getModificationRemark3AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getModificationRemark3AsFormattedString");
       return fmtMgr.formatString(this.getModificationRemark3());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ModificationRemark3");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getModificationRemark3AsFormattedString");
       throw x;
     }
   }
  /** Sets the ModificationRemark3 field from a formatted string
   *
   * @param _value the ModificationRemark3 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ModificationRemark3 field
   */
   public void setModificationRemark3FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getModificationRemark3FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setModificationRemark3(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ModificationRemark3");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setModificationRemark3FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setModificationRemark3FromFormattedString");
   }

  /** get the value of the field: ModificationRemark3 (VOUCHER_HISTORY.modification_remark3)
   * @return String the value
   */
  public String getModificationRemark3 () {
    return this.ModificationRemark3;
  }
  /** Change the field to not being actively set: ModificationRemark3 (VOUCHER_HISTORY.modification_remark3)
   */
  public void unsetModificationRemark3 () {
    this._ModificationRemark3Set = false;
  }
  /** See if the field is actively set: ModificationRemark3 (VOUCHER_HISTORY.modification_remark3)
   * @return boolean whether the field is actively set
   */
  public boolean issetModificationRemark3 () {
    return this._ModificationRemark3Set;
  }
  /** set the fields value: ModificationRemark4 (VOUCHER_HISTORY.modification_remark4)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ModificationRemark4") 
  public void setModificationRemark4 (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 100))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ModificationRemark4", "setModificationRemark4");
    }
    this.ModificationRemark4 = value;
    this._ModificationRemark4Set = true;
  }

  /** Retrieves the ModificationRemark4 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ModificationRemark4 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ModificationRemark4 field
   */
   public String getModificationRemark4AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getModificationRemark4AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getModificationRemark4AsFormattedString");
       return fmtMgr.formatString(this.getModificationRemark4());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ModificationRemark4");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getModificationRemark4AsFormattedString");
       throw x;
     }
   }
  /** Sets the ModificationRemark4 field from a formatted string
   *
   * @param _value the ModificationRemark4 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ModificationRemark4 field
   */
   public void setModificationRemark4FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getModificationRemark4FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setModificationRemark4(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ModificationRemark4");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setModificationRemark4FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setModificationRemark4FromFormattedString");
   }

  /** get the value of the field: ModificationRemark4 (VOUCHER_HISTORY.modification_remark4)
   * @return String the value
   */
  public String getModificationRemark4 () {
    return this.ModificationRemark4;
  }
  /** Change the field to not being actively set: ModificationRemark4 (VOUCHER_HISTORY.modification_remark4)
   */
  public void unsetModificationRemark4 () {
    this._ModificationRemark4Set = false;
  }
  /** See if the field is actively set: ModificationRemark4 (VOUCHER_HISTORY.modification_remark4)
   * @return boolean whether the field is actively set
   */
  public boolean issetModificationRemark4 () {
    return this._ModificationRemark4Set;
  }
  /** set the fields value: ModificationRemark5 (VOUCHER_HISTORY.modification_remark5)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ModificationRemark5") 
  public void setModificationRemark5 (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 100))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ModificationRemark5", "setModificationRemark5");
    }
    this.ModificationRemark5 = value;
    this._ModificationRemark5Set = true;
  }

  /** Retrieves the ModificationRemark5 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ModificationRemark5 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ModificationRemark5 field
   */
   public String getModificationRemark5AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getModificationRemark5AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getModificationRemark5AsFormattedString");
       return fmtMgr.formatString(this.getModificationRemark5());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ModificationRemark5");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getModificationRemark5AsFormattedString");
       throw x;
     }
   }
  /** Sets the ModificationRemark5 field from a formatted string
   *
   * @param _value the ModificationRemark5 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ModificationRemark5 field
   */
   public void setModificationRemark5FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getModificationRemark5FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setModificationRemark5(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ModificationRemark5");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setModificationRemark5FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setModificationRemark5FromFormattedString");
   }

  /** get the value of the field: ModificationRemark5 (VOUCHER_HISTORY.modification_remark5)
   * @return String the value
   */
  public String getModificationRemark5 () {
    return this.ModificationRemark5;
  }
  /** Change the field to not being actively set: ModificationRemark5 (VOUCHER_HISTORY.modification_remark5)
   */
  public void unsetModificationRemark5 () {
    this._ModificationRemark5Set = false;
  }
  /** See if the field is actively set: ModificationRemark5 (VOUCHER_HISTORY.modification_remark5)
   * @return boolean whether the field is actively set
   */
  public boolean issetModificationRemark5 () {
    return this._ModificationRemark5Set;
  }
  public String toString() {
    return VoucherHistoryObjectHelper.toMap(this, null).toString();
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
  /** VOUCHER_HISTORY.chg_who field */
    if(!nonNullOnly || (ChgWho != null))  _ChgWhoSet = flag;
  /** VOUCHER_HISTORY.status field */
    if(!nonNullOnly || (Status != null))  _StatusSet = flag;
  /** VOUCHER_HISTORY.location_code field */
    if(!nonNullOnly || (LocationCode != null))  _LocationCodeSet = flag;
  /** VOUCHER_HISTORY.modification_remark1 field */
    if(!nonNullOnly || (ModificationRemark1 != null))  _ModificationRemark1Set = flag;
  /** VOUCHER_HISTORY.modification_remark2 field */
    if(!nonNullOnly || (ModificationRemark2 != null))  _ModificationRemark2Set = flag;
  /** VOUCHER_HISTORY.modification_remark3 field */
    if(!nonNullOnly || (ModificationRemark3 != null))  _ModificationRemark3Set = flag;
  /** VOUCHER_HISTORY.modification_remark4 field */
    if(!nonNullOnly || (ModificationRemark4 != null))  _ModificationRemark4Set = flag;
  /** VOUCHER_HISTORY.modification_remark5 field */
    if(!nonNullOnly || (ModificationRemark5 != null))  _ModificationRemark5Set = flag;
  }
}
