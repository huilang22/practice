/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CorridorObjectData.java
 * Definition File: Customer/Corridor.xml
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
  
/** CorridorObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class CorridorObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public CorridorObjectKeyData Key = null;
  /** CORRIDOR_PLAN_ID_REF.is_icb_corridor field */
  public    Boolean IsIcbCorridor  = null;
  protected boolean _IsIcbCorridorSet = false;
  /** CORRIDOR_PLAN_ID_REF.plan_type field */
  public    Integer PlanType  = null;
  protected boolean _PlanTypeSet = false;
  /** CORRIDOR_PLAN_ID_REF.plan_level field */
  public    Integer PlanLevel  = null;
  protected boolean _PlanLevelSet = false;
  /** CORRIDOR_PLAN_ID_REF.origin_restriction field */
  public    Integer OriginRestriction  = null;
  protected boolean _OriginRestrictionSet = false;
  /** CORRIDOR_PLAN_ID_REF.target_restriction field */
  public    Integer TargetRestriction  = null;
  protected boolean _TargetRestrictionSet = false;
  /** CORRIDOR_PLAN_ID_REF.discount_id field */
  public    Integer DiscountId  = null;
  protected boolean _DiscountIdSet = false;
  /** CORRIDOR_PLAN_ID_REF.max_corridors field */
  public    Integer MaxCorridors  = null;
  protected boolean _MaxCorridorsSet = false;
  /** CORRIDOR_PLAN_ID_REF.is_default field */
  public    Boolean IsDefault  = null;
  protected boolean _IsDefaultSet = false;
  /** CORRIDOR_PLAN_ID_REF.is_internal field */
  public    Boolean IsInternal  = null;
  protected boolean _IsInternalSet = false;
  /** CORRIDOR_PLAN_ID_REF.priority field */
  public    Integer Priority  = null;
  protected boolean _PrioritySet = false;
  /** CORRIDOR_PLAN_ID_VALUES.short_display field */
  public    String ShortDisplay  = null;
  protected boolean _ShortDisplaySet = false;
  /** CORRIDOR_PLAN_ID_VALUES.display_value field */
  public    String DisplayValue  = null;
  protected boolean _DisplayValueSet = false;
  /** CUSTOMER_CORRIDORS.account_no field */
  public    Integer AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  /** CUSTOMER_CORRIDORS.point_origin field */
  public    String PointOrigin  = null;
  protected boolean _PointOriginSet = false;
  /** CUSTOMER_CORRIDORS.origin_is_xact field */
  public    Boolean OriginIsXact  = null;
  protected boolean _OriginIsXactSet = false;
  /** CUSTOMER_CORRIDORS.country_code_origin field */
  public    Integer CountryCodeOrigin  = null;
  protected boolean _CountryCodeOriginSet = false;
  /** CUSTOMER_CORRIDORS.point_target field */
  public    String PointTarget  = null;
  protected boolean _PointTargetSet = false;
  /** CUSTOMER_CORRIDORS.target_is_xact field */
  public    Boolean TargetIsXact  = null;
  protected boolean _TargetIsXactSet = false;
  /** CUSTOMER_CORRIDORS.country_code_target field */
  public    Integer CountryCodeTarget  = null;
  protected boolean _CountryCodeTargetSet = false;
  /** CUSTOMER_CORRIDORS.corridor_plan_id field */
  public    Integer CorridorPlanId  = null;
  protected boolean _CorridorPlanIdSet = false;
  /** CUSTOMER_CORRIDORS.active_dt field */
  public    Date ActiveDt  = null;
  protected boolean _ActiveDtSet = false;
  /** CUSTOMER_CORRIDORS.inactive_dt field */
  public    Date InactiveDt  = null;
  protected boolean _InactiveDtSet = false;
  /** CUSTOMER_CORRIDORS.create_dt field */
  public    Date CreateDt  = null;
  protected boolean _CreateDtSet = false;
  /** CUSTOMER_CORRIDORS.chg_dt field */
  public    Date ChgDt  = null;
  protected boolean _ChgDtSet = false;
  /** CUSTOMER_CORRIDORS.chg_who field */
  public    String ChgWho  = null;
  protected boolean _ChgWhoSet = false;
  /** CUSTOMER_CORRIDORS.access_region_origin field */
  public    String AccessRegionOrigin  = null;
  protected boolean _AccessRegionOriginSet = false;
  /** CUSTOMER_CORRIDORS.access_region_target field */
  public    String AccessRegionTarget  = null;
  protected boolean _AccessRegionTargetSet = false;
  /** CUSTOMER_CORRIDORS.owning_account_no field */
  public    Integer OwningAccountInternalId  = null;
  protected boolean _OwningAccountInternalIdSet = false;
  /** CUSTOMER_CORRIDORS.point_category field */
  public    Integer PointCategory  = null;
  protected boolean _PointCategorySet = false;
  /** CUSTOMER_CORRIDORS.subscr_no field */
  public    Integer ServiceInternalId  = null;
  protected boolean _ServiceInternalIdSet = false;
  /** CUSTOMER_CORRIDORS.subscr_no_resets field */
  public    Integer ServiceInternalIdResets  = null;
  protected boolean _ServiceInternalIdResetsSet = false;
  /** CUSTOMER_CORRIDORS.prev_end_dt field */
  public    Date PrevEndDt  = null;
  protected boolean _PrevEndDtSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
  public    String OwningAccountExternalId  = null;
  protected boolean _OwningAccountExternalIdSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
  public    Integer OwningAccountExternalIdType  = null;
  protected boolean _OwningAccountExternalIdTypeSet = false;
  private String _objName = "CorridorObjectData";
  /** Default constructor */
  public CorridorObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public CorridorObjectData (CorridorObjectData other)
  {

    if (other == null) return;
    this.Key = new CorridorObjectKeyData (other.Key);
    this.IsIcbCorridor = other.IsIcbCorridor;
    this._IsIcbCorridorSet = other._IsIcbCorridorSet;
    this.PlanType = other.PlanType;
    this._PlanTypeSet = other._PlanTypeSet;
    this.PlanLevel = other.PlanLevel;
    this._PlanLevelSet = other._PlanLevelSet;
    this.OriginRestriction = other.OriginRestriction;
    this._OriginRestrictionSet = other._OriginRestrictionSet;
    this.TargetRestriction = other.TargetRestriction;
    this._TargetRestrictionSet = other._TargetRestrictionSet;
    this.DiscountId = other.DiscountId;
    this._DiscountIdSet = other._DiscountIdSet;
    this.MaxCorridors = other.MaxCorridors;
    this._MaxCorridorsSet = other._MaxCorridorsSet;
    this.IsDefault = other.IsDefault;
    this._IsDefaultSet = other._IsDefaultSet;
    this.IsInternal = other.IsInternal;
    this._IsInternalSet = other._IsInternalSet;
    this.Priority = other.Priority;
    this._PrioritySet = other._PrioritySet;
    this.ShortDisplay = other.ShortDisplay;
    this._ShortDisplaySet = other._ShortDisplaySet;
    this.DisplayValue = other.DisplayValue;
    this._DisplayValueSet = other._DisplayValueSet;
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
    this.PointOrigin = other.PointOrigin;
    this._PointOriginSet = other._PointOriginSet;
    this.OriginIsXact = other.OriginIsXact;
    this._OriginIsXactSet = other._OriginIsXactSet;
    this.CountryCodeOrigin = other.CountryCodeOrigin;
    this._CountryCodeOriginSet = other._CountryCodeOriginSet;
    this.PointTarget = other.PointTarget;
    this._PointTargetSet = other._PointTargetSet;
    this.TargetIsXact = other.TargetIsXact;
    this._TargetIsXactSet = other._TargetIsXactSet;
    this.CountryCodeTarget = other.CountryCodeTarget;
    this._CountryCodeTargetSet = other._CountryCodeTargetSet;
    this.CorridorPlanId = other.CorridorPlanId;
    this._CorridorPlanIdSet = other._CorridorPlanIdSet;
    this.ActiveDt = other.ActiveDt;
    this._ActiveDtSet = other._ActiveDtSet;
    this.InactiveDt = other.InactiveDt;
    this._InactiveDtSet = other._InactiveDtSet;
    this.CreateDt = other.CreateDt;
    this._CreateDtSet = other._CreateDtSet;
    this.ChgDt = other.ChgDt;
    this._ChgDtSet = other._ChgDtSet;
    this.ChgWho = other.ChgWho;
    this._ChgWhoSet = other._ChgWhoSet;
    this.AccessRegionOrigin = other.AccessRegionOrigin;
    this._AccessRegionOriginSet = other._AccessRegionOriginSet;
    this.AccessRegionTarget = other.AccessRegionTarget;
    this._AccessRegionTargetSet = other._AccessRegionTargetSet;
    this.OwningAccountInternalId = other.OwningAccountInternalId;
    this._OwningAccountInternalIdSet = other._OwningAccountInternalIdSet;
    this.PointCategory = other.PointCategory;
    this._PointCategorySet = other._PointCategorySet;
    this.ServiceInternalId = other.ServiceInternalId;
    this._ServiceInternalIdSet = other._ServiceInternalIdSet;
    this.ServiceInternalIdResets = other.ServiceInternalIdResets;
    this._ServiceInternalIdResetsSet = other._ServiceInternalIdResetsSet;
    this.PrevEndDt = other.PrevEndDt;
    this._PrevEndDtSet = other._PrevEndDtSet;
    this.OwningAccountExternalId = other.OwningAccountExternalId;
    this._OwningAccountExternalIdSet = other._OwningAccountExternalIdSet;
    this.OwningAccountExternalIdType = other.OwningAccountExternalIdType;
    this._OwningAccountExternalIdTypeSet = other._OwningAccountExternalIdTypeSet;
  }

  /** get the Key for this object
   * @return CorridorObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public CorridorObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (CorridorObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: TrackingId (CUSTOMER_CORRIDORS.tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingId", "setTrackingId");
    }
    if (this.Key == null) this.Key = new CorridorObjectKeyData ();
    this.Key.TrackingId = value;
    this.Key._TrackingIdSet = true;
  }
  /** get the value of the field: TrackingId (CUSTOMER_CORRIDORS.tracking_id)
   * @return Integer the value
   */
  public Integer getTrackingId () {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Change the field to not being actively set: TrackingId (CUSTOMER_CORRIDORS.tracking_id)
   */
  public void unsetTrackingId () {
    if (this.Key == null) return;
    this.Key._TrackingIdSet = false;
  }
  /** See if the field is actively set: TrackingId (CUSTOMER_CORRIDORS.tracking_id)
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

  /** set the fields value: TrackingIdServ (CUSTOMER_CORRIDORS.tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingIdServ", "setTrackingIdServ");
    }
    if (this.Key == null) this.Key = new CorridorObjectKeyData ();
    this.Key.TrackingIdServ = value;
    this.Key._TrackingIdServSet = true;
  }
  /** get the value of the field: TrackingIdServ (CUSTOMER_CORRIDORS.tracking_id_serv)
   * @return Integer the value
   */
  public Integer getTrackingIdServ () {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Change the field to not being actively set: TrackingIdServ (CUSTOMER_CORRIDORS.tracking_id_serv)
   */
  public void unsetTrackingIdServ () {
    if (this.Key == null) return;
    this.Key._TrackingIdServSet = false;
  }
  /** See if the field is actively set: TrackingIdServ (CUSTOMER_CORRIDORS.tracking_id_serv)
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

  /** set the fields value: LanguageCode (CORRIDOR_PLAN_ID_VALUES.language_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setLanguageCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LanguageCode", "setLanguageCode");
    }
    if (this.Key == null) this.Key = new CorridorObjectKeyData ();
    this.Key.LanguageCode = value;
    this.Key._LanguageCodeSet = true;
  }
  /** get the value of the field: LanguageCode (CORRIDOR_PLAN_ID_VALUES.language_code)
   * @return Integer the value
   */
  public Integer getLanguageCode () {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  /** Change the field to not being actively set: LanguageCode (CORRIDOR_PLAN_ID_VALUES.language_code)
   */
  public void unsetLanguageCode () {
    if (this.Key == null) return;
    this.Key._LanguageCodeSet = false;
  }
  /** See if the field is actively set: LanguageCode (CORRIDOR_PLAN_ID_VALUES.language_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetLanguageCode () {
    if (this.Key == null) return false;
    return this.Key._LanguageCodeSet;
  }

  /** Retrieves the LanguageCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LanguageCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LanguageCode field
   */
   public String getLanguageCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getLanguageCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LanguageCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the LanguageCode field from a formatted string
   *
   * @param _value the LanguageCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LanguageCode field
   */
   public void setLanguageCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLanguageCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LanguageCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLanguageCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLanguageCodeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated LanguageCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the LanguageCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the LanguageCode field
   */
  public String getLanguageCodeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getLanguageCodeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getLanguageCode()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated LanguageCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the LanguageCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the LanguageCode field
   */
  public Enumeration getLanguageCodeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeEnumeration");
    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("LanguageCode", _locale, null, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated LanguageCode field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setLanguageCodeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLanguageCodeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getLanguageCodeEnumeration(_locale);
      this.setLanguageCode((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLanguageCodeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLanguageCodeFromDisplayValue");
  }

  /** set the fields value: IsIcbCorridor (CORRIDOR_PLAN_ID_REF.is_icb_corridor)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsIcbCorridor") 
  public void setIsIcbCorridor (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsIcbCorridor", "setIsIcbCorridor");
    }
    this.IsIcbCorridor = value;
    this._IsIcbCorridorSet = true;
  }

  /** Retrieves the IsIcbCorridor field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsIcbCorridor field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsIcbCorridor field
   */
   public String getIsIcbCorridorAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsIcbCorridorAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsIcbCorridorAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsIcbCorridor());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsIcbCorridor");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsIcbCorridorAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsIcbCorridor field from a formatted string
   *
   * @param _value the IsIcbCorridor field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsIcbCorridor field
   */
   public void setIsIcbCorridorFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsIcbCorridorFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsIcbCorridor(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsIcbCorridor");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsIcbCorridorFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsIcbCorridorFromFormattedString");
   }

  /** get the value of the field: IsIcbCorridor (CORRIDOR_PLAN_ID_REF.is_icb_corridor)
   * @return Boolean the value
   */
  public Boolean getIsIcbCorridor () {
    return this.IsIcbCorridor;
  }
  /** Change the field to not being actively set: IsIcbCorridor (CORRIDOR_PLAN_ID_REF.is_icb_corridor)
   */
  public void unsetIsIcbCorridor () {
    this._IsIcbCorridorSet = false;
  }
  /** See if the field is actively set: IsIcbCorridor (CORRIDOR_PLAN_ID_REF.is_icb_corridor)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsIcbCorridor () {
    return this._IsIcbCorridorSet;
  }
  /** set the fields value: PlanType (CORRIDOR_PLAN_ID_REF.plan_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PlanType") 
  public void setPlanType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PlanType", "setPlanType");
    }
    this.PlanType = value;
    this._PlanTypeSet = true;
  }

  /** Retrieves the PlanType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PlanType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PlanType field
   */
   public String getPlanTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPlanTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPlanTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getPlanType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PlanType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPlanTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the PlanType field from a formatted string
   *
   * @param _value the PlanType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PlanType field
   */
   public void setPlanTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPlanTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPlanType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PlanType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPlanTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPlanTypeFromFormattedString");
   }

  /** get the value of the field: PlanType (CORRIDOR_PLAN_ID_REF.plan_type)
   * @return Integer the value
   */
  public Integer getPlanType () {
    return this.PlanType;
  }
  /** Change the field to not being actively set: PlanType (CORRIDOR_PLAN_ID_REF.plan_type)
   */
  public void unsetPlanType () {
    this._PlanTypeSet = false;
  }
  /** See if the field is actively set: PlanType (CORRIDOR_PLAN_ID_REF.plan_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetPlanType () {
    return this._PlanTypeSet;
  }
  /** set the fields value: PlanLevel (CORRIDOR_PLAN_ID_REF.plan_level)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PlanLevel") 
  public void setPlanLevel (Integer value) throws ServiceException
  {
    this.PlanLevel = value;
    this._PlanLevelSet = true;
  }

  /** Retrieves the PlanLevel field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PlanLevel field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PlanLevel field
   */
   public String getPlanLevelAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPlanLevelAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPlanLevelAsFormattedString");
       return fmtMgr.formatNumber(this.getPlanLevel(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PlanLevel");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPlanLevelAsFormattedString");
       throw x;
     }
   }
  /** Sets the PlanLevel field from a formatted string
   *
   * @param _value the PlanLevel field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PlanLevel field
   */
   public void setPlanLevelFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPlanLevelFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPlanLevel(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PlanLevel");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPlanLevelFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPlanLevelFromFormattedString");
   }

  /** get the value of the field: PlanLevel (CORRIDOR_PLAN_ID_REF.plan_level)
   * @return Integer the value
   */
  public Integer getPlanLevel () {
    return this.PlanLevel;
  }
  /** Change the field to not being actively set: PlanLevel (CORRIDOR_PLAN_ID_REF.plan_level)
   */
  public void unsetPlanLevel () {
    this._PlanLevelSet = false;
  }
  /** See if the field is actively set: PlanLevel (CORRIDOR_PLAN_ID_REF.plan_level)
   * @return boolean whether the field is actively set
   */
  public boolean issetPlanLevel () {
    return this._PlanLevelSet;
  }
  /** set the fields value: OriginRestriction (CORRIDOR_PLAN_ID_REF.origin_restriction)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OriginRestriction") 
  public void setOriginRestriction (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OriginRestriction", "setOriginRestriction");
    }
    this.OriginRestriction = value;
    this._OriginRestrictionSet = true;
  }

  /** Retrieves the OriginRestriction field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OriginRestriction field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OriginRestriction field
   */
   public String getOriginRestrictionAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOriginRestrictionAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOriginRestrictionAsFormattedString");
       return fmtMgr.formatNumber(this.getOriginRestriction(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OriginRestriction");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOriginRestrictionAsFormattedString");
       throw x;
     }
   }
  /** Sets the OriginRestriction field from a formatted string
   *
   * @param _value the OriginRestriction field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OriginRestriction field
   */
   public void setOriginRestrictionFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOriginRestrictionFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOriginRestriction(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OriginRestriction");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOriginRestrictionFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOriginRestrictionFromFormattedString");
   }

  /** get the value of the field: OriginRestriction (CORRIDOR_PLAN_ID_REF.origin_restriction)
   * @return Integer the value
   */
  public Integer getOriginRestriction () {
    return this.OriginRestriction;
  }
  /** Change the field to not being actively set: OriginRestriction (CORRIDOR_PLAN_ID_REF.origin_restriction)
   */
  public void unsetOriginRestriction () {
    this._OriginRestrictionSet = false;
  }
  /** See if the field is actively set: OriginRestriction (CORRIDOR_PLAN_ID_REF.origin_restriction)
   * @return boolean whether the field is actively set
   */
  public boolean issetOriginRestriction () {
    return this._OriginRestrictionSet;
  }
  /** set the fields value: TargetRestriction (CORRIDOR_PLAN_ID_REF.target_restriction)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TargetRestriction") 
  public void setTargetRestriction (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TargetRestriction", "setTargetRestriction");
    }
    this.TargetRestriction = value;
    this._TargetRestrictionSet = true;
  }

  /** Retrieves the TargetRestriction field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TargetRestriction field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TargetRestriction field
   */
   public String getTargetRestrictionAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTargetRestrictionAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTargetRestrictionAsFormattedString");
       return fmtMgr.formatNumber(this.getTargetRestriction(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TargetRestriction");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTargetRestrictionAsFormattedString");
       throw x;
     }
   }
  /** Sets the TargetRestriction field from a formatted string
   *
   * @param _value the TargetRestriction field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TargetRestriction field
   */
   public void setTargetRestrictionFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTargetRestrictionFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTargetRestriction(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TargetRestriction");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTargetRestrictionFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTargetRestrictionFromFormattedString");
   }

  /** get the value of the field: TargetRestriction (CORRIDOR_PLAN_ID_REF.target_restriction)
   * @return Integer the value
   */
  public Integer getTargetRestriction () {
    return this.TargetRestriction;
  }
  /** Change the field to not being actively set: TargetRestriction (CORRIDOR_PLAN_ID_REF.target_restriction)
   */
  public void unsetTargetRestriction () {
    this._TargetRestrictionSet = false;
  }
  /** See if the field is actively set: TargetRestriction (CORRIDOR_PLAN_ID_REF.target_restriction)
   * @return boolean whether the field is actively set
   */
  public boolean issetTargetRestriction () {
    return this._TargetRestrictionSet;
  }
  /** set the fields value: DiscountId (CORRIDOR_PLAN_ID_REF.discount_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DiscountId") 
  public void setDiscountId (Integer value) throws ServiceException
  {
    this.DiscountId = value;
    this._DiscountIdSet = true;
  }

  /** Retrieves the DiscountId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DiscountId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DiscountId field
   */
   public String getDiscountIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountIdAsFormattedString");
       return fmtMgr.formatNumber(this.getDiscountId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DiscountId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the DiscountId field from a formatted string
   *
   * @param _value the DiscountId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DiscountId field
   */
   public void setDiscountIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDiscountId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DiscountId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountIdFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated DiscountId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the DiscountId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the DiscountId field
   */

  public String getDiscountIdDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountIdDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getDiscountIdEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountIdDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getDiscountId()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountIdDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated DiscountId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the DiscountId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the DiscountId field
   */
  public Enumeration getDiscountIdEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountIdEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("DiscountType", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountIdEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountIdEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated DiscountId field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setDiscountIdFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDiscountIdFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getDiscountIdEnumeration(_locale);
      this.setDiscountId((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountIdFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDiscountIdFromDisplayValue");
  }

  /** get the value of the field: DiscountId (CORRIDOR_PLAN_ID_REF.discount_id)
   * @return Integer the value
   */
  public Integer getDiscountId () {
    return this.DiscountId;
  }
  /** Change the field to not being actively set: DiscountId (CORRIDOR_PLAN_ID_REF.discount_id)
   */
  public void unsetDiscountId () {
    this._DiscountIdSet = false;
  }
  /** See if the field is actively set: DiscountId (CORRIDOR_PLAN_ID_REF.discount_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetDiscountId () {
    return this._DiscountIdSet;
  }
  /** set the fields value: MaxCorridors (CORRIDOR_PLAN_ID_REF.max_corridors)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MaxCorridors") 
  public void setMaxCorridors (Integer value) throws ServiceException
  {
    this.MaxCorridors = value;
    this._MaxCorridorsSet = true;
  }

  /** Retrieves the MaxCorridors field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MaxCorridors field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MaxCorridors field
   */
   public String getMaxCorridorsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMaxCorridorsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMaxCorridorsAsFormattedString");
       return fmtMgr.formatNumber(this.getMaxCorridors(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MaxCorridors");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMaxCorridorsAsFormattedString");
       throw x;
     }
   }
  /** Sets the MaxCorridors field from a formatted string
   *
   * @param _value the MaxCorridors field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MaxCorridors field
   */
   public void setMaxCorridorsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMaxCorridorsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMaxCorridors(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MaxCorridors");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMaxCorridorsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMaxCorridorsFromFormattedString");
   }

  /** get the value of the field: MaxCorridors (CORRIDOR_PLAN_ID_REF.max_corridors)
   * @return Integer the value
   */
  public Integer getMaxCorridors () {
    return this.MaxCorridors;
  }
  /** Change the field to not being actively set: MaxCorridors (CORRIDOR_PLAN_ID_REF.max_corridors)
   */
  public void unsetMaxCorridors () {
    this._MaxCorridorsSet = false;
  }
  /** See if the field is actively set: MaxCorridors (CORRIDOR_PLAN_ID_REF.max_corridors)
   * @return boolean whether the field is actively set
   */
  public boolean issetMaxCorridors () {
    return this._MaxCorridorsSet;
  }
  /** set the fields value: IsDefault (CORRIDOR_PLAN_ID_REF.is_default)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsDefault") 
  public void setIsDefault (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsDefault", "setIsDefault");
    }
    this.IsDefault = value;
    this._IsDefaultSet = true;
  }

  /** Retrieves the IsDefault field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsDefault field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsDefault field
   */
   public String getIsDefaultAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDefaultAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsDefaultAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsDefault());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsDefault");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsDefaultAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsDefault field from a formatted string
   *
   * @param _value the IsDefault field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsDefault field
   */
   public void setIsDefaultFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDefaultFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsDefault(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsDefault");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsDefaultFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsDefaultFromFormattedString");
   }

  /** get the value of the field: IsDefault (CORRIDOR_PLAN_ID_REF.is_default)
   * @return Boolean the value
   */
  public Boolean getIsDefault () {
    return this.IsDefault;
  }
  /** Change the field to not being actively set: IsDefault (CORRIDOR_PLAN_ID_REF.is_default)
   */
  public void unsetIsDefault () {
    this._IsDefaultSet = false;
  }
  /** See if the field is actively set: IsDefault (CORRIDOR_PLAN_ID_REF.is_default)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsDefault () {
    return this._IsDefaultSet;
  }
  /** set the fields value: IsInternal (CORRIDOR_PLAN_ID_REF.is_internal)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsInternal") 
  public void setIsInternal (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsInternal", "setIsInternal");
    }
    this.IsInternal = value;
    this._IsInternalSet = true;
  }

  /** Retrieves the IsInternal field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsInternal field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsInternal field
   */
   public String getIsInternalAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsInternalAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsInternalAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsInternal());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsInternal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsInternalAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsInternal field from a formatted string
   *
   * @param _value the IsInternal field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsInternal field
   */
   public void setIsInternalFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsInternalFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsInternal(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsInternal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsInternalFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsInternalFromFormattedString");
   }

  /** get the value of the field: IsInternal (CORRIDOR_PLAN_ID_REF.is_internal)
   * @return Boolean the value
   */
  public Boolean getIsInternal () {
    return this.IsInternal;
  }
  /** Change the field to not being actively set: IsInternal (CORRIDOR_PLAN_ID_REF.is_internal)
   */
  public void unsetIsInternal () {
    this._IsInternalSet = false;
  }
  /** See if the field is actively set: IsInternal (CORRIDOR_PLAN_ID_REF.is_internal)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsInternal () {
    return this._IsInternalSet;
  }
  /** set the fields value: Priority (CORRIDOR_PLAN_ID_REF.priority)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Priority") 
  public void setPriority (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Priority", "setPriority");
    }
    this.Priority = value;
    this._PrioritySet = true;
  }

  /** Retrieves the Priority field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Priority field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Priority field
   */
   public String getPriorityAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPriorityAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPriorityAsFormattedString");
       return fmtMgr.formatNumber(this.getPriority(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Priority");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPriorityAsFormattedString");
       throw x;
     }
   }
  /** Sets the Priority field from a formatted string
   *
   * @param _value the Priority field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Priority field
   */
   public void setPriorityFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPriorityFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPriority(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Priority");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPriorityFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPriorityFromFormattedString");
   }

  /** get the value of the field: Priority (CORRIDOR_PLAN_ID_REF.priority)
   * @return Integer the value
   */
  public Integer getPriority () {
    return this.Priority;
  }
  /** Change the field to not being actively set: Priority (CORRIDOR_PLAN_ID_REF.priority)
   */
  public void unsetPriority () {
    this._PrioritySet = false;
  }
  /** See if the field is actively set: Priority (CORRIDOR_PLAN_ID_REF.priority)
   * @return boolean whether the field is actively set
   */
  public boolean issetPriority () {
    return this._PrioritySet;
  }
  /** set the fields value: ShortDisplay (CORRIDOR_PLAN_ID_VALUES.short_display)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ShortDisplay") 
  public void setShortDisplay (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 5))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ShortDisplay", "setShortDisplay");
    }
    this.ShortDisplay = value;
    this._ShortDisplaySet = true;
  }

  /** Retrieves the ShortDisplay field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ShortDisplay field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ShortDisplay field
   */
   public String getShortDisplayAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getShortDisplayAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getShortDisplayAsFormattedString");
       return fmtMgr.formatString(this.getShortDisplay());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ShortDisplay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getShortDisplayAsFormattedString");
       throw x;
     }
   }
  /** Sets the ShortDisplay field from a formatted string
   *
   * @param _value the ShortDisplay field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ShortDisplay field
   */
   public void setShortDisplayFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getShortDisplayFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setShortDisplay(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ShortDisplay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setShortDisplayFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setShortDisplayFromFormattedString");
   }

  /** get the value of the field: ShortDisplay (CORRIDOR_PLAN_ID_VALUES.short_display)
   * @return String the value
   */
  public String getShortDisplay () {
    return this.ShortDisplay;
  }
  /** Change the field to not being actively set: ShortDisplay (CORRIDOR_PLAN_ID_VALUES.short_display)
   */
  public void unsetShortDisplay () {
    this._ShortDisplaySet = false;
  }
  /** See if the field is actively set: ShortDisplay (CORRIDOR_PLAN_ID_VALUES.short_display)
   * @return boolean whether the field is actively set
   */
  public boolean issetShortDisplay () {
    return this._ShortDisplaySet;
  }
  /** set the fields value: DisplayValue (CORRIDOR_PLAN_ID_VALUES.display_value)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DisplayValue") 
  public void setDisplayValue (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DisplayValue", "setDisplayValue");
    }
    if (value != null && !DataHelper.validLength (value, 80))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DisplayValue", "setDisplayValue");
    }
    this.DisplayValue = value;
    this._DisplayValueSet = true;
  }

  /** Retrieves the DisplayValue field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DisplayValue field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DisplayValue field
   */
   public String getDisplayValueAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisplayValueAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDisplayValueAsFormattedString");
       return fmtMgr.formatString(this.getDisplayValue());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DisplayValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDisplayValueAsFormattedString");
       throw x;
     }
   }
  /** Sets the DisplayValue field from a formatted string
   *
   * @param _value the DisplayValue field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DisplayValue field
   */
   public void setDisplayValueFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisplayValueFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDisplayValue(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DisplayValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDisplayValueFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDisplayValueFromFormattedString");
   }

  /** get the value of the field: DisplayValue (CORRIDOR_PLAN_ID_VALUES.display_value)
   * @return String the value
   */
  public String getDisplayValue () {
    return this.DisplayValue;
  }
  /** Change the field to not being actively set: DisplayValue (CORRIDOR_PLAN_ID_VALUES.display_value)
   */
  public void unsetDisplayValue () {
    this._DisplayValueSet = false;
  }
  /** See if the field is actively set: DisplayValue (CORRIDOR_PLAN_ID_VALUES.display_value)
   * @return boolean whether the field is actively set
   */
  public boolean issetDisplayValue () {
    return this._DisplayValueSet;
  }
  /** set the fields value: AccountInternalId (CUSTOMER_CORRIDORS.account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountInternalId") 
  public void setAccountInternalId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountInternalId", "setAccountInternalId");
    }
    this.AccountInternalId = value;
    this._AccountInternalIdSet = true;
  }

  /** Retrieves the AccountInternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountInternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountInternalId field
   */
   public String getAccountInternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInternalIdAsFormattedString");
       return fmtMgr.formatNumber(this.getAccountInternalId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountInternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountInternalId field from a formatted string
   *
   * @param _value the AccountInternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountInternalId field
   */
   public void setAccountInternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountInternalId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountInternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountInternalIdFromFormattedString");
   }

  /** get the value of the field: AccountInternalId (CUSTOMER_CORRIDORS.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (CUSTOMER_CORRIDORS.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (CUSTOMER_CORRIDORS.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  /** set the fields value: PointOrigin (CUSTOMER_CORRIDORS.point_origin)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PointOrigin") 
  public void setPointOrigin (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 24))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PointOrigin", "setPointOrigin");
    }
    this.PointOrigin = value;
    this._PointOriginSet = true;
  }

  /** Retrieves the PointOrigin field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PointOrigin field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointOrigin field
   */
   public String getPointOriginAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointOriginAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointOriginAsFormattedString");
       return fmtMgr.formatString(this.getPointOrigin());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointOriginAsFormattedString");
       throw x;
     }
   }
  /** Sets the PointOrigin field from a formatted string
   *
   * @param _value the PointOrigin field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PointOrigin field
   */
   public void setPointOriginFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointOriginFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPointOrigin(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointOriginFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointOriginFromFormattedString");
   }

  /** get the value of the field: PointOrigin (CUSTOMER_CORRIDORS.point_origin)
   * @return String the value
   */
  public String getPointOrigin () {
    return this.PointOrigin;
  }
  /** Change the field to not being actively set: PointOrigin (CUSTOMER_CORRIDORS.point_origin)
   */
  public void unsetPointOrigin () {
    this._PointOriginSet = false;
  }
  /** See if the field is actively set: PointOrigin (CUSTOMER_CORRIDORS.point_origin)
   * @return boolean whether the field is actively set
   */
  public boolean issetPointOrigin () {
    return this._PointOriginSet;
  }
  /** set the fields value: OriginIsXact (CUSTOMER_CORRIDORS.origin_is_xact)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OriginIsXact") 
  public void setOriginIsXact (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OriginIsXact", "setOriginIsXact");
    }
    this.OriginIsXact = value;
    this._OriginIsXactSet = true;
  }

  /** Retrieves the OriginIsXact field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OriginIsXact field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OriginIsXact field
   */
   public String getOriginIsXactAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOriginIsXactAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOriginIsXactAsFormattedString");
       return fmtMgr.formatBoolean(this.getOriginIsXact());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OriginIsXact");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOriginIsXactAsFormattedString");
       throw x;
     }
   }
  /** Sets the OriginIsXact field from a formatted string
   *
   * @param _value the OriginIsXact field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OriginIsXact field
   */
   public void setOriginIsXactFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOriginIsXactFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOriginIsXact(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OriginIsXact");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOriginIsXactFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOriginIsXactFromFormattedString");
   }

  /** get the value of the field: OriginIsXact (CUSTOMER_CORRIDORS.origin_is_xact)
   * @return Boolean the value
   */
  public Boolean getOriginIsXact () {
    return this.OriginIsXact;
  }
  /** Change the field to not being actively set: OriginIsXact (CUSTOMER_CORRIDORS.origin_is_xact)
   */
  public void unsetOriginIsXact () {
    this._OriginIsXactSet = false;
  }
  /** See if the field is actively set: OriginIsXact (CUSTOMER_CORRIDORS.origin_is_xact)
   * @return boolean whether the field is actively set
   */
  public boolean issetOriginIsXact () {
    return this._OriginIsXactSet;
  }
  /** set the fields value: CountryCodeOrigin (CUSTOMER_CORRIDORS.country_code_origin)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CountryCodeOrigin") 
  public void setCountryCodeOrigin (Integer value) throws ServiceException
  {
    this.CountryCodeOrigin = value;
    this._CountryCodeOriginSet = true;
  }

  /** Retrieves the CountryCodeOrigin field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CountryCodeOrigin field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountryCodeOrigin field
   */
   public String getCountryCodeOriginAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeOriginAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountryCodeOriginAsFormattedString");
       return fmtMgr.formatNumber(this.getCountryCodeOrigin(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountryCodeOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountryCodeOriginAsFormattedString");
       throw x;
     }
   }
  /** Sets the CountryCodeOrigin field from a formatted string
   *
   * @param _value the CountryCodeOrigin field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CountryCodeOrigin field
   */
   public void setCountryCodeOriginFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeOriginFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCountryCodeOrigin(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountryCodeOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountryCodeOriginFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountryCodeOriginFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated CountryCodeOrigin field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CountryCodeOrigin field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CountryCodeOrigin field
   */

  public String getCountryCodeOriginDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeOriginDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCountryCodeOriginEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountryCodeOriginDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getCountryCodeOrigin()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryCodeOrigin");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountryCodeOriginDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated CountryCodeOrigin field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the CountryCodeOrigin field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CountryCodeOrigin field
   */
  public Enumeration getCountryCodeOriginEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeOriginEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("CountryCode", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountryCodeOriginEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryCodeOrigin");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountryCodeOriginEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated CountryCodeOrigin field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setCountryCodeOriginFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCountryCodeOriginFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCountryCodeOriginEnumeration(_locale);
      this.setCountryCodeOrigin((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryCodeOrigin");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountryCodeOriginFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCountryCodeOriginFromDisplayValue");
  }

  /** get the value of the field: CountryCodeOrigin (CUSTOMER_CORRIDORS.country_code_origin)
   * @return Integer the value
   */
  public Integer getCountryCodeOrigin () {
    return this.CountryCodeOrigin;
  }
  /** Change the field to not being actively set: CountryCodeOrigin (CUSTOMER_CORRIDORS.country_code_origin)
   */
  public void unsetCountryCodeOrigin () {
    this._CountryCodeOriginSet = false;
  }
  /** See if the field is actively set: CountryCodeOrigin (CUSTOMER_CORRIDORS.country_code_origin)
   * @return boolean whether the field is actively set
   */
  public boolean issetCountryCodeOrigin () {
    return this._CountryCodeOriginSet;
  }
  /** set the fields value: PointTarget (CUSTOMER_CORRIDORS.point_target)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PointTarget") 
  public void setPointTarget (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 24))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PointTarget", "setPointTarget");
    }
    this.PointTarget = value;
    this._PointTargetSet = true;
  }

  /** Retrieves the PointTarget field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PointTarget field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointTarget field
   */
   public String getPointTargetAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointTargetAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointTargetAsFormattedString");
       return fmtMgr.formatString(this.getPointTarget());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointTarget");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointTargetAsFormattedString");
       throw x;
     }
   }
  /** Sets the PointTarget field from a formatted string
   *
   * @param _value the PointTarget field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PointTarget field
   */
   public void setPointTargetFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointTargetFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPointTarget(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointTarget");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointTargetFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointTargetFromFormattedString");
   }

  /** get the value of the field: PointTarget (CUSTOMER_CORRIDORS.point_target)
   * @return String the value
   */
  public String getPointTarget () {
    return this.PointTarget;
  }
  /** Change the field to not being actively set: PointTarget (CUSTOMER_CORRIDORS.point_target)
   */
  public void unsetPointTarget () {
    this._PointTargetSet = false;
  }
  /** See if the field is actively set: PointTarget (CUSTOMER_CORRIDORS.point_target)
   * @return boolean whether the field is actively set
   */
  public boolean issetPointTarget () {
    return this._PointTargetSet;
  }
  /** set the fields value: TargetIsXact (CUSTOMER_CORRIDORS.target_is_xact)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TargetIsXact") 
  public void setTargetIsXact (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TargetIsXact", "setTargetIsXact");
    }
    this.TargetIsXact = value;
    this._TargetIsXactSet = true;
  }

  /** Retrieves the TargetIsXact field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TargetIsXact field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TargetIsXact field
   */
   public String getTargetIsXactAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTargetIsXactAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTargetIsXactAsFormattedString");
       return fmtMgr.formatBoolean(this.getTargetIsXact());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TargetIsXact");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTargetIsXactAsFormattedString");
       throw x;
     }
   }
  /** Sets the TargetIsXact field from a formatted string
   *
   * @param _value the TargetIsXact field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TargetIsXact field
   */
   public void setTargetIsXactFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTargetIsXactFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTargetIsXact(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TargetIsXact");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTargetIsXactFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTargetIsXactFromFormattedString");
   }

  /** get the value of the field: TargetIsXact (CUSTOMER_CORRIDORS.target_is_xact)
   * @return Boolean the value
   */
  public Boolean getTargetIsXact () {
    return this.TargetIsXact;
  }
  /** Change the field to not being actively set: TargetIsXact (CUSTOMER_CORRIDORS.target_is_xact)
   */
  public void unsetTargetIsXact () {
    this._TargetIsXactSet = false;
  }
  /** See if the field is actively set: TargetIsXact (CUSTOMER_CORRIDORS.target_is_xact)
   * @return boolean whether the field is actively set
   */
  public boolean issetTargetIsXact () {
    return this._TargetIsXactSet;
  }
  /** set the fields value: CountryCodeTarget (CUSTOMER_CORRIDORS.country_code_target)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CountryCodeTarget") 
  public void setCountryCodeTarget (Integer value) throws ServiceException
  {
    this.CountryCodeTarget = value;
    this._CountryCodeTargetSet = true;
  }

  /** Retrieves the CountryCodeTarget field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CountryCodeTarget field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountryCodeTarget field
   */
   public String getCountryCodeTargetAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeTargetAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountryCodeTargetAsFormattedString");
       return fmtMgr.formatNumber(this.getCountryCodeTarget(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountryCodeTarget");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountryCodeTargetAsFormattedString");
       throw x;
     }
   }
  /** Sets the CountryCodeTarget field from a formatted string
   *
   * @param _value the CountryCodeTarget field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CountryCodeTarget field
   */
   public void setCountryCodeTargetFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeTargetFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCountryCodeTarget(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountryCodeTarget");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountryCodeTargetFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountryCodeTargetFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated CountryCodeTarget field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CountryCodeTarget field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CountryCodeTarget field
   */

  public String getCountryCodeTargetDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeTargetDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCountryCodeTargetEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountryCodeTargetDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getCountryCodeTarget()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryCodeTarget");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountryCodeTargetDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated CountryCodeTarget field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the CountryCodeTarget field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CountryCodeTarget field
   */
  public Enumeration getCountryCodeTargetEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeTargetEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("CountryCode", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountryCodeTargetEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryCodeTarget");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountryCodeTargetEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated CountryCodeTarget field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setCountryCodeTargetFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCountryCodeTargetFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCountryCodeTargetEnumeration(_locale);
      this.setCountryCodeTarget((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryCodeTarget");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountryCodeTargetFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCountryCodeTargetFromDisplayValue");
  }

  /** get the value of the field: CountryCodeTarget (CUSTOMER_CORRIDORS.country_code_target)
   * @return Integer the value
   */
  public Integer getCountryCodeTarget () {
    return this.CountryCodeTarget;
  }
  /** Change the field to not being actively set: CountryCodeTarget (CUSTOMER_CORRIDORS.country_code_target)
   */
  public void unsetCountryCodeTarget () {
    this._CountryCodeTargetSet = false;
  }
  /** See if the field is actively set: CountryCodeTarget (CUSTOMER_CORRIDORS.country_code_target)
   * @return boolean whether the field is actively set
   */
  public boolean issetCountryCodeTarget () {
    return this._CountryCodeTargetSet;
  }
  /** set the fields value: CorridorPlanId (CUSTOMER_CORRIDORS.corridor_plan_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CorridorPlanId") 
  public void setCorridorPlanId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CorridorPlanId", "setCorridorPlanId");
    }
    this.CorridorPlanId = value;
    this._CorridorPlanIdSet = true;
  }

  /** Retrieves the CorridorPlanId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CorridorPlanId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CorridorPlanId field
   */
   public String getCorridorPlanIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorPlanIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorPlanIdAsFormattedString");
       return fmtMgr.formatNumber(this.getCorridorPlanId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CorridorPlanId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCorridorPlanIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the CorridorPlanId field from a formatted string
   *
   * @param _value the CorridorPlanId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CorridorPlanId field
   */
   public void setCorridorPlanIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorPlanIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCorridorPlanId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CorridorPlanId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCorridorPlanIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCorridorPlanIdFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated CorridorPlanId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CorridorPlanId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CorridorPlanId field
   */

  public String getCorridorPlanIdDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorPlanIdDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCorridorPlanIdEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorPlanIdDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getCorridorPlanId()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CorridorPlanId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCorridorPlanIdDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated CorridorPlanId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the CorridorPlanId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CorridorPlanId field
   */
  public Enumeration getCorridorPlanIdEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorPlanIdEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("CorridorPlan", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorPlanIdEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CorridorPlanId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCorridorPlanIdEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated CorridorPlanId field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setCorridorPlanIdFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCorridorPlanIdFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCorridorPlanIdEnumeration(_locale);
      this.setCorridorPlanId((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CorridorPlanId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCorridorPlanIdFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCorridorPlanIdFromDisplayValue");
  }

  /** get the value of the field: CorridorPlanId (CUSTOMER_CORRIDORS.corridor_plan_id)
   * @return Integer the value
   */
  public Integer getCorridorPlanId () {
    return this.CorridorPlanId;
  }
  /** Change the field to not being actively set: CorridorPlanId (CUSTOMER_CORRIDORS.corridor_plan_id)
   */
  public void unsetCorridorPlanId () {
    this._CorridorPlanIdSet = false;
  }
  /** See if the field is actively set: CorridorPlanId (CUSTOMER_CORRIDORS.corridor_plan_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetCorridorPlanId () {
    return this._CorridorPlanIdSet;
  }
  /** set the fields value: ActiveDt (CUSTOMER_CORRIDORS.active_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ActiveDt") 
  public void setActiveDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ActiveDt", "setActiveDt");
    }
    this.ActiveDt = value;
    this._ActiveDtSet = true;
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

  /** get the value of the field: ActiveDt (CUSTOMER_CORRIDORS.active_dt)
   * @return Date the value
   */
  public Date getActiveDt () {
    return this.ActiveDt;
  }
  /** Change the field to not being actively set: ActiveDt (CUSTOMER_CORRIDORS.active_dt)
   */
  public void unsetActiveDt () {
    this._ActiveDtSet = false;
  }
  /** See if the field is actively set: ActiveDt (CUSTOMER_CORRIDORS.active_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetActiveDt () {
    return this._ActiveDtSet;
  }
  /** set the fields value: InactiveDt (CUSTOMER_CORRIDORS.inactive_dt)
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

  /** get the value of the field: InactiveDt (CUSTOMER_CORRIDORS.inactive_dt)
   * @return Date the value
   */
  public Date getInactiveDt () {
    return this.InactiveDt;
  }
  /** Change the field to not being actively set: InactiveDt (CUSTOMER_CORRIDORS.inactive_dt)
   */
  public void unsetInactiveDt () {
    this._InactiveDtSet = false;
  }
  /** See if the field is actively set: InactiveDt (CUSTOMER_CORRIDORS.inactive_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetInactiveDt () {
    return this._InactiveDtSet;
  }
  /** set the fields value: CreateDt (CUSTOMER_CORRIDORS.create_dt)
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

  /** get the value of the field: CreateDt (CUSTOMER_CORRIDORS.create_dt)
   * @return Date the value
   */
  public Date getCreateDt () {
    return this.CreateDt;
  }
  /** Change the field to not being actively set: CreateDt (CUSTOMER_CORRIDORS.create_dt)
   */
  public void unsetCreateDt () {
    this._CreateDtSet = false;
  }
  /** See if the field is actively set: CreateDt (CUSTOMER_CORRIDORS.create_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetCreateDt () {
    return this._CreateDtSet;
  }
  /** set the fields value: ChgDt (CUSTOMER_CORRIDORS.chg_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChgDt") 
  public void setChgDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChgDt", "setChgDt");
    }
    this.ChgDt = value;
    this._ChgDtSet = true;
  }

  /** Retrieves the ChgDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChgDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDt field
   */
   public String getChgDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDtAsFormattedString");
       return fmtMgr.formatDate(this.getChgDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChgDt field from a formatted string
   *
   * @param _value the ChgDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDt field
   */
   public void setChgDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChgDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDtFromFormattedString");
   }

  /**
   * Retrieves the ChgDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDt field
   */
  public String getChgDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getChgDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDt field value from a formatted date/time string
   *
   * @param _value the ChgDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDt field
   */
  public void setChgDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setChgDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ChgDt (CUSTOMER_CORRIDORS.chg_dt)
   * @return Date the value
   */
  public Date getChgDt () {
    return this.ChgDt;
  }
  /** Change the field to not being actively set: ChgDt (CUSTOMER_CORRIDORS.chg_dt)
   */
  public void unsetChgDt () {
    this._ChgDtSet = false;
  }
  /** See if the field is actively set: ChgDt (CUSTOMER_CORRIDORS.chg_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgDt () {
    return this._ChgDtSet;
  }
  /** set the fields value: ChgWho (CUSTOMER_CORRIDORS.chg_who)
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

  /** get the value of the field: ChgWho (CUSTOMER_CORRIDORS.chg_who)
   * @return String the value
   */
  public String getChgWho () {
    return this.ChgWho;
  }
  /** Change the field to not being actively set: ChgWho (CUSTOMER_CORRIDORS.chg_who)
   */
  public void unsetChgWho () {
    this._ChgWhoSet = false;
  }
  /** See if the field is actively set: ChgWho (CUSTOMER_CORRIDORS.chg_who)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgWho () {
    return this._ChgWhoSet;
  }
  /** set the fields value: AccessRegionOrigin (CUSTOMER_CORRIDORS.access_region_origin)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccessRegionOrigin") 
  public void setAccessRegionOrigin (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 5))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AccessRegionOrigin", "setAccessRegionOrigin");
    }
    this.AccessRegionOrigin = value;
    this._AccessRegionOriginSet = true;
  }

  /** Retrieves the AccessRegionOrigin field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccessRegionOrigin field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccessRegionOrigin field
   */
   public String getAccessRegionOriginAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccessRegionOriginAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccessRegionOriginAsFormattedString");
       return fmtMgr.formatString(this.getAccessRegionOrigin());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccessRegionOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccessRegionOriginAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccessRegionOrigin field from a formatted string
   *
   * @param _value the AccessRegionOrigin field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccessRegionOrigin field
   */
   public void setAccessRegionOriginFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccessRegionOriginFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccessRegionOrigin(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccessRegionOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccessRegionOriginFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccessRegionOriginFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated AccessRegionOrigin field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AccessRegionOrigin field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccessRegionOrigin field
   */

  public String getAccessRegionOriginDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccessRegionOriginDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAccessRegionOriginEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccessRegionOriginDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getAccessRegionOrigin()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccessRegionOrigin");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccessRegionOriginDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated AccessRegionOrigin field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the AccessRegionOrigin field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccessRegionOrigin field
   */
  public Enumeration getAccessRegionOriginEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccessRegionOriginEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("AccessRegion", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccessRegionOriginEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccessRegionOrigin");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccessRegionOriginEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated AccessRegionOrigin field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setAccessRegionOriginFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccessRegionOriginFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAccessRegionOriginEnumeration(_locale);
      this.setAccessRegionOrigin((String)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), String.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccessRegionOrigin");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccessRegionOriginFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccessRegionOriginFromDisplayValue");
  }

  /** get the value of the field: AccessRegionOrigin (CUSTOMER_CORRIDORS.access_region_origin)
   * @return String the value
   */
  public String getAccessRegionOrigin () {
    return this.AccessRegionOrigin;
  }
  /** Change the field to not being actively set: AccessRegionOrigin (CUSTOMER_CORRIDORS.access_region_origin)
   */
  public void unsetAccessRegionOrigin () {
    this._AccessRegionOriginSet = false;
  }
  /** See if the field is actively set: AccessRegionOrigin (CUSTOMER_CORRIDORS.access_region_origin)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccessRegionOrigin () {
    return this._AccessRegionOriginSet;
  }
  /** set the fields value: AccessRegionTarget (CUSTOMER_CORRIDORS.access_region_target)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccessRegionTarget") 
  public void setAccessRegionTarget (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 5))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AccessRegionTarget", "setAccessRegionTarget");
    }
    this.AccessRegionTarget = value;
    this._AccessRegionTargetSet = true;
  }

  /** Retrieves the AccessRegionTarget field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccessRegionTarget field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccessRegionTarget field
   */
   public String getAccessRegionTargetAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccessRegionTargetAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccessRegionTargetAsFormattedString");
       return fmtMgr.formatString(this.getAccessRegionTarget());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccessRegionTarget");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccessRegionTargetAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccessRegionTarget field from a formatted string
   *
   * @param _value the AccessRegionTarget field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccessRegionTarget field
   */
   public void setAccessRegionTargetFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccessRegionTargetFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccessRegionTarget(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccessRegionTarget");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccessRegionTargetFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccessRegionTargetFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated AccessRegionTarget field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AccessRegionTarget field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccessRegionTarget field
   */

  public String getAccessRegionTargetDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccessRegionTargetDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAccessRegionTargetEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccessRegionTargetDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getAccessRegionTarget()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccessRegionTarget");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccessRegionTargetDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated AccessRegionTarget field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the AccessRegionTarget field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccessRegionTarget field
   */
  public Enumeration getAccessRegionTargetEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccessRegionTargetEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("AccessRegion", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccessRegionTargetEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccessRegionTarget");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccessRegionTargetEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated AccessRegionTarget field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setAccessRegionTargetFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccessRegionTargetFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAccessRegionTargetEnumeration(_locale);
      this.setAccessRegionTarget((String)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), String.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccessRegionTarget");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccessRegionTargetFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccessRegionTargetFromDisplayValue");
  }

  /** get the value of the field: AccessRegionTarget (CUSTOMER_CORRIDORS.access_region_target)
   * @return String the value
   */
  public String getAccessRegionTarget () {
    return this.AccessRegionTarget;
  }
  /** Change the field to not being actively set: AccessRegionTarget (CUSTOMER_CORRIDORS.access_region_target)
   */
  public void unsetAccessRegionTarget () {
    this._AccessRegionTargetSet = false;
  }
  /** See if the field is actively set: AccessRegionTarget (CUSTOMER_CORRIDORS.access_region_target)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccessRegionTarget () {
    return this._AccessRegionTargetSet;
  }
  /** set the fields value: OwningAccountInternalId (CUSTOMER_CORRIDORS.owning_account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OwningAccountInternalId") 
  public void setOwningAccountInternalId (Integer value) throws ServiceException
  {
    this.OwningAccountInternalId = value;
    this._OwningAccountInternalIdSet = true;
  }

  /** Retrieves the OwningAccountInternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OwningAccountInternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OwningAccountInternalId field
   */
   public String getOwningAccountInternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwningAccountInternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOwningAccountInternalIdAsFormattedString");
       return fmtMgr.formatNumber(this.getOwningAccountInternalId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OwningAccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOwningAccountInternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the OwningAccountInternalId field from a formatted string
   *
   * @param _value the OwningAccountInternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OwningAccountInternalId field
   */
   public void setOwningAccountInternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwningAccountInternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOwningAccountInternalId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OwningAccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOwningAccountInternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOwningAccountInternalIdFromFormattedString");
   }

  /** get the value of the field: OwningAccountInternalId (CUSTOMER_CORRIDORS.owning_account_no)
   * @return Integer the value
   */
  public Integer getOwningAccountInternalId () {
    return this.OwningAccountInternalId;
  }
  /** Change the field to not being actively set: OwningAccountInternalId (CUSTOMER_CORRIDORS.owning_account_no)
   */
  public void unsetOwningAccountInternalId () {
    this._OwningAccountInternalIdSet = false;
  }
  /** See if the field is actively set: OwningAccountInternalId (CUSTOMER_CORRIDORS.owning_account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetOwningAccountInternalId () {
    return this._OwningAccountInternalIdSet;
  }
  /** set the fields value: PointCategory (CUSTOMER_CORRIDORS.point_category)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PointCategory") 
  public void setPointCategory (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PointCategory", "setPointCategory");
    }
    this.PointCategory = value;
    this._PointCategorySet = true;
  }

  /** Retrieves the PointCategory field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PointCategory field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointCategory field
   */
   public String getPointCategoryAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointCategoryAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointCategoryAsFormattedString");
       return fmtMgr.formatNumber(this.getPointCategory(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointCategoryAsFormattedString");
       throw x;
     }
   }
  /** Sets the PointCategory field from a formatted string
   *
   * @param _value the PointCategory field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PointCategory field
   */
   public void setPointCategoryFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointCategoryFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPointCategory(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointCategoryFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointCategoryFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated PointCategory field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the PointCategory field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the PointCategory field
   */

  public String getPointCategoryDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointCategoryDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getPointCategoryEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointCategoryDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getPointCategory()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointCategory");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointCategoryDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated PointCategory field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the PointCategory field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the PointCategory field
   */
  public Enumeration getPointCategoryEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointCategoryEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("PointCategory", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointCategoryEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointCategory");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointCategoryEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated PointCategory field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setPointCategoryFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPointCategoryFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getPointCategoryEnumeration(_locale);
      this.setPointCategory((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointCategory");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointCategoryFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPointCategoryFromDisplayValue");
  }

  /** get the value of the field: PointCategory (CUSTOMER_CORRIDORS.point_category)
   * @return Integer the value
   */
  public Integer getPointCategory () {
    return this.PointCategory;
  }
  /** Change the field to not being actively set: PointCategory (CUSTOMER_CORRIDORS.point_category)
   */
  public void unsetPointCategory () {
    this._PointCategorySet = false;
  }
  /** See if the field is actively set: PointCategory (CUSTOMER_CORRIDORS.point_category)
   * @return boolean whether the field is actively set
   */
  public boolean issetPointCategory () {
    return this._PointCategorySet;
  }
  /** set the fields value: ServiceInternalId (CUSTOMER_CORRIDORS.subscr_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceInternalId") 
  public void setServiceInternalId (Integer value) throws ServiceException
  {
    this.ServiceInternalId = value;
    this._ServiceInternalIdSet = true;
  }

  /** Retrieves the ServiceInternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceInternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInternalId field
   */
   public String getServiceInternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInternalIdAsFormattedString");
       return fmtMgr.formatNumber(this.getServiceInternalId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceInternalId field from a formatted string
   *
   * @param _value the ServiceInternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceInternalId field
   */
   public void setServiceInternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceInternalId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInternalIdFromFormattedString");
   }

  /** get the value of the field: ServiceInternalId (CUSTOMER_CORRIDORS.subscr_no)
   * @return Integer the value
   */
  public Integer getServiceInternalId () {
    return this.ServiceInternalId;
  }
  /** Change the field to not being actively set: ServiceInternalId (CUSTOMER_CORRIDORS.subscr_no)
   */
  public void unsetServiceInternalId () {
    this._ServiceInternalIdSet = false;
  }
  /** See if the field is actively set: ServiceInternalId (CUSTOMER_CORRIDORS.subscr_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceInternalId () {
    return this._ServiceInternalIdSet;
  }
  /** set the fields value: ServiceInternalIdResets (CUSTOMER_CORRIDORS.subscr_no_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceInternalIdResets") 
  public void setServiceInternalIdResets (Integer value) throws ServiceException
  {
    this.ServiceInternalIdResets = value;
    this._ServiceInternalIdResetsSet = true;
  }

  /** Retrieves the ServiceInternalIdResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceInternalIdResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInternalIdResets field
   */
   public String getServiceInternalIdResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInternalIdResetsAsFormattedString");
       return fmtMgr.formatNumber(this.getServiceInternalIdResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceInternalIdResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInternalIdResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceInternalIdResets field from a formatted string
   *
   * @param _value the ServiceInternalIdResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceInternalIdResets field
   */
   public void setServiceInternalIdResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceInternalIdResets(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceInternalIdResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInternalIdResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInternalIdResetsFromFormattedString");
   }

  /** get the value of the field: ServiceInternalIdResets (CUSTOMER_CORRIDORS.subscr_no_resets)
   * @return Integer the value
   */
  public Integer getServiceInternalIdResets () {
    return this.ServiceInternalIdResets;
  }
  /** Change the field to not being actively set: ServiceInternalIdResets (CUSTOMER_CORRIDORS.subscr_no_resets)
   */
  public void unsetServiceInternalIdResets () {
    this._ServiceInternalIdResetsSet = false;
  }
  /** See if the field is actively set: ServiceInternalIdResets (CUSTOMER_CORRIDORS.subscr_no_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceInternalIdResets () {
    return this._ServiceInternalIdResetsSet;
  }
  /** set the fields value: PrevEndDt (CUSTOMER_CORRIDORS.prev_end_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrevEndDt") 
  public void setPrevEndDt (Date value) throws ServiceException
  {
    this.PrevEndDt = value;
    this._PrevEndDtSet = true;
  }

  /** Retrieves the PrevEndDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrevEndDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevEndDt field
   */
   public String getPrevEndDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevEndDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevEndDtAsFormattedString");
       return fmtMgr.formatDate(this.getPrevEndDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevEndDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevEndDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrevEndDt field from a formatted string
   *
   * @param _value the PrevEndDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrevEndDt field
   */
   public void setPrevEndDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevEndDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrevEndDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevEndDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevEndDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevEndDtFromFormattedString");
   }

  /**
   * Retrieves the PrevEndDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrevEndDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevEndDt field
   */
  public String getPrevEndDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevEndDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevEndDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getPrevEndDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevEndDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevEndDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PrevEndDt field value from a formatted date/time string
   *
   * @param _value the PrevEndDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrevEndDt field
   */
  public void setPrevEndDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrevEndDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setPrevEndDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevEndDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevEndDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: PrevEndDt (CUSTOMER_CORRIDORS.prev_end_dt)
   * @return Date the value
   */
  public Date getPrevEndDt () {
    return this.PrevEndDt;
  }
  /** Change the field to not being actively set: PrevEndDt (CUSTOMER_CORRIDORS.prev_end_dt)
   */
  public void unsetPrevEndDt () {
    this._PrevEndDtSet = false;
  }
  /** See if the field is actively set: PrevEndDt (CUSTOMER_CORRIDORS.prev_end_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrevEndDt () {
    return this._PrevEndDtSet;
  }
  /** set the fields value: OwningAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OwningAccountExternalId") 
  public void setOwningAccountExternalId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OwningAccountExternalId", "setOwningAccountExternalId");
    }
    if (value != null && !DataHelper.validLength (value, 144))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "OwningAccountExternalId", "setOwningAccountExternalId");
    }
    this.OwningAccountExternalId = value;
    this._OwningAccountExternalIdSet = true;
  }

  /** Retrieves the OwningAccountExternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OwningAccountExternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OwningAccountExternalId field
   */
   public String getOwningAccountExternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwningAccountExternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOwningAccountExternalIdAsFormattedString");
       return fmtMgr.formatString(this.getOwningAccountExternalId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OwningAccountExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOwningAccountExternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the OwningAccountExternalId field from a formatted string
   *
   * @param _value the OwningAccountExternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OwningAccountExternalId field
   */
   public void setOwningAccountExternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwningAccountExternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOwningAccountExternalId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OwningAccountExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOwningAccountExternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOwningAccountExternalIdFromFormattedString");
   }

  /** get the value of the field: OwningAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return String the value
   */
  public String getOwningAccountExternalId () {
    return this.OwningAccountExternalId;
  }
  /** Change the field to not being actively set: OwningAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   */
  public void unsetOwningAccountExternalId () {
    this._OwningAccountExternalIdSet = false;
  }
  /** See if the field is actively set: OwningAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetOwningAccountExternalId () {
    return this._OwningAccountExternalIdSet;
  }
  /** set the fields value: OwningAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OwningAccountExternalIdType") 
  public void setOwningAccountExternalIdType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OwningAccountExternalIdType", "setOwningAccountExternalIdType");
    }
    this.OwningAccountExternalIdType = value;
    this._OwningAccountExternalIdTypeSet = true;
  }

  /** Retrieves the OwningAccountExternalIdType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OwningAccountExternalIdType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OwningAccountExternalIdType field
   */
   public String getOwningAccountExternalIdTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwningAccountExternalIdTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOwningAccountExternalIdTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getOwningAccountExternalIdType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OwningAccountExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOwningAccountExternalIdTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the OwningAccountExternalIdType field from a formatted string
   *
   * @param _value the OwningAccountExternalIdType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OwningAccountExternalIdType field
   */
   public void setOwningAccountExternalIdTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwningAccountExternalIdTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOwningAccountExternalIdType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OwningAccountExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOwningAccountExternalIdTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOwningAccountExternalIdTypeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated OwningAccountExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the OwningAccountExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the OwningAccountExternalIdType field
   */

  public String getOwningAccountExternalIdTypeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwningAccountExternalIdTypeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getOwningAccountExternalIdTypeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOwningAccountExternalIdTypeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getOwningAccountExternalIdType()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OwningAccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOwningAccountExternalIdTypeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated OwningAccountExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the OwningAccountExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the OwningAccountExternalIdType field
   */
  public Enumeration getOwningAccountExternalIdTypeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwningAccountExternalIdTypeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ExternalIdType", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOwningAccountExternalIdTypeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OwningAccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOwningAccountExternalIdTypeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated OwningAccountExternalIdType field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setOwningAccountExternalIdTypeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOwningAccountExternalIdTypeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getOwningAccountExternalIdTypeEnumeration(_locale);
      this.setOwningAccountExternalIdType((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OwningAccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOwningAccountExternalIdTypeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOwningAccountExternalIdTypeFromDisplayValue");
  }

  /** get the value of the field: OwningAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return Integer the value
   */
  public Integer getOwningAccountExternalIdType () {
    return this.OwningAccountExternalIdType;
  }
  /** Change the field to not being actively set: OwningAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   */
  public void unsetOwningAccountExternalIdType () {
    this._OwningAccountExternalIdTypeSet = false;
  }
  /** See if the field is actively set: OwningAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetOwningAccountExternalIdType () {
    return this._OwningAccountExternalIdTypeSet;
  }
  public String toString() {
    return CorridorObjectHelper.toMap(this, null).toString();
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
  /** CORRIDOR_PLAN_ID_REF.is_icb_corridor field */
    if(!nonNullOnly || (IsIcbCorridor != null))  _IsIcbCorridorSet = flag;
  /** CORRIDOR_PLAN_ID_REF.plan_type field */
    if(!nonNullOnly || (PlanType != null))  _PlanTypeSet = flag;
  /** CORRIDOR_PLAN_ID_REF.plan_level field */
    if(!nonNullOnly || (PlanLevel != null))  _PlanLevelSet = flag;
  /** CORRIDOR_PLAN_ID_REF.origin_restriction field */
    if(!nonNullOnly || (OriginRestriction != null))  _OriginRestrictionSet = flag;
  /** CORRIDOR_PLAN_ID_REF.target_restriction field */
    if(!nonNullOnly || (TargetRestriction != null))  _TargetRestrictionSet = flag;
  /** CORRIDOR_PLAN_ID_REF.discount_id field */
    if(!nonNullOnly || (DiscountId != null))  _DiscountIdSet = flag;
  /** CORRIDOR_PLAN_ID_REF.max_corridors field */
    if(!nonNullOnly || (MaxCorridors != null))  _MaxCorridorsSet = flag;
  /** CORRIDOR_PLAN_ID_REF.is_default field */
    if(!nonNullOnly || (IsDefault != null))  _IsDefaultSet = flag;
  /** CORRIDOR_PLAN_ID_REF.is_internal field */
    if(!nonNullOnly || (IsInternal != null))  _IsInternalSet = flag;
  /** CORRIDOR_PLAN_ID_REF.priority field */
    if(!nonNullOnly || (Priority != null))  _PrioritySet = flag;
  /** CORRIDOR_PLAN_ID_VALUES.short_display field */
    if(!nonNullOnly || (ShortDisplay != null))  _ShortDisplaySet = flag;
  /** CORRIDOR_PLAN_ID_VALUES.display_value field */
    if(!nonNullOnly || (DisplayValue != null))  _DisplayValueSet = flag;
  /** CUSTOMER_CORRIDORS.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  /** CUSTOMER_CORRIDORS.point_origin field */
    if(!nonNullOnly || (PointOrigin != null))  _PointOriginSet = flag;
  /** CUSTOMER_CORRIDORS.origin_is_xact field */
    if(!nonNullOnly || (OriginIsXact != null))  _OriginIsXactSet = flag;
  /** CUSTOMER_CORRIDORS.country_code_origin field */
    if(!nonNullOnly || (CountryCodeOrigin != null))  _CountryCodeOriginSet = flag;
  /** CUSTOMER_CORRIDORS.point_target field */
    if(!nonNullOnly || (PointTarget != null))  _PointTargetSet = flag;
  /** CUSTOMER_CORRIDORS.target_is_xact field */
    if(!nonNullOnly || (TargetIsXact != null))  _TargetIsXactSet = flag;
  /** CUSTOMER_CORRIDORS.country_code_target field */
    if(!nonNullOnly || (CountryCodeTarget != null))  _CountryCodeTargetSet = flag;
  /** CUSTOMER_CORRIDORS.corridor_plan_id field */
    if(!nonNullOnly || (CorridorPlanId != null))  _CorridorPlanIdSet = flag;
  /** CUSTOMER_CORRIDORS.active_dt field */
    if(!nonNullOnly || (ActiveDt != null))  _ActiveDtSet = flag;
  /** CUSTOMER_CORRIDORS.inactive_dt field */
    if(!nonNullOnly || (InactiveDt != null))  _InactiveDtSet = flag;
  /** CUSTOMER_CORRIDORS.create_dt field */
    if(!nonNullOnly || (CreateDt != null))  _CreateDtSet = flag;
  /** CUSTOMER_CORRIDORS.chg_dt field */
    if(!nonNullOnly || (ChgDt != null))  _ChgDtSet = flag;
  /** CUSTOMER_CORRIDORS.chg_who field */
    if(!nonNullOnly || (ChgWho != null))  _ChgWhoSet = flag;
  /** CUSTOMER_CORRIDORS.access_region_origin field */
    if(!nonNullOnly || (AccessRegionOrigin != null))  _AccessRegionOriginSet = flag;
  /** CUSTOMER_CORRIDORS.access_region_target field */
    if(!nonNullOnly || (AccessRegionTarget != null))  _AccessRegionTargetSet = flag;
  /** CUSTOMER_CORRIDORS.owning_account_no field */
    if(!nonNullOnly || (OwningAccountInternalId != null))  _OwningAccountInternalIdSet = flag;
  /** CUSTOMER_CORRIDORS.point_category field */
    if(!nonNullOnly || (PointCategory != null))  _PointCategorySet = flag;
  /** CUSTOMER_CORRIDORS.subscr_no field */
    if(!nonNullOnly || (ServiceInternalId != null))  _ServiceInternalIdSet = flag;
  /** CUSTOMER_CORRIDORS.subscr_no_resets field */
    if(!nonNullOnly || (ServiceInternalIdResets != null))  _ServiceInternalIdResetsSet = flag;
  /** CUSTOMER_CORRIDORS.prev_end_dt field */
    if(!nonNullOnly || (PrevEndDt != null))  _PrevEndDtSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
    if(!nonNullOnly || (OwningAccountExternalId != null))  _OwningAccountExternalIdSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
    if(!nonNullOnly || (OwningAccountExternalIdType != null))  _OwningAccountExternalIdTypeSet = flag;
  }
}
