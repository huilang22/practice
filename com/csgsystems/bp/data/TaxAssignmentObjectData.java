/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TaxAssignmentObjectData.java
 * Definition File: Admin/TaxAssignment.xml
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
  
/** TaxAssignmentObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class TaxAssignmentObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public TaxAssignmentObjectKeyData Key = null;
  /** TAX_ASSIGNMENTS.provider_id field */
  public    Integer ProviderId  = null;
  protected boolean _ProviderIdSet = false;
  /** TAX_ASSIGNMENTS.owning_cost_ctr field */
  public    Integer OwningCostCtr  = null;
  protected boolean _OwningCostCtrSet = false;
  /** TAX_ASSIGNMENTS.config_tag_id field */
  public    String ConfigTagId  = null;
  protected boolean _ConfigTagIdSet = false;
  private String _objName = "TaxAssignmentObjectData";
  /** Default constructor */
  public TaxAssignmentObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public TaxAssignmentObjectData (TaxAssignmentObjectData other)
  {

    if (other == null) return;
    this.Key = new TaxAssignmentObjectKeyData (other.Key);
    this.ProviderId = other.ProviderId;
    this._ProviderIdSet = other._ProviderIdSet;
    this.OwningCostCtr = other.OwningCostCtr;
    this._OwningCostCtrSet = other._OwningCostCtrSet;
    this.ConfigTagId = other.ConfigTagId;
    this._ConfigTagIdSet = other._ConfigTagIdSet;
  }

  /** get the Key for this object
   * @return TaxAssignmentObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public TaxAssignmentObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (TaxAssignmentObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: AccountCategory (TAX_ASSIGNMENTS.account_category)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAccountCategory (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountCategory", "setAccountCategory");
    }
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyData ();
    this.Key.AccountCategory = value;
    this.Key._AccountCategorySet = true;
  }
  /** get the value of the field: AccountCategory (TAX_ASSIGNMENTS.account_category)
   * @return Integer the value
   */
  public Integer getAccountCategory () {
    if (this.Key == null) return null;
    return this.Key.AccountCategory;
  }
  /** Change the field to not being actively set: AccountCategory (TAX_ASSIGNMENTS.account_category)
   */
  public void unsetAccountCategory () {
    if (this.Key == null) return;
    this.Key._AccountCategorySet = false;
  }
  /** See if the field is actively set: AccountCategory (TAX_ASSIGNMENTS.account_category)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountCategory () {
    if (this.Key == null) return false;
    return this.Key._AccountCategorySet;
  }

  /** Retrieves the AccountCategory field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountCategory field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountCategory field
   */
   public String getAccountCategoryAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCategoryAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCategoryAsFormattedString");
       return fmtMgr.formatNumber(this.getAccountCategory(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountCategoryAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountCategory field from a formatted string
   *
   * @param _value the AccountCategory field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountCategory field
   */
   public void setAccountCategoryFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCategoryFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountCategory(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountCategoryFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountCategoryFromFormattedString");
   }

  /** set the fields value: BrandId (TAX_ASSIGNMENTS.brand_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBrandId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BrandId", "setBrandId");
    }
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyData ();
    this.Key.BrandId = value;
    this.Key._BrandIdSet = true;
  }
  /** get the value of the field: BrandId (TAX_ASSIGNMENTS.brand_id)
   * @return Integer the value
   */
  public Integer getBrandId () {
    if (this.Key == null) return null;
    return this.Key.BrandId;
  }
  /** Change the field to not being actively set: BrandId (TAX_ASSIGNMENTS.brand_id)
   */
  public void unsetBrandId () {
    if (this.Key == null) return;
    this.Key._BrandIdSet = false;
  }
  /** See if the field is actively set: BrandId (TAX_ASSIGNMENTS.brand_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetBrandId () {
    if (this.Key == null) return false;
    return this.Key._BrandIdSet;
  }

  /** Retrieves the BrandId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BrandId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BrandId field
   */
   public String getBrandIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBrandIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBrandIdAsFormattedString");
       return fmtMgr.formatNumber(this.getBrandId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BrandId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBrandIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the BrandId field from a formatted string
   *
   * @param _value the BrandId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BrandId field
   */
   public void setBrandIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBrandIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBrandId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BrandId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBrandIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBrandIdFromFormattedString");
   }

  /** set the fields value: CountryCode (TAX_ASSIGNMENTS.country_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCountryCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CountryCode", "setCountryCode");
    }
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyData ();
    this.Key.CountryCode = value;
    this.Key._CountryCodeSet = true;
  }
  /** get the value of the field: CountryCode (TAX_ASSIGNMENTS.country_code)
   * @return Integer the value
   */
  public Integer getCountryCode () {
    if (this.Key == null) return null;
    return this.Key.CountryCode;
  }
  /** Change the field to not being actively set: CountryCode (TAX_ASSIGNMENTS.country_code)
   */
  public void unsetCountryCode () {
    if (this.Key == null) return;
    this.Key._CountryCodeSet = false;
  }
  /** See if the field is actively set: CountryCode (TAX_ASSIGNMENTS.country_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCountryCode () {
    if (this.Key == null) return false;
    return this.Key._CountryCodeSet;
  }

  /** Retrieves the CountryCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CountryCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountryCode field
   */
   public String getCountryCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountryCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getCountryCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountryCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountryCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CountryCode field from a formatted string
   *
   * @param _value the CountryCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CountryCode field
   */
   public void setCountryCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCountryCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountryCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountryCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountryCodeFromFormattedString");
   }

  /** set the fields value: StateCode (TAX_ASSIGNMENTS.state_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setStateCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "StateCode", "setStateCode");
    }
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyData ();
    this.Key.StateCode = value;
    this.Key._StateCodeSet = true;
  }
  /** get the value of the field: StateCode (TAX_ASSIGNMENTS.state_code)
   * @return Integer the value
   */
  public Integer getStateCode () {
    if (this.Key == null) return null;
    return this.Key.StateCode;
  }
  /** Change the field to not being actively set: StateCode (TAX_ASSIGNMENTS.state_code)
   */
  public void unsetStateCode () {
    if (this.Key == null) return;
    this.Key._StateCodeSet = false;
  }
  /** See if the field is actively set: StateCode (TAX_ASSIGNMENTS.state_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetStateCode () {
    if (this.Key == null) return false;
    return this.Key._StateCodeSet;
  }

  /** Retrieves the StateCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StateCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StateCode field
   */
   public String getStateCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStateCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getStateCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StateCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStateCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the StateCode field from a formatted string
   *
   * @param _value the StateCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StateCode field
   */
   public void setStateCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStateCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StateCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStateCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStateCodeFromFormattedString");
   }

  /** set the fields value: CountyCode (TAX_ASSIGNMENTS.county_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCountyCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CountyCode", "setCountyCode");
    }
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyData ();
    this.Key.CountyCode = value;
    this.Key._CountyCodeSet = true;
  }
  /** get the value of the field: CountyCode (TAX_ASSIGNMENTS.county_code)
   * @return Integer the value
   */
  public Integer getCountyCode () {
    if (this.Key == null) return null;
    return this.Key.CountyCode;
  }
  /** Change the field to not being actively set: CountyCode (TAX_ASSIGNMENTS.county_code)
   */
  public void unsetCountyCode () {
    if (this.Key == null) return;
    this.Key._CountyCodeSet = false;
  }
  /** See if the field is actively set: CountyCode (TAX_ASSIGNMENTS.county_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCountyCode () {
    if (this.Key == null) return false;
    return this.Key._CountyCodeSet;
  }

  /** Retrieves the CountyCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CountyCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountyCode field
   */
   public String getCountyCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountyCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountyCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getCountyCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountyCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CountyCode field from a formatted string
   *
   * @param _value the CountyCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CountyCode field
   */
   public void setCountyCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountyCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCountyCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountyCodeFromFormattedString");
   }

  /** set the fields value: CityCode (TAX_ASSIGNMENTS.city_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCityCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CityCode", "setCityCode");
    }
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyData ();
    this.Key.CityCode = value;
    this.Key._CityCodeSet = true;
  }
  /** get the value of the field: CityCode (TAX_ASSIGNMENTS.city_code)
   * @return Integer the value
   */
  public Integer getCityCode () {
    if (this.Key == null) return null;
    return this.Key.CityCode;
  }
  /** Change the field to not being actively set: CityCode (TAX_ASSIGNMENTS.city_code)
   */
  public void unsetCityCode () {
    if (this.Key == null) return;
    this.Key._CityCodeSet = false;
  }
  /** See if the field is actively set: CityCode (TAX_ASSIGNMENTS.city_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCityCode () {
    if (this.Key == null) return false;
    return this.Key._CityCodeSet;
  }

  /** Retrieves the CityCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CityCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CityCode field
   */
   public String getCityCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCityCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCityCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getCityCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CityCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCityCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CityCode field from a formatted string
   *
   * @param _value the CityCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CityCode field
   */
   public void setCityCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCityCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCityCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CityCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCityCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCityCodeFromFormattedString");
   }

  /** set the fields value: FranchiseCode (TAX_ASSIGNMENTS.franchise_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setFranchiseCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FranchiseCode", "setFranchiseCode");
    }
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyData ();
    this.Key.FranchiseCode = value;
    this.Key._FranchiseCodeSet = true;
  }
  /** get the value of the field: FranchiseCode (TAX_ASSIGNMENTS.franchise_code)
   * @return Integer the value
   */
  public Integer getFranchiseCode () {
    if (this.Key == null) return null;
    return this.Key.FranchiseCode;
  }
  /** Change the field to not being actively set: FranchiseCode (TAX_ASSIGNMENTS.franchise_code)
   */
  public void unsetFranchiseCode () {
    if (this.Key == null) return;
    this.Key._FranchiseCodeSet = false;
  }
  /** See if the field is actively set: FranchiseCode (TAX_ASSIGNMENTS.franchise_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetFranchiseCode () {
    if (this.Key == null) return false;
    return this.Key._FranchiseCodeSet;
  }

  /** Retrieves the FranchiseCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FranchiseCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FranchiseCode field
   */
   public String getFranchiseCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFranchiseCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFranchiseCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getFranchiseCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FranchiseCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFranchiseCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the FranchiseCode field from a formatted string
   *
   * @param _value the FranchiseCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FranchiseCode field
   */
   public void setFranchiseCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFranchiseCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFranchiseCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FranchiseCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFranchiseCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFranchiseCodeFromFormattedString");
   }

  /** set the fields value: ChargeEltType (TAX_ASSIGNMENTS.charge_elt_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setChargeEltType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChargeEltType", "setChargeEltType");
    }
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyData ();
    this.Key.ChargeEltType = value;
    this.Key._ChargeEltTypeSet = true;
  }
  /** get the value of the field: ChargeEltType (TAX_ASSIGNMENTS.charge_elt_type)
   * @return Integer the value
   */
  public Integer getChargeEltType () {
    if (this.Key == null) return null;
    return this.Key.ChargeEltType;
  }
  /** Change the field to not being actively set: ChargeEltType (TAX_ASSIGNMENTS.charge_elt_type)
   */
  public void unsetChargeEltType () {
    if (this.Key == null) return;
    this.Key._ChargeEltTypeSet = false;
  }
  /** See if the field is actively set: ChargeEltType (TAX_ASSIGNMENTS.charge_elt_type)
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

  /** set the fields value: ChargeEltId (TAX_ASSIGNMENTS.charge_elt_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setChargeEltId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChargeEltId", "setChargeEltId");
    }
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyData ();
    this.Key.ChargeEltId = value;
    this.Key._ChargeEltIdSet = true;
  }
  /** get the value of the field: ChargeEltId (TAX_ASSIGNMENTS.charge_elt_id)
   * @return Integer the value
   */
  public Integer getChargeEltId () {
    if (this.Key == null) return null;
    return this.Key.ChargeEltId;
  }
  /** Change the field to not being actively set: ChargeEltId (TAX_ASSIGNMENTS.charge_elt_id)
   */
  public void unsetChargeEltId () {
    if (this.Key == null) return;
    this.Key._ChargeEltIdSet = false;
  }
  /** See if the field is actively set: ChargeEltId (TAX_ASSIGNMENTS.charge_elt_id)
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

  /** set the fields value: TaxPkgInstId (TAX_ASSIGNMENTS.tax_pkg_inst_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTaxPkgInstId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TaxPkgInstId", "setTaxPkgInstId");
    }
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyData ();
    this.Key.TaxPkgInstId = value;
    this.Key._TaxPkgInstIdSet = true;
  }
  /** get the value of the field: TaxPkgInstId (TAX_ASSIGNMENTS.tax_pkg_inst_id)
   * @return Integer the value
   */
  public Integer getTaxPkgInstId () {
    if (this.Key == null) return null;
    return this.Key.TaxPkgInstId;
  }
  /** Change the field to not being actively set: TaxPkgInstId (TAX_ASSIGNMENTS.tax_pkg_inst_id)
   */
  public void unsetTaxPkgInstId () {
    if (this.Key == null) return;
    this.Key._TaxPkgInstIdSet = false;
  }
  /** See if the field is actively set: TaxPkgInstId (TAX_ASSIGNMENTS.tax_pkg_inst_id)
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

  /** set the fields value: ProviderId (TAX_ASSIGNMENTS.provider_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProviderId") 
  public void setProviderId (Integer value) throws ServiceException
  {
    this.ProviderId = value;
    this._ProviderIdSet = true;
  }

  /** Retrieves the ProviderId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProviderId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProviderId field
   */
   public String getProviderIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProviderIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProviderIdAsFormattedString");
       return fmtMgr.formatNumber(this.getProviderId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProviderId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProviderIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProviderId field from a formatted string
   *
   * @param _value the ProviderId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProviderId field
   */
   public void setProviderIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProviderIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProviderId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProviderId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProviderIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProviderIdFromFormattedString");
   }

  /** get the value of the field: ProviderId (TAX_ASSIGNMENTS.provider_id)
   * @return Integer the value
   */
  public Integer getProviderId () {
    return this.ProviderId;
  }
  /** Change the field to not being actively set: ProviderId (TAX_ASSIGNMENTS.provider_id)
   */
  public void unsetProviderId () {
    this._ProviderIdSet = false;
  }
  /** See if the field is actively set: ProviderId (TAX_ASSIGNMENTS.provider_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetProviderId () {
    return this._ProviderIdSet;
  }
  /** set the fields value: OwningCostCtr (TAX_ASSIGNMENTS.owning_cost_ctr)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OwningCostCtr") 
  public void setOwningCostCtr (Integer value) throws ServiceException
  {
    this.OwningCostCtr = value;
    this._OwningCostCtrSet = true;
  }

  /** Retrieves the OwningCostCtr field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OwningCostCtr field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OwningCostCtr field
   */
   public String getOwningCostCtrAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwningCostCtrAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOwningCostCtrAsFormattedString");
       return fmtMgr.formatNumber(this.getOwningCostCtr(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OwningCostCtr");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOwningCostCtrAsFormattedString");
       throw x;
     }
   }
  /** Sets the OwningCostCtr field from a formatted string
   *
   * @param _value the OwningCostCtr field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OwningCostCtr field
   */
   public void setOwningCostCtrFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwningCostCtrFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOwningCostCtr(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OwningCostCtr");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOwningCostCtrFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOwningCostCtrFromFormattedString");
   }

  /** get the value of the field: OwningCostCtr (TAX_ASSIGNMENTS.owning_cost_ctr)
   * @return Integer the value
   */
  public Integer getOwningCostCtr () {
    return this.OwningCostCtr;
  }
  /** Change the field to not being actively set: OwningCostCtr (TAX_ASSIGNMENTS.owning_cost_ctr)
   */
  public void unsetOwningCostCtr () {
    this._OwningCostCtrSet = false;
  }
  /** See if the field is actively set: OwningCostCtr (TAX_ASSIGNMENTS.owning_cost_ctr)
   * @return boolean whether the field is actively set
   */
  public boolean issetOwningCostCtr () {
    return this._OwningCostCtrSet;
  }
  /** set the fields value: ConfigTagId (TAX_ASSIGNMENTS.config_tag_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ConfigTagId") 
  public void setConfigTagId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 32))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ConfigTagId", "setConfigTagId");
    }
    this.ConfigTagId = value;
    this._ConfigTagIdSet = true;
  }

  /** Retrieves the ConfigTagId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ConfigTagId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ConfigTagId field
   */
   public String getConfigTagIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConfigTagIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getConfigTagIdAsFormattedString");
       return fmtMgr.formatString(this.getConfigTagId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ConfigTagId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getConfigTagIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ConfigTagId field from a formatted string
   *
   * @param _value the ConfigTagId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ConfigTagId field
   */
   public void setConfigTagIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConfigTagIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setConfigTagId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ConfigTagId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setConfigTagIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setConfigTagIdFromFormattedString");
   }

  /** get the value of the field: ConfigTagId (TAX_ASSIGNMENTS.config_tag_id)
   * @return String the value
   */
  public String getConfigTagId () {
    return this.ConfigTagId;
  }
  /** Change the field to not being actively set: ConfigTagId (TAX_ASSIGNMENTS.config_tag_id)
   */
  public void unsetConfigTagId () {
    this._ConfigTagIdSet = false;
  }
  /** See if the field is actively set: ConfigTagId (TAX_ASSIGNMENTS.config_tag_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetConfigTagId () {
    return this._ConfigTagIdSet;
  }
  public String toString() {
    return TaxAssignmentObjectHelper.toMap(this, null).toString();
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
  /** TAX_ASSIGNMENTS.provider_id field */
    if(!nonNullOnly || (ProviderId != null))  _ProviderIdSet = flag;
  /** TAX_ASSIGNMENTS.owning_cost_ctr field */
    if(!nonNullOnly || (OwningCostCtr != null))  _OwningCostCtrSet = flag;
  /** TAX_ASSIGNMENTS.config_tag_id field */
    if(!nonNullOnly || (ConfigTagId != null))  _ConfigTagIdSet = flag;
  }
}
