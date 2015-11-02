/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HqGroupProductObjectData.java
 * Definition File: Catalog/HqGroupProduct.xml
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
  
/** HqGroupProductObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class HqGroupProductObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public HqGroupProductObjectKeyData Key = null;
  /** HQ_GROUP_PRODUCTS.prdct_parent_account_no field */
  public    Integer PrdctParentAccountNo  = null;
  protected boolean _PrdctParentAccountNoSet = false;
  /** HQ_GROUP_PRODUCTS.prdct_parent_subscr_no field */
  public    Integer PrdctParentSubscrNo  = null;
  protected boolean _PrdctParentSubscrNoSet = false;
  /** HQ_GROUP_PRODUCTS.prdct_parent_subscr_no_resets field */
  public    Integer PrdctParentSubscrNoResets  = null;
  protected boolean _PrdctParentSubscrNoResetsSet = false;
  /** HQ_GROUP_PRODUCTS.server_id field */
  public    Integer ServerId  = null;
  protected boolean _ServerIdSet = false;
  /** HQ_GROUP_PRODUCTS.start_dt field */
  public    Date StartDt  = null;
  protected boolean _StartDtSet = false;
  /** HQ_GROUP_PRODUCTS.end_dt field */
  public    Date EndDt  = null;
  protected boolean _EndDtSet = false;
  private String _objName = "HqGroupProductObjectData";
  /** Default constructor */
  public HqGroupProductObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public HqGroupProductObjectData (HqGroupProductObjectData other)
  {

    if (other == null) return;
    this.Key = new HqGroupProductObjectKeyData (other.Key);
    this.PrdctParentAccountNo = other.PrdctParentAccountNo;
    this._PrdctParentAccountNoSet = other._PrdctParentAccountNoSet;
    this.PrdctParentSubscrNo = other.PrdctParentSubscrNo;
    this._PrdctParentSubscrNoSet = other._PrdctParentSubscrNoSet;
    this.PrdctParentSubscrNoResets = other.PrdctParentSubscrNoResets;
    this._PrdctParentSubscrNoResetsSet = other._PrdctParentSubscrNoResetsSet;
    this.ServerId = other.ServerId;
    this._ServerIdSet = other._ServerIdSet;
    this.StartDt = other.StartDt;
    this._StartDtSet = other._StartDtSet;
    this.EndDt = other.EndDt;
    this._EndDtSet = other._EndDtSet;
  }

  /** get the Key for this object
   * @return HqGroupProductObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public HqGroupProductObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (HqGroupProductObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: GroupId (HQ_GROUP_PRODUCTS.group_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setGroupId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "GroupId", "setGroupId");
    }
    if (this.Key == null) this.Key = new HqGroupProductObjectKeyData ();
    this.Key.GroupId = value;
    this.Key._GroupIdSet = true;
  }
  /** get the value of the field: GroupId (HQ_GROUP_PRODUCTS.group_id)
   * @return Integer the value
   */
  public Integer getGroupId () {
    if (this.Key == null) return null;
    return this.Key.GroupId;
  }
  /** Change the field to not being actively set: GroupId (HQ_GROUP_PRODUCTS.group_id)
   */
  public void unsetGroupId () {
    if (this.Key == null) return;
    this.Key._GroupIdSet = false;
  }
  /** See if the field is actively set: GroupId (HQ_GROUP_PRODUCTS.group_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetGroupId () {
    if (this.Key == null) return false;
    return this.Key._GroupIdSet;
  }

  /** Retrieves the GroupId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The GroupId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GroupId field
   */
   public String getGroupIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupIdAsFormattedString");
       return fmtMgr.formatNumber(this.getGroupId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GroupId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getGroupIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the GroupId field from a formatted string
   *
   * @param _value the GroupId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the GroupId field
   */
   public void setGroupIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setGroupId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GroupId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setGroupIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGroupIdFromFormattedString");
   }

  /** set the fields value: GroupIdServ (HQ_GROUP_PRODUCTS.group_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setGroupIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "GroupIdServ", "setGroupIdServ");
    }
    if (this.Key == null) this.Key = new HqGroupProductObjectKeyData ();
    this.Key.GroupIdServ = value;
    this.Key._GroupIdServSet = true;
  }
  /** get the value of the field: GroupIdServ (HQ_GROUP_PRODUCTS.group_id_serv)
   * @return Integer the value
   */
  public Integer getGroupIdServ () {
    if (this.Key == null) return null;
    return this.Key.GroupIdServ;
  }
  /** Change the field to not being actively set: GroupIdServ (HQ_GROUP_PRODUCTS.group_id_serv)
   */
  public void unsetGroupIdServ () {
    if (this.Key == null) return;
    this.Key._GroupIdServSet = false;
  }
  /** See if the field is actively set: GroupIdServ (HQ_GROUP_PRODUCTS.group_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetGroupIdServ () {
    if (this.Key == null) return false;
    return this.Key._GroupIdServSet;
  }

  /** Retrieves the GroupIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The GroupIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GroupIdServ field
   */
   public String getGroupIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getGroupIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GroupIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getGroupIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the GroupIdServ field from a formatted string
   *
   * @param _value the GroupIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the GroupIdServ field
   */
   public void setGroupIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setGroupIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GroupIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setGroupIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGroupIdServFromFormattedString");
   }

  /** set the fields value: TrackingId (HQ_GROUP_PRODUCTS.tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingId", "setTrackingId");
    }
    if (this.Key == null) this.Key = new HqGroupProductObjectKeyData ();
    this.Key.TrackingId = value;
    this.Key._TrackingIdSet = true;
  }
  /** get the value of the field: TrackingId (HQ_GROUP_PRODUCTS.tracking_id)
   * @return Integer the value
   */
  public Integer getTrackingId () {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Change the field to not being actively set: TrackingId (HQ_GROUP_PRODUCTS.tracking_id)
   */
  public void unsetTrackingId () {
    if (this.Key == null) return;
    this.Key._TrackingIdSet = false;
  }
  /** See if the field is actively set: TrackingId (HQ_GROUP_PRODUCTS.tracking_id)
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

  /** set the fields value: TrackingIdServ (HQ_GROUP_PRODUCTS.tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingIdServ", "setTrackingIdServ");
    }
    if (this.Key == null) this.Key = new HqGroupProductObjectKeyData ();
    this.Key.TrackingIdServ = value;
    this.Key._TrackingIdServSet = true;
  }
  /** get the value of the field: TrackingIdServ (HQ_GROUP_PRODUCTS.tracking_id_serv)
   * @return Integer the value
   */
  public Integer getTrackingIdServ () {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Change the field to not being actively set: TrackingIdServ (HQ_GROUP_PRODUCTS.tracking_id_serv)
   */
  public void unsetTrackingIdServ () {
    if (this.Key == null) return;
    this.Key._TrackingIdServSet = false;
  }
  /** See if the field is actively set: TrackingIdServ (HQ_GROUP_PRODUCTS.tracking_id_serv)
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

  /** set the fields value: PrdctParentAccountNo (HQ_GROUP_PRODUCTS.prdct_parent_account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrdctParentAccountNo") 
  public void setPrdctParentAccountNo (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PrdctParentAccountNo", "setPrdctParentAccountNo");
    }
    this.PrdctParentAccountNo = value;
    this._PrdctParentAccountNoSet = true;
  }

  /** Retrieves the PrdctParentAccountNo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrdctParentAccountNo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrdctParentAccountNo field
   */
   public String getPrdctParentAccountNoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrdctParentAccountNoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrdctParentAccountNoAsFormattedString");
       return fmtMgr.formatNumber(this.getPrdctParentAccountNo(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrdctParentAccountNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrdctParentAccountNoAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrdctParentAccountNo field from a formatted string
   *
   * @param _value the PrdctParentAccountNo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrdctParentAccountNo field
   */
   public void setPrdctParentAccountNoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrdctParentAccountNoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrdctParentAccountNo(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrdctParentAccountNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrdctParentAccountNoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrdctParentAccountNoFromFormattedString");
   }

  /** get the value of the field: PrdctParentAccountNo (HQ_GROUP_PRODUCTS.prdct_parent_account_no)
   * @return Integer the value
   */
  public Integer getPrdctParentAccountNo () {
    return this.PrdctParentAccountNo;
  }
  /** Change the field to not being actively set: PrdctParentAccountNo (HQ_GROUP_PRODUCTS.prdct_parent_account_no)
   */
  public void unsetPrdctParentAccountNo () {
    this._PrdctParentAccountNoSet = false;
  }
  /** See if the field is actively set: PrdctParentAccountNo (HQ_GROUP_PRODUCTS.prdct_parent_account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrdctParentAccountNo () {
    return this._PrdctParentAccountNoSet;
  }
  /** set the fields value: PrdctParentSubscrNo (HQ_GROUP_PRODUCTS.prdct_parent_subscr_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrdctParentSubscrNo") 
  public void setPrdctParentSubscrNo (Integer value) throws ServiceException
  {
    this.PrdctParentSubscrNo = value;
    this._PrdctParentSubscrNoSet = true;
  }

  /** Retrieves the PrdctParentSubscrNo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrdctParentSubscrNo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrdctParentSubscrNo field
   */
   public String getPrdctParentSubscrNoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrdctParentSubscrNoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrdctParentSubscrNoAsFormattedString");
       return fmtMgr.formatNumber(this.getPrdctParentSubscrNo(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrdctParentSubscrNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrdctParentSubscrNoAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrdctParentSubscrNo field from a formatted string
   *
   * @param _value the PrdctParentSubscrNo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrdctParentSubscrNo field
   */
   public void setPrdctParentSubscrNoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrdctParentSubscrNoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrdctParentSubscrNo(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrdctParentSubscrNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrdctParentSubscrNoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrdctParentSubscrNoFromFormattedString");
   }

  /** get the value of the field: PrdctParentSubscrNo (HQ_GROUP_PRODUCTS.prdct_parent_subscr_no)
   * @return Integer the value
   */
  public Integer getPrdctParentSubscrNo () {
    return this.PrdctParentSubscrNo;
  }
  /** Change the field to not being actively set: PrdctParentSubscrNo (HQ_GROUP_PRODUCTS.prdct_parent_subscr_no)
   */
  public void unsetPrdctParentSubscrNo () {
    this._PrdctParentSubscrNoSet = false;
  }
  /** See if the field is actively set: PrdctParentSubscrNo (HQ_GROUP_PRODUCTS.prdct_parent_subscr_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrdctParentSubscrNo () {
    return this._PrdctParentSubscrNoSet;
  }
  /** set the fields value: PrdctParentSubscrNoResets (HQ_GROUP_PRODUCTS.prdct_parent_subscr_no_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrdctParentSubscrNoResets") 
  public void setPrdctParentSubscrNoResets (Integer value) throws ServiceException
  {
    this.PrdctParentSubscrNoResets = value;
    this._PrdctParentSubscrNoResetsSet = true;
  }

  /** Retrieves the PrdctParentSubscrNoResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrdctParentSubscrNoResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrdctParentSubscrNoResets field
   */
   public String getPrdctParentSubscrNoResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrdctParentSubscrNoResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrdctParentSubscrNoResetsAsFormattedString");
       return fmtMgr.formatNumber(this.getPrdctParentSubscrNoResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrdctParentSubscrNoResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrdctParentSubscrNoResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrdctParentSubscrNoResets field from a formatted string
   *
   * @param _value the PrdctParentSubscrNoResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrdctParentSubscrNoResets field
   */
   public void setPrdctParentSubscrNoResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrdctParentSubscrNoResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrdctParentSubscrNoResets(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrdctParentSubscrNoResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrdctParentSubscrNoResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrdctParentSubscrNoResetsFromFormattedString");
   }

  /** get the value of the field: PrdctParentSubscrNoResets (HQ_GROUP_PRODUCTS.prdct_parent_subscr_no_resets)
   * @return Integer the value
   */
  public Integer getPrdctParentSubscrNoResets () {
    return this.PrdctParentSubscrNoResets;
  }
  /** Change the field to not being actively set: PrdctParentSubscrNoResets (HQ_GROUP_PRODUCTS.prdct_parent_subscr_no_resets)
   */
  public void unsetPrdctParentSubscrNoResets () {
    this._PrdctParentSubscrNoResetsSet = false;
  }
  /** See if the field is actively set: PrdctParentSubscrNoResets (HQ_GROUP_PRODUCTS.prdct_parent_subscr_no_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrdctParentSubscrNoResets () {
    return this._PrdctParentSubscrNoResetsSet;
  }
  /** set the fields value: ServerId (HQ_GROUP_PRODUCTS.server_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServerId") 
  public void setServerId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServerId", "setServerId");
    }
    this.ServerId = value;
    this._ServerIdSet = true;
  }

  /** Retrieves the ServerId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServerId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServerId field
   */
   public String getServerIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServerIdAsFormattedString");
       return fmtMgr.formatNumber(this.getServerId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServerId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServerIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServerId field from a formatted string
   *
   * @param _value the ServerId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServerId field
   */
   public void setServerIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServerId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServerId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServerIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServerIdFromFormattedString");
   }

  /** get the value of the field: ServerId (HQ_GROUP_PRODUCTS.server_id)
   * @return Integer the value
   */
  public Integer getServerId () {
    return this.ServerId;
  }
  /** Change the field to not being actively set: ServerId (HQ_GROUP_PRODUCTS.server_id)
   */
  public void unsetServerId () {
    this._ServerIdSet = false;
  }
  /** See if the field is actively set: ServerId (HQ_GROUP_PRODUCTS.server_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetServerId () {
    return this._ServerIdSet;
  }
  /** set the fields value: StartDt (HQ_GROUP_PRODUCTS.start_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StartDt") 
  public void setStartDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "StartDt", "setStartDt");
    }
    this.StartDt = value;
    this._StartDtSet = true;
  }

  /** Retrieves the StartDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StartDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StartDt field
   */
   public String getStartDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStartDtAsFormattedString");
       return fmtMgr.formatDate(this.getStartDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StartDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStartDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the StartDt field from a formatted string
   *
   * @param _value the StartDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StartDt field
   */
   public void setStartDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStartDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StartDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStartDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStartDtFromFormattedString");
   }

  /**
   * Retrieves the StartDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StartDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the StartDt field
   */
  public String getStartDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStartDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getStartDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStartDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the StartDt field value from a formatted date/time string
   *
   * @param _value the StartDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StartDt field
   */
  public void setStartDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStartDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setStartDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStartDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: StartDt (HQ_GROUP_PRODUCTS.start_dt)
   * @return Date the value
   */
  public Date getStartDt () {
    return this.StartDt;
  }
  /** Change the field to not being actively set: StartDt (HQ_GROUP_PRODUCTS.start_dt)
   */
  public void unsetStartDt () {
    this._StartDtSet = false;
  }
  /** See if the field is actively set: StartDt (HQ_GROUP_PRODUCTS.start_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetStartDt () {
    return this._StartDtSet;
  }
  /** set the fields value: EndDt (HQ_GROUP_PRODUCTS.end_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EndDt") 
  public void setEndDt (Date value) throws ServiceException
  {
    this.EndDt = value;
    this._EndDtSet = true;
  }

  /** Retrieves the EndDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EndDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EndDt field
   */
   public String getEndDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEndDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEndDtAsFormattedString");
       return fmtMgr.formatDate(this.getEndDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EndDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEndDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the EndDt field from a formatted string
   *
   * @param _value the EndDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EndDt field
   */
   public void setEndDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEndDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEndDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EndDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEndDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEndDtFromFormattedString");
   }

  /**
   * Retrieves the EndDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EndDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the EndDt field
   */
  public String getEndDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEndDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEndDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getEndDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EndDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEndDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the EndDt field value from a formatted date/time string
   *
   * @param _value the EndDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EndDt field
   */
  public void setEndDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEndDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setEndDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EndDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEndDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: EndDt (HQ_GROUP_PRODUCTS.end_dt)
   * @return Date the value
   */
  public Date getEndDt () {
    return this.EndDt;
  }
  /** Change the field to not being actively set: EndDt (HQ_GROUP_PRODUCTS.end_dt)
   */
  public void unsetEndDt () {
    this._EndDtSet = false;
  }
  /** See if the field is actively set: EndDt (HQ_GROUP_PRODUCTS.end_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetEndDt () {
    return this._EndDtSet;
  }
  public String toString() {
    return HqGroupProductObjectHelper.toMap(this, null).toString();
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
  /** HQ_GROUP_PRODUCTS.prdct_parent_account_no field */
    if(!nonNullOnly || (PrdctParentAccountNo != null))  _PrdctParentAccountNoSet = flag;
  /** HQ_GROUP_PRODUCTS.prdct_parent_subscr_no field */
    if(!nonNullOnly || (PrdctParentSubscrNo != null))  _PrdctParentSubscrNoSet = flag;
  /** HQ_GROUP_PRODUCTS.prdct_parent_subscr_no_resets field */
    if(!nonNullOnly || (PrdctParentSubscrNoResets != null))  _PrdctParentSubscrNoResetsSet = flag;
  /** HQ_GROUP_PRODUCTS.server_id field */
    if(!nonNullOnly || (ServerId != null))  _ServerIdSet = flag;
  /** HQ_GROUP_PRODUCTS.start_dt field */
    if(!nonNullOnly || (StartDt != null))  _StartDtSet = flag;
  /** HQ_GROUP_PRODUCTS.end_dt field */
    if(!nonNullOnly || (EndDt != null))  _EndDtSet = flag;
  }
}
