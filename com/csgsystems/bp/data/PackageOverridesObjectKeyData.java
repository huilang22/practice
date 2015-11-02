/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PackageOverridesObjectKeyData.java
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

/** PackageOverridesObject's Key Data class. */
public class PackageOverridesObjectKeyData  extends BaseObjectData
{
  /** CMF_PACKAGE_OVERRIDES.parent_account_no field */
  public    Integer ParentAccountInternalId  = null;
  protected boolean _ParentAccountInternalIdSet = false;
  /** CMF_PACKAGE_OVERRIDES.package_inst_id field */
  public    Integer PackageInstId  = null;
  protected boolean _PackageInstIdSet = false;
  /** CMF_PACKAGE_OVERRIDES.package_inst_id_serv field */
  public    Integer PackageInstIdServ  = null;
  protected boolean _PackageInstIdServSet = false;
  /** CMF_PACKAGE_OVERRIDES.package_id field */
  public    Integer PackageId  = null;
  protected boolean _PackageIdSet = false;
  /** CMF_PACKAGE_OVERRIDES.association_id field */
  public    Integer AssociationId  = null;
  protected boolean _AssociationIdSet = false;
  /** CMF_PACKAGE_OVERRIDES.association_type field */
  public    BigInteger AssociationType  = null;
  protected boolean _AssociationTypeSet = false;
  /** CMF_PACKAGE_OVERRIDES.currency_code field */
  public    Integer CurrencyCode  = null;
  protected boolean _CurrencyCodeSet = false;
  private String _objName = "PackageOverridesObjectKeyData";
  /** default constructor */
  public PackageOverridesObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public PackageOverridesObjectKeyData (PackageOverridesObjectKeyData other)
  {
    if (other == null) return;
    this.ParentAccountInternalId = other.ParentAccountInternalId;
    this._ParentAccountInternalIdSet = other._ParentAccountInternalIdSet;
    this.PackageInstId = other.PackageInstId;
    this._PackageInstIdSet = other._PackageInstIdSet;
    this.PackageInstIdServ = other.PackageInstIdServ;
    this._PackageInstIdServSet = other._PackageInstIdServSet;
    this.PackageId = other.PackageId;
    this._PackageIdSet = other._PackageIdSet;
    this.AssociationId = other.AssociationId;
    this._AssociationIdSet = other._AssociationIdSet;
    this.AssociationType = other.AssociationType;
    this._AssociationTypeSet = other._AssociationTypeSet;
    this.CurrencyCode = other.CurrencyCode;
    this._CurrencyCodeSet = other._CurrencyCodeSet;
  }
  /** set the fields value: ParentAccountInternalId (CMF_PACKAGE_OVERRIDES.parent_account_no)
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

  /** get the value of the field: ParentAccountInternalId (CMF_PACKAGE_OVERRIDES.parent_account_no)
   * @return Integer the value
   */
  public Integer getParentAccountInternalId () {
    return this.ParentAccountInternalId;
  }
  /** Change the field to not being actively set: ParentAccountInternalId (CMF_PACKAGE_OVERRIDES.parent_account_no)
   */
  public void unsetParentAccountInternalId () {
    this._ParentAccountInternalIdSet = false;
  }
  /** See if the field is actively set: ParentAccountInternalId (CMF_PACKAGE_OVERRIDES.parent_account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetParentAccountInternalId () {
    return this._ParentAccountInternalIdSet;
  }
  /** set the fields value: PackageInstId (CMF_PACKAGE_OVERRIDES.package_inst_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PackageInstId") 
  public void setPackageInstId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PackageInstId", "setPackageInstId");
    }
    this.PackageInstId = value;
    this._PackageInstIdSet = true;
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

  /** get the value of the field: PackageInstId (CMF_PACKAGE_OVERRIDES.package_inst_id)
   * @return Integer the value
   */
  public Integer getPackageInstId () {
    return this.PackageInstId;
  }
  /** Change the field to not being actively set: PackageInstId (CMF_PACKAGE_OVERRIDES.package_inst_id)
   */
  public void unsetPackageInstId () {
    this._PackageInstIdSet = false;
  }
  /** See if the field is actively set: PackageInstId (CMF_PACKAGE_OVERRIDES.package_inst_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetPackageInstId () {
    return this._PackageInstIdSet;
  }
  /** set the fields value: PackageInstIdServ (CMF_PACKAGE_OVERRIDES.package_inst_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PackageInstIdServ") 
  public void setPackageInstIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PackageInstIdServ", "setPackageInstIdServ");
    }
    this.PackageInstIdServ = value;
    this._PackageInstIdServSet = true;
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

  /** get the value of the field: PackageInstIdServ (CMF_PACKAGE_OVERRIDES.package_inst_id_serv)
   * @return Integer the value
   */
  public Integer getPackageInstIdServ () {
    return this.PackageInstIdServ;
  }
  /** Change the field to not being actively set: PackageInstIdServ (CMF_PACKAGE_OVERRIDES.package_inst_id_serv)
   */
  public void unsetPackageInstIdServ () {
    this._PackageInstIdServSet = false;
  }
  /** See if the field is actively set: PackageInstIdServ (CMF_PACKAGE_OVERRIDES.package_inst_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetPackageInstIdServ () {
    return this._PackageInstIdServSet;
  }
  /** set the fields value: PackageId (CMF_PACKAGE_OVERRIDES.package_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PackageId") 
  public void setPackageId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PackageId", "setPackageId");
    }
    this.PackageId = value;
    this._PackageIdSet = true;
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

  /** get the value of the field: PackageId (CMF_PACKAGE_OVERRIDES.package_id)
   * @return Integer the value
   */
  public Integer getPackageId () {
    return this.PackageId;
  }
  /** Change the field to not being actively set: PackageId (CMF_PACKAGE_OVERRIDES.package_id)
   */
  public void unsetPackageId () {
    this._PackageIdSet = false;
  }
  /** See if the field is actively set: PackageId (CMF_PACKAGE_OVERRIDES.package_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetPackageId () {
    return this._PackageIdSet;
  }
  /** set the fields value: AssociationId (CMF_PACKAGE_OVERRIDES.association_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AssociationId") 
  public void setAssociationId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AssociationId", "setAssociationId");
    }
    this.AssociationId = value;
    this._AssociationIdSet = true;
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

  /** get the value of the field: AssociationId (CMF_PACKAGE_OVERRIDES.association_id)
   * @return Integer the value
   */
  public Integer getAssociationId () {
    return this.AssociationId;
  }
  /** Change the field to not being actively set: AssociationId (CMF_PACKAGE_OVERRIDES.association_id)
   */
  public void unsetAssociationId () {
    this._AssociationIdSet = false;
  }
  /** See if the field is actively set: AssociationId (CMF_PACKAGE_OVERRIDES.association_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAssociationId () {
    return this._AssociationIdSet;
  }
  /** set the fields value: AssociationType (CMF_PACKAGE_OVERRIDES.association_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AssociationType") 
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
    this.AssociationType = value;
    this._AssociationTypeSet = true;
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

  /** get the value of the field: AssociationType (CMF_PACKAGE_OVERRIDES.association_type)
   * @return BigInteger the value
   */
  public BigInteger getAssociationType () {
    return this.AssociationType;
  }
  /** Change the field to not being actively set: AssociationType (CMF_PACKAGE_OVERRIDES.association_type)
   */
  public void unsetAssociationType () {
    this._AssociationTypeSet = false;
  }
  /** See if the field is actively set: AssociationType (CMF_PACKAGE_OVERRIDES.association_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetAssociationType () {
    return this._AssociationTypeSet;
  }
  /** set the fields value: CurrencyCode (CMF_PACKAGE_OVERRIDES.currency_code)
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

  /** get the value of the field: CurrencyCode (CMF_PACKAGE_OVERRIDES.currency_code)
   * @return Integer the value
   */
  public Integer getCurrencyCode () {
    return this.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (CMF_PACKAGE_OVERRIDES.currency_code)
   */
  public void unsetCurrencyCode () {
    this._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (CMF_PACKAGE_OVERRIDES.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode () {
    return this._CurrencyCodeSet;
  }
  public String toString() {
    return PackageOverridesObjectKeyHelper.toMap(this, null).toString();
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
    
  /** CMF_PACKAGE_OVERRIDES.parent_account_no field */
    if(!nonNullOnly || (ParentAccountInternalId != null))  _ParentAccountInternalIdSet = flag;
  /** CMF_PACKAGE_OVERRIDES.package_inst_id field */
    if(!nonNullOnly || (PackageInstId != null))  _PackageInstIdSet = flag;
  /** CMF_PACKAGE_OVERRIDES.package_inst_id_serv field */
    if(!nonNullOnly || (PackageInstIdServ != null))  _PackageInstIdServSet = flag;
  /** CMF_PACKAGE_OVERRIDES.package_id field */
    if(!nonNullOnly || (PackageId != null))  _PackageIdSet = flag;
  /** CMF_PACKAGE_OVERRIDES.association_id field */
    if(!nonNullOnly || (AssociationId != null))  _AssociationIdSet = flag;
  /** CMF_PACKAGE_OVERRIDES.association_type field */
    if(!nonNullOnly || (AssociationType != null))  _AssociationTypeSet = flag;
  /** CMF_PACKAGE_OVERRIDES.currency_code field */
    if(!nonNullOnly || (CurrencyCode != null))  _CurrencyCodeSet = flag;
  }
}
