/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ProductChargeMapObjectData.java
 * Definition File: Customer/ProductChargeMap.xml
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
  
/** ProductChargeMapObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class ProductChargeMapObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public ProductChargeMapObjectKeyData Key = null;
  /** PRODUCT_CHARGE_MAP.billing_account_no field */
  public    Integer BillingAccountInternalId  = null;
  protected boolean _BillingAccountInternalIdSet = false;
  /** PRODUCT_CHARGE_MAP.billed_thru_dt field */
  public    Date BilledThruDt  = null;
  protected boolean _BilledThruDtSet = false;
  /** PRODUCT_CHARGE_MAP.bill_period field */
  public    String BillPeriod  = null;
  protected boolean _BillPeriodSet = false;
  /** PRODUCT_CHARGE_MAP.no_bill field */
  public    Boolean NoBill  = null;
  protected boolean _NoBillSet = false;
  /** PRODUCT_CHARGE_MAP.parent_account_no field */
  public    Integer ParentAccountInternalId  = null;
  protected boolean _ParentAccountInternalIdSet = false;
  /** PRODUCT_CHARGE_MAP.open_item_id field */
  public    Integer OpenItemId  = null;
  protected boolean _OpenItemIdSet = false;
  /** PRODUCT_CHARGE_MAP.in_arrears_override field */
  public    Integer InArrearsOverride  = null;
  protected boolean _InArrearsOverrideSet = false;
  /** PRODUCT_CHARGE_MAP.activation_code field */
  public    Integer ActivationCode  = null;
  protected boolean _ActivationCodeSet = false;
  /** PRODUCT_CHARGE_MAP.termination_code field */
  public    Integer TerminationCode  = null;
  protected boolean _TerminationCodeSet = false;
  /** PRODUCT_CHARGE_MAP.inactive_dt field */
  public    Date InactiveDt  = null;
  protected boolean _InactiveDtSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
  public    String BillingAccountExternalId  = null;
  protected boolean _BillingAccountExternalIdSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
  public    Integer BillingAccountExternalIdType  = null;
  protected boolean _BillingAccountExternalIdTypeSet = false;
  private String _objName = "ProductChargeMapObjectData";
  /** Default constructor */
  public ProductChargeMapObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public ProductChargeMapObjectData (ProductChargeMapObjectData other)
  {

    if (other == null) return;
    this.Key = new ProductChargeMapObjectKeyData (other.Key);
    this.BillingAccountInternalId = other.BillingAccountInternalId;
    this._BillingAccountInternalIdSet = other._BillingAccountInternalIdSet;
    this.BilledThruDt = other.BilledThruDt;
    this._BilledThruDtSet = other._BilledThruDtSet;
    this.BillPeriod = other.BillPeriod;
    this._BillPeriodSet = other._BillPeriodSet;
    this.NoBill = other.NoBill;
    this._NoBillSet = other._NoBillSet;
    this.ParentAccountInternalId = other.ParentAccountInternalId;
    this._ParentAccountInternalIdSet = other._ParentAccountInternalIdSet;
    this.OpenItemId = other.OpenItemId;
    this._OpenItemIdSet = other._OpenItemIdSet;
    this.InArrearsOverride = other.InArrearsOverride;
    this._InArrearsOverrideSet = other._InArrearsOverrideSet;
    this.ActivationCode = other.ActivationCode;
    this._ActivationCodeSet = other._ActivationCodeSet;
    this.TerminationCode = other.TerminationCode;
    this._TerminationCodeSet = other._TerminationCodeSet;
    this.InactiveDt = other.InactiveDt;
    this._InactiveDtSet = other._InactiveDtSet;
    this.BillingAccountExternalId = other.BillingAccountExternalId;
    this._BillingAccountExternalIdSet = other._BillingAccountExternalIdSet;
    this.BillingAccountExternalIdType = other.BillingAccountExternalIdType;
    this._BillingAccountExternalIdTypeSet = other._BillingAccountExternalIdTypeSet;
  }

  /** get the Key for this object
   * @return ProductChargeMapObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public ProductChargeMapObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (ProductChargeMapObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: TrackingId (PRODUCT_CHARGE_MAP.tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingId", "setTrackingId");
    }
    if (this.Key == null) this.Key = new ProductChargeMapObjectKeyData ();
    this.Key.TrackingId = value;
    this.Key._TrackingIdSet = true;
  }
  /** get the value of the field: TrackingId (PRODUCT_CHARGE_MAP.tracking_id)
   * @return Integer the value
   */
  public Integer getTrackingId () {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Change the field to not being actively set: TrackingId (PRODUCT_CHARGE_MAP.tracking_id)
   */
  public void unsetTrackingId () {
    if (this.Key == null) return;
    this.Key._TrackingIdSet = false;
  }
  /** See if the field is actively set: TrackingId (PRODUCT_CHARGE_MAP.tracking_id)
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

  /** set the fields value: TrackingIdServ (PRODUCT_CHARGE_MAP.tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingIdServ", "setTrackingIdServ");
    }
    if (this.Key == null) this.Key = new ProductChargeMapObjectKeyData ();
    this.Key.TrackingIdServ = value;
    this.Key._TrackingIdServSet = true;
  }
  /** get the value of the field: TrackingIdServ (PRODUCT_CHARGE_MAP.tracking_id_serv)
   * @return Integer the value
   */
  public Integer getTrackingIdServ () {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Change the field to not being actively set: TrackingIdServ (PRODUCT_CHARGE_MAP.tracking_id_serv)
   */
  public void unsetTrackingIdServ () {
    if (this.Key == null) return;
    this.Key._TrackingIdServSet = false;
  }
  /** See if the field is actively set: TrackingIdServ (PRODUCT_CHARGE_MAP.tracking_id_serv)
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

  /** set the fields value: ActiveDt (PRODUCT_CHARGE_MAP.active_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setActiveDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ActiveDt", "setActiveDt");
    }
    if (this.Key == null) this.Key = new ProductChargeMapObjectKeyData ();
    this.Key.ActiveDt = value;
    this.Key._ActiveDtSet = true;
  }
  /** get the value of the field: ActiveDt (PRODUCT_CHARGE_MAP.active_dt)
   * @return Date the value
   */
  public Date getActiveDt () {
    if (this.Key == null) return null;
    return this.Key.ActiveDt;
  }
  /** Change the field to not being actively set: ActiveDt (PRODUCT_CHARGE_MAP.active_dt)
   */
  public void unsetActiveDt () {
    if (this.Key == null) return;
    this.Key._ActiveDtSet = false;
  }
  /** See if the field is actively set: ActiveDt (PRODUCT_CHARGE_MAP.active_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetActiveDt () {
    if (this.Key == null) return false;
    return this.Key._ActiveDtSet;
  }

  /** Retrieves the ActiveDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ActiveDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDt field
   */
   public String getActiveDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDtAsFormattedString");
       return fmtMgr.formatDate(this.getActiveDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the ActiveDt field from a formatted string
   *
   * @param _value the ActiveDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ActiveDt field
   */
   public void setActiveDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setActiveDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveDtFromFormattedString");
   }

  /**
   * Retrieves the ActiveDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActiveDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDt field
   */
  public String getActiveDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getActiveDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ActiveDt field value from a formatted date/time string
   *
   * @param _value the ActiveDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ActiveDt field
   */
  public void setActiveDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActiveDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setActiveDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** set the fields value: BillingAccountInternalId (PRODUCT_CHARGE_MAP.billing_account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillingAccountInternalId") 
  public void setBillingAccountInternalId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillingAccountInternalId", "setBillingAccountInternalId");
    }
    this.BillingAccountInternalId = value;
    this._BillingAccountInternalIdSet = true;
  }

  /** Retrieves the BillingAccountInternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillingAccountInternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillingAccountInternalId field
   */
   public String getBillingAccountInternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingAccountInternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingAccountInternalIdAsFormattedString");
       return fmtMgr.formatNumber(this.getBillingAccountInternalId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillingAccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingAccountInternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillingAccountInternalId field from a formatted string
   *
   * @param _value the BillingAccountInternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillingAccountInternalId field
   */
   public void setBillingAccountInternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingAccountInternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillingAccountInternalId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillingAccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillingAccountInternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillingAccountInternalIdFromFormattedString");
   }

  /** get the value of the field: BillingAccountInternalId (PRODUCT_CHARGE_MAP.billing_account_no)
   * @return Integer the value
   */
  public Integer getBillingAccountInternalId () {
    return this.BillingAccountInternalId;
  }
  /** Change the field to not being actively set: BillingAccountInternalId (PRODUCT_CHARGE_MAP.billing_account_no)
   */
  public void unsetBillingAccountInternalId () {
    this._BillingAccountInternalIdSet = false;
  }
  /** See if the field is actively set: BillingAccountInternalId (PRODUCT_CHARGE_MAP.billing_account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillingAccountInternalId () {
    return this._BillingAccountInternalIdSet;
  }
  /** set the fields value: BilledThruDt (PRODUCT_CHARGE_MAP.billed_thru_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BilledThruDt") 
  public void setBilledThruDt (Date value) throws ServiceException
  {
    this.BilledThruDt = value;
    this._BilledThruDtSet = true;
  }

  /** Retrieves the BilledThruDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BilledThruDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BilledThruDt field
   */
   public String getBilledThruDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBilledThruDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBilledThruDtAsFormattedString");
       return fmtMgr.formatDate(this.getBilledThruDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BilledThruDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBilledThruDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the BilledThruDt field from a formatted string
   *
   * @param _value the BilledThruDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BilledThruDt field
   */
   public void setBilledThruDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBilledThruDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBilledThruDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BilledThruDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBilledThruDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBilledThruDtFromFormattedString");
   }

  /**
   * Retrieves the BilledThruDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BilledThruDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the BilledThruDt field
   */
  public String getBilledThruDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBilledThruDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBilledThruDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getBilledThruDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BilledThruDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBilledThruDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the BilledThruDt field value from a formatted date/time string
   *
   * @param _value the BilledThruDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BilledThruDt field
   */
  public void setBilledThruDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBilledThruDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setBilledThruDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BilledThruDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBilledThruDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: BilledThruDt (PRODUCT_CHARGE_MAP.billed_thru_dt)
   * @return Date the value
   */
  public Date getBilledThruDt () {
    return this.BilledThruDt;
  }
  /** Change the field to not being actively set: BilledThruDt (PRODUCT_CHARGE_MAP.billed_thru_dt)
   */
  public void unsetBilledThruDt () {
    this._BilledThruDtSet = false;
  }
  /** See if the field is actively set: BilledThruDt (PRODUCT_CHARGE_MAP.billed_thru_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetBilledThruDt () {
    return this._BilledThruDtSet;
  }
  /** set the fields value: BillPeriod (PRODUCT_CHARGE_MAP.bill_period)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillPeriod") 
  public void setBillPeriod (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 3))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillPeriod", "setBillPeriod");
    }
    this.BillPeriod = value;
    this._BillPeriodSet = true;
  }

  /** Retrieves the BillPeriod field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillPeriod field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillPeriod field
   */
   public String getBillPeriodAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillPeriodAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillPeriodAsFormattedString");
       return fmtMgr.formatString(this.getBillPeriod());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillPeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillPeriodAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillPeriod field from a formatted string
   *
   * @param _value the BillPeriod field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillPeriod field
   */
   public void setBillPeriodFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillPeriodFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillPeriod(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillPeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillPeriodFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillPeriodFromFormattedString");
   }

  /** get the value of the field: BillPeriod (PRODUCT_CHARGE_MAP.bill_period)
   * @return String the value
   */
  public String getBillPeriod () {
    return this.BillPeriod;
  }
  /** Change the field to not being actively set: BillPeriod (PRODUCT_CHARGE_MAP.bill_period)
   */
  public void unsetBillPeriod () {
    this._BillPeriodSet = false;
  }
  /** See if the field is actively set: BillPeriod (PRODUCT_CHARGE_MAP.bill_period)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillPeriod () {
    return this._BillPeriodSet;
  }
  /** set the fields value: NoBill (PRODUCT_CHARGE_MAP.no_bill)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NoBill") 
  public void setNoBill (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "NoBill", "setNoBill");
    }
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
       return fmtMgr.formatBoolean(this.getNoBill());
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
       this.setNoBill(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NoBill");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNoBillFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNoBillFromFormattedString");
   }

  /** get the value of the field: NoBill (PRODUCT_CHARGE_MAP.no_bill)
   * @return Boolean the value
   */
  public Boolean getNoBill () {
    return this.NoBill;
  }
  /** Change the field to not being actively set: NoBill (PRODUCT_CHARGE_MAP.no_bill)
   */
  public void unsetNoBill () {
    this._NoBillSet = false;
  }
  /** See if the field is actively set: NoBill (PRODUCT_CHARGE_MAP.no_bill)
   * @return boolean whether the field is actively set
   */
  public boolean issetNoBill () {
    return this._NoBillSet;
  }
  /** set the fields value: ParentAccountInternalId (PRODUCT_CHARGE_MAP.parent_account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ParentAccountInternalId") 
  public void setParentAccountInternalId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ParentAccountInternalId", "setParentAccountInternalId");
    }
    this.ParentAccountInternalId = value;
    this._ParentAccountInternalIdSet = true;
  }

  /** Retrieves the ParentAccountInternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ParentAccountInternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentAccountInternalId field
   */
   public String getParentAccountInternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentAccountInternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentAccountInternalIdAsFormattedString");
       return fmtMgr.formatNumber(this.getParentAccountInternalId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentAccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentAccountInternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ParentAccountInternalId field from a formatted string
   *
   * @param _value the ParentAccountInternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ParentAccountInternalId field
   */
   public void setParentAccountInternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentAccountInternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setParentAccountInternalId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentAccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentAccountInternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentAccountInternalIdFromFormattedString");
   }

  /** get the value of the field: ParentAccountInternalId (PRODUCT_CHARGE_MAP.parent_account_no)
   * @return Integer the value
   */
  public Integer getParentAccountInternalId () {
    return this.ParentAccountInternalId;
  }
  /** Change the field to not being actively set: ParentAccountInternalId (PRODUCT_CHARGE_MAP.parent_account_no)
   */
  public void unsetParentAccountInternalId () {
    this._ParentAccountInternalIdSet = false;
  }
  /** See if the field is actively set: ParentAccountInternalId (PRODUCT_CHARGE_MAP.parent_account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetParentAccountInternalId () {
    return this._ParentAccountInternalIdSet;
  }
  /** set the fields value: OpenItemId (PRODUCT_CHARGE_MAP.open_item_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OpenItemId") 
  public void setOpenItemId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OpenItemId", "setOpenItemId");
    }
    this.OpenItemId = value;
    this._OpenItemIdSet = true;
  }

  /** Retrieves the OpenItemId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OpenItemId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OpenItemId field
   */
   public String getOpenItemIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdAsFormattedString");
       return fmtMgr.formatNumber(this.getOpenItemId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OpenItemId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOpenItemIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the OpenItemId field from a formatted string
   *
   * @param _value the OpenItemId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OpenItemId field
   */
   public void setOpenItemIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOpenItemId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OpenItemId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOpenItemIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOpenItemIdFromFormattedString");
   }

  /** get the value of the field: OpenItemId (PRODUCT_CHARGE_MAP.open_item_id)
   * @return Integer the value
   */
  public Integer getOpenItemId () {
    return this.OpenItemId;
  }
  /** Change the field to not being actively set: OpenItemId (PRODUCT_CHARGE_MAP.open_item_id)
   */
  public void unsetOpenItemId () {
    this._OpenItemIdSet = false;
  }
  /** See if the field is actively set: OpenItemId (PRODUCT_CHARGE_MAP.open_item_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetOpenItemId () {
    return this._OpenItemIdSet;
  }
  /** set the fields value: InArrearsOverride (PRODUCT_CHARGE_MAP.in_arrears_override)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("InArrearsOverride") 
  public void setInArrearsOverride (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InArrearsOverride", "setInArrearsOverride");
    }
    this.InArrearsOverride = value;
    this._InArrearsOverrideSet = true;
  }

  /** Retrieves the InArrearsOverride field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InArrearsOverride field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InArrearsOverride field
   */
   public String getInArrearsOverrideAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInArrearsOverrideAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInArrearsOverrideAsFormattedString");
       return fmtMgr.formatNumber(this.getInArrearsOverride(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InArrearsOverride");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInArrearsOverrideAsFormattedString");
       throw x;
     }
   }
  /** Sets the InArrearsOverride field from a formatted string
   *
   * @param _value the InArrearsOverride field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InArrearsOverride field
   */
   public void setInArrearsOverrideFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInArrearsOverrideFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInArrearsOverride(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InArrearsOverride");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInArrearsOverrideFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInArrearsOverrideFromFormattedString");
   }

  /** get the value of the field: InArrearsOverride (PRODUCT_CHARGE_MAP.in_arrears_override)
   * @return Integer the value
   */
  public Integer getInArrearsOverride () {
    return this.InArrearsOverride;
  }
  /** Change the field to not being actively set: InArrearsOverride (PRODUCT_CHARGE_MAP.in_arrears_override)
   */
  public void unsetInArrearsOverride () {
    this._InArrearsOverrideSet = false;
  }
  /** See if the field is actively set: InArrearsOverride (PRODUCT_CHARGE_MAP.in_arrears_override)
   * @return boolean whether the field is actively set
   */
  public boolean issetInArrearsOverride () {
    return this._InArrearsOverrideSet;
  }
  /** set the fields value: ActivationCode (PRODUCT_CHARGE_MAP.activation_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ActivationCode") 
  public void setActivationCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ActivationCode", "setActivationCode");
    }
    this.ActivationCode = value;
    this._ActivationCodeSet = true;
  }

  /** Retrieves the ActivationCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ActivationCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActivationCode field
   */
   public String getActivationCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActivationCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActivationCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getActivationCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActivationCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getActivationCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ActivationCode field from a formatted string
   *
   * @param _value the ActivationCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ActivationCode field
   */
   public void setActivationCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActivationCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setActivationCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActivationCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setActivationCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActivationCodeFromFormattedString");
   }

  /** get the value of the field: ActivationCode (PRODUCT_CHARGE_MAP.activation_code)
   * @return Integer the value
   */
  public Integer getActivationCode () {
    return this.ActivationCode;
  }
  /** Change the field to not being actively set: ActivationCode (PRODUCT_CHARGE_MAP.activation_code)
   */
  public void unsetActivationCode () {
    this._ActivationCodeSet = false;
  }
  /** See if the field is actively set: ActivationCode (PRODUCT_CHARGE_MAP.activation_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetActivationCode () {
    return this._ActivationCodeSet;
  }
  /** set the fields value: TerminationCode (PRODUCT_CHARGE_MAP.termination_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TerminationCode") 
  public void setTerminationCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TerminationCode", "setTerminationCode");
    }
    this.TerminationCode = value;
    this._TerminationCodeSet = true;
  }

  /** Retrieves the TerminationCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TerminationCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TerminationCode field
   */
   public String getTerminationCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTerminationCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTerminationCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getTerminationCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TerminationCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTerminationCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the TerminationCode field from a formatted string
   *
   * @param _value the TerminationCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TerminationCode field
   */
   public void setTerminationCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTerminationCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTerminationCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TerminationCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTerminationCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTerminationCodeFromFormattedString");
   }

  /** get the value of the field: TerminationCode (PRODUCT_CHARGE_MAP.termination_code)
   * @return Integer the value
   */
  public Integer getTerminationCode () {
    return this.TerminationCode;
  }
  /** Change the field to not being actively set: TerminationCode (PRODUCT_CHARGE_MAP.termination_code)
   */
  public void unsetTerminationCode () {
    this._TerminationCodeSet = false;
  }
  /** See if the field is actively set: TerminationCode (PRODUCT_CHARGE_MAP.termination_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetTerminationCode () {
    return this._TerminationCodeSet;
  }
  /** set the fields value: InactiveDt (PRODUCT_CHARGE_MAP.inactive_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("InactiveDt") 
  public void setInactiveDt (Date value) throws ServiceException
  {
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

  /** get the value of the field: InactiveDt (PRODUCT_CHARGE_MAP.inactive_dt)
   * @return Date the value
   */
  public Date getInactiveDt () {
    return this.InactiveDt;
  }
  /** Change the field to not being actively set: InactiveDt (PRODUCT_CHARGE_MAP.inactive_dt)
   */
  public void unsetInactiveDt () {
    this._InactiveDtSet = false;
  }
  /** See if the field is actively set: InactiveDt (PRODUCT_CHARGE_MAP.inactive_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetInactiveDt () {
    return this._InactiveDtSet;
  }
  /** set the fields value: BillingAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillingAccountExternalId") 
  public void setBillingAccountExternalId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillingAccountExternalId", "setBillingAccountExternalId");
    }
    if (value != null && !DataHelper.validLength (value, 144))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillingAccountExternalId", "setBillingAccountExternalId");
    }
    this.BillingAccountExternalId = value;
    this._BillingAccountExternalIdSet = true;
  }

  /** Retrieves the BillingAccountExternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillingAccountExternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillingAccountExternalId field
   */
   public String getBillingAccountExternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingAccountExternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingAccountExternalIdAsFormattedString");
       return fmtMgr.formatString(this.getBillingAccountExternalId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillingAccountExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingAccountExternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillingAccountExternalId field from a formatted string
   *
   * @param _value the BillingAccountExternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillingAccountExternalId field
   */
   public void setBillingAccountExternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingAccountExternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillingAccountExternalId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillingAccountExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillingAccountExternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillingAccountExternalIdFromFormattedString");
   }

  /** get the value of the field: BillingAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return String the value
   */
  public String getBillingAccountExternalId () {
    return this.BillingAccountExternalId;
  }
  /** Change the field to not being actively set: BillingAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   */
  public void unsetBillingAccountExternalId () {
    this._BillingAccountExternalIdSet = false;
  }
  /** See if the field is actively set: BillingAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillingAccountExternalId () {
    return this._BillingAccountExternalIdSet;
  }
  /** set the fields value: BillingAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillingAccountExternalIdType") 
  public void setBillingAccountExternalIdType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillingAccountExternalIdType", "setBillingAccountExternalIdType");
    }
    this.BillingAccountExternalIdType = value;
    this._BillingAccountExternalIdTypeSet = true;
  }

  /** Retrieves the BillingAccountExternalIdType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillingAccountExternalIdType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillingAccountExternalIdType field
   */
   public String getBillingAccountExternalIdTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingAccountExternalIdTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingAccountExternalIdTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getBillingAccountExternalIdType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillingAccountExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingAccountExternalIdTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillingAccountExternalIdType field from a formatted string
   *
   * @param _value the BillingAccountExternalIdType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillingAccountExternalIdType field
   */
   public void setBillingAccountExternalIdTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingAccountExternalIdTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillingAccountExternalIdType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillingAccountExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillingAccountExternalIdTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillingAccountExternalIdTypeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated BillingAccountExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BillingAccountExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillingAccountExternalIdType field
   */

  public String getBillingAccountExternalIdTypeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingAccountExternalIdTypeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBillingAccountExternalIdTypeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingAccountExternalIdTypeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getBillingAccountExternalIdType()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingAccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingAccountExternalIdTypeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated BillingAccountExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the BillingAccountExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillingAccountExternalIdType field
   */
  public Enumeration getBillingAccountExternalIdTypeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingAccountExternalIdTypeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ExternalIdType", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingAccountExternalIdTypeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingAccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingAccountExternalIdTypeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated BillingAccountExternalIdType field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setBillingAccountExternalIdTypeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillingAccountExternalIdTypeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBillingAccountExternalIdTypeEnumeration(_locale);
      this.setBillingAccountExternalIdType((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingAccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillingAccountExternalIdTypeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillingAccountExternalIdTypeFromDisplayValue");
  }

  /** get the value of the field: BillingAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return Integer the value
   */
  public Integer getBillingAccountExternalIdType () {
    return this.BillingAccountExternalIdType;
  }
  /** Change the field to not being actively set: BillingAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   */
  public void unsetBillingAccountExternalIdType () {
    this._BillingAccountExternalIdTypeSet = false;
  }
  /** See if the field is actively set: BillingAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillingAccountExternalIdType () {
    return this._BillingAccountExternalIdTypeSet;
  }
  public String toString() {
    return ProductChargeMapObjectHelper.toMap(this, null).toString();
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
  /** PRODUCT_CHARGE_MAP.billing_account_no field */
    if(!nonNullOnly || (BillingAccountInternalId != null))  _BillingAccountInternalIdSet = flag;
  /** PRODUCT_CHARGE_MAP.billed_thru_dt field */
    if(!nonNullOnly || (BilledThruDt != null))  _BilledThruDtSet = flag;
  /** PRODUCT_CHARGE_MAP.bill_period field */
    if(!nonNullOnly || (BillPeriod != null))  _BillPeriodSet = flag;
  /** PRODUCT_CHARGE_MAP.no_bill field */
    if(!nonNullOnly || (NoBill != null))  _NoBillSet = flag;
  /** PRODUCT_CHARGE_MAP.parent_account_no field */
    if(!nonNullOnly || (ParentAccountInternalId != null))  _ParentAccountInternalIdSet = flag;
  /** PRODUCT_CHARGE_MAP.open_item_id field */
    if(!nonNullOnly || (OpenItemId != null))  _OpenItemIdSet = flag;
  /** PRODUCT_CHARGE_MAP.in_arrears_override field */
    if(!nonNullOnly || (InArrearsOverride != null))  _InArrearsOverrideSet = flag;
  /** PRODUCT_CHARGE_MAP.activation_code field */
    if(!nonNullOnly || (ActivationCode != null))  _ActivationCodeSet = flag;
  /** PRODUCT_CHARGE_MAP.termination_code field */
    if(!nonNullOnly || (TerminationCode != null))  _TerminationCodeSet = flag;
  /** PRODUCT_CHARGE_MAP.inactive_dt field */
    if(!nonNullOnly || (InactiveDt != null))  _InactiveDtSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
    if(!nonNullOnly || (BillingAccountExternalId != null))  _BillingAccountExternalIdSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
    if(!nonNullOnly || (BillingAccountExternalIdType != null))  _BillingAccountExternalIdTypeSet = flag;
  }
}
