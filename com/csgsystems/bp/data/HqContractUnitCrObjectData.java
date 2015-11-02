/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HqContractUnitCrObjectData.java
 * Definition File: Catalog/HqContractUnitCr.xml
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
  
/** HqContractUnitCrObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class HqContractUnitCrObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public HqContractUnitCrObjectKeyData Key = null;
  /** HQ_CONTRACT_UNIT_CR.total_units field */
  public    Integer TotalUnits  = null;
  protected boolean _TotalUnitsSet = false;
  /** HQ_CONTRACT_UNIT_CR.avail_units field */
  public    Integer AvailUnits  = null;
  protected boolean _AvailUnitsSet = false;
  /** HQ_CONTRACT_UNIT_CR.total_amount field */
  public    Integer TotalAmount  = null;
  protected boolean _TotalAmountSet = false;
  /** HQ_CONTRACT_UNIT_CR.avail_amount field */
  public    Integer AvailAmount  = null;
  protected boolean _AvailAmountSet = false;
  /** HQ_CONTRACT_UNIT_CR.create_dt field */
  public    Date CreateDt  = null;
  protected boolean _CreateDtSet = false;
  /** HQ_CONTRACT_UNIT_CR.inactive_dt field */
  public    Date InactiveDt  = null;
  protected boolean _InactiveDtSet = false;
  /** HQ_CONTRACT_UNIT_CR.currency_code field */
  public    Integer CurrencyCode  = null;
  protected boolean _CurrencyCodeSet = false;
  /** HQ_CONTRACT_UNIT_CR.no_bill field */
  public    Integer NoBill  = null;
  protected boolean _NoBillSet = false;
  private String _objName = "HqContractUnitCrObjectData";
  /** Default constructor */
  public HqContractUnitCrObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public HqContractUnitCrObjectData (HqContractUnitCrObjectData other)
  {

    if (other == null) return;
    this.Key = new HqContractUnitCrObjectKeyData (other.Key);
    this.TotalUnits = other.TotalUnits;
    this._TotalUnitsSet = other._TotalUnitsSet;
    this.AvailUnits = other.AvailUnits;
    this._AvailUnitsSet = other._AvailUnitsSet;
    this.TotalAmount = other.TotalAmount;
    this._TotalAmountSet = other._TotalAmountSet;
    this.AvailAmount = other.AvailAmount;
    this._AvailAmountSet = other._AvailAmountSet;
    this.CreateDt = other.CreateDt;
    this._CreateDtSet = other._CreateDtSet;
    this.InactiveDt = other.InactiveDt;
    this._InactiveDtSet = other._InactiveDtSet;
    this.CurrencyCode = other.CurrencyCode;
    this._CurrencyCodeSet = other._CurrencyCodeSet;
    this.NoBill = other.NoBill;
    this._NoBillSet = other._NoBillSet;
  }

  /** get the Key for this object
   * @return HqContractUnitCrObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public HqContractUnitCrObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (HqContractUnitCrObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: TrackingId (HQ_CONTRACT_UNIT_CR.tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingId", "setTrackingId");
    }
    if (this.Key == null) this.Key = new HqContractUnitCrObjectKeyData ();
    this.Key.TrackingId = value;
    this.Key._TrackingIdSet = true;
  }
  /** get the value of the field: TrackingId (HQ_CONTRACT_UNIT_CR.tracking_id)
   * @return Integer the value
   */
  public Integer getTrackingId () {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Change the field to not being actively set: TrackingId (HQ_CONTRACT_UNIT_CR.tracking_id)
   */
  public void unsetTrackingId () {
    if (this.Key == null) return;
    this.Key._TrackingIdSet = false;
  }
  /** See if the field is actively set: TrackingId (HQ_CONTRACT_UNIT_CR.tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetTrackingId () {
    if (this.Key == null) return false;
    return this.Key._TrackingIdSet;
  }

  /** Retrieves the TrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingId field
   */
   public String getTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the TrackingId field from a formatted string
   *
   * @param _value the TrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TrackingId field
   */
   public void setTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdFromFormattedString");
   }

  /** set the fields value: TrackingIdServ (HQ_CONTRACT_UNIT_CR.tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingIdServ", "setTrackingIdServ");
    }
    if (this.Key == null) this.Key = new HqContractUnitCrObjectKeyData ();
    this.Key.TrackingIdServ = value;
    this.Key._TrackingIdServSet = true;
  }
  /** get the value of the field: TrackingIdServ (HQ_CONTRACT_UNIT_CR.tracking_id_serv)
   * @return Integer the value
   */
  public Integer getTrackingIdServ () {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Change the field to not being actively set: TrackingIdServ (HQ_CONTRACT_UNIT_CR.tracking_id_serv)
   */
  public void unsetTrackingIdServ () {
    if (this.Key == null) return;
    this.Key._TrackingIdServSet = false;
  }
  /** See if the field is actively set: TrackingIdServ (HQ_CONTRACT_UNIT_CR.tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetTrackingIdServ () {
    if (this.Key == null) return false;
    return this.Key._TrackingIdServSet;
  }

  /** Retrieves the TrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingIdServ field
   */
   public String getTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the TrackingIdServ field from a formatted string
   *
   * @param _value the TrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TrackingIdServ field
   */
   public void setTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdServFromFormattedString");
   }

  /** set the fields value: UnitCrId (HQ_CONTRACT_UNIT_CR.unit_cr_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setUnitCrId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UnitCrId", "setUnitCrId");
    }
    if (this.Key == null) this.Key = new HqContractUnitCrObjectKeyData ();
    this.Key.UnitCrId = value;
    this.Key._UnitCrIdSet = true;
  }
  /** get the value of the field: UnitCrId (HQ_CONTRACT_UNIT_CR.unit_cr_id)
   * @return Integer the value
   */
  public Integer getUnitCrId () {
    if (this.Key == null) return null;
    return this.Key.UnitCrId;
  }
  /** Change the field to not being actively set: UnitCrId (HQ_CONTRACT_UNIT_CR.unit_cr_id)
   */
  public void unsetUnitCrId () {
    if (this.Key == null) return;
    this.Key._UnitCrIdSet = false;
  }
  /** See if the field is actively set: UnitCrId (HQ_CONTRACT_UNIT_CR.unit_cr_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetUnitCrId () {
    if (this.Key == null) return false;
    return this.Key._UnitCrIdSet;
  }

  /** Retrieves the UnitCrId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UnitCrId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitCrId field
   */
   public String getUnitCrIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitCrIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitCrIdAsFormattedString");
       return fmtMgr.formatNumber(this.getUnitCrId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnitCrId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitCrIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the UnitCrId field from a formatted string
   *
   * @param _value the UnitCrId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UnitCrId field
   */
   public void setUnitCrIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitCrIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUnitCrId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnitCrId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitCrIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitCrIdFromFormattedString");
   }

  /** set the fields value: TotalUnits (HQ_CONTRACT_UNIT_CR.total_units)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TotalUnits") 
  public void setTotalUnits (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TotalUnits", "setTotalUnits");
    }
    this.TotalUnits = value;
    this._TotalUnitsSet = true;
  }

  /** Retrieves the TotalUnits field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TotalUnits field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalUnits field
   */
   public String getTotalUnitsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalUnitsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalUnitsAsFormattedString");
       return fmtMgr.formatNumber(this.getTotalUnits(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalUnitsAsFormattedString");
       throw x;
     }
   }
  /** Sets the TotalUnits field from a formatted string
   *
   * @param _value the TotalUnits field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TotalUnits field
   */
   public void setTotalUnitsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalUnitsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTotalUnits(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalUnitsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalUnitsFromFormattedString");
   }

  /** get the value of the field: TotalUnits (HQ_CONTRACT_UNIT_CR.total_units)
   * @return Integer the value
   */
  public Integer getTotalUnits () {
    return this.TotalUnits;
  }
  /** Change the field to not being actively set: TotalUnits (HQ_CONTRACT_UNIT_CR.total_units)
   */
  public void unsetTotalUnits () {
    this._TotalUnitsSet = false;
  }
  /** See if the field is actively set: TotalUnits (HQ_CONTRACT_UNIT_CR.total_units)
   * @return boolean whether the field is actively set
   */
  public boolean issetTotalUnits () {
    return this._TotalUnitsSet;
  }
  /** set the fields value: AvailUnits (HQ_CONTRACT_UNIT_CR.avail_units)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AvailUnits") 
  public void setAvailUnits (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AvailUnits", "setAvailUnits");
    }
    this.AvailUnits = value;
    this._AvailUnitsSet = true;
  }

  /** Retrieves the AvailUnits field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AvailUnits field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AvailUnits field
   */
   public String getAvailUnitsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAvailUnitsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAvailUnitsAsFormattedString");
       return fmtMgr.formatNumber(this.getAvailUnits(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AvailUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAvailUnitsAsFormattedString");
       throw x;
     }
   }
  /** Sets the AvailUnits field from a formatted string
   *
   * @param _value the AvailUnits field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AvailUnits field
   */
   public void setAvailUnitsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAvailUnitsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAvailUnits(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AvailUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAvailUnitsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAvailUnitsFromFormattedString");
   }

  /** get the value of the field: AvailUnits (HQ_CONTRACT_UNIT_CR.avail_units)
   * @return Integer the value
   */
  public Integer getAvailUnits () {
    return this.AvailUnits;
  }
  /** Change the field to not being actively set: AvailUnits (HQ_CONTRACT_UNIT_CR.avail_units)
   */
  public void unsetAvailUnits () {
    this._AvailUnitsSet = false;
  }
  /** See if the field is actively set: AvailUnits (HQ_CONTRACT_UNIT_CR.avail_units)
   * @return boolean whether the field is actively set
   */
  public boolean issetAvailUnits () {
    return this._AvailUnitsSet;
  }
  /** set the fields value: TotalAmount (HQ_CONTRACT_UNIT_CR.total_amount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TotalAmount") 
  public void setTotalAmount (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TotalAmount", "setTotalAmount");
    }
    this.TotalAmount = value;
    this._TotalAmountSet = true;
  }

  /** Retrieves the TotalAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TotalAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalAmount field
   */
   public String getTotalAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalAmountAsFormattedString");
       return fmtMgr.formatNumber(this.getTotalAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the TotalAmount field from a formatted string
   *
   * @param _value the TotalAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TotalAmount field
   */
   public void setTotalAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTotalAmount(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalAmountFromFormattedString");
   }

  /** get the value of the field: TotalAmount (HQ_CONTRACT_UNIT_CR.total_amount)
   * @return Integer the value
   */
  public Integer getTotalAmount () {
    return this.TotalAmount;
  }
  /** Change the field to not being actively set: TotalAmount (HQ_CONTRACT_UNIT_CR.total_amount)
   */
  public void unsetTotalAmount () {
    this._TotalAmountSet = false;
  }
  /** See if the field is actively set: TotalAmount (HQ_CONTRACT_UNIT_CR.total_amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetTotalAmount () {
    return this._TotalAmountSet;
  }
  /** set the fields value: AvailAmount (HQ_CONTRACT_UNIT_CR.avail_amount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AvailAmount") 
  public void setAvailAmount (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AvailAmount", "setAvailAmount");
    }
    this.AvailAmount = value;
    this._AvailAmountSet = true;
  }

  /** Retrieves the AvailAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AvailAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AvailAmount field
   */
   public String getAvailAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAvailAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAvailAmountAsFormattedString");
       return fmtMgr.formatNumber(this.getAvailAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AvailAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAvailAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the AvailAmount field from a formatted string
   *
   * @param _value the AvailAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AvailAmount field
   */
   public void setAvailAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAvailAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAvailAmount(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AvailAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAvailAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAvailAmountFromFormattedString");
   }

  /** get the value of the field: AvailAmount (HQ_CONTRACT_UNIT_CR.avail_amount)
   * @return Integer the value
   */
  public Integer getAvailAmount () {
    return this.AvailAmount;
  }
  /** Change the field to not being actively set: AvailAmount (HQ_CONTRACT_UNIT_CR.avail_amount)
   */
  public void unsetAvailAmount () {
    this._AvailAmountSet = false;
  }
  /** See if the field is actively set: AvailAmount (HQ_CONTRACT_UNIT_CR.avail_amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetAvailAmount () {
    return this._AvailAmountSet;
  }
  /** set the fields value: CreateDt (HQ_CONTRACT_UNIT_CR.create_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CreateDt") 
  public void setCreateDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CreateDt", "setCreateDt");
    }
    this.CreateDt = value;
    this._CreateDtSet = true;
  }

  /** Retrieves the CreateDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CreateDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CreateDt field
   */
   public String getCreateDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreateDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCreateDtAsFormattedString");
       return fmtMgr.formatDate(this.getCreateDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CreateDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCreateDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the CreateDt field from a formatted string
   *
   * @param _value the CreateDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CreateDt field
   */
   public void setCreateDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreateDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCreateDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CreateDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCreateDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCreateDtFromFormattedString");
   }

  /**
   * Retrieves the CreateDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CreateDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the CreateDt field
   */
  public String getCreateDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreateDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCreateDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getCreateDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreateDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCreateDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the CreateDt field value from a formatted date/time string
   *
   * @param _value the CreateDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CreateDt field
   */
  public void setCreateDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCreateDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setCreateDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreateDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCreateDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: CreateDt (HQ_CONTRACT_UNIT_CR.create_dt)
   * @return Date the value
   */
  public Date getCreateDt () {
    return this.CreateDt;
  }
  /** Change the field to not being actively set: CreateDt (HQ_CONTRACT_UNIT_CR.create_dt)
   */
  public void unsetCreateDt () {
    this._CreateDtSet = false;
  }
  /** See if the field is actively set: CreateDt (HQ_CONTRACT_UNIT_CR.create_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetCreateDt () {
    return this._CreateDtSet;
  }
  /** set the fields value: InactiveDt (HQ_CONTRACT_UNIT_CR.inactive_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("InactiveDt") 
  public void setInactiveDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InactiveDt", "setInactiveDt");
    }
    this.InactiveDt = value;
    this._InactiveDtSet = true;
  }

  /** Retrieves the InactiveDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InactiveDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDt field
   */
   public String getInactiveDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDtAsFormattedString");
       return fmtMgr.formatDate(this.getInactiveDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InactiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the InactiveDt field from a formatted string
   *
   * @param _value the InactiveDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InactiveDt field
   */
   public void setInactiveDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInactiveDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InactiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInactiveDtFromFormattedString");
   }

  /**
   * Retrieves the InactiveDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InactiveDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDt field
   */
  public String getInactiveDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getInactiveDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the InactiveDt field value from a formatted date/time string
   *
   * @param _value the InactiveDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InactiveDt field
   */
  public void setInactiveDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInactiveDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setInactiveDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: InactiveDt (HQ_CONTRACT_UNIT_CR.inactive_dt)
   * @return Date the value
   */
  public Date getInactiveDt () {
    return this.InactiveDt;
  }
  /** Change the field to not being actively set: InactiveDt (HQ_CONTRACT_UNIT_CR.inactive_dt)
   */
  public void unsetInactiveDt () {
    this._InactiveDtSet = false;
  }
  /** See if the field is actively set: InactiveDt (HQ_CONTRACT_UNIT_CR.inactive_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetInactiveDt () {
    return this._InactiveDtSet;
  }
  /** set the fields value: CurrencyCode (HQ_CONTRACT_UNIT_CR.currency_code)
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

  /** get the value of the field: CurrencyCode (HQ_CONTRACT_UNIT_CR.currency_code)
   * @return Integer the value
   */
  public Integer getCurrencyCode () {
    return this.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (HQ_CONTRACT_UNIT_CR.currency_code)
   */
  public void unsetCurrencyCode () {
    this._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (HQ_CONTRACT_UNIT_CR.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode () {
    return this._CurrencyCodeSet;
  }
  /** set the fields value: NoBill (HQ_CONTRACT_UNIT_CR.no_bill)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NoBill") 
  public void setNoBill (Integer value) throws ServiceException
  {
    this.NoBill = value;
    this._NoBillSet = true;
  }

  /** Retrieves the NoBill field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NoBill field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NoBill field
   */
   public String getNoBillAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoBillAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNoBillAsFormattedString");
       return fmtMgr.formatNumber(this.getNoBill(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NoBill");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNoBillAsFormattedString");
       throw x;
     }
   }
  /** Sets the NoBill field from a formatted string
   *
   * @param _value the NoBill field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NoBill field
   */
   public void setNoBillFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoBillFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNoBill(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NoBill");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNoBillFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNoBillFromFormattedString");
   }

  /** get the value of the field: NoBill (HQ_CONTRACT_UNIT_CR.no_bill)
   * @return Integer the value
   */
  public Integer getNoBill () {
    return this.NoBill;
  }
  /** Change the field to not being actively set: NoBill (HQ_CONTRACT_UNIT_CR.no_bill)
   */
  public void unsetNoBill () {
    this._NoBillSet = false;
  }
  /** See if the field is actively set: NoBill (HQ_CONTRACT_UNIT_CR.no_bill)
   * @return boolean whether the field is actively set
   */
  public boolean issetNoBill () {
    return this._NoBillSet;
  }
  public String toString() {
    return HqContractUnitCrObjectHelper.toMap(this, null).toString();
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
  /** HQ_CONTRACT_UNIT_CR.total_units field */
    if(!nonNullOnly || (TotalUnits != null))  _TotalUnitsSet = flag;
  /** HQ_CONTRACT_UNIT_CR.avail_units field */
    if(!nonNullOnly || (AvailUnits != null))  _AvailUnitsSet = flag;
  /** HQ_CONTRACT_UNIT_CR.total_amount field */
    if(!nonNullOnly || (TotalAmount != null))  _TotalAmountSet = flag;
  /** HQ_CONTRACT_UNIT_CR.avail_amount field */
    if(!nonNullOnly || (AvailAmount != null))  _AvailAmountSet = flag;
  /** HQ_CONTRACT_UNIT_CR.create_dt field */
    if(!nonNullOnly || (CreateDt != null))  _CreateDtSet = flag;
  /** HQ_CONTRACT_UNIT_CR.inactive_dt field */
    if(!nonNullOnly || (InactiveDt != null))  _InactiveDtSet = flag;
  /** HQ_CONTRACT_UNIT_CR.currency_code field */
    if(!nonNullOnly || (CurrencyCode != null))  _CurrencyCodeSet = flag;
  /** HQ_CONTRACT_UNIT_CR.no_bill field */
    if(!nonNullOnly || (NoBill != null))  _NoBillSet = flag;
  }
}
