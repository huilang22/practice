/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PrepaymentDistributionObjectData.java
 * Definition File: Customer/PrepaymentDistribution.xml
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
  
/** PrepaymentDistributionObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class PrepaymentDistributionObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public PrepaymentDistributionObjectKeyData Key = null;
  /** PREPAYMENT_DISTRIBUTION.bmf_tracking_id field */
  public    Integer BmfTrackingId  = null;
  protected boolean _BmfTrackingIdSet = false;
  /** PREPAYMENT_DISTRIBUTION.bmf_tracking_id_serv field */
  public    Integer BmfTrackingIdServ  = null;
  protected boolean _BmfTrackingIdServSet = false;
  /** PREPAYMENT_DISTRIBUTION.orig_bmf_tracking_id field */
  public    Integer OrigBmfTrackingId  = null;
  protected boolean _OrigBmfTrackingIdSet = false;
  /** PREPAYMENT_DISTRIBUTION.orig_bmf_tracking_id_serv field */
  public    Integer OrigBmfTrackingIdServ  = null;
  protected boolean _OrigBmfTrackingIdServSet = false;
  /** PREPAYMENT_DISTRIBUTION.amount field */
  public    BigInteger Amount  = null;
  protected boolean _AmountSet = false;
  /** PREPAYMENT_DISTRIBUTION.status field */
  public    Integer Status  = null;
  protected boolean _StatusSet = false;
  /** PREPAYMENT_DISTRIBUTION.trans_date field */
  public    Date TransDate  = null;
  protected boolean _TransDateSet = false;
  /** PREPAYMENT_DISTRIBUTION.chg_date field */
  public    Date ChgDate  = null;
  protected boolean _ChgDateSet = false;
  /** PREPAYMENT_DISTRIBUTION.chg_who field */
  public    String ChgWho  = null;
  protected boolean _ChgWhoSet = false;
  /** PREPAYMENT_DISTRIBUTION.is_tax field */
  public    Boolean IsTax  = null;
  protected boolean _IsTaxSet = false;
  private String _objName = "PrepaymentDistributionObjectData";
  /** Default constructor */
  public PrepaymentDistributionObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public PrepaymentDistributionObjectData (PrepaymentDistributionObjectData other)
  {

    if (other == null) return;
    this.Key = new PrepaymentDistributionObjectKeyData (other.Key);
    this.BmfTrackingId = other.BmfTrackingId;
    this._BmfTrackingIdSet = other._BmfTrackingIdSet;
    this.BmfTrackingIdServ = other.BmfTrackingIdServ;
    this._BmfTrackingIdServSet = other._BmfTrackingIdServSet;
    this.OrigBmfTrackingId = other.OrigBmfTrackingId;
    this._OrigBmfTrackingIdSet = other._OrigBmfTrackingIdSet;
    this.OrigBmfTrackingIdServ = other.OrigBmfTrackingIdServ;
    this._OrigBmfTrackingIdServSet = other._OrigBmfTrackingIdServSet;
    this.Amount = other.Amount;
    this._AmountSet = other._AmountSet;
    this.Status = other.Status;
    this._StatusSet = other._StatusSet;
    this.TransDate = other.TransDate;
    this._TransDateSet = other._TransDateSet;
    this.ChgDate = other.ChgDate;
    this._ChgDateSet = other._ChgDateSet;
    this.ChgWho = other.ChgWho;
    this._ChgWhoSet = other._ChgWhoSet;
    this.IsTax = other.IsTax;
    this._IsTaxSet = other._IsTaxSet;
  }

  /** get the Key for this object
   * @return PrepaymentDistributionObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public PrepaymentDistributionObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (PrepaymentDistributionObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: PrepaymentTrackingId (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPrepaymentTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PrepaymentTrackingId", "setPrepaymentTrackingId");
    }
    if (this.Key == null) this.Key = new PrepaymentDistributionObjectKeyData ();
    this.Key.PrepaymentTrackingId = value;
    this.Key._PrepaymentTrackingIdSet = true;
  }
  /** get the value of the field: PrepaymentTrackingId (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id)
   * @return Integer the value
   */
  public Integer getPrepaymentTrackingId () {
    if (this.Key == null) return null;
    return this.Key.PrepaymentTrackingId;
  }
  /** Change the field to not being actively set: PrepaymentTrackingId (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id)
   */
  public void unsetPrepaymentTrackingId () {
    if (this.Key == null) return;
    this.Key._PrepaymentTrackingIdSet = false;
  }
  /** See if the field is actively set: PrepaymentTrackingId (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrepaymentTrackingId () {
    if (this.Key == null) return false;
    return this.Key._PrepaymentTrackingIdSet;
  }

  /** Retrieves the PrepaymentTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrepaymentTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepaymentTrackingId field
   */
   public String getPrepaymentTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepaymentTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepaymentTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getPrepaymentTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepaymentTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepaymentTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrepaymentTrackingId field from a formatted string
   *
   * @param _value the PrepaymentTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrepaymentTrackingId field
   */
   public void setPrepaymentTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepaymentTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrepaymentTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepaymentTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepaymentTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepaymentTrackingIdFromFormattedString");
   }

  /** set the fields value: PrepaymentTrackingIdServ (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPrepaymentTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PrepaymentTrackingIdServ", "setPrepaymentTrackingIdServ");
    }
    if (this.Key == null) this.Key = new PrepaymentDistributionObjectKeyData ();
    this.Key.PrepaymentTrackingIdServ = value;
    this.Key._PrepaymentTrackingIdServSet = true;
  }
  /** get the value of the field: PrepaymentTrackingIdServ (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getPrepaymentTrackingIdServ () {
    if (this.Key == null) return null;
    return this.Key.PrepaymentTrackingIdServ;
  }
  /** Change the field to not being actively set: PrepaymentTrackingIdServ (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id_serv)
   */
  public void unsetPrepaymentTrackingIdServ () {
    if (this.Key == null) return;
    this.Key._PrepaymentTrackingIdServSet = false;
  }
  /** See if the field is actively set: PrepaymentTrackingIdServ (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrepaymentTrackingIdServ () {
    if (this.Key == null) return false;
    return this.Key._PrepaymentTrackingIdServSet;
  }

  /** Retrieves the PrepaymentTrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrepaymentTrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepaymentTrackingIdServ field
   */
   public String getPrepaymentTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepaymentTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepaymentTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getPrepaymentTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepaymentTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepaymentTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrepaymentTrackingIdServ field from a formatted string
   *
   * @param _value the PrepaymentTrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrepaymentTrackingIdServ field
   */
   public void setPrepaymentTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepaymentTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrepaymentTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepaymentTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepaymentTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepaymentTrackingIdServFromFormattedString");
   }

  /** set the fields value: DistribOrder (PREPAYMENT_DISTRIBUTION.distrib_order)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setDistribOrder (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DistribOrder", "setDistribOrder");
    }
    if (this.Key == null) this.Key = new PrepaymentDistributionObjectKeyData ();
    this.Key.DistribOrder = value;
    this.Key._DistribOrderSet = true;
  }
  /** get the value of the field: DistribOrder (PREPAYMENT_DISTRIBUTION.distrib_order)
   * @return Integer the value
   */
  public Integer getDistribOrder () {
    if (this.Key == null) return null;
    return this.Key.DistribOrder;
  }
  /** Change the field to not being actively set: DistribOrder (PREPAYMENT_DISTRIBUTION.distrib_order)
   */
  public void unsetDistribOrder () {
    if (this.Key == null) return;
    this.Key._DistribOrderSet = false;
  }
  /** See if the field is actively set: DistribOrder (PREPAYMENT_DISTRIBUTION.distrib_order)
   * @return boolean whether the field is actively set
   */
  public boolean issetDistribOrder () {
    if (this.Key == null) return false;
    return this.Key._DistribOrderSet;
  }

  /** Retrieves the DistribOrder field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DistribOrder field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DistribOrder field
   */
   public String getDistribOrderAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDistribOrderAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDistribOrderAsFormattedString");
       return fmtMgr.formatNumber(this.getDistribOrder(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DistribOrder");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDistribOrderAsFormattedString");
       throw x;
     }
   }
  /** Sets the DistribOrder field from a formatted string
   *
   * @param _value the DistribOrder field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DistribOrder field
   */
   public void setDistribOrderFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDistribOrderFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDistribOrder(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DistribOrder");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDistribOrderFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDistribOrderFromFormattedString");
   }

  /** set the fields value: BmfTrackingId (PREPAYMENT_DISTRIBUTION.bmf_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BmfTrackingId") 
  public void setBmfTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BmfTrackingId", "setBmfTrackingId");
    }
    this.BmfTrackingId = value;
    this._BmfTrackingIdSet = true;
  }

  /** Retrieves the BmfTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BmfTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfTrackingId field
   */
   public String getBmfTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getBmfTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the BmfTrackingId field from a formatted string
   *
   * @param _value the BmfTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BmfTrackingId field
   */
   public void setBmfTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBmfTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfTrackingIdFromFormattedString");
   }

  /** get the value of the field: BmfTrackingId (PREPAYMENT_DISTRIBUTION.bmf_tracking_id)
   * @return Integer the value
   */
  public Integer getBmfTrackingId () {
    return this.BmfTrackingId;
  }
  /** Change the field to not being actively set: BmfTrackingId (PREPAYMENT_DISTRIBUTION.bmf_tracking_id)
   */
  public void unsetBmfTrackingId () {
    this._BmfTrackingIdSet = false;
  }
  /** See if the field is actively set: BmfTrackingId (PREPAYMENT_DISTRIBUTION.bmf_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetBmfTrackingId () {
    return this._BmfTrackingIdSet;
  }
  /** set the fields value: BmfTrackingIdServ (PREPAYMENT_DISTRIBUTION.bmf_tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BmfTrackingIdServ") 
  public void setBmfTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BmfTrackingIdServ", "setBmfTrackingIdServ");
    }
    this.BmfTrackingIdServ = value;
    this._BmfTrackingIdServSet = true;
  }

  /** Retrieves the BmfTrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BmfTrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfTrackingIdServ field
   */
   public String getBmfTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getBmfTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the BmfTrackingIdServ field from a formatted string
   *
   * @param _value the BmfTrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BmfTrackingIdServ field
   */
   public void setBmfTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBmfTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfTrackingIdServFromFormattedString");
   }

  /** get the value of the field: BmfTrackingIdServ (PREPAYMENT_DISTRIBUTION.bmf_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getBmfTrackingIdServ () {
    return this.BmfTrackingIdServ;
  }
  /** Change the field to not being actively set: BmfTrackingIdServ (PREPAYMENT_DISTRIBUTION.bmf_tracking_id_serv)
   */
  public void unsetBmfTrackingIdServ () {
    this._BmfTrackingIdServSet = false;
  }
  /** See if the field is actively set: BmfTrackingIdServ (PREPAYMENT_DISTRIBUTION.bmf_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetBmfTrackingIdServ () {
    return this._BmfTrackingIdServSet;
  }
  /** set the fields value: OrigBmfTrackingId (PREPAYMENT_DISTRIBUTION.orig_bmf_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigBmfTrackingId") 
  public void setOrigBmfTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OrigBmfTrackingId", "setOrigBmfTrackingId");
    }
    this.OrigBmfTrackingId = value;
    this._OrigBmfTrackingIdSet = true;
  }

  /** Retrieves the OrigBmfTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigBmfTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigBmfTrackingId field
   */
   public String getOrigBmfTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBmfTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigBmfTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getOrigBmfTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigBmfTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigBmfTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigBmfTrackingId field from a formatted string
   *
   * @param _value the OrigBmfTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigBmfTrackingId field
   */
   public void setOrigBmfTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBmfTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigBmfTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigBmfTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigBmfTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigBmfTrackingIdFromFormattedString");
   }

  /** get the value of the field: OrigBmfTrackingId (PREPAYMENT_DISTRIBUTION.orig_bmf_tracking_id)
   * @return Integer the value
   */
  public Integer getOrigBmfTrackingId () {
    return this.OrigBmfTrackingId;
  }
  /** Change the field to not being actively set: OrigBmfTrackingId (PREPAYMENT_DISTRIBUTION.orig_bmf_tracking_id)
   */
  public void unsetOrigBmfTrackingId () {
    this._OrigBmfTrackingIdSet = false;
  }
  /** See if the field is actively set: OrigBmfTrackingId (PREPAYMENT_DISTRIBUTION.orig_bmf_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigBmfTrackingId () {
    return this._OrigBmfTrackingIdSet;
  }
  /** set the fields value: OrigBmfTrackingIdServ (PREPAYMENT_DISTRIBUTION.orig_bmf_tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigBmfTrackingIdServ") 
  public void setOrigBmfTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OrigBmfTrackingIdServ", "setOrigBmfTrackingIdServ");
    }
    this.OrigBmfTrackingIdServ = value;
    this._OrigBmfTrackingIdServSet = true;
  }

  /** Retrieves the OrigBmfTrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigBmfTrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigBmfTrackingIdServ field
   */
   public String getOrigBmfTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBmfTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigBmfTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getOrigBmfTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigBmfTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigBmfTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigBmfTrackingIdServ field from a formatted string
   *
   * @param _value the OrigBmfTrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigBmfTrackingIdServ field
   */
   public void setOrigBmfTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBmfTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigBmfTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigBmfTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigBmfTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigBmfTrackingIdServFromFormattedString");
   }

  /** get the value of the field: OrigBmfTrackingIdServ (PREPAYMENT_DISTRIBUTION.orig_bmf_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getOrigBmfTrackingIdServ () {
    return this.OrigBmfTrackingIdServ;
  }
  /** Change the field to not being actively set: OrigBmfTrackingIdServ (PREPAYMENT_DISTRIBUTION.orig_bmf_tracking_id_serv)
   */
  public void unsetOrigBmfTrackingIdServ () {
    this._OrigBmfTrackingIdServSet = false;
  }
  /** See if the field is actively set: OrigBmfTrackingIdServ (PREPAYMENT_DISTRIBUTION.orig_bmf_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigBmfTrackingIdServ () {
    return this._OrigBmfTrackingIdServSet;
  }
  /** set the fields value: Amount (PREPAYMENT_DISTRIBUTION.amount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Amount") 
  public void setAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Amount", "setAmount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Amount", "setAmount");
    }
    this.Amount = value;
    this._AmountSet = true;
  }

  /** Retrieves the Amount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Amount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Amount field
   */
   public String getAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Amount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the Amount field from a formatted string
   *
   * @param _value the Amount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Amount field
   */
   public void setAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Amount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountFromFormattedString");
   }

  /**
   * Retrieves the Amount field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The Amount field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the Amount field
   */
  public String getAmountAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getAmount(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Amount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the Amount field value from a formatted currency string
   *
   * @param _value the Amount field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Amount field
   */
  public void setAmountFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAmountFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setAmount(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Amount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountFromFormattedCurrencyString");
  }

  /** get the value of the field: Amount (PREPAYMENT_DISTRIBUTION.amount)
   * @return BigInteger the value
   */
  public BigInteger getAmount () {
    return this.Amount;
  }
  /** Change the field to not being actively set: Amount (PREPAYMENT_DISTRIBUTION.amount)
   */
  public void unsetAmount () {
    this._AmountSet = false;
  }
  /** See if the field is actively set: Amount (PREPAYMENT_DISTRIBUTION.amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetAmount () {
    return this._AmountSet;
  }
  /** set the fields value: Status (PREPAYMENT_DISTRIBUTION.status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Status") 
  public void setStatus (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Status", "setStatus");
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
       return fmtMgr.formatNumber(this.getStatus(), _locale);
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
       this.setStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Status");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusFromFormattedString");
   }

  /** get the value of the field: Status (PREPAYMENT_DISTRIBUTION.status)
   * @return Integer the value
   */
  public Integer getStatus () {
    return this.Status;
  }
  /** Change the field to not being actively set: Status (PREPAYMENT_DISTRIBUTION.status)
   */
  public void unsetStatus () {
    this._StatusSet = false;
  }
  /** See if the field is actively set: Status (PREPAYMENT_DISTRIBUTION.status)
   * @return boolean whether the field is actively set
   */
  public boolean issetStatus () {
    return this._StatusSet;
  }
  /** set the fields value: TransDate (PREPAYMENT_DISTRIBUTION.trans_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TransDate") 
  public void setTransDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TransDate", "setTransDate");
    }
    this.TransDate = value;
    this._TransDateSet = true;
  }

  /** Retrieves the TransDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TransDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransDate field
   */
   public String getTransDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransDateAsFormattedString");
       return fmtMgr.formatDate(this.getTransDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the TransDate field from a formatted string
   *
   * @param _value the TransDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransDate field
   */
   public void setTransDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTransDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransDateFromFormattedString");
   }

  /**
   * Retrieves the TransDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransDate field
   */
  public String getTransDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getTransDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the TransDate field value from a formatted date/time string
   *
   * @param _value the TransDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransDate field
   */
  public void setTransDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setTransDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: TransDate (PREPAYMENT_DISTRIBUTION.trans_date)
   * @return Date the value
   */
  public Date getTransDate () {
    return this.TransDate;
  }
  /** Change the field to not being actively set: TransDate (PREPAYMENT_DISTRIBUTION.trans_date)
   */
  public void unsetTransDate () {
    this._TransDateSet = false;
  }
  /** See if the field is actively set: TransDate (PREPAYMENT_DISTRIBUTION.trans_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransDate () {
    return this._TransDateSet;
  }
  /** set the fields value: ChgDate (PREPAYMENT_DISTRIBUTION.chg_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChgDate") 
  public void setChgDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChgDate", "setChgDate");
    }
    this.ChgDate = value;
    this._ChgDateSet = true;
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

  /** get the value of the field: ChgDate (PREPAYMENT_DISTRIBUTION.chg_date)
   * @return Date the value
   */
  public Date getChgDate () {
    return this.ChgDate;
  }
  /** Change the field to not being actively set: ChgDate (PREPAYMENT_DISTRIBUTION.chg_date)
   */
  public void unsetChgDate () {
    this._ChgDateSet = false;
  }
  /** See if the field is actively set: ChgDate (PREPAYMENT_DISTRIBUTION.chg_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgDate () {
    return this._ChgDateSet;
  }
  /** set the fields value: ChgWho (PREPAYMENT_DISTRIBUTION.chg_who)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChgWho") 
  public void setChgWho (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChgWho", "setChgWho");
    }
    if (value != null && !DataHelper.validLength (value, 30))
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

  /** get the value of the field: ChgWho (PREPAYMENT_DISTRIBUTION.chg_who)
   * @return String the value
   */
  public String getChgWho () {
    return this.ChgWho;
  }
  /** Change the field to not being actively set: ChgWho (PREPAYMENT_DISTRIBUTION.chg_who)
   */
  public void unsetChgWho () {
    this._ChgWhoSet = false;
  }
  /** See if the field is actively set: ChgWho (PREPAYMENT_DISTRIBUTION.chg_who)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgWho () {
    return this._ChgWhoSet;
  }
  /** set the fields value: IsTax (PREPAYMENT_DISTRIBUTION.is_tax)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsTax") 
  public void setIsTax (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsTax", "setIsTax");
    }
    this.IsTax = value;
    this._IsTaxSet = true;
  }

  /** Retrieves the IsTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsTax field
   */
   public String getIsTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsTaxAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsTax());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsTax field from a formatted string
   *
   * @param _value the IsTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsTax field
   */
   public void setIsTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsTax(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsTaxFromFormattedString");
   }

  /** get the value of the field: IsTax (PREPAYMENT_DISTRIBUTION.is_tax)
   * @return Boolean the value
   */
  public Boolean getIsTax () {
    return this.IsTax;
  }
  /** Change the field to not being actively set: IsTax (PREPAYMENT_DISTRIBUTION.is_tax)
   */
  public void unsetIsTax () {
    this._IsTaxSet = false;
  }
  /** See if the field is actively set: IsTax (PREPAYMENT_DISTRIBUTION.is_tax)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsTax () {
    return this._IsTaxSet;
  }
  public String toString() {
    return PrepaymentDistributionObjectHelper.toMap(this, null).toString();
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
  /** PREPAYMENT_DISTRIBUTION.bmf_tracking_id field */
    if(!nonNullOnly || (BmfTrackingId != null))  _BmfTrackingIdSet = flag;
  /** PREPAYMENT_DISTRIBUTION.bmf_tracking_id_serv field */
    if(!nonNullOnly || (BmfTrackingIdServ != null))  _BmfTrackingIdServSet = flag;
  /** PREPAYMENT_DISTRIBUTION.orig_bmf_tracking_id field */
    if(!nonNullOnly || (OrigBmfTrackingId != null))  _OrigBmfTrackingIdSet = flag;
  /** PREPAYMENT_DISTRIBUTION.orig_bmf_tracking_id_serv field */
    if(!nonNullOnly || (OrigBmfTrackingIdServ != null))  _OrigBmfTrackingIdServSet = flag;
  /** PREPAYMENT_DISTRIBUTION.amount field */
    if(!nonNullOnly || (Amount != null))  _AmountSet = flag;
  /** PREPAYMENT_DISTRIBUTION.status field */
    if(!nonNullOnly || (Status != null))  _StatusSet = flag;
  /** PREPAYMENT_DISTRIBUTION.trans_date field */
    if(!nonNullOnly || (TransDate != null))  _TransDateSet = flag;
  /** PREPAYMENT_DISTRIBUTION.chg_date field */
    if(!nonNullOnly || (ChgDate != null))  _ChgDateSet = flag;
  /** PREPAYMENT_DISTRIBUTION.chg_who field */
    if(!nonNullOnly || (ChgWho != null))  _ChgWhoSet = flag;
  /** PREPAYMENT_DISTRIBUTION.is_tax field */
    if(!nonNullOnly || (IsTax != null))  _IsTaxSet = flag;
  }
}
