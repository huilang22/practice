/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillInsertGroupMapObjectKeyData.java
 * Definition File: Admin/BillInsertGroupMap.xml
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

/** BillInsertGroupMapObject's Key Data class. */
public class BillInsertGroupMapObjectKeyData  extends BaseObjectData
{
  /** BILL_INSERT_GROUPS.insert_grp_id field */
  public    Integer InsertGrpId  = null;
  protected boolean _InsertGrpIdSet = false;
  /** BILL_INSERT_GROUPS.insert_id field */
  public    Integer InsertId  = null;
  protected boolean _InsertIdSet = false;
  /** BILL_INSERT_GROUPS.geo_key field */
  public    String GeoKey  = null;
  protected boolean _GeoKeySet = false;
  /** BILL_INSERT_GROUPS.mkt_code field */
  public    Integer MktCode  = null;
  protected boolean _MktCodeSet = false;
  private String _objName = "BillInsertGroupMapObjectKeyData";
  /** default constructor */
  public BillInsertGroupMapObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public BillInsertGroupMapObjectKeyData (BillInsertGroupMapObjectKeyData other)
  {
    if (other == null) return;
    this.InsertGrpId = other.InsertGrpId;
    this._InsertGrpIdSet = other._InsertGrpIdSet;
    this.InsertId = other.InsertId;
    this._InsertIdSet = other._InsertIdSet;
    this.GeoKey = other.GeoKey;
    this._GeoKeySet = other._GeoKeySet;
    this.MktCode = other.MktCode;
    this._MktCodeSet = other._MktCodeSet;
  }
  /** set the fields value: InsertGrpId (BILL_INSERT_GROUPS.insert_grp_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("InsertGrpId") 
  public void setInsertGrpId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InsertGrpId", "setInsertGrpId");
    }
    this.InsertGrpId = value;
    this._InsertGrpIdSet = true;
  }

  /** Retrieves the InsertGrpId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InsertGrpId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InsertGrpId field
   */
   public String getInsertGrpIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInsertGrpIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInsertGrpIdAsFormattedString");
       return fmtMgr.formatNumber(this.getInsertGrpId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InsertGrpId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInsertGrpIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the InsertGrpId field from a formatted string
   *
   * @param _value the InsertGrpId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InsertGrpId field
   */
   public void setInsertGrpIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInsertGrpIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInsertGrpId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InsertGrpId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInsertGrpIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInsertGrpIdFromFormattedString");
   }

  /** get the value of the field: InsertGrpId (BILL_INSERT_GROUPS.insert_grp_id)
   * @return Integer the value
   */
  public Integer getInsertGrpId () {
    return this.InsertGrpId;
  }
  /** Change the field to not being actively set: InsertGrpId (BILL_INSERT_GROUPS.insert_grp_id)
   */
  public void unsetInsertGrpId () {
    this._InsertGrpIdSet = false;
  }
  /** See if the field is actively set: InsertGrpId (BILL_INSERT_GROUPS.insert_grp_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetInsertGrpId () {
    return this._InsertGrpIdSet;
  }
  /** set the fields value: InsertId (BILL_INSERT_GROUPS.insert_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("InsertId") 
  public void setInsertId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InsertId", "setInsertId");
    }
    this.InsertId = value;
    this._InsertIdSet = true;
  }

  /** Retrieves the InsertId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InsertId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InsertId field
   */
   public String getInsertIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInsertIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInsertIdAsFormattedString");
       return fmtMgr.formatNumber(this.getInsertId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InsertId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInsertIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the InsertId field from a formatted string
   *
   * @param _value the InsertId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InsertId field
   */
   public void setInsertIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInsertIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInsertId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InsertId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInsertIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInsertIdFromFormattedString");
   }

  /** get the value of the field: InsertId (BILL_INSERT_GROUPS.insert_id)
   * @return Integer the value
   */
  public Integer getInsertId () {
    return this.InsertId;
  }
  /** Change the field to not being actively set: InsertId (BILL_INSERT_GROUPS.insert_id)
   */
  public void unsetInsertId () {
    this._InsertIdSet = false;
  }
  /** See if the field is actively set: InsertId (BILL_INSERT_GROUPS.insert_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetInsertId () {
    return this._InsertIdSet;
  }
  /** set the fields value: GeoKey (BILL_INSERT_GROUPS.geo_key)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("GeoKey") 
  public void setGeoKey (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "GeoKey", "setGeoKey");
    }
    if (value != null && !DataHelper.validLength (value, 8))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "GeoKey", "setGeoKey");
    }
    this.GeoKey = value;
    this._GeoKeySet = true;
  }

  /** Retrieves the GeoKey field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The GeoKey field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GeoKey field
   */
   public String getGeoKeyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGeoKeyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGeoKeyAsFormattedString");
       return fmtMgr.formatString(this.getGeoKey());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GeoKey");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getGeoKeyAsFormattedString");
       throw x;
     }
   }
  /** Sets the GeoKey field from a formatted string
   *
   * @param _value the GeoKey field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the GeoKey field
   */
   public void setGeoKeyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGeoKeyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setGeoKey(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GeoKey");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setGeoKeyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGeoKeyFromFormattedString");
   }

  /** get the value of the field: GeoKey (BILL_INSERT_GROUPS.geo_key)
   * @return String the value
   */
  public String getGeoKey () {
    return this.GeoKey;
  }
  /** Change the field to not being actively set: GeoKey (BILL_INSERT_GROUPS.geo_key)
   */
  public void unsetGeoKey () {
    this._GeoKeySet = false;
  }
  /** See if the field is actively set: GeoKey (BILL_INSERT_GROUPS.geo_key)
   * @return boolean whether the field is actively set
   */
  public boolean issetGeoKey () {
    return this._GeoKeySet;
  }
  /** set the fields value: MktCode (BILL_INSERT_GROUPS.mkt_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MktCode") 
  public void setMktCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MktCode", "setMktCode");
    }
    this.MktCode = value;
    this._MktCodeSet = true;
  }

  /** Retrieves the MktCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MktCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MktCode field
   */
   public String getMktCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMktCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMktCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getMktCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MktCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMktCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the MktCode field from a formatted string
   *
   * @param _value the MktCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MktCode field
   */
   public void setMktCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMktCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMktCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MktCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMktCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMktCodeFromFormattedString");
   }

  /** get the value of the field: MktCode (BILL_INSERT_GROUPS.mkt_code)
   * @return Integer the value
   */
  public Integer getMktCode () {
    return this.MktCode;
  }
  /** Change the field to not being actively set: MktCode (BILL_INSERT_GROUPS.mkt_code)
   */
  public void unsetMktCode () {
    this._MktCodeSet = false;
  }
  /** See if the field is actively set: MktCode (BILL_INSERT_GROUPS.mkt_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetMktCode () {
    return this._MktCodeSet;
  }
  public String toString() {
    return BillInsertGroupMapObjectKeyHelper.toMap(this, null).toString();
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
    
  /** BILL_INSERT_GROUPS.insert_grp_id field */
    if(!nonNullOnly || (InsertGrpId != null))  _InsertGrpIdSet = flag;
  /** BILL_INSERT_GROUPS.insert_id field */
    if(!nonNullOnly || (InsertId != null))  _InsertIdSet = flag;
  /** BILL_INSERT_GROUPS.geo_key field */
    if(!nonNullOnly || (GeoKey != null))  _GeoKeySet = flag;
  /** BILL_INSERT_GROUPS.mkt_code field */
    if(!nonNullOnly || (MktCode != null))  _MktCodeSet = flag;
  }
}
