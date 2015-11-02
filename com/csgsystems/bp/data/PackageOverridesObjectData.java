/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PackageOverridesObjectData.java
 * Definition File: Customer/CmfPackageOverrides.xml
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
  
/** PackageOverridesObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class PackageOverridesObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public PackageOverridesObjectKeyData Key = null;
  /** CMF_PACKAGE_OVERRIDES.component_id field */
  public    Integer ComponentId  = null;
  protected boolean _ComponentIdSet = false;
  /** CMF_PACKAGE_OVERRIDES.member_id field */
  public    Integer MemberId  = null;
  protected boolean _MemberIdSet = false;
  /** CMF_PACKAGE_OVERRIDES.override_rate_level field */
  public    BigInteger OverrideRateLevel  = null;
  protected boolean _OverrideRateLevelSet = false;
  /** CMF_PACKAGE_OVERRIDES.override_rate_status field */
  public    BigInteger OverrideRateStatus  = null;
  protected boolean _OverrideRateStatusSet = false;
  /** CMF_PACKAGE_OVERRIDES.override_rate_rc field */
  public    BigInteger OverrideRateRc  = null;
  protected boolean _OverrideRateRcSet = false;
  /** CMF_PACKAGE_OVERRIDES.override_rate_nrc field */
  public    BigInteger OverrideRateNrc  = null;
  protected boolean _OverrideRateNrcSet = false;
  /** CMF_PACKAGE_OVERRIDES.override_usg_charge_amt field */
  public    BigInteger OverrideUsgChargeAmt  = null;
  protected boolean _OverrideUsgChargeAmtSet = false;
  /** CMF_PACKAGE_OVERRIDES.override_usg_fixed_amt field */
  public    Integer OverrideUsgFixedAmt  = null;
  protected boolean _OverrideUsgFixedAmtSet = false;
  /** CMF_PACKAGE_OVERRIDES.override_usg_unit field */
  public    Integer OverrideUsgUnit  = null;
  protected boolean _OverrideUsgUnitSet = false;
  /** CMF_PACKAGE_OVERRIDES.active_date field */
  public    Date ActiveDate  = null;
  protected boolean _ActiveDateSet = false;
  /** CMF_PACKAGE_OVERRIDES.inactive_date field */
  public    Date InactiveDate  = null;
  protected boolean _InactiveDateSet = false;
  /** CMF_PACKAGE_OVERRIDES.chg_who field */
  public    String ChgWho  = null;
  protected boolean _ChgWhoSet = false;
  /** CMF_PACKAGE_OVERRIDES.chg_date field */
  public    Date ChgDate  = null;
  protected boolean _ChgDateSet = false;
  private String _objName = "PackageOverridesObjectData";
  /** Default constructor */
  public PackageOverridesObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public PackageOverridesObjectData (PackageOverridesObjectData other)
  {

    if (other == null) return;
    this.Key = new PackageOverridesObjectKeyData (other.Key);
    this.ComponentId = other.ComponentId;
    this._ComponentIdSet = other._ComponentIdSet;
    this.MemberId = other.MemberId;
    this._MemberIdSet = other._MemberIdSet;
    this.OverrideRateLevel = other.OverrideRateLevel;
    this._OverrideRateLevelSet = other._OverrideRateLevelSet;
    this.OverrideRateStatus = other.OverrideRateStatus;
    this._OverrideRateStatusSet = other._OverrideRateStatusSet;
    this.OverrideRateRc = other.OverrideRateRc;
    this._OverrideRateRcSet = other._OverrideRateRcSet;
    this.OverrideRateNrc = other.OverrideRateNrc;
    this._OverrideRateNrcSet = other._OverrideRateNrcSet;
    this.OverrideUsgChargeAmt = other.OverrideUsgChargeAmt;
    this._OverrideUsgChargeAmtSet = other._OverrideUsgChargeAmtSet;
    this.OverrideUsgFixedAmt = other.OverrideUsgFixedAmt;
    this._OverrideUsgFixedAmtSet = other._OverrideUsgFixedAmtSet;
    this.OverrideUsgUnit = other.OverrideUsgUnit;
    this._OverrideUsgUnitSet = other._OverrideUsgUnitSet;
    this.ActiveDate = other.ActiveDate;
    this._ActiveDateSet = other._ActiveDateSet;
    this.InactiveDate = other.InactiveDate;
    this._InactiveDateSet = other._InactiveDateSet;
    this.ChgWho = other.ChgWho;
    this._ChgWhoSet = other._ChgWhoSet;
    this.ChgDate = other.ChgDate;
    this._ChgDateSet = other._ChgDateSet;
  }

  /** get the Key for this object
   * @return PackageOverridesObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public PackageOverridesObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (PackageOverridesObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: ParentAccountInternalId (CMF_PACKAGE_OVERRIDES.parent_account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setParentAccountInternalId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ParentAccountInternalId", "setParentAccountInternalId");
    }
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyData ();
    this.Key.ParentAccountInternalId = value;
    this.Key._ParentAccountInternalIdSet = true;
  }
  /** get the value of the field: ParentAccountInternalId (CMF_PACKAGE_OVERRIDES.parent_account_no)
   * @return Integer the value
   */
  public Integer getParentAccountInternalId () {
    if (this.Key == null) return null;
    return this.Key.ParentAccountInternalId;
  }
  /** Change the field to not being actively set: ParentAccountInternalId (CMF_PACKAGE_OVERRIDES.parent_account_no)
   */
  public void unsetParentAccountInternalId () {
    if (this.Key == null) return;
    this.Key._ParentAccountInternalIdSet = false;
  }
  /** See if the field is actively set: ParentAccountInternalId (CMF_PACKAGE_OVERRIDES.parent_account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetParentAccountInternalId () {
    if (this.Key == null) return false;
    return this.Key._ParentAccountInternalIdSet;
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

  /** set the fields value: PackageInstId (CMF_PACKAGE_OVERRIDES.package_inst_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPackageInstId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PackageInstId", "setPackageInstId");
    }
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyData ();
    this.Key.PackageInstId = value;
    this.Key._PackageInstIdSet = true;
  }
  /** get the value of the field: PackageInstId (CMF_PACKAGE_OVERRIDES.package_inst_id)
   * @return Integer the value
   */
  public Integer getPackageInstId () {
    if (this.Key == null) return null;
    return this.Key.PackageInstId;
  }
  /** Change the field to not being actively set: PackageInstId (CMF_PACKAGE_OVERRIDES.package_inst_id)
   */
  public void unsetPackageInstId () {
    if (this.Key == null) return;
    this.Key._PackageInstIdSet = false;
  }
  /** See if the field is actively set: PackageInstId (CMF_PACKAGE_OVERRIDES.package_inst_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetPackageInstId () {
    if (this.Key == null) return false;
    return this.Key._PackageInstIdSet;
  }

  /** Retrieves the PackageInstId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PackageInstId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PackageInstId field
   */
   public String getPackageInstIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageInstIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPackageInstIdAsFormattedString");
       return fmtMgr.formatNumber(this.getPackageInstId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PackageInstId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPackageInstIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the PackageInstId field from a formatted string
   *
   * @param _value the PackageInstId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PackageInstId field
   */
   public void setPackageInstIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageInstIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPackageInstId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PackageInstId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPackageInstIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPackageInstIdFromFormattedString");
   }

  /** set the fields value: PackageInstIdServ (CMF_PACKAGE_OVERRIDES.package_inst_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPackageInstIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PackageInstIdServ", "setPackageInstIdServ");
    }
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyData ();
    this.Key.PackageInstIdServ = value;
    this.Key._PackageInstIdServSet = true;
  }
  /** get the value of the field: PackageInstIdServ (CMF_PACKAGE_OVERRIDES.package_inst_id_serv)
   * @return Integer the value
   */
  public Integer getPackageInstIdServ () {
    if (this.Key == null) return null;
    return this.Key.PackageInstIdServ;
  }
  /** Change the field to not being actively set: PackageInstIdServ (CMF_PACKAGE_OVERRIDES.package_inst_id_serv)
   */
  public void unsetPackageInstIdServ () {
    if (this.Key == null) return;
    this.Key._PackageInstIdServSet = false;
  }
  /** See if the field is actively set: PackageInstIdServ (CMF_PACKAGE_OVERRIDES.package_inst_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetPackageInstIdServ () {
    if (this.Key == null) return false;
    return this.Key._PackageInstIdServSet;
  }

  /** Retrieves the PackageInstIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PackageInstIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PackageInstIdServ field
   */
   public String getPackageInstIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageInstIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPackageInstIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getPackageInstIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PackageInstIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPackageInstIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the PackageInstIdServ field from a formatted string
   *
   * @param _value the PackageInstIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PackageInstIdServ field
   */
   public void setPackageInstIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageInstIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPackageInstIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PackageInstIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPackageInstIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPackageInstIdServFromFormattedString");
   }

  /** set the fields value: PackageId (CMF_PACKAGE_OVERRIDES.package_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPackageId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PackageId", "setPackageId");
    }
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyData ();
    this.Key.PackageId = value;
    this.Key._PackageIdSet = true;
  }
  /** get the value of the field: PackageId (CMF_PACKAGE_OVERRIDES.package_id)
   * @return Integer the value
   */
  public Integer getPackageId () {
    if (this.Key == null) return null;
    return this.Key.PackageId;
  }
  /** Change the field to not being actively set: PackageId (CMF_PACKAGE_OVERRIDES.package_id)
   */
  public void unsetPackageId () {
    if (this.Key == null) return;
    this.Key._PackageIdSet = false;
  }
  /** See if the field is actively set: PackageId (CMF_PACKAGE_OVERRIDES.package_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetPackageId () {
    if (this.Key == null) return false;
    return this.Key._PackageIdSet;
  }

  /** Retrieves the PackageId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PackageId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PackageId field
   */
   public String getPackageIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPackageIdAsFormattedString");
       return fmtMgr.formatNumber(this.getPackageId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PackageId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPackageIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the PackageId field from a formatted string
   *
   * @param _value the PackageId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PackageId field
   */
   public void setPackageIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPackageId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PackageId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPackageIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPackageIdFromFormattedString");
   }

  /** set the fields value: AssociationId (CMF_PACKAGE_OVERRIDES.association_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAssociationId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AssociationId", "setAssociationId");
    }
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyData ();
    this.Key.AssociationId = value;
    this.Key._AssociationIdSet = true;
  }
  /** get the value of the field: AssociationId (CMF_PACKAGE_OVERRIDES.association_id)
   * @return Integer the value
   */
  public Integer getAssociationId () {
    if (this.Key == null) return null;
    return this.Key.AssociationId;
  }
  /** Change the field to not being actively set: AssociationId (CMF_PACKAGE_OVERRIDES.association_id)
   */
  public void unsetAssociationId () {
    if (this.Key == null) return;
    this.Key._AssociationIdSet = false;
  }
  /** See if the field is actively set: AssociationId (CMF_PACKAGE_OVERRIDES.association_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAssociationId () {
    if (this.Key == null) return false;
    return this.Key._AssociationIdSet;
  }

  /** Retrieves the AssociationId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AssociationId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AssociationId field
   */
   public String getAssociationIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAssociationIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAssociationIdAsFormattedString");
       return fmtMgr.formatNumber(this.getAssociationId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AssociationId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAssociationIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AssociationId field from a formatted string
   *
   * @param _value the AssociationId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AssociationId field
   */
   public void setAssociationIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAssociationIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAssociationId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AssociationId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAssociationIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAssociationIdFromFormattedString");
   }

  /** set the fields value: AssociationType (CMF_PACKAGE_OVERRIDES.association_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAssociationType (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AssociationType", "setAssociationType");
    }
    if (value != null && !DataHelper.validLength (value, 1))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AssociationType", "setAssociationType");
    }
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyData ();
    this.Key.AssociationType = value;
    this.Key._AssociationTypeSet = true;
  }
  /** get the value of the field: AssociationType (CMF_PACKAGE_OVERRIDES.association_type)
   * @return BigInteger the value
   */
  public BigInteger getAssociationType () {
    if (this.Key == null) return null;
    return this.Key.AssociationType;
  }
  /** Change the field to not being actively set: AssociationType (CMF_PACKAGE_OVERRIDES.association_type)
   */
  public void unsetAssociationType () {
    if (this.Key == null) return;
    this.Key._AssociationTypeSet = false;
  }
  /** See if the field is actively set: AssociationType (CMF_PACKAGE_OVERRIDES.association_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetAssociationType () {
    if (this.Key == null) return false;
    return this.Key._AssociationTypeSet;
  }

  /** Retrieves the AssociationType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AssociationType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AssociationType field
   */
   public String getAssociationTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAssociationTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAssociationTypeAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAssociationType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AssociationType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAssociationTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the AssociationType field from a formatted string
   *
   * @param _value the AssociationType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AssociationType field
   */
   public void setAssociationTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAssociationTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAssociationType(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AssociationType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAssociationTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAssociationTypeFromFormattedString");
   }

  /** set the fields value: CurrencyCode (CMF_PACKAGE_OVERRIDES.currency_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCurrencyCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CurrencyCode", "setCurrencyCode");
    }
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyData ();
    this.Key.CurrencyCode = value;
    this.Key._CurrencyCodeSet = true;
  }
  /** get the value of the field: CurrencyCode (CMF_PACKAGE_OVERRIDES.currency_code)
   * @return Integer the value
   */
  public Integer getCurrencyCode () {
    if (this.Key == null) return null;
    return this.Key.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (CMF_PACKAGE_OVERRIDES.currency_code)
   */
  public void unsetCurrencyCode () {
    if (this.Key == null) return;
    this.Key._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (CMF_PACKAGE_OVERRIDES.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode () {
    if (this.Key == null) return false;
    return this.Key._CurrencyCodeSet;
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

  /** set the fields value: ComponentId (CMF_PACKAGE_OVERRIDES.component_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ComponentId") 
  public void setComponentId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ComponentId", "setComponentId");
    }
    this.ComponentId = value;
    this._ComponentIdSet = true;
  }

  /** Retrieves the ComponentId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ComponentId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ComponentId field
   */
   public String getComponentIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getComponentIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getComponentIdAsFormattedString");
       return fmtMgr.formatNumber(this.getComponentId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ComponentId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getComponentIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ComponentId field from a formatted string
   *
   * @param _value the ComponentId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ComponentId field
   */
   public void setComponentIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getComponentIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setComponentId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ComponentId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setComponentIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setComponentIdFromFormattedString");
   }

  /** get the value of the field: ComponentId (CMF_PACKAGE_OVERRIDES.component_id)
   * @return Integer the value
   */
  public Integer getComponentId () {
    return this.ComponentId;
  }
  /** Change the field to not being actively set: ComponentId (CMF_PACKAGE_OVERRIDES.component_id)
   */
  public void unsetComponentId () {
    this._ComponentIdSet = false;
  }
  /** See if the field is actively set: ComponentId (CMF_PACKAGE_OVERRIDES.component_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetComponentId () {
    return this._ComponentIdSet;
  }
  /** set the fields value: MemberId (CMF_PACKAGE_OVERRIDES.member_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MemberId") 
  public void setMemberId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MemberId", "setMemberId");
    }
    this.MemberId = value;
    this._MemberIdSet = true;
  }

  /** Retrieves the MemberId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MemberId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MemberId field
   */
   public String getMemberIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMemberIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMemberIdAsFormattedString");
       return fmtMgr.formatNumber(this.getMemberId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MemberId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMemberIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the MemberId field from a formatted string
   *
   * @param _value the MemberId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MemberId field
   */
   public void setMemberIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMemberIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMemberId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MemberId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMemberIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMemberIdFromFormattedString");
   }

  /** get the value of the field: MemberId (CMF_PACKAGE_OVERRIDES.member_id)
   * @return Integer the value
   */
  public Integer getMemberId () {
    return this.MemberId;
  }
  /** Change the field to not being actively set: MemberId (CMF_PACKAGE_OVERRIDES.member_id)
   */
  public void unsetMemberId () {
    this._MemberIdSet = false;
  }
  /** See if the field is actively set: MemberId (CMF_PACKAGE_OVERRIDES.member_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetMemberId () {
    return this._MemberIdSet;
  }
  /** set the fields value: OverrideRateLevel (CMF_PACKAGE_OVERRIDES.override_rate_level)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OverrideRateLevel") 
  public void setOverrideRateLevel (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OverrideRateLevel", "setOverrideRateLevel");
    }
    if (value != null && !DataHelper.validLength (value, 1))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "OverrideRateLevel", "setOverrideRateLevel");
    }
    this.OverrideRateLevel = value;
    this._OverrideRateLevelSet = true;
  }

  /** Retrieves the OverrideRateLevel field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OverrideRateLevel field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OverrideRateLevel field
   */
   public String getOverrideRateLevelAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideRateLevelAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideRateLevelAsFormattedString");
       return fmtMgr.formatBigInteger(this.getOverrideRateLevel(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OverrideRateLevel");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOverrideRateLevelAsFormattedString");
       throw x;
     }
   }
  /** Sets the OverrideRateLevel field from a formatted string
   *
   * @param _value the OverrideRateLevel field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OverrideRateLevel field
   */
   public void setOverrideRateLevelFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideRateLevelFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOverrideRateLevel(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OverrideRateLevel");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOverrideRateLevelFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOverrideRateLevelFromFormattedString");
   }

  /** get the value of the field: OverrideRateLevel (CMF_PACKAGE_OVERRIDES.override_rate_level)
   * @return BigInteger the value
   */
  public BigInteger getOverrideRateLevel () {
    return this.OverrideRateLevel;
  }
  /** Change the field to not being actively set: OverrideRateLevel (CMF_PACKAGE_OVERRIDES.override_rate_level)
   */
  public void unsetOverrideRateLevel () {
    this._OverrideRateLevelSet = false;
  }
  /** See if the field is actively set: OverrideRateLevel (CMF_PACKAGE_OVERRIDES.override_rate_level)
   * @return boolean whether the field is actively set
   */
  public boolean issetOverrideRateLevel () {
    return this._OverrideRateLevelSet;
  }
  /** set the fields value: OverrideRateStatus (CMF_PACKAGE_OVERRIDES.override_rate_status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OverrideRateStatus") 
  public void setOverrideRateStatus (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OverrideRateStatus", "setOverrideRateStatus");
    }
    if (value != null && !DataHelper.validLength (value, 1))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "OverrideRateStatus", "setOverrideRateStatus");
    }
    this.OverrideRateStatus = value;
    this._OverrideRateStatusSet = true;
  }

  /** Retrieves the OverrideRateStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OverrideRateStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OverrideRateStatus field
   */
   public String getOverrideRateStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideRateStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideRateStatusAsFormattedString");
       return fmtMgr.formatBigInteger(this.getOverrideRateStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OverrideRateStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOverrideRateStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the OverrideRateStatus field from a formatted string
   *
   * @param _value the OverrideRateStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OverrideRateStatus field
   */
   public void setOverrideRateStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideRateStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOverrideRateStatus(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OverrideRateStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOverrideRateStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOverrideRateStatusFromFormattedString");
   }

  /** get the value of the field: OverrideRateStatus (CMF_PACKAGE_OVERRIDES.override_rate_status)
   * @return BigInteger the value
   */
  public BigInteger getOverrideRateStatus () {
    return this.OverrideRateStatus;
  }
  /** Change the field to not being actively set: OverrideRateStatus (CMF_PACKAGE_OVERRIDES.override_rate_status)
   */
  public void unsetOverrideRateStatus () {
    this._OverrideRateStatusSet = false;
  }
  /** See if the field is actively set: OverrideRateStatus (CMF_PACKAGE_OVERRIDES.override_rate_status)
   * @return boolean whether the field is actively set
   */
  public boolean issetOverrideRateStatus () {
    return this._OverrideRateStatusSet;
  }
  /** set the fields value: OverrideRateRc (CMF_PACKAGE_OVERRIDES.override_rate_rc)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OverrideRateRc") 
  public void setOverrideRateRc (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OverrideRateRc", "setOverrideRateRc");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "OverrideRateRc", "setOverrideRateRc");
    }
    this.OverrideRateRc = value;
    this._OverrideRateRcSet = true;
  }

  /** Retrieves the OverrideRateRc field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OverrideRateRc field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OverrideRateRc field
   */
   public String getOverrideRateRcAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideRateRcAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideRateRcAsFormattedString");
       return fmtMgr.formatBigInteger(this.getOverrideRateRc(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OverrideRateRc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOverrideRateRcAsFormattedString");
       throw x;
     }
   }
  /** Sets the OverrideRateRc field from a formatted string
   *
   * @param _value the OverrideRateRc field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OverrideRateRc field
   */
   public void setOverrideRateRcFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideRateRcFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOverrideRateRc(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OverrideRateRc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOverrideRateRcFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOverrideRateRcFromFormattedString");
   }

  /** get the value of the field: OverrideRateRc (CMF_PACKAGE_OVERRIDES.override_rate_rc)
   * @return BigInteger the value
   */
  public BigInteger getOverrideRateRc () {
    return this.OverrideRateRc;
  }
  /** Change the field to not being actively set: OverrideRateRc (CMF_PACKAGE_OVERRIDES.override_rate_rc)
   */
  public void unsetOverrideRateRc () {
    this._OverrideRateRcSet = false;
  }
  /** See if the field is actively set: OverrideRateRc (CMF_PACKAGE_OVERRIDES.override_rate_rc)
   * @return boolean whether the field is actively set
   */
  public boolean issetOverrideRateRc () {
    return this._OverrideRateRcSet;
  }
  /** set the fields value: OverrideRateNrc (CMF_PACKAGE_OVERRIDES.override_rate_nrc)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OverrideRateNrc") 
  public void setOverrideRateNrc (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OverrideRateNrc", "setOverrideRateNrc");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "OverrideRateNrc", "setOverrideRateNrc");
    }
    this.OverrideRateNrc = value;
    this._OverrideRateNrcSet = true;
  }

  /** Retrieves the OverrideRateNrc field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OverrideRateNrc field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OverrideRateNrc field
   */
   public String getOverrideRateNrcAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideRateNrcAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideRateNrcAsFormattedString");
       return fmtMgr.formatBigInteger(this.getOverrideRateNrc(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OverrideRateNrc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOverrideRateNrcAsFormattedString");
       throw x;
     }
   }
  /** Sets the OverrideRateNrc field from a formatted string
   *
   * @param _value the OverrideRateNrc field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OverrideRateNrc field
   */
   public void setOverrideRateNrcFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideRateNrcFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOverrideRateNrc(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OverrideRateNrc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOverrideRateNrcFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOverrideRateNrcFromFormattedString");
   }

  /** get the value of the field: OverrideRateNrc (CMF_PACKAGE_OVERRIDES.override_rate_nrc)
   * @return BigInteger the value
   */
  public BigInteger getOverrideRateNrc () {
    return this.OverrideRateNrc;
  }
  /** Change the field to not being actively set: OverrideRateNrc (CMF_PACKAGE_OVERRIDES.override_rate_nrc)
   */
  public void unsetOverrideRateNrc () {
    this._OverrideRateNrcSet = false;
  }
  /** See if the field is actively set: OverrideRateNrc (CMF_PACKAGE_OVERRIDES.override_rate_nrc)
   * @return boolean whether the field is actively set
   */
  public boolean issetOverrideRateNrc () {
    return this._OverrideRateNrcSet;
  }
  /** set the fields value: OverrideUsgChargeAmt (CMF_PACKAGE_OVERRIDES.override_usg_charge_amt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OverrideUsgChargeAmt") 
  public void setOverrideUsgChargeAmt (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OverrideUsgChargeAmt", "setOverrideUsgChargeAmt");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "OverrideUsgChargeAmt", "setOverrideUsgChargeAmt");
    }
    this.OverrideUsgChargeAmt = value;
    this._OverrideUsgChargeAmtSet = true;
  }

  /** Retrieves the OverrideUsgChargeAmt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OverrideUsgChargeAmt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OverrideUsgChargeAmt field
   */
   public String getOverrideUsgChargeAmtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideUsgChargeAmtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideUsgChargeAmtAsFormattedString");
       return fmtMgr.formatBigInteger(this.getOverrideUsgChargeAmt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OverrideUsgChargeAmt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOverrideUsgChargeAmtAsFormattedString");
       throw x;
     }
   }
  /** Sets the OverrideUsgChargeAmt field from a formatted string
   *
   * @param _value the OverrideUsgChargeAmt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OverrideUsgChargeAmt field
   */
   public void setOverrideUsgChargeAmtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideUsgChargeAmtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOverrideUsgChargeAmt(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OverrideUsgChargeAmt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOverrideUsgChargeAmtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOverrideUsgChargeAmtFromFormattedString");
   }

  /** get the value of the field: OverrideUsgChargeAmt (CMF_PACKAGE_OVERRIDES.override_usg_charge_amt)
   * @return BigInteger the value
   */
  public BigInteger getOverrideUsgChargeAmt () {
    return this.OverrideUsgChargeAmt;
  }
  /** Change the field to not being actively set: OverrideUsgChargeAmt (CMF_PACKAGE_OVERRIDES.override_usg_charge_amt)
   */
  public void unsetOverrideUsgChargeAmt () {
    this._OverrideUsgChargeAmtSet = false;
  }
  /** See if the field is actively set: OverrideUsgChargeAmt (CMF_PACKAGE_OVERRIDES.override_usg_charge_amt)
   * @return boolean whether the field is actively set
   */
  public boolean issetOverrideUsgChargeAmt () {
    return this._OverrideUsgChargeAmtSet;
  }
  /** set the fields value: OverrideUsgFixedAmt (CMF_PACKAGE_OVERRIDES.override_usg_fixed_amt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OverrideUsgFixedAmt") 
  public void setOverrideUsgFixedAmt (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OverrideUsgFixedAmt", "setOverrideUsgFixedAmt");
    }
    this.OverrideUsgFixedAmt = value;
    this._OverrideUsgFixedAmtSet = true;
  }

  /** Retrieves the OverrideUsgFixedAmt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OverrideUsgFixedAmt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OverrideUsgFixedAmt field
   */
   public String getOverrideUsgFixedAmtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideUsgFixedAmtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideUsgFixedAmtAsFormattedString");
       return fmtMgr.formatNumber(this.getOverrideUsgFixedAmt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OverrideUsgFixedAmt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOverrideUsgFixedAmtAsFormattedString");
       throw x;
     }
   }
  /** Sets the OverrideUsgFixedAmt field from a formatted string
   *
   * @param _value the OverrideUsgFixedAmt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OverrideUsgFixedAmt field
   */
   public void setOverrideUsgFixedAmtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideUsgFixedAmtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOverrideUsgFixedAmt(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OverrideUsgFixedAmt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOverrideUsgFixedAmtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOverrideUsgFixedAmtFromFormattedString");
   }

  /** get the value of the field: OverrideUsgFixedAmt (CMF_PACKAGE_OVERRIDES.override_usg_fixed_amt)
   * @return Integer the value
   */
  public Integer getOverrideUsgFixedAmt () {
    return this.OverrideUsgFixedAmt;
  }
  /** Change the field to not being actively set: OverrideUsgFixedAmt (CMF_PACKAGE_OVERRIDES.override_usg_fixed_amt)
   */
  public void unsetOverrideUsgFixedAmt () {
    this._OverrideUsgFixedAmtSet = false;
  }
  /** See if the field is actively set: OverrideUsgFixedAmt (CMF_PACKAGE_OVERRIDES.override_usg_fixed_amt)
   * @return boolean whether the field is actively set
   */
  public boolean issetOverrideUsgFixedAmt () {
    return this._OverrideUsgFixedAmtSet;
  }
  /** set the fields value: OverrideUsgUnit (CMF_PACKAGE_OVERRIDES.override_usg_unit)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OverrideUsgUnit") 
  public void setOverrideUsgUnit (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OverrideUsgUnit", "setOverrideUsgUnit");
    }
    this.OverrideUsgUnit = value;
    this._OverrideUsgUnitSet = true;
  }

  /** Retrieves the OverrideUsgUnit field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OverrideUsgUnit field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OverrideUsgUnit field
   */
   public String getOverrideUsgUnitAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideUsgUnitAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideUsgUnitAsFormattedString");
       return fmtMgr.formatNumber(this.getOverrideUsgUnit(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OverrideUsgUnit");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOverrideUsgUnitAsFormattedString");
       throw x;
     }
   }
  /** Sets the OverrideUsgUnit field from a formatted string
   *
   * @param _value the OverrideUsgUnit field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OverrideUsgUnit field
   */
   public void setOverrideUsgUnitFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideUsgUnitFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOverrideUsgUnit(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OverrideUsgUnit");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOverrideUsgUnitFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOverrideUsgUnitFromFormattedString");
   }

  /** get the value of the field: OverrideUsgUnit (CMF_PACKAGE_OVERRIDES.override_usg_unit)
   * @return Integer the value
   */
  public Integer getOverrideUsgUnit () {
    return this.OverrideUsgUnit;
  }
  /** Change the field to not being actively set: OverrideUsgUnit (CMF_PACKAGE_OVERRIDES.override_usg_unit)
   */
  public void unsetOverrideUsgUnit () {
    this._OverrideUsgUnitSet = false;
  }
  /** See if the field is actively set: OverrideUsgUnit (CMF_PACKAGE_OVERRIDES.override_usg_unit)
   * @return boolean whether the field is actively set
   */
  public boolean issetOverrideUsgUnit () {
    return this._OverrideUsgUnitSet;
  }
  /** set the fields value: ActiveDate (CMF_PACKAGE_OVERRIDES.active_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ActiveDate") 
  public void setActiveDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ActiveDate", "setActiveDate");
    }
    this.ActiveDate = value;
    this._ActiveDateSet = true;
  }

  /** Retrieves the ActiveDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ActiveDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDate field
   */
   public String getActiveDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDateAsFormattedString");
       return fmtMgr.formatDate(this.getActiveDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ActiveDate field from a formatted string
   *
   * @param _value the ActiveDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ActiveDate field
   */
   public void setActiveDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setActiveDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveDateFromFormattedString");
   }

  /**
   * Retrieves the ActiveDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActiveDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDate field
   */
  public String getActiveDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getActiveDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ActiveDate field value from a formatted date/time string
   *
   * @param _value the ActiveDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ActiveDate field
   */
  public void setActiveDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActiveDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setActiveDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ActiveDate (CMF_PACKAGE_OVERRIDES.active_date)
   * @return Date the value
   */
  public Date getActiveDate () {
    return this.ActiveDate;
  }
  /** Change the field to not being actively set: ActiveDate (CMF_PACKAGE_OVERRIDES.active_date)
   */
  public void unsetActiveDate () {
    this._ActiveDateSet = false;
  }
  /** See if the field is actively set: ActiveDate (CMF_PACKAGE_OVERRIDES.active_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetActiveDate () {
    return this._ActiveDateSet;
  }
  /** set the fields value: InactiveDate (CMF_PACKAGE_OVERRIDES.inactive_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("InactiveDate") 
  public void setInactiveDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InactiveDate", "setInactiveDate");
    }
    this.InactiveDate = value;
    this._InactiveDateSet = true;
  }

  /** Retrieves the InactiveDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InactiveDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDate field
   */
   public String getInactiveDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDateAsFormattedString");
       return fmtMgr.formatDate(this.getInactiveDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InactiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the InactiveDate field from a formatted string
   *
   * @param _value the InactiveDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InactiveDate field
   */
   public void setInactiveDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInactiveDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InactiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInactiveDateFromFormattedString");
   }

  /**
   * Retrieves the InactiveDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InactiveDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDate field
   */
  public String getInactiveDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getInactiveDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the InactiveDate field value from a formatted date/time string
   *
   * @param _value the InactiveDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InactiveDate field
   */
  public void setInactiveDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInactiveDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setInactiveDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: InactiveDate (CMF_PACKAGE_OVERRIDES.inactive_date)
   * @return Date the value
   */
  public Date getInactiveDate () {
    return this.InactiveDate;
  }
  /** Change the field to not being actively set: InactiveDate (CMF_PACKAGE_OVERRIDES.inactive_date)
   */
  public void unsetInactiveDate () {
    this._InactiveDateSet = false;
  }
  /** See if the field is actively set: InactiveDate (CMF_PACKAGE_OVERRIDES.inactive_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetInactiveDate () {
    return this._InactiveDateSet;
  }
  /** set the fields value: ChgWho (CMF_PACKAGE_OVERRIDES.chg_who)
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

  /** get the value of the field: ChgWho (CMF_PACKAGE_OVERRIDES.chg_who)
   * @return String the value
   */
  public String getChgWho () {
    return this.ChgWho;
  }
  /** Change the field to not being actively set: ChgWho (CMF_PACKAGE_OVERRIDES.chg_who)
   */
  public void unsetChgWho () {
    this._ChgWhoSet = false;
  }
  /** See if the field is actively set: ChgWho (CMF_PACKAGE_OVERRIDES.chg_who)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgWho () {
    return this._ChgWhoSet;
  }
  /** set the fields value: ChgDate (CMF_PACKAGE_OVERRIDES.chg_date)
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

  /** get the value of the field: ChgDate (CMF_PACKAGE_OVERRIDES.chg_date)
   * @return Date the value
   */
  public Date getChgDate () {
    return this.ChgDate;
  }
  /** Change the field to not being actively set: ChgDate (CMF_PACKAGE_OVERRIDES.chg_date)
   */
  public void unsetChgDate () {
    this._ChgDateSet = false;
  }
  /** See if the field is actively set: ChgDate (CMF_PACKAGE_OVERRIDES.chg_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgDate () {
    return this._ChgDateSet;
  }
  public String toString() {
    return PackageOverridesObjectHelper.toMap(this, null).toString();
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
  /** CMF_PACKAGE_OVERRIDES.component_id field */
    if(!nonNullOnly || (ComponentId != null))  _ComponentIdSet = flag;
  /** CMF_PACKAGE_OVERRIDES.member_id field */
    if(!nonNullOnly || (MemberId != null))  _MemberIdSet = flag;
  /** CMF_PACKAGE_OVERRIDES.override_rate_level field */
    if(!nonNullOnly || (OverrideRateLevel != null))  _OverrideRateLevelSet = flag;
  /** CMF_PACKAGE_OVERRIDES.override_rate_status field */
    if(!nonNullOnly || (OverrideRateStatus != null))  _OverrideRateStatusSet = flag;
  /** CMF_PACKAGE_OVERRIDES.override_rate_rc field */
    if(!nonNullOnly || (OverrideRateRc != null))  _OverrideRateRcSet = flag;
  /** CMF_PACKAGE_OVERRIDES.override_rate_nrc field */
    if(!nonNullOnly || (OverrideRateNrc != null))  _OverrideRateNrcSet = flag;
  /** CMF_PACKAGE_OVERRIDES.override_usg_charge_amt field */
    if(!nonNullOnly || (OverrideUsgChargeAmt != null))  _OverrideUsgChargeAmtSet = flag;
  /** CMF_PACKAGE_OVERRIDES.override_usg_fixed_amt field */
    if(!nonNullOnly || (OverrideUsgFixedAmt != null))  _OverrideUsgFixedAmtSet = flag;
  /** CMF_PACKAGE_OVERRIDES.override_usg_unit field */
    if(!nonNullOnly || (OverrideUsgUnit != null))  _OverrideUsgUnitSet = flag;
  /** CMF_PACKAGE_OVERRIDES.active_date field */
    if(!nonNullOnly || (ActiveDate != null))  _ActiveDateSet = flag;
  /** CMF_PACKAGE_OVERRIDES.inactive_date field */
    if(!nonNullOnly || (InactiveDate != null))  _InactiveDateSet = flag;
  /** CMF_PACKAGE_OVERRIDES.chg_who field */
    if(!nonNullOnly || (ChgWho != null))  _ChgWhoSet = flag;
  /** CMF_PACKAGE_OVERRIDES.chg_date field */
    if(!nonNullOnly || (ChgDate != null))  _ChgDateSet = flag;
  }
}
