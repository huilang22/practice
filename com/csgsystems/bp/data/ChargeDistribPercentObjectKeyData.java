/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ChargeDistribPercentObjectKeyData.java
 * Definition File: Customer/ChargeDistribPercent.xml
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

/** ChargeDistribPercentObject's Key Data class. */
public class ChargeDistribPercentObjectKeyData  extends BaseObjectData
{
  /** CHARGE_DISTRIB_PERCENT.account_no field */
  public    Integer AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  /** CHARGE_DISTRIB_PERCENT.distrib_type field */
  public    Integer DistribType  = null;
  protected boolean _DistribTypeSet = false;
  /** CHARGE_DISTRIB_PERCENT.tax_pkg_inst_id field */
  public    Integer TaxPkgInstId  = null;
  protected boolean _TaxPkgInstIdSet = false;
  /** CHARGE_DISTRIB_PERCENT.subscr_no field */
  public    Integer ServiceInternalId  = null;
  protected boolean _ServiceInternalIdSet = false;
  /** CHARGE_DISTRIB_PERCENT.subscr_no_resets field */
  public    Integer ServiceInternalIdResets  = null;
  protected boolean _ServiceInternalIdResetsSet = false;
  /** CHARGE_DISTRIB_PERCENT.charge_elt_type field */
  public    Integer ChargeEltType  = null;
  protected boolean _ChargeEltTypeSet = false;
  /** CHARGE_DISTRIB_PERCENT.charge_elt_id field */
  public    Integer ChargeEltId  = null;
  protected boolean _ChargeEltIdSet = false;
  /** CHARGE_DISTRIB_PERCENT.active_date field */
  public    Date ActiveDate  = null;
  protected boolean _ActiveDateSet = false;
  private String _objName = "ChargeDistribPercentObjectKeyData";
  /** default constructor */
  public ChargeDistribPercentObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public ChargeDistribPercentObjectKeyData (ChargeDistribPercentObjectKeyData other)
  {
    if (other == null) return;
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
    this.DistribType = other.DistribType;
    this._DistribTypeSet = other._DistribTypeSet;
    this.TaxPkgInstId = other.TaxPkgInstId;
    this._TaxPkgInstIdSet = other._TaxPkgInstIdSet;
    this.ServiceInternalId = other.ServiceInternalId;
    this._ServiceInternalIdSet = other._ServiceInternalIdSet;
    this.ServiceInternalIdResets = other.ServiceInternalIdResets;
    this._ServiceInternalIdResetsSet = other._ServiceInternalIdResetsSet;
    this.ChargeEltType = other.ChargeEltType;
    this._ChargeEltTypeSet = other._ChargeEltTypeSet;
    this.ChargeEltId = other.ChargeEltId;
    this._ChargeEltIdSet = other._ChargeEltIdSet;
    this.ActiveDate = other.ActiveDate;
    this._ActiveDateSet = other._ActiveDateSet;
  }
  /** set the fields value: AccountInternalId (CHARGE_DISTRIB_PERCENT.account_no)
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

  /** get the value of the field: AccountInternalId (CHARGE_DISTRIB_PERCENT.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (CHARGE_DISTRIB_PERCENT.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (CHARGE_DISTRIB_PERCENT.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  /** set the fields value: DistribType (CHARGE_DISTRIB_PERCENT.distrib_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DistribType") 
  public void setDistribType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DistribType", "setDistribType");
    }
    this.DistribType = value;
    this._DistribTypeSet = true;
  }

  /** Retrieves the DistribType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DistribType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DistribType field
   */
   public String getDistribTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDistribTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDistribTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getDistribType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DistribType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDistribTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the DistribType field from a formatted string
   *
   * @param _value the DistribType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DistribType field
   */
   public void setDistribTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDistribTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDistribType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DistribType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDistribTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDistribTypeFromFormattedString");
   }

  /** get the value of the field: DistribType (CHARGE_DISTRIB_PERCENT.distrib_type)
   * @return Integer the value
   */
  public Integer getDistribType () {
    return this.DistribType;
  }
  /** Change the field to not being actively set: DistribType (CHARGE_DISTRIB_PERCENT.distrib_type)
   */
  public void unsetDistribType () {
    this._DistribTypeSet = false;
  }
  /** See if the field is actively set: DistribType (CHARGE_DISTRIB_PERCENT.distrib_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetDistribType () {
    return this._DistribTypeSet;
  }
  /** set the fields value: TaxPkgInstId (CHARGE_DISTRIB_PERCENT.tax_pkg_inst_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaxPkgInstId") 
  public void setTaxPkgInstId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TaxPkgInstId", "setTaxPkgInstId");
    }
    this.TaxPkgInstId = value;
    this._TaxPkgInstIdSet = true;
  }

  /** Retrieves the TaxPkgInstId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxPkgInstId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxPkgInstId field
   */
   public String getTaxPkgInstIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPkgInstIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxPkgInstIdAsFormattedString");
       return fmtMgr.formatNumber(this.getTaxPkgInstId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxPkgInstId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxPkgInstIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxPkgInstId field from a formatted string
   *
   * @param _value the TaxPkgInstId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxPkgInstId field
   */
   public void setTaxPkgInstIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPkgInstIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxPkgInstId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxPkgInstId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxPkgInstIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxPkgInstIdFromFormattedString");
   }

  /** get the value of the field: TaxPkgInstId (CHARGE_DISTRIB_PERCENT.tax_pkg_inst_id)
   * @return Integer the value
   */
  public Integer getTaxPkgInstId () {
    return this.TaxPkgInstId;
  }
  /** Change the field to not being actively set: TaxPkgInstId (CHARGE_DISTRIB_PERCENT.tax_pkg_inst_id)
   */
  public void unsetTaxPkgInstId () {
    this._TaxPkgInstIdSet = false;
  }
  /** See if the field is actively set: TaxPkgInstId (CHARGE_DISTRIB_PERCENT.tax_pkg_inst_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxPkgInstId () {
    return this._TaxPkgInstIdSet;
  }
  /** set the fields value: ServiceInternalId (CHARGE_DISTRIB_PERCENT.subscr_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceInternalId") 
  public void setServiceInternalId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServiceInternalId", "setServiceInternalId");
    }
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

  /** get the value of the field: ServiceInternalId (CHARGE_DISTRIB_PERCENT.subscr_no)
   * @return Integer the value
   */
  public Integer getServiceInternalId () {
    return this.ServiceInternalId;
  }
  /** Change the field to not being actively set: ServiceInternalId (CHARGE_DISTRIB_PERCENT.subscr_no)
   */
  public void unsetServiceInternalId () {
    this._ServiceInternalIdSet = false;
  }
  /** See if the field is actively set: ServiceInternalId (CHARGE_DISTRIB_PERCENT.subscr_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceInternalId () {
    return this._ServiceInternalIdSet;
  }
  /** set the fields value: ServiceInternalIdResets (CHARGE_DISTRIB_PERCENT.subscr_no_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceInternalIdResets") 
  public void setServiceInternalIdResets (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServiceInternalIdResets", "setServiceInternalIdResets");
    }
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

  /** get the value of the field: ServiceInternalIdResets (CHARGE_DISTRIB_PERCENT.subscr_no_resets)
   * @return Integer the value
   */
  public Integer getServiceInternalIdResets () {
    return this.ServiceInternalIdResets;
  }
  /** Change the field to not being actively set: ServiceInternalIdResets (CHARGE_DISTRIB_PERCENT.subscr_no_resets)
   */
  public void unsetServiceInternalIdResets () {
    this._ServiceInternalIdResetsSet = false;
  }
  /** See if the field is actively set: ServiceInternalIdResets (CHARGE_DISTRIB_PERCENT.subscr_no_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceInternalIdResets () {
    return this._ServiceInternalIdResetsSet;
  }
  /** set the fields value: ChargeEltType (CHARGE_DISTRIB_PERCENT.charge_elt_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChargeEltType") 
  public void setChargeEltType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChargeEltType", "setChargeEltType");
    }
    this.ChargeEltType = value;
    this._ChargeEltTypeSet = true;
  }

  /** Retrieves the ChargeEltType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChargeEltType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChargeEltType field
   */
   public String getChargeEltTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChargeEltTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChargeEltTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getChargeEltType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChargeEltType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChargeEltTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChargeEltType field from a formatted string
   *
   * @param _value the ChargeEltType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChargeEltType field
   */
   public void setChargeEltTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChargeEltTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChargeEltType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChargeEltType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChargeEltTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChargeEltTypeFromFormattedString");
   }

  /** get the value of the field: ChargeEltType (CHARGE_DISTRIB_PERCENT.charge_elt_type)
   * @return Integer the value
   */
  public Integer getChargeEltType () {
    return this.ChargeEltType;
  }
  /** Change the field to not being actively set: ChargeEltType (CHARGE_DISTRIB_PERCENT.charge_elt_type)
   */
  public void unsetChargeEltType () {
    this._ChargeEltTypeSet = false;
  }
  /** See if the field is actively set: ChargeEltType (CHARGE_DISTRIB_PERCENT.charge_elt_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetChargeEltType () {
    return this._ChargeEltTypeSet;
  }
  /** set the fields value: ChargeEltId (CHARGE_DISTRIB_PERCENT.charge_elt_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChargeEltId") 
  public void setChargeEltId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChargeEltId", "setChargeEltId");
    }
    this.ChargeEltId = value;
    this._ChargeEltIdSet = true;
  }

  /** Retrieves the ChargeEltId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChargeEltId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChargeEltId field
   */
   public String getChargeEltIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChargeEltIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChargeEltIdAsFormattedString");
       return fmtMgr.formatNumber(this.getChargeEltId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChargeEltId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChargeEltIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChargeEltId field from a formatted string
   *
   * @param _value the ChargeEltId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChargeEltId field
   */
   public void setChargeEltIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChargeEltIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChargeEltId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChargeEltId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChargeEltIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChargeEltIdFromFormattedString");
   }

  /** get the value of the field: ChargeEltId (CHARGE_DISTRIB_PERCENT.charge_elt_id)
   * @return Integer the value
   */
  public Integer getChargeEltId () {
    return this.ChargeEltId;
  }
  /** Change the field to not being actively set: ChargeEltId (CHARGE_DISTRIB_PERCENT.charge_elt_id)
   */
  public void unsetChargeEltId () {
    this._ChargeEltIdSet = false;
  }
  /** See if the field is actively set: ChargeEltId (CHARGE_DISTRIB_PERCENT.charge_elt_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetChargeEltId () {
    return this._ChargeEltIdSet;
  }
  /** set the fields value: ActiveDate (CHARGE_DISTRIB_PERCENT.active_date)
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

  /** get the value of the field: ActiveDate (CHARGE_DISTRIB_PERCENT.active_date)
   * @return Date the value
   */
  public Date getActiveDate () {
    return this.ActiveDate;
  }
  /** Change the field to not being actively set: ActiveDate (CHARGE_DISTRIB_PERCENT.active_date)
   */
  public void unsetActiveDate () {
    this._ActiveDateSet = false;
  }
  /** See if the field is actively set: ActiveDate (CHARGE_DISTRIB_PERCENT.active_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetActiveDate () {
    return this._ActiveDateSet;
  }
  public String toString() {
    return ChargeDistribPercentObjectKeyHelper.toMap(this, null).toString();
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
    
  /** CHARGE_DISTRIB_PERCENT.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  /** CHARGE_DISTRIB_PERCENT.distrib_type field */
    if(!nonNullOnly || (DistribType != null))  _DistribTypeSet = flag;
  /** CHARGE_DISTRIB_PERCENT.tax_pkg_inst_id field */
    if(!nonNullOnly || (TaxPkgInstId != null))  _TaxPkgInstIdSet = flag;
  /** CHARGE_DISTRIB_PERCENT.subscr_no field */
    if(!nonNullOnly || (ServiceInternalId != null))  _ServiceInternalIdSet = flag;
  /** CHARGE_DISTRIB_PERCENT.subscr_no_resets field */
    if(!nonNullOnly || (ServiceInternalIdResets != null))  _ServiceInternalIdResetsSet = flag;
  /** CHARGE_DISTRIB_PERCENT.charge_elt_type field */
    if(!nonNullOnly || (ChargeEltType != null))  _ChargeEltTypeSet = flag;
  /** CHARGE_DISTRIB_PERCENT.charge_elt_id field */
    if(!nonNullOnly || (ChargeEltId != null))  _ChargeEltIdSet = flag;
  /** CHARGE_DISTRIB_PERCENT.active_date field */
    if(!nonNullOnly || (ActiveDate != null))  _ActiveDateSet = flag;
  }
}
