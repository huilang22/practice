/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ServerObjectData.java
 * Definition File: Catalog/Server.xml
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
  
/** ServerObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class ServerObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public ServerObjectKeyData Key = null;
  /** SERVER_DEFINITION.server_type field */
  public    Integer ServerType  = null;
  protected boolean _ServerTypeSet = false;
  /** SERVER_DEFINITION.hostname field */
  public    String Hostname  = null;
  protected boolean _HostnameSet = false;
  /** SERVER_DEFINITION.ip_address field */
  public    String IpAddress  = null;
  protected boolean _IpAddressSet = false;
  /** SERVER_DEFINITION.dsquery field */
  public    String Dsquery  = null;
  protected boolean _DsquerySet = false;
  /** SERVER_DEFINITION.ds_database field */
  public    String DsDatabase  = null;
  protected boolean _DsDatabaseSet = false;
  /** SERVER_DEFINITION.arbordata field */
  public    String Arbordata  = null;
  protected boolean _ArbordataSet = false;
  /** SERVER_DEFINITION.num_accts field */
  public    Integer NumAccts  = null;
  protected boolean _NumAcctsSet = false;
  /** SERVER_DEFINITION.server_capacity field */
  public    Integer ServerCapacity  = null;
  protected boolean _ServerCapacitySet = false;
  /** SERVER_DEFINITION.active_flag field */
  public    Boolean ActiveFlag  = null;
  protected boolean _ActiveFlagSet = false;
  /** SERVER_DEFINITION.up_since_dt field */
  public    Date UpSinceDt  = null;
  protected boolean _UpSinceDtSet = false;
  /** SERVER_DEFINITION.down_since_dt field */
  public    Date DownSinceDt  = null;
  protected boolean _DownSinceDtSet = false;
  /** SERVER_DEFINITION.down_set_by field */
  public    String DownSetBy  = null;
  protected boolean _DownSetBySet = false;
  /** SERVER_DEFINITION.down_reason_code field */
  public    Integer DownReasonCode  = null;
  protected boolean _DownReasonCodeSet = false;
  /** SERVER_DEFINITION.server_category field */
  public    Integer ServerCategory  = null;
  protected boolean _ServerCategorySet = false;
  private String _objName = "ServerObjectData";
  /** Default constructor */
  public ServerObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public ServerObjectData (ServerObjectData other)
  {

    if (other == null) return;
    this.Key = new ServerObjectKeyData (other.Key);
    this.ServerType = other.ServerType;
    this._ServerTypeSet = other._ServerTypeSet;
    this.Hostname = other.Hostname;
    this._HostnameSet = other._HostnameSet;
    this.IpAddress = other.IpAddress;
    this._IpAddressSet = other._IpAddressSet;
    this.Dsquery = other.Dsquery;
    this._DsquerySet = other._DsquerySet;
    this.DsDatabase = other.DsDatabase;
    this._DsDatabaseSet = other._DsDatabaseSet;
    this.Arbordata = other.Arbordata;
    this._ArbordataSet = other._ArbordataSet;
    this.NumAccts = other.NumAccts;
    this._NumAcctsSet = other._NumAcctsSet;
    this.ServerCapacity = other.ServerCapacity;
    this._ServerCapacitySet = other._ServerCapacitySet;
    this.ActiveFlag = other.ActiveFlag;
    this._ActiveFlagSet = other._ActiveFlagSet;
    this.UpSinceDt = other.UpSinceDt;
    this._UpSinceDtSet = other._UpSinceDtSet;
    this.DownSinceDt = other.DownSinceDt;
    this._DownSinceDtSet = other._DownSinceDtSet;
    this.DownSetBy = other.DownSetBy;
    this._DownSetBySet = other._DownSetBySet;
    this.DownReasonCode = other.DownReasonCode;
    this._DownReasonCodeSet = other._DownReasonCodeSet;
    this.ServerCategory = other.ServerCategory;
    this._ServerCategorySet = other._ServerCategorySet;
  }

  /** get the Key for this object
   * @return ServerObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public ServerObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (ServerObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: ServerId (SERVER_DEFINITION.server_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setServerId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServerId", "setServerId");
    }
    if (this.Key == null) this.Key = new ServerObjectKeyData ();
    this.Key.ServerId = value;
    this.Key._ServerIdSet = true;
  }
  /** get the value of the field: ServerId (SERVER_DEFINITION.server_id)
   * @return Integer the value
   */
  public Integer getServerId () {
    if (this.Key == null) return null;
    return this.Key.ServerId;
  }
  /** Change the field to not being actively set: ServerId (SERVER_DEFINITION.server_id)
   */
  public void unsetServerId () {
    if (this.Key == null) return;
    this.Key._ServerIdSet = false;
  }
  /** See if the field is actively set: ServerId (SERVER_DEFINITION.server_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetServerId () {
    if (this.Key == null) return false;
    return this.Key._ServerIdSet;
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

  /** set the fields value: ServerType (SERVER_DEFINITION.server_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServerType") 
  public void setServerType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServerType", "setServerType");
    }
    this.ServerType = value;
    this._ServerTypeSet = true;
  }

  /** Retrieves the ServerType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServerType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServerType field
   */
   public String getServerTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServerTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getServerType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServerType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServerTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServerType field from a formatted string
   *
   * @param _value the ServerType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServerType field
   */
   public void setServerTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServerType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServerType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServerTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServerTypeFromFormattedString");
   }

  /** get the value of the field: ServerType (SERVER_DEFINITION.server_type)
   * @return Integer the value
   */
  public Integer getServerType () {
    return this.ServerType;
  }
  /** Change the field to not being actively set: ServerType (SERVER_DEFINITION.server_type)
   */
  public void unsetServerType () {
    this._ServerTypeSet = false;
  }
  /** See if the field is actively set: ServerType (SERVER_DEFINITION.server_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetServerType () {
    return this._ServerTypeSet;
  }
  /** set the fields value: Hostname (SERVER_DEFINITION.hostname)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Hostname") 
  public void setHostname (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Hostname", "setHostname");
    }
    if (value != null && !DataHelper.validLength (value, 32))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Hostname", "setHostname");
    }
    this.Hostname = value;
    this._HostnameSet = true;
  }

  /** Retrieves the Hostname field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Hostname field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Hostname field
   */
   public String getHostnameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHostnameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHostnameAsFormattedString");
       return fmtMgr.formatString(this.getHostname());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Hostname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getHostnameAsFormattedString");
       throw x;
     }
   }
  /** Sets the Hostname field from a formatted string
   *
   * @param _value the Hostname field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Hostname field
   */
   public void setHostnameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHostnameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setHostname(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Hostname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setHostnameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setHostnameFromFormattedString");
   }

  /** get the value of the field: Hostname (SERVER_DEFINITION.hostname)
   * @return String the value
   */
  public String getHostname () {
    return this.Hostname;
  }
  /** Change the field to not being actively set: Hostname (SERVER_DEFINITION.hostname)
   */
  public void unsetHostname () {
    this._HostnameSet = false;
  }
  /** See if the field is actively set: Hostname (SERVER_DEFINITION.hostname)
   * @return boolean whether the field is actively set
   */
  public boolean issetHostname () {
    return this._HostnameSet;
  }
  /** set the fields value: IpAddress (SERVER_DEFINITION.ip_address)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IpAddress") 
  public void setIpAddress (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IpAddress", "setIpAddress");
    }
    if (value != null && !DataHelper.validLength (value, 15))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "IpAddress", "setIpAddress");
    }
    this.IpAddress = value;
    this._IpAddressSet = true;
  }

  /** Retrieves the IpAddress field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IpAddress field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IpAddress field
   */
   public String getIpAddressAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIpAddressAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIpAddressAsFormattedString");
       return fmtMgr.formatString(this.getIpAddress());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IpAddress");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIpAddressAsFormattedString");
       throw x;
     }
   }
  /** Sets the IpAddress field from a formatted string
   *
   * @param _value the IpAddress field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IpAddress field
   */
   public void setIpAddressFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIpAddressFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIpAddress(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IpAddress");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIpAddressFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIpAddressFromFormattedString");
   }

  /** get the value of the field: IpAddress (SERVER_DEFINITION.ip_address)
   * @return String the value
   */
  public String getIpAddress () {
    return this.IpAddress;
  }
  /** Change the field to not being actively set: IpAddress (SERVER_DEFINITION.ip_address)
   */
  public void unsetIpAddress () {
    this._IpAddressSet = false;
  }
  /** See if the field is actively set: IpAddress (SERVER_DEFINITION.ip_address)
   * @return boolean whether the field is actively set
   */
  public boolean issetIpAddress () {
    return this._IpAddressSet;
  }
  /** set the fields value: Dsquery (SERVER_DEFINITION.dsquery)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Dsquery") 
  public void setDsquery (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Dsquery", "setDsquery");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Dsquery", "setDsquery");
    }
    this.Dsquery = value;
    this._DsquerySet = true;
  }

  /** Retrieves the Dsquery field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Dsquery field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Dsquery field
   */
   public String getDsqueryAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDsqueryAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDsqueryAsFormattedString");
       return fmtMgr.formatString(this.getDsquery());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Dsquery");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDsqueryAsFormattedString");
       throw x;
     }
   }
  /** Sets the Dsquery field from a formatted string
   *
   * @param _value the Dsquery field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Dsquery field
   */
   public void setDsqueryFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDsqueryFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDsquery(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Dsquery");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDsqueryFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDsqueryFromFormattedString");
   }

  /** get the value of the field: Dsquery (SERVER_DEFINITION.dsquery)
   * @return String the value
   */
  public String getDsquery () {
    return this.Dsquery;
  }
  /** Change the field to not being actively set: Dsquery (SERVER_DEFINITION.dsquery)
   */
  public void unsetDsquery () {
    this._DsquerySet = false;
  }
  /** See if the field is actively set: Dsquery (SERVER_DEFINITION.dsquery)
   * @return boolean whether the field is actively set
   */
  public boolean issetDsquery () {
    return this._DsquerySet;
  }
  /** set the fields value: DsDatabase (SERVER_DEFINITION.ds_database)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DsDatabase") 
  public void setDsDatabase (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DsDatabase", "setDsDatabase");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DsDatabase", "setDsDatabase");
    }
    this.DsDatabase = value;
    this._DsDatabaseSet = true;
  }

  /** Retrieves the DsDatabase field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DsDatabase field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DsDatabase field
   */
   public String getDsDatabaseAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDsDatabaseAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDsDatabaseAsFormattedString");
       return fmtMgr.formatString(this.getDsDatabase());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DsDatabase");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDsDatabaseAsFormattedString");
       throw x;
     }
   }
  /** Sets the DsDatabase field from a formatted string
   *
   * @param _value the DsDatabase field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DsDatabase field
   */
   public void setDsDatabaseFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDsDatabaseFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDsDatabase(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DsDatabase");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDsDatabaseFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDsDatabaseFromFormattedString");
   }

  /** get the value of the field: DsDatabase (SERVER_DEFINITION.ds_database)
   * @return String the value
   */
  public String getDsDatabase () {
    return this.DsDatabase;
  }
  /** Change the field to not being actively set: DsDatabase (SERVER_DEFINITION.ds_database)
   */
  public void unsetDsDatabase () {
    this._DsDatabaseSet = false;
  }
  /** See if the field is actively set: DsDatabase (SERVER_DEFINITION.ds_database)
   * @return boolean whether the field is actively set
   */
  public boolean issetDsDatabase () {
    return this._DsDatabaseSet;
  }
  /** set the fields value: Arbordata (SERVER_DEFINITION.arbordata)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Arbordata") 
  public void setArbordata (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Arbordata", "setArbordata");
    }
    if (value != null && !DataHelper.validLength (value, 255))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Arbordata", "setArbordata");
    }
    this.Arbordata = value;
    this._ArbordataSet = true;
  }

  /** Retrieves the Arbordata field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Arbordata field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Arbordata field
   */
   public String getArbordataAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getArbordataAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getArbordataAsFormattedString");
       return fmtMgr.formatString(this.getArbordata());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Arbordata");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getArbordataAsFormattedString");
       throw x;
     }
   }
  /** Sets the Arbordata field from a formatted string
   *
   * @param _value the Arbordata field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Arbordata field
   */
   public void setArbordataFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getArbordataFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setArbordata(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Arbordata");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setArbordataFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setArbordataFromFormattedString");
   }

  /** get the value of the field: Arbordata (SERVER_DEFINITION.arbordata)
   * @return String the value
   */
  public String getArbordata () {
    return this.Arbordata;
  }
  /** Change the field to not being actively set: Arbordata (SERVER_DEFINITION.arbordata)
   */
  public void unsetArbordata () {
    this._ArbordataSet = false;
  }
  /** See if the field is actively set: Arbordata (SERVER_DEFINITION.arbordata)
   * @return boolean whether the field is actively set
   */
  public boolean issetArbordata () {
    return this._ArbordataSet;
  }
  /** set the fields value: NumAccts (SERVER_DEFINITION.num_accts)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NumAccts") 
  public void setNumAccts (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "NumAccts", "setNumAccts");
    }
    this.NumAccts = value;
    this._NumAcctsSet = true;
  }

  /** Retrieves the NumAccts field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NumAccts field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NumAccts field
   */
   public String getNumAcctsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNumAcctsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNumAcctsAsFormattedString");
       return fmtMgr.formatNumber(this.getNumAccts(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NumAccts");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNumAcctsAsFormattedString");
       throw x;
     }
   }
  /** Sets the NumAccts field from a formatted string
   *
   * @param _value the NumAccts field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NumAccts field
   */
   public void setNumAcctsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNumAcctsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNumAccts(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NumAccts");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNumAcctsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNumAcctsFromFormattedString");
   }

  /** get the value of the field: NumAccts (SERVER_DEFINITION.num_accts)
   * @return Integer the value
   */
  public Integer getNumAccts () {
    return this.NumAccts;
  }
  /** Change the field to not being actively set: NumAccts (SERVER_DEFINITION.num_accts)
   */
  public void unsetNumAccts () {
    this._NumAcctsSet = false;
  }
  /** See if the field is actively set: NumAccts (SERVER_DEFINITION.num_accts)
   * @return boolean whether the field is actively set
   */
  public boolean issetNumAccts () {
    return this._NumAcctsSet;
  }
  /** set the fields value: ServerCapacity (SERVER_DEFINITION.server_capacity)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServerCapacity") 
  public void setServerCapacity (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServerCapacity", "setServerCapacity");
    }
    this.ServerCapacity = value;
    this._ServerCapacitySet = true;
  }

  /** Retrieves the ServerCapacity field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServerCapacity field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServerCapacity field
   */
   public String getServerCapacityAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerCapacityAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServerCapacityAsFormattedString");
       return fmtMgr.formatNumber(this.getServerCapacity(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServerCapacity");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServerCapacityAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServerCapacity field from a formatted string
   *
   * @param _value the ServerCapacity field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServerCapacity field
   */
   public void setServerCapacityFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerCapacityFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServerCapacity(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServerCapacity");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServerCapacityFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServerCapacityFromFormattedString");
   }

  /** get the value of the field: ServerCapacity (SERVER_DEFINITION.server_capacity)
   * @return Integer the value
   */
  public Integer getServerCapacity () {
    return this.ServerCapacity;
  }
  /** Change the field to not being actively set: ServerCapacity (SERVER_DEFINITION.server_capacity)
   */
  public void unsetServerCapacity () {
    this._ServerCapacitySet = false;
  }
  /** See if the field is actively set: ServerCapacity (SERVER_DEFINITION.server_capacity)
   * @return boolean whether the field is actively set
   */
  public boolean issetServerCapacity () {
    return this._ServerCapacitySet;
  }
  /** set the fields value: ActiveFlag (SERVER_DEFINITION.active_flag)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ActiveFlag") 
  public void setActiveFlag (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ActiveFlag", "setActiveFlag");
    }
    this.ActiveFlag = value;
    this._ActiveFlagSet = true;
  }

  /** Retrieves the ActiveFlag field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ActiveFlag field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveFlag field
   */
   public String getActiveFlagAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveFlagAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveFlagAsFormattedString");
       return fmtMgr.formatBoolean(this.getActiveFlag());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActiveFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveFlagAsFormattedString");
       throw x;
     }
   }
  /** Sets the ActiveFlag field from a formatted string
   *
   * @param _value the ActiveFlag field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ActiveFlag field
   */
   public void setActiveFlagFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveFlagFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setActiveFlag(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActiveFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveFlagFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveFlagFromFormattedString");
   }

  /** get the value of the field: ActiveFlag (SERVER_DEFINITION.active_flag)
   * @return Boolean the value
   */
  public Boolean getActiveFlag () {
    return this.ActiveFlag;
  }
  /** Change the field to not being actively set: ActiveFlag (SERVER_DEFINITION.active_flag)
   */
  public void unsetActiveFlag () {
    this._ActiveFlagSet = false;
  }
  /** See if the field is actively set: ActiveFlag (SERVER_DEFINITION.active_flag)
   * @return boolean whether the field is actively set
   */
  public boolean issetActiveFlag () {
    return this._ActiveFlagSet;
  }
  /** set the fields value: UpSinceDt (SERVER_DEFINITION.up_since_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UpSinceDt") 
  public void setUpSinceDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UpSinceDt", "setUpSinceDt");
    }
    this.UpSinceDt = value;
    this._UpSinceDtSet = true;
  }

  /** Retrieves the UpSinceDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UpSinceDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UpSinceDt field
   */
   public String getUpSinceDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUpSinceDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUpSinceDtAsFormattedString");
       return fmtMgr.formatDate(this.getUpSinceDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UpSinceDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUpSinceDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the UpSinceDt field from a formatted string
   *
   * @param _value the UpSinceDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UpSinceDt field
   */
   public void setUpSinceDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUpSinceDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUpSinceDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UpSinceDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUpSinceDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUpSinceDtFromFormattedString");
   }

  /**
   * Retrieves the UpSinceDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UpSinceDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the UpSinceDt field
   */
  public String getUpSinceDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUpSinceDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUpSinceDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getUpSinceDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UpSinceDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUpSinceDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the UpSinceDt field value from a formatted date/time string
   *
   * @param _value the UpSinceDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UpSinceDt field
   */
  public void setUpSinceDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUpSinceDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setUpSinceDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UpSinceDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUpSinceDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: UpSinceDt (SERVER_DEFINITION.up_since_dt)
   * @return Date the value
   */
  public Date getUpSinceDt () {
    return this.UpSinceDt;
  }
  /** Change the field to not being actively set: UpSinceDt (SERVER_DEFINITION.up_since_dt)
   */
  public void unsetUpSinceDt () {
    this._UpSinceDtSet = false;
  }
  /** See if the field is actively set: UpSinceDt (SERVER_DEFINITION.up_since_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetUpSinceDt () {
    return this._UpSinceDtSet;
  }
  /** set the fields value: DownSinceDt (SERVER_DEFINITION.down_since_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DownSinceDt") 
  public void setDownSinceDt (Date value) throws ServiceException
  {
    this.DownSinceDt = value;
    this._DownSinceDtSet = true;
  }

  /** Retrieves the DownSinceDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DownSinceDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DownSinceDt field
   */
   public String getDownSinceDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDownSinceDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDownSinceDtAsFormattedString");
       return fmtMgr.formatDate(this.getDownSinceDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DownSinceDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDownSinceDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the DownSinceDt field from a formatted string
   *
   * @param _value the DownSinceDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DownSinceDt field
   */
   public void setDownSinceDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDownSinceDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDownSinceDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DownSinceDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDownSinceDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDownSinceDtFromFormattedString");
   }

  /**
   * Retrieves the DownSinceDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DownSinceDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the DownSinceDt field
   */
  public String getDownSinceDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDownSinceDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDownSinceDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getDownSinceDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DownSinceDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDownSinceDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the DownSinceDt field value from a formatted date/time string
   *
   * @param _value the DownSinceDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DownSinceDt field
   */
  public void setDownSinceDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDownSinceDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setDownSinceDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DownSinceDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDownSinceDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: DownSinceDt (SERVER_DEFINITION.down_since_dt)
   * @return Date the value
   */
  public Date getDownSinceDt () {
    return this.DownSinceDt;
  }
  /** Change the field to not being actively set: DownSinceDt (SERVER_DEFINITION.down_since_dt)
   */
  public void unsetDownSinceDt () {
    this._DownSinceDtSet = false;
  }
  /** See if the field is actively set: DownSinceDt (SERVER_DEFINITION.down_since_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetDownSinceDt () {
    return this._DownSinceDtSet;
  }
  /** set the fields value: DownSetBy (SERVER_DEFINITION.down_set_by)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DownSetBy") 
  public void setDownSetBy (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DownSetBy", "setDownSetBy");
    }
    this.DownSetBy = value;
    this._DownSetBySet = true;
  }

  /** Retrieves the DownSetBy field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DownSetBy field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DownSetBy field
   */
   public String getDownSetByAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDownSetByAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDownSetByAsFormattedString");
       return fmtMgr.formatString(this.getDownSetBy());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DownSetBy");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDownSetByAsFormattedString");
       throw x;
     }
   }
  /** Sets the DownSetBy field from a formatted string
   *
   * @param _value the DownSetBy field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DownSetBy field
   */
   public void setDownSetByFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDownSetByFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDownSetBy(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DownSetBy");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDownSetByFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDownSetByFromFormattedString");
   }

  /** get the value of the field: DownSetBy (SERVER_DEFINITION.down_set_by)
   * @return String the value
   */
  public String getDownSetBy () {
    return this.DownSetBy;
  }
  /** Change the field to not being actively set: DownSetBy (SERVER_DEFINITION.down_set_by)
   */
  public void unsetDownSetBy () {
    this._DownSetBySet = false;
  }
  /** See if the field is actively set: DownSetBy (SERVER_DEFINITION.down_set_by)
   * @return boolean whether the field is actively set
   */
  public boolean issetDownSetBy () {
    return this._DownSetBySet;
  }
  /** set the fields value: DownReasonCode (SERVER_DEFINITION.down_reason_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DownReasonCode") 
  public void setDownReasonCode (Integer value) throws ServiceException
  {
    this.DownReasonCode = value;
    this._DownReasonCodeSet = true;
  }

  /** Retrieves the DownReasonCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DownReasonCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DownReasonCode field
   */
   public String getDownReasonCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDownReasonCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDownReasonCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getDownReasonCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DownReasonCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDownReasonCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the DownReasonCode field from a formatted string
   *
   * @param _value the DownReasonCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DownReasonCode field
   */
   public void setDownReasonCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDownReasonCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDownReasonCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DownReasonCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDownReasonCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDownReasonCodeFromFormattedString");
   }

  /** get the value of the field: DownReasonCode (SERVER_DEFINITION.down_reason_code)
   * @return Integer the value
   */
  public Integer getDownReasonCode () {
    return this.DownReasonCode;
  }
  /** Change the field to not being actively set: DownReasonCode (SERVER_DEFINITION.down_reason_code)
   */
  public void unsetDownReasonCode () {
    this._DownReasonCodeSet = false;
  }
  /** See if the field is actively set: DownReasonCode (SERVER_DEFINITION.down_reason_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetDownReasonCode () {
    return this._DownReasonCodeSet;
  }
  /** set the fields value: ServerCategory (SERVER_DEFINITION.server_category)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServerCategory") 
  public void setServerCategory (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServerCategory", "setServerCategory");
    }
    this.ServerCategory = value;
    this._ServerCategorySet = true;
  }

  /** Retrieves the ServerCategory field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServerCategory field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServerCategory field
   */
   public String getServerCategoryAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerCategoryAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServerCategoryAsFormattedString");
       return fmtMgr.formatNumber(this.getServerCategory(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServerCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServerCategoryAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServerCategory field from a formatted string
   *
   * @param _value the ServerCategory field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServerCategory field
   */
   public void setServerCategoryFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerCategoryFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServerCategory(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServerCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServerCategoryFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServerCategoryFromFormattedString");
   }

  /** get the value of the field: ServerCategory (SERVER_DEFINITION.server_category)
   * @return Integer the value
   */
  public Integer getServerCategory () {
    return this.ServerCategory;
  }
  /** Change the field to not being actively set: ServerCategory (SERVER_DEFINITION.server_category)
   */
  public void unsetServerCategory () {
    this._ServerCategorySet = false;
  }
  /** See if the field is actively set: ServerCategory (SERVER_DEFINITION.server_category)
   * @return boolean whether the field is actively set
   */
  public boolean issetServerCategory () {
    return this._ServerCategorySet;
  }
  public String toString() {
    return ServerObjectHelper.toMap(this, null).toString();
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
  /** SERVER_DEFINITION.server_type field */
    if(!nonNullOnly || (ServerType != null))  _ServerTypeSet = flag;
  /** SERVER_DEFINITION.hostname field */
    if(!nonNullOnly || (Hostname != null))  _HostnameSet = flag;
  /** SERVER_DEFINITION.ip_address field */
    if(!nonNullOnly || (IpAddress != null))  _IpAddressSet = flag;
  /** SERVER_DEFINITION.dsquery field */
    if(!nonNullOnly || (Dsquery != null))  _DsquerySet = flag;
  /** SERVER_DEFINITION.ds_database field */
    if(!nonNullOnly || (DsDatabase != null))  _DsDatabaseSet = flag;
  /** SERVER_DEFINITION.arbordata field */
    if(!nonNullOnly || (Arbordata != null))  _ArbordataSet = flag;
  /** SERVER_DEFINITION.num_accts field */
    if(!nonNullOnly || (NumAccts != null))  _NumAcctsSet = flag;
  /** SERVER_DEFINITION.server_capacity field */
    if(!nonNullOnly || (ServerCapacity != null))  _ServerCapacitySet = flag;
  /** SERVER_DEFINITION.active_flag field */
    if(!nonNullOnly || (ActiveFlag != null))  _ActiveFlagSet = flag;
  /** SERVER_DEFINITION.up_since_dt field */
    if(!nonNullOnly || (UpSinceDt != null))  _UpSinceDtSet = flag;
  /** SERVER_DEFINITION.down_since_dt field */
    if(!nonNullOnly || (DownSinceDt != null))  _DownSinceDtSet = flag;
  /** SERVER_DEFINITION.down_set_by field */
    if(!nonNullOnly || (DownSetBy != null))  _DownSetBySet = flag;
  /** SERVER_DEFINITION.down_reason_code field */
    if(!nonNullOnly || (DownReasonCode != null))  _DownReasonCodeSet = flag;
  /** SERVER_DEFINITION.server_category field */
    if(!nonNullOnly || (ServerCategory != null))  _ServerCategorySet = flag;
  }
}
