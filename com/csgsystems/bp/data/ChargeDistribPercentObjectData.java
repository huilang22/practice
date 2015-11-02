/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ChargeDistribPercentObjectData.java
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
  
/** ChargeDistribPercentObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class ChargeDistribPercentObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public ChargeDistribPercentObjectKeyData Key = null;
  /** CHARGE_DISTRIB_PERCENT.a_distri_percent field */
  public    BigInteger ADistriPercent  = null;
  protected boolean _ADistriPercentSet = false;
  /** CHARGE_DISTRIB_PERCENT.b_distri_percent field */
  public    BigInteger BDistriPercent  = null;
  protected boolean _BDistriPercentSet = false;
  /** CHARGE_DISTRIB_PERCENT.inactive_date field */
  public    Date InactiveDate  = null;
  protected boolean _InactiveDateSet = false;
  private String _objName = "ChargeDistribPercentObjectData";
  /** Default constructor */
  public ChargeDistribPercentObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public ChargeDistribPercentObjectData (ChargeDistribPercentObjectData other)
  {

    if (other == null) return;
    this.Key = new ChargeDistribPercentObjectKeyData (other.Key);
    this.ADistriPercent = other.ADistriPercent;
    this._ADistriPercentSet = other._ADistriPercentSet;
    this.BDistriPercent = other.BDistriPercent;
    this._BDistriPercentSet = other._BDistriPercentSet;
    this.InactiveDate = other.InactiveDate;
    this._InactiveDateSet = other._InactiveDateSet;
  }

  /** get the Key for this object
   * @return ChargeDistribPercentObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public ChargeDistribPercentObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (ChargeDistribPercentObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: AccountInternalId (CHARGE_DISTRIB_PERCENT.account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAccountInternalId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountInternalId", "setAccountInternalId");
    }
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyData ();
    this.Key.AccountInternalId = value;
    this.Key._AccountInternalIdSet = true;
  }
  /** get the value of the field: AccountInternalId (CHARGE_DISTRIB_PERCENT.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    if (this.Key == null) return null;
    return this.Key.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (CHARGE_DISTRIB_PERCENT.account_no)
   */
  public void unsetAccountInternalId () {
    if (this.Key == null) return;
    this.Key._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (CHARGE_DISTRIB_PERCENT.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    if (this.Key == null) return false;
    return this.Key._AccountInternalIdSet;
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

  /** set the fields value: DistribType (CHARGE_DISTRIB_PERCENT.distrib_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setDistribType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DistribType", "setDistribType");
    }
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyData ();
    this.Key.DistribType = value;
    this.Key._DistribTypeSet = true;
  }
  /** get the value of the field: DistribType (CHARGE_DISTRIB_PERCENT.distrib_type)
   * @return Integer the value
   */
  public Integer getDistribType () {
    if (this.Key == null) return null;
    return this.Key.DistribType;
  }
  /** Change the field to not being actively set: DistribType (CHARGE_DISTRIB_PERCENT.distrib_type)
   */
  public void unsetDistribType () {
    if (this.Key == null) return;
    this.Key._DistribTypeSet = false;
  }
  /** See if the field is actively set: DistribType (CHARGE_DISTRIB_PERCENT.distrib_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetDistribType () {
    if (this.Key == null) return false;
    return this.Key._DistribTypeSet;
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

  /** set the fields value: TaxPkgInstId (CHARGE_DISTRIB_PERCENT.tax_pkg_inst_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTaxPkgInstId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TaxPkgInstId", "setTaxPkgInstId");
    }
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyData ();
    this.Key.TaxPkgInstId = value;
    this.Key._TaxPkgInstIdSet = true;
  }
  /** get the value of the field: TaxPkgInstId (CHARGE_DISTRIB_PERCENT.tax_pkg_inst_id)
   * @return Integer the value
   */
  public Integer getTaxPkgInstId () {
    if (this.Key == null) return null;
    return this.Key.TaxPkgInstId;
  }
  /** Change the field to not being actively set: TaxPkgInstId (CHARGE_DISTRIB_PERCENT.tax_pkg_inst_id)
   */
  public void unsetTaxPkgInstId () {
    if (this.Key == null) return;
    this.Key._TaxPkgInstIdSet = false;
  }
  /** See if the field is actively set: TaxPkgInstId (CHARGE_DISTRIB_PERCENT.tax_pkg_inst_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxPkgInstId () {
    if (this.Key == null) return false;
    return this.Key._TaxPkgInstIdSet;
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

  /** set the fields value: ServiceInternalId (CHARGE_DISTRIB_PERCENT.subscr_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setServiceInternalId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServiceInternalId", "setServiceInternalId");
    }
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyData ();
    this.Key.ServiceInternalId = value;
    this.Key._ServiceInternalIdSet = true;
  }
  /** get the value of the field: ServiceInternalId (CHARGE_DISTRIB_PERCENT.subscr_no)
   * @return Integer the value
   */
  public Integer getServiceInternalId () {
    if (this.Key == null) return null;
    return this.Key.ServiceInternalId;
  }
  /** Change the field to not being actively set: ServiceInternalId (CHARGE_DISTRIB_PERCENT.subscr_no)
   */
  public void unsetServiceInternalId () {
    if (this.Key == null) return;
    this.Key._ServiceInternalIdSet = false;
  }
  /** See if the field is actively set: ServiceInternalId (CHARGE_DISTRIB_PERCENT.subscr_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceInternalId () {
    if (this.Key == null) return false;
    return this.Key._ServiceInternalIdSet;
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

  /** set the fields value: ServiceInternalIdResets (CHARGE_DISTRIB_PERCENT.subscr_no_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setServiceInternalIdResets (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServiceInternalIdResets", "setServiceInternalIdResets");
    }
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyData ();
    this.Key.ServiceInternalIdResets = value;
    this.Key._ServiceInternalIdResetsSet = true;
  }
  /** get the value of the field: ServiceInternalIdResets (CHARGE_DISTRIB_PERCENT.subscr_no_resets)
   * @return Integer the value
   */
  public Integer getServiceInternalIdResets () {
    if (this.Key == null) return null;
    return this.Key.ServiceInternalIdResets;
  }
  /** Change the field to not being actively set: ServiceInternalIdResets (CHARGE_DISTRIB_PERCENT.subscr_no_resets)
   */
  public void unsetServiceInternalIdResets () {
    if (this.Key == null) return;
    this.Key._ServiceInternalIdResetsSet = false;
  }
  /** See if the field is actively set: ServiceInternalIdResets (CHARGE_DISTRIB_PERCENT.subscr_no_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceInternalIdResets () {
    if (this.Key == null) return false;
    return this.Key._ServiceInternalIdResetsSet;
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

  /** set the fields value: ChargeEltType (CHARGE_DISTRIB_PERCENT.charge_elt_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setChargeEltType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChargeEltType", "setChargeEltType");
    }
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyData ();
    this.Key.ChargeEltType = value;
    this.Key._ChargeEltTypeSet = true;
  }
  /** get the value of the field: ChargeEltType (CHARGE_DISTRIB_PERCENT.charge_elt_type)
   * @return Integer the value
   */
  public Integer getChargeEltType () {
    if (this.Key == null) return null;
    return this.Key.ChargeEltType;
  }
  /** Change the field to not being actively set: ChargeEltType (CHARGE_DISTRIB_PERCENT.charge_elt_type)
   */
  public void unsetChargeEltType () {
    if (this.Key == null) return;
    this.Key._ChargeEltTypeSet = false;
  }
  /** See if the field is actively set: ChargeEltType (CHARGE_DISTRIB_PERCENT.charge_elt_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetChargeEltType () {
    if (this.Key == null) return false;
    return this.Key._ChargeEltTypeSet;
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

  /** set the fields value: ChargeEltId (CHARGE_DISTRIB_PERCENT.charge_elt_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setChargeEltId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChargeEltId", "setChargeEltId");
    }
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyData ();
    this.Key.ChargeEltId = value;
    this.Key._ChargeEltIdSet = true;
  }
  /** get the value of the field: ChargeEltId (CHARGE_DISTRIB_PERCENT.charge_elt_id)
   * @return Integer the value
   */
  public Integer getChargeEltId () {
    if (this.Key == null) return null;
    return this.Key.ChargeEltId;
  }
  /** Change the field to not being actively set: ChargeEltId (CHARGE_DISTRIB_PERCENT.charge_elt_id)
   */
  public void unsetChargeEltId () {
    if (this.Key == null) return;
    this.Key._ChargeEltIdSet = false;
  }
  /** See if the field is actively set: ChargeEltId (CHARGE_DISTRIB_PERCENT.charge_elt_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetChargeEltId () {
    if (this.Key == null) return false;
    return this.Key._ChargeEltIdSet;
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

  /** set the fields value: ActiveDate (CHARGE_DISTRIB_PERCENT.active_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setActiveDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ActiveDate", "setActiveDate");
    }
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyData ();
    this.Key.ActiveDate = value;
    this.Key._ActiveDateSet = true;
  }
  /** get the value of the field: ActiveDate (CHARGE_DISTRIB_PERCENT.active_date)
   * @return Date the value
   */
  public Date getActiveDate () {
    if (this.Key == null) return null;
    return this.Key.ActiveDate;
  }
  /** Change the field to not being actively set: ActiveDate (CHARGE_DISTRIB_PERCENT.active_date)
   */
  public void unsetActiveDate () {
    if (this.Key == null) return;
    this.Key._ActiveDateSet = false;
  }
  /** See if the field is actively set: ActiveDate (CHARGE_DISTRIB_PERCENT.active_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetActiveDate () {
    if (this.Key == null) return false;
    return this.Key._ActiveDateSet;
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

  /** set the fields value: ADistriPercent (CHARGE_DISTRIB_PERCENT.a_distri_percent)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ADistriPercent") 
  public void setADistriPercent (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ADistriPercent", "setADistriPercent");
    }
    if (value != null && !DataHelper.validLength (value, 6))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ADistriPercent", "setADistriPercent");
    }
    this.ADistriPercent = value;
    this._ADistriPercentSet = true;
  }

  /** Retrieves the ADistriPercent field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ADistriPercent field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ADistriPercent field
   */
   public String getADistriPercentAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getADistriPercentAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getADistriPercentAsFormattedString");
       return fmtMgr.formatBigInteger(this.getADistriPercent(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ADistriPercent");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getADistriPercentAsFormattedString");
       throw x;
     }
   }
  /** Sets the ADistriPercent field from a formatted string
   *
   * @param _value the ADistriPercent field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ADistriPercent field
   */
   public void setADistriPercentFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getADistriPercentFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setADistriPercent(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ADistriPercent");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setADistriPercentFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setADistriPercentFromFormattedString");
   }

  /** get the value of the field: ADistriPercent (CHARGE_DISTRIB_PERCENT.a_distri_percent)
   * @return BigInteger the value
   */
  public BigInteger getADistriPercent () {
    return this.ADistriPercent;
  }
  /** Change the field to not being actively set: ADistriPercent (CHARGE_DISTRIB_PERCENT.a_distri_percent)
   */
  public void unsetADistriPercent () {
    this._ADistriPercentSet = false;
  }
  /** See if the field is actively set: ADistriPercent (CHARGE_DISTRIB_PERCENT.a_distri_percent)
   * @return boolean whether the field is actively set
   */
  public boolean issetADistriPercent () {
    return this._ADistriPercentSet;
  }
  /** set the fields value: BDistriPercent (CHARGE_DISTRIB_PERCENT.b_distri_percent)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BDistriPercent") 
  public void setBDistriPercent (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BDistriPercent", "setBDistriPercent");
    }
    if (value != null && !DataHelper.validLength (value, 6))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BDistriPercent", "setBDistriPercent");
    }
    this.BDistriPercent = value;
    this._BDistriPercentSet = true;
  }

  /** Retrieves the BDistriPercent field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BDistriPercent field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BDistriPercent field
   */
   public String getBDistriPercentAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBDistriPercentAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBDistriPercentAsFormattedString");
       return fmtMgr.formatBigInteger(this.getBDistriPercent(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BDistriPercent");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBDistriPercentAsFormattedString");
       throw x;
     }
   }
  /** Sets the BDistriPercent field from a formatted string
   *
   * @param _value the BDistriPercent field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BDistriPercent field
   */
   public void setBDistriPercentFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBDistriPercentFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBDistriPercent(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BDistriPercent");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBDistriPercentFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBDistriPercentFromFormattedString");
   }

  /** get the value of the field: BDistriPercent (CHARGE_DISTRIB_PERCENT.b_distri_percent)
   * @return BigInteger the value
   */
  public BigInteger getBDistriPercent () {
    return this.BDistriPercent;
  }
  /** Change the field to not being actively set: BDistriPercent (CHARGE_DISTRIB_PERCENT.b_distri_percent)
   */
  public void unsetBDistriPercent () {
    this._BDistriPercentSet = false;
  }
  /** See if the field is actively set: BDistriPercent (CHARGE_DISTRIB_PERCENT.b_distri_percent)
   * @return boolean whether the field is actively set
   */
  public boolean issetBDistriPercent () {
    return this._BDistriPercentSet;
  }
  /** set the fields value: InactiveDate (CHARGE_DISTRIB_PERCENT.inactive_date)
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

  /** get the value of the field: InactiveDate (CHARGE_DISTRIB_PERCENT.inactive_date)
   * @return Date the value
   */
  public Date getInactiveDate () {
    return this.InactiveDate;
  }
  /** Change the field to not being actively set: InactiveDate (CHARGE_DISTRIB_PERCENT.inactive_date)
   */
  public void unsetInactiveDate () {
    this._InactiveDateSet = false;
  }
  /** See if the field is actively set: InactiveDate (CHARGE_DISTRIB_PERCENT.inactive_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetInactiveDate () {
    return this._InactiveDateSet;
  }
  public String toString() {
    return ChargeDistribPercentObjectHelper.toMap(this, null).toString();
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
  /** CHARGE_DISTRIB_PERCENT.a_distri_percent field */
    if(!nonNullOnly || (ADistriPercent != null))  _ADistriPercentSet = flag;
  /** CHARGE_DISTRIB_PERCENT.b_distri_percent field */
    if(!nonNullOnly || (BDistriPercent != null))  _BDistriPercentSet = flag;
  /** CHARGE_DISTRIB_PERCENT.inactive_date field */
    if(!nonNullOnly || (InactiveDate != null))  _InactiveDateSet = flag;
  }
}
