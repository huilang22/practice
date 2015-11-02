/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TaxAssignmentObjectKeyData.java
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

/** TaxAssignmentObject's Key Data class. */
public class TaxAssignmentObjectKeyData  extends BaseObjectData
{
  /** TAX_ASSIGNMENTS.account_category field */
  public    Integer AccountCategory  = null;
  protected boolean _AccountCategorySet = false;
  /** TAX_ASSIGNMENTS.brand_id field */
  public    Integer BrandId  = null;
  protected boolean _BrandIdSet = false;
  /** TAX_ASSIGNMENTS.country_code field */
  public    Integer CountryCode  = null;
  protected boolean _CountryCodeSet = false;
  /** TAX_ASSIGNMENTS.state_code field */
  public    Integer StateCode  = null;
  protected boolean _StateCodeSet = false;
  /** TAX_ASSIGNMENTS.county_code field */
  public    Integer CountyCode  = null;
  protected boolean _CountyCodeSet = false;
  /** TAX_ASSIGNMENTS.city_code field */
  public    Integer CityCode  = null;
  protected boolean _CityCodeSet = false;
  /** TAX_ASSIGNMENTS.franchise_code field */
  public    Integer FranchiseCode  = null;
  protected boolean _FranchiseCodeSet = false;
  /** TAX_ASSIGNMENTS.charge_elt_type field */
  public    Integer ChargeEltType  = null;
  protected boolean _ChargeEltTypeSet = false;
  /** TAX_ASSIGNMENTS.charge_elt_id field */
  public    Integer ChargeEltId  = null;
  protected boolean _ChargeEltIdSet = false;
  /** TAX_ASSIGNMENTS.tax_pkg_inst_id field */
  public    Integer TaxPkgInstId  = null;
  protected boolean _TaxPkgInstIdSet = false;
  private String _objName = "TaxAssignmentObjectKeyData";
  /** default constructor */
  public TaxAssignmentObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public TaxAssignmentObjectKeyData (TaxAssignmentObjectKeyData other)
  {
    if (other == null) return;
    this.AccountCategory = other.AccountCategory;
    this._AccountCategorySet = other._AccountCategorySet;
    this.BrandId = other.BrandId;
    this._BrandIdSet = other._BrandIdSet;
    this.CountryCode = other.CountryCode;
    this._CountryCodeSet = other._CountryCodeSet;
    this.StateCode = other.StateCode;
    this._StateCodeSet = other._StateCodeSet;
    this.CountyCode = other.CountyCode;
    this._CountyCodeSet = other._CountyCodeSet;
    this.CityCode = other.CityCode;
    this._CityCodeSet = other._CityCodeSet;
    this.FranchiseCode = other.FranchiseCode;
    this._FranchiseCodeSet = other._FranchiseCodeSet;
    this.ChargeEltType = other.ChargeEltType;
    this._ChargeEltTypeSet = other._ChargeEltTypeSet;
    this.ChargeEltId = other.ChargeEltId;
    this._ChargeEltIdSet = other._ChargeEltIdSet;
    this.TaxPkgInstId = other.TaxPkgInstId;
    this._TaxPkgInstIdSet = other._TaxPkgInstIdSet;
  }
  /** set the fields value: AccountCategory (TAX_ASSIGNMENTS.account_category)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountCategory") 
  public void setAccountCategory (Integer value) throws ServiceException
  {
    this.AccountCategory = value;
    this._AccountCategorySet = true;
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

  /** get the value of the field: AccountCategory (TAX_ASSIGNMENTS.account_category)
   * @return Integer the value
   */
  public Integer getAccountCategory () {
    return this.AccountCategory;
  }
  /** Change the field to not being actively set: AccountCategory (TAX_ASSIGNMENTS.account_category)
   */
  public void unsetAccountCategory () {
    this._AccountCategorySet = false;
  }
  /** See if the field is actively set: AccountCategory (TAX_ASSIGNMENTS.account_category)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountCategory () {
    return this._AccountCategorySet;
  }
  /** set the fields value: BrandId (TAX_ASSIGNMENTS.brand_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BrandId") 
  public void setBrandId (Integer value) throws ServiceException
  {
    this.BrandId = value;
    this._BrandIdSet = true;
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

  /** get the value of the field: BrandId (TAX_ASSIGNMENTS.brand_id)
   * @return Integer the value
   */
  public Integer getBrandId () {
    return this.BrandId;
  }
  /** Change the field to not being actively set: BrandId (TAX_ASSIGNMENTS.brand_id)
   */
  public void unsetBrandId () {
    this._BrandIdSet = false;
  }
  /** See if the field is actively set: BrandId (TAX_ASSIGNMENTS.brand_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetBrandId () {
    return this._BrandIdSet;
  }
  /** set the fields value: CountryCode (TAX_ASSIGNMENTS.country_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CountryCode") 
  public void setCountryCode (Integer value) throws ServiceException
  {
    this.CountryCode = value;
    this._CountryCodeSet = true;
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

  /** get the value of the field: CountryCode (TAX_ASSIGNMENTS.country_code)
   * @return Integer the value
   */
  public Integer getCountryCode () {
    return this.CountryCode;
  }
  /** Change the field to not being actively set: CountryCode (TAX_ASSIGNMENTS.country_code)
   */
  public void unsetCountryCode () {
    this._CountryCodeSet = false;
  }
  /** See if the field is actively set: CountryCode (TAX_ASSIGNMENTS.country_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCountryCode () {
    return this._CountryCodeSet;
  }
  /** set the fields value: StateCode (TAX_ASSIGNMENTS.state_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StateCode") 
  public void setStateCode (Integer value) throws ServiceException
  {
    this.StateCode = value;
    this._StateCodeSet = true;
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

  /** get the value of the field: StateCode (TAX_ASSIGNMENTS.state_code)
   * @return Integer the value
   */
  public Integer getStateCode () {
    return this.StateCode;
  }
  /** Change the field to not being actively set: StateCode (TAX_ASSIGNMENTS.state_code)
   */
  public void unsetStateCode () {
    this._StateCodeSet = false;
  }
  /** See if the field is actively set: StateCode (TAX_ASSIGNMENTS.state_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetStateCode () {
    return this._StateCodeSet;
  }
  /** set the fields value: CountyCode (TAX_ASSIGNMENTS.county_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CountyCode") 
  public void setCountyCode (Integer value) throws ServiceException
  {
    this.CountyCode = value;
    this._CountyCodeSet = true;
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

  /** get the value of the field: CountyCode (TAX_ASSIGNMENTS.county_code)
   * @return Integer the value
   */
  public Integer getCountyCode () {
    return this.CountyCode;
  }
  /** Change the field to not being actively set: CountyCode (TAX_ASSIGNMENTS.county_code)
   */
  public void unsetCountyCode () {
    this._CountyCodeSet = false;
  }
  /** See if the field is actively set: CountyCode (TAX_ASSIGNMENTS.county_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCountyCode () {
    return this._CountyCodeSet;
  }
  /** set the fields value: CityCode (TAX_ASSIGNMENTS.city_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CityCode") 
  public void setCityCode (Integer value) throws ServiceException
  {
    this.CityCode = value;
    this._CityCodeSet = true;
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

  /** get the value of the field: CityCode (TAX_ASSIGNMENTS.city_code)
   * @return Integer the value
   */
  public Integer getCityCode () {
    return this.CityCode;
  }
  /** Change the field to not being actively set: CityCode (TAX_ASSIGNMENTS.city_code)
   */
  public void unsetCityCode () {
    this._CityCodeSet = false;
  }
  /** See if the field is actively set: CityCode (TAX_ASSIGNMENTS.city_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCityCode () {
    return this._CityCodeSet;
  }
  /** set the fields value: FranchiseCode (TAX_ASSIGNMENTS.franchise_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FranchiseCode") 
  public void setFranchiseCode (Integer value) throws ServiceException
  {
    this.FranchiseCode = value;
    this._FranchiseCodeSet = true;
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

  /** get the value of the field: FranchiseCode (TAX_ASSIGNMENTS.franchise_code)
   * @return Integer the value
   */
  public Integer getFranchiseCode () {
    return this.FranchiseCode;
  }
  /** Change the field to not being actively set: FranchiseCode (TAX_ASSIGNMENTS.franchise_code)
   */
  public void unsetFranchiseCode () {
    this._FranchiseCodeSet = false;
  }
  /** See if the field is actively set: FranchiseCode (TAX_ASSIGNMENTS.franchise_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetFranchiseCode () {
    return this._FranchiseCodeSet;
  }
  /** set the fields value: ChargeEltType (TAX_ASSIGNMENTS.charge_elt_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChargeEltType") 
  public void setChargeEltType (Integer value) throws ServiceException
  {
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

  /** get the value of the field: ChargeEltType (TAX_ASSIGNMENTS.charge_elt_type)
   * @return Integer the value
   */
  public Integer getChargeEltType () {
    return this.ChargeEltType;
  }
  /** Change the field to not being actively set: ChargeEltType (TAX_ASSIGNMENTS.charge_elt_type)
   */
  public void unsetChargeEltType () {
    this._ChargeEltTypeSet = false;
  }
  /** See if the field is actively set: ChargeEltType (TAX_ASSIGNMENTS.charge_elt_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetChargeEltType () {
    return this._ChargeEltTypeSet;
  }
  /** set the fields value: ChargeEltId (TAX_ASSIGNMENTS.charge_elt_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChargeEltId") 
  public void setChargeEltId (Integer value) throws ServiceException
  {
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

  /** get the value of the field: ChargeEltId (TAX_ASSIGNMENTS.charge_elt_id)
   * @return Integer the value
   */
  public Integer getChargeEltId () {
    return this.ChargeEltId;
  }
  /** Change the field to not being actively set: ChargeEltId (TAX_ASSIGNMENTS.charge_elt_id)
   */
  public void unsetChargeEltId () {
    this._ChargeEltIdSet = false;
  }
  /** See if the field is actively set: ChargeEltId (TAX_ASSIGNMENTS.charge_elt_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetChargeEltId () {
    return this._ChargeEltIdSet;
  }
  /** set the fields value: TaxPkgInstId (TAX_ASSIGNMENTS.tax_pkg_inst_id)
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

  /** get the value of the field: TaxPkgInstId (TAX_ASSIGNMENTS.tax_pkg_inst_id)
   * @return Integer the value
   */
  public Integer getTaxPkgInstId () {
    return this.TaxPkgInstId;
  }
  /** Change the field to not being actively set: TaxPkgInstId (TAX_ASSIGNMENTS.tax_pkg_inst_id)
   */
  public void unsetTaxPkgInstId () {
    this._TaxPkgInstIdSet = false;
  }
  /** See if the field is actively set: TaxPkgInstId (TAX_ASSIGNMENTS.tax_pkg_inst_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxPkgInstId () {
    return this._TaxPkgInstIdSet;
  }
  public String toString() {
    return TaxAssignmentObjectKeyHelper.toMap(this, null).toString();
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
    
  /** TAX_ASSIGNMENTS.account_category field */
    if(!nonNullOnly || (AccountCategory != null))  _AccountCategorySet = flag;
  /** TAX_ASSIGNMENTS.brand_id field */
    if(!nonNullOnly || (BrandId != null))  _BrandIdSet = flag;
  /** TAX_ASSIGNMENTS.country_code field */
    if(!nonNullOnly || (CountryCode != null))  _CountryCodeSet = flag;
  /** TAX_ASSIGNMENTS.state_code field */
    if(!nonNullOnly || (StateCode != null))  _StateCodeSet = flag;
  /** TAX_ASSIGNMENTS.county_code field */
    if(!nonNullOnly || (CountyCode != null))  _CountyCodeSet = flag;
  /** TAX_ASSIGNMENTS.city_code field */
    if(!nonNullOnly || (CityCode != null))  _CityCodeSet = flag;
  /** TAX_ASSIGNMENTS.franchise_code field */
    if(!nonNullOnly || (FranchiseCode != null))  _FranchiseCodeSet = flag;
  /** TAX_ASSIGNMENTS.charge_elt_type field */
    if(!nonNullOnly || (ChargeEltType != null))  _ChargeEltTypeSet = flag;
  /** TAX_ASSIGNMENTS.charge_elt_id field */
    if(!nonNullOnly || (ChargeEltId != null))  _ChargeEltIdSet = flag;
  /** TAX_ASSIGNMENTS.tax_pkg_inst_id field */
    if(!nonNullOnly || (TaxPkgInstId != null))  _TaxPkgInstIdSet = flag;
  }
}
