/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AbiNrcDucObjectData.java
 * Definition File: Customer/AbiNrcDuc.xml
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
  
/** AbiNrcDucObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class AbiNrcDucObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public AbiNrcDucObjectKeyData Key = null;
  /** ABI_NRC_DUC.duc_id field */
  public    BigInteger DucId  = null;
  protected boolean _DucIdSet = false;
  /** ABI_NRC_DUC.duc_type field */
  public    BigInteger DucType  = null;
  protected boolean _DucTypeSet = false;
  /** ABI_NRC_DUC.duc_subtype field */
  public    BigInteger DucSubtype  = null;
  protected boolean _DucSubtypeSet = false;
  /** ABI_NRC_DUC.money_value field */
  public    BigInteger MoneyValue  = null;
  protected boolean _MoneyValueSet = false;
  /** ABI_NRC_DUC.currency_code field */
  public    BigInteger CurrencyCode  = null;
  protected boolean _CurrencyCodeSet = false;
  /** ABI_NRC_DUC.annotation field */
  public    String Annotation  = null;
  protected boolean _AnnotationSet = false;
  private String _objName = "AbiNrcDucObjectData";
  /** Default constructor */
  public AbiNrcDucObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public AbiNrcDucObjectData (AbiNrcDucObjectData other)
  {

    if (other == null) return;
    this.Key = new AbiNrcDucObjectKeyData (other.Key);
    this.DucId = other.DucId;
    this._DucIdSet = other._DucIdSet;
    this.DucType = other.DucType;
    this._DucTypeSet = other._DucTypeSet;
    this.DucSubtype = other.DucSubtype;
    this._DucSubtypeSet = other._DucSubtypeSet;
    this.MoneyValue = other.MoneyValue;
    this._MoneyValueSet = other._MoneyValueSet;
    this.CurrencyCode = other.CurrencyCode;
    this._CurrencyCodeSet = other._CurrencyCodeSet;
    this.Annotation = other.Annotation;
    this._AnnotationSet = other._AnnotationSet;
  }

  /** get the Key for this object
   * @return AbiNrcDucObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public AbiNrcDucObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (AbiNrcDucObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: TrackingId (ABI_NRC_DUC.tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingId", "setTrackingId");
    }
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "TrackingId", "setTrackingId");
    }
    if (this.Key == null) this.Key = new AbiNrcDucObjectKeyData ();
    this.Key.TrackingId = value;
    this.Key._TrackingIdSet = true;
  }
  /** get the value of the field: TrackingId (ABI_NRC_DUC.tracking_id)
   * @return BigInteger the value
   */
  public BigInteger getTrackingId () {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Change the field to not being actively set: TrackingId (ABI_NRC_DUC.tracking_id)
   */
  public void unsetTrackingId () {
    if (this.Key == null) return;
    this.Key._TrackingIdSet = false;
  }
  /** See if the field is actively set: TrackingId (ABI_NRC_DUC.tracking_id)
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
       return fmtMgr.formatBigInteger(this.getTrackingId(), _locale);
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
       this.setTrackingId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdFromFormattedString");
   }

  /** set the fields value: TrackingIdServ (ABI_NRC_DUC.tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingIdServ (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingIdServ", "setTrackingIdServ");
    }
    if (value != null && !DataHelper.validLength (value, 3))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "TrackingIdServ", "setTrackingIdServ");
    }
    if (this.Key == null) this.Key = new AbiNrcDucObjectKeyData ();
    this.Key.TrackingIdServ = value;
    this.Key._TrackingIdServSet = true;
  }
  /** get the value of the field: TrackingIdServ (ABI_NRC_DUC.tracking_id_serv)
   * @return BigInteger the value
   */
  public BigInteger getTrackingIdServ () {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Change the field to not being actively set: TrackingIdServ (ABI_NRC_DUC.tracking_id_serv)
   */
  public void unsetTrackingIdServ () {
    if (this.Key == null) return;
    this.Key._TrackingIdServSet = false;
  }
  /** See if the field is actively set: TrackingIdServ (ABI_NRC_DUC.tracking_id_serv)
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
       return fmtMgr.formatBigInteger(this.getTrackingIdServ(), _locale);
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
       this.setTrackingIdServ(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdServFromFormattedString");
   }

  /** set the fields value: ParentChargeType (ABI_NRC_DUC.parent_charge_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setParentChargeType (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ParentChargeType", "setParentChargeType");
    }
    if (value != null && !DataHelper.validLength (value, 3))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ParentChargeType", "setParentChargeType");
    }
    if (this.Key == null) this.Key = new AbiNrcDucObjectKeyData ();
    this.Key.ParentChargeType = value;
    this.Key._ParentChargeTypeSet = true;
  }
  /** get the value of the field: ParentChargeType (ABI_NRC_DUC.parent_charge_type)
   * @return BigInteger the value
   */
  public BigInteger getParentChargeType () {
    if (this.Key == null) return null;
    return this.Key.ParentChargeType;
  }
  /** Change the field to not being actively set: ParentChargeType (ABI_NRC_DUC.parent_charge_type)
   */
  public void unsetParentChargeType () {
    if (this.Key == null) return;
    this.Key._ParentChargeTypeSet = false;
  }
  /** See if the field is actively set: ParentChargeType (ABI_NRC_DUC.parent_charge_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetParentChargeType () {
    if (this.Key == null) return false;
    return this.Key._ParentChargeTypeSet;
  }

  /** Retrieves the ParentChargeType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ParentChargeType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentChargeType field
   */
   public String getParentChargeTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentChargeTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentChargeTypeAsFormattedString");
       return fmtMgr.formatBigInteger(this.getParentChargeType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentChargeType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentChargeTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ParentChargeType field from a formatted string
   *
   * @param _value the ParentChargeType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ParentChargeType field
   */
   public void setParentChargeTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentChargeTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setParentChargeType(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentChargeType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentChargeTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentChargeTypeFromFormattedString");
   }

  /** set the fields value: DucId (ABI_NRC_DUC.duc_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DucId") 
  public void setDucId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DucId", "setDucId");
    }
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DucId", "setDucId");
    }
    this.DucId = value;
    this._DucIdSet = true;
  }

  /** Retrieves the DucId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DucId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DucId field
   */
   public String getDucIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDucIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDucIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getDucId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DucId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDucIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the DucId field from a formatted string
   *
   * @param _value the DucId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DucId field
   */
   public void setDucIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDucIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDucId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DucId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDucIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDucIdFromFormattedString");
   }

  /** get the value of the field: DucId (ABI_NRC_DUC.duc_id)
   * @return BigInteger the value
   */
  public BigInteger getDucId () {
    return this.DucId;
  }
  /** Change the field to not being actively set: DucId (ABI_NRC_DUC.duc_id)
   */
  public void unsetDucId () {
    this._DucIdSet = false;
  }
  /** See if the field is actively set: DucId (ABI_NRC_DUC.duc_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetDucId () {
    return this._DucIdSet;
  }
  /** set the fields value: DucType (ABI_NRC_DUC.duc_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DucType") 
  public void setDucType (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DucType", "setDucType");
    }
    if (value != null && !DataHelper.validLength (value, 3))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DucType", "setDucType");
    }
    this.DucType = value;
    this._DucTypeSet = true;
  }

  /** Retrieves the DucType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DucType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DucType field
   */
   public String getDucTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDucTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDucTypeAsFormattedString");
       return fmtMgr.formatBigInteger(this.getDucType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DucType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDucTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the DucType field from a formatted string
   *
   * @param _value the DucType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DucType field
   */
   public void setDucTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDucTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDucType(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DucType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDucTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDucTypeFromFormattedString");
   }

  /** get the value of the field: DucType (ABI_NRC_DUC.duc_type)
   * @return BigInteger the value
   */
  public BigInteger getDucType () {
    return this.DucType;
  }
  /** Change the field to not being actively set: DucType (ABI_NRC_DUC.duc_type)
   */
  public void unsetDucType () {
    this._DucTypeSet = false;
  }
  /** See if the field is actively set: DucType (ABI_NRC_DUC.duc_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetDucType () {
    return this._DucTypeSet;
  }
  /** set the fields value: DucSubtype (ABI_NRC_DUC.duc_subtype)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DucSubtype") 
  public void setDucSubtype (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DucSubtype", "setDucSubtype");
    }
    if (value != null && !DataHelper.validLength (value, 3))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DucSubtype", "setDucSubtype");
    }
    this.DucSubtype = value;
    this._DucSubtypeSet = true;
  }

  /** Retrieves the DucSubtype field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DucSubtype field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DucSubtype field
   */
   public String getDucSubtypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDucSubtypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDucSubtypeAsFormattedString");
       return fmtMgr.formatBigInteger(this.getDucSubtype(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DucSubtype");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDucSubtypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the DucSubtype field from a formatted string
   *
   * @param _value the DucSubtype field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DucSubtype field
   */
   public void setDucSubtypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDucSubtypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDucSubtype(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DucSubtype");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDucSubtypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDucSubtypeFromFormattedString");
   }

  /** get the value of the field: DucSubtype (ABI_NRC_DUC.duc_subtype)
   * @return BigInteger the value
   */
  public BigInteger getDucSubtype () {
    return this.DucSubtype;
  }
  /** Change the field to not being actively set: DucSubtype (ABI_NRC_DUC.duc_subtype)
   */
  public void unsetDucSubtype () {
    this._DucSubtypeSet = false;
  }
  /** See if the field is actively set: DucSubtype (ABI_NRC_DUC.duc_subtype)
   * @return boolean whether the field is actively set
   */
  public boolean issetDucSubtype () {
    return this._DucSubtypeSet;
  }
  /** set the fields value: MoneyValue (ABI_NRC_DUC.money_value)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MoneyValue") 
  public void setMoneyValue (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MoneyValue", "setMoneyValue");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "MoneyValue", "setMoneyValue");
    }
    this.MoneyValue = value;
    this._MoneyValueSet = true;
  }

  /** Retrieves the MoneyValue field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MoneyValue field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MoneyValue field
   */
   public String getMoneyValueAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMoneyValueAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMoneyValueAsFormattedString");
       return fmtMgr.formatBigInteger(this.getMoneyValue(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MoneyValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMoneyValueAsFormattedString");
       throw x;
     }
   }
  /** Sets the MoneyValue field from a formatted string
   *
   * @param _value the MoneyValue field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MoneyValue field
   */
   public void setMoneyValueFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMoneyValueFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMoneyValue(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MoneyValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMoneyValueFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMoneyValueFromFormattedString");
   }

  /** get the value of the field: MoneyValue (ABI_NRC_DUC.money_value)
   * @return BigInteger the value
   */
  public BigInteger getMoneyValue () {
    return this.MoneyValue;
  }
  /** Change the field to not being actively set: MoneyValue (ABI_NRC_DUC.money_value)
   */
  public void unsetMoneyValue () {
    this._MoneyValueSet = false;
  }
  /** See if the field is actively set: MoneyValue (ABI_NRC_DUC.money_value)
   * @return boolean whether the field is actively set
   */
  public boolean issetMoneyValue () {
    return this._MoneyValueSet;
  }
  /** set the fields value: CurrencyCode (ABI_NRC_DUC.currency_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CurrencyCode") 
  public void setCurrencyCode (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CurrencyCode", "setCurrencyCode");
    }
    if (value != null && !DataHelper.validLength (value, 6))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CurrencyCode", "setCurrencyCode");
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
       return fmtMgr.formatBigInteger(this.getCurrencyCode(), _locale);
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
       this.setCurrencyCode(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyCodeFromFormattedString");
   }

  /** get the value of the field: CurrencyCode (ABI_NRC_DUC.currency_code)
   * @return BigInteger the value
   */
  public BigInteger getCurrencyCode () {
    return this.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (ABI_NRC_DUC.currency_code)
   */
  public void unsetCurrencyCode () {
    this._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (ABI_NRC_DUC.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode () {
    return this._CurrencyCodeSet;
  }
  /** set the fields value: Annotation (ABI_NRC_DUC.annotation)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Annotation") 
  public void setAnnotation (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 255))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Annotation", "setAnnotation");
    }
    this.Annotation = value;
    this._AnnotationSet = true;
  }

  /** Retrieves the Annotation field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Annotation field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Annotation field
   */
   public String getAnnotationAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAnnotationAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAnnotationAsFormattedString");
       return fmtMgr.formatString(this.getAnnotation());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Annotation");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAnnotationAsFormattedString");
       throw x;
     }
   }
  /** Sets the Annotation field from a formatted string
   *
   * @param _value the Annotation field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Annotation field
   */
   public void setAnnotationFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAnnotationFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAnnotation(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Annotation");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAnnotationFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAnnotationFromFormattedString");
   }

  /** get the value of the field: Annotation (ABI_NRC_DUC.annotation)
   * @return String the value
   */
  public String getAnnotation () {
    return this.Annotation;
  }
  /** Change the field to not being actively set: Annotation (ABI_NRC_DUC.annotation)
   */
  public void unsetAnnotation () {
    this._AnnotationSet = false;
  }
  /** See if the field is actively set: Annotation (ABI_NRC_DUC.annotation)
   * @return boolean whether the field is actively set
   */
  public boolean issetAnnotation () {
    return this._AnnotationSet;
  }
  public String toString() {
    return AbiNrcDucObjectHelper.toMap(this, null).toString();
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
  /** ABI_NRC_DUC.duc_id field */
    if(!nonNullOnly || (DucId != null))  _DucIdSet = flag;
  /** ABI_NRC_DUC.duc_type field */
    if(!nonNullOnly || (DucType != null))  _DucTypeSet = flag;
  /** ABI_NRC_DUC.duc_subtype field */
    if(!nonNullOnly || (DucSubtype != null))  _DucSubtypeSet = flag;
  /** ABI_NRC_DUC.money_value field */
    if(!nonNullOnly || (MoneyValue != null))  _MoneyValueSet = flag;
  /** ABI_NRC_DUC.currency_code field */
    if(!nonNullOnly || (CurrencyCode != null))  _CurrencyCodeSet = flag;
  /** ABI_NRC_DUC.annotation field */
    if(!nonNullOnly || (Annotation != null))  _AnnotationSet = flag;
  }
}
