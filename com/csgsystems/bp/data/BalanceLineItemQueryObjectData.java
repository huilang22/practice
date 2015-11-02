/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BalanceLineItemQueryObjectData.java
 * Definition File: Customer/BalanceLineItem.xml
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
  
/** BalanceLineItemQueryObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class BalanceLineItemQueryObjectData extends BalanceLineItemObjectData  implements Serializable
{

  /** ApiQueryName field */
  public    String ApiQueryName  = null;
  protected boolean _ApiQueryNameSet = false;
  /** LatestInvoice field */
  public    Boolean LatestInvoice  = null;
  protected boolean _LatestInvoiceSet = false;
  /** CMF.bill_lname field */
  public    String BillLname  = null;
  protected boolean _BillLnameSet = false;
  /** CMF.bill_fname field */
  public    String BillFname  = null;
  protected boolean _BillFnameSet = false;
  /** CMF.bill_company field */
  public    String BillCompany  = null;
  protected boolean _BillCompanySet = false;
  /** CMF.hierarchy_id field */
  public    Integer HierarchyId  = null;
  protected boolean _HierarchyIdSet = false;
  /** CMF.bill_city field */
  public    String BillCity  = null;
  protected boolean _BillCitySet = false;
  /** CMF.bill_state field */
  public    String BillState  = null;
  protected boolean _BillStateSet = false;
  /** CMF.bill_country_code field */
  public    Integer BillCountryCode  = null;
  protected boolean _BillCountryCodeSet = false;
  /** CMF.bill_zip field */
  public    String BillZip  = null;
  protected boolean _BillZipSet = false;
  private String _objName = "BalanceLineItemQueryObjectData";
  /** Default constructor */
  public BalanceLineItemQueryObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public BalanceLineItemQueryObjectData (BalanceLineItemQueryObjectData other)
  {

    super (other);

    if (other == null) return;
    this.ApiQueryName = other.ApiQueryName;
    this._ApiQueryNameSet = other._ApiQueryNameSet;
    this.LatestInvoice = other.LatestInvoice;
    this._LatestInvoiceSet = other._LatestInvoiceSet;
    this.BillLname = other.BillLname;
    this._BillLnameSet = other._BillLnameSet;
    this.BillFname = other.BillFname;
    this._BillFnameSet = other._BillFnameSet;
    this.BillCompany = other.BillCompany;
    this._BillCompanySet = other._BillCompanySet;
    this.HierarchyId = other.HierarchyId;
    this._HierarchyIdSet = other._HierarchyIdSet;
    this.BillCity = other.BillCity;
    this._BillCitySet = other._BillCitySet;
    this.BillState = other.BillState;
    this._BillStateSet = other._BillStateSet;
    this.BillCountryCode = other.BillCountryCode;
    this._BillCountryCodeSet = other._BillCountryCodeSet;
    this.BillZip = other.BillZip;
    this._BillZipSet = other._BillZipSet;
  }

  /** Constructor to copy base class fields. 
   * @param other the object to copy
   */
  public BalanceLineItemQueryObjectData (BalanceLineItemObjectData other)
  {
    super (other);

  }

  /** set the fields value: ApiQueryName
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setApiQueryName (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ApiQueryName", "setApiQueryName");
    }
    this.ApiQueryName = value;
    this._ApiQueryNameSet = true;
  }
  /** get the value of the field: ApiQueryName
   * @return String the value
   */
  public String getApiQueryName ()
  {
    return this.ApiQueryName;
  }
  /** Change the field to not being actively set: ApiQueryName
   */
  public void unsetApiQueryName ()
  {
    this._ApiQueryNameSet = false;
  }
  /** See if the field is actively set: ApiQueryName
   * @return boolean whether the field is actively set
   */
  public boolean issetApiQueryName ()
  {
    return this._ApiQueryNameSet;
  }

  /** Retrieves the ApiQueryName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ApiQueryName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ApiQueryName field
   */
   public String getApiQueryNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getApiQueryNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getApiQueryNameAsFormattedString");
       return fmtMgr.formatString(this.getApiQueryName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ApiQueryName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getApiQueryNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the ApiQueryName field from a formatted string
   *
   * @param _value the ApiQueryName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ApiQueryName field
   */
   public void setApiQueryNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getApiQueryNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setApiQueryName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ApiQueryName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setApiQueryNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setApiQueryNameFromFormattedString");
   }

  /** set the fields value: LatestInvoice
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setLatestInvoice (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LatestInvoice", "setLatestInvoice");
    }
    this.LatestInvoice = value;
    this._LatestInvoiceSet = true;
  }
  /** get the value of the field: LatestInvoice
   * @return Boolean the value
   */
  public Boolean getLatestInvoice ()
  {
    return this.LatestInvoice;
  }
  /** Change the field to not being actively set: LatestInvoice
   */
  public void unsetLatestInvoice ()
  {
    this._LatestInvoiceSet = false;
  }
  /** See if the field is actively set: LatestInvoice
   * @return boolean whether the field is actively set
   */
  public boolean issetLatestInvoice ()
  {
    return this._LatestInvoiceSet;
  }

  /** Retrieves the LatestInvoice field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LatestInvoice field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LatestInvoice field
   */
   public String getLatestInvoiceAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLatestInvoiceAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLatestInvoiceAsFormattedString");
       return fmtMgr.formatBoolean(this.getLatestInvoice());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LatestInvoice");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLatestInvoiceAsFormattedString");
       throw x;
     }
   }
  /** Sets the LatestInvoice field from a formatted string
   *
   * @param _value the LatestInvoice field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LatestInvoice field
   */
   public void setLatestInvoiceFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLatestInvoiceFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLatestInvoice(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LatestInvoice");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLatestInvoiceFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLatestInvoiceFromFormattedString");
   }

  /** set the fields value: BillLname (CMF.bill_lname)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillLname") 
  public void setBillLname (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 56))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillLname", "setBillLname");
    }
    this.BillLname = value;
    this._BillLnameSet = true;
  }

  /** Retrieves the BillLname field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillLname field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillLname field
   */
   public String getBillLnameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillLnameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillLnameAsFormattedString");
       return fmtMgr.formatString(this.getBillLname());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillLname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillLnameAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillLname field from a formatted string
   *
   * @param _value the BillLname field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillLname field
   */
   public void setBillLnameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillLnameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillLname(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillLname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillLnameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillLnameFromFormattedString");
   }

  /** get the value of the field: BillLname (CMF.bill_lname)
   * @return String the value
   */
  public String getBillLname () {
    return this.BillLname;
  }
  /** Change the field to not being actively set: BillLname (CMF.bill_lname)
   */
  public void unsetBillLname () {
    this._BillLnameSet = false;
  }
  /** See if the field is actively set: BillLname (CMF.bill_lname)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillLname () {
    return this._BillLnameSet;
  }
  /** set the fields value: BillFname (CMF.bill_fname)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillFname") 
  public void setBillFname (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 28))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillFname", "setBillFname");
    }
    this.BillFname = value;
    this._BillFnameSet = true;
  }

  /** Retrieves the BillFname field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillFname field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillFname field
   */
   public String getBillFnameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFnameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillFnameAsFormattedString");
       return fmtMgr.formatString(this.getBillFname());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillFname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillFnameAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillFname field from a formatted string
   *
   * @param _value the BillFname field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillFname field
   */
   public void setBillFnameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFnameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillFname(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillFname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillFnameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillFnameFromFormattedString");
   }

  /** get the value of the field: BillFname (CMF.bill_fname)
   * @return String the value
   */
  public String getBillFname () {
    return this.BillFname;
  }
  /** Change the field to not being actively set: BillFname (CMF.bill_fname)
   */
  public void unsetBillFname () {
    this._BillFnameSet = false;
  }
  /** See if the field is actively set: BillFname (CMF.bill_fname)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillFname () {
    return this._BillFnameSet;
  }
  /** set the fields value: BillCompany (CMF.bill_company)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillCompany") 
  public void setBillCompany (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 56))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillCompany", "setBillCompany");
    }
    this.BillCompany = value;
    this._BillCompanySet = true;
  }

  /** Retrieves the BillCompany field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillCompany field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillCompany field
   */
   public String getBillCompanyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCompanyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCompanyAsFormattedString");
       return fmtMgr.formatString(this.getBillCompany());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillCompany");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillCompanyAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillCompany field from a formatted string
   *
   * @param _value the BillCompany field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillCompany field
   */
   public void setBillCompanyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCompanyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillCompany(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillCompany");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillCompanyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillCompanyFromFormattedString");
   }

  /** get the value of the field: BillCompany (CMF.bill_company)
   * @return String the value
   */
  public String getBillCompany () {
    return this.BillCompany;
  }
  /** Change the field to not being actively set: BillCompany (CMF.bill_company)
   */
  public void unsetBillCompany () {
    this._BillCompanySet = false;
  }
  /** See if the field is actively set: BillCompany (CMF.bill_company)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillCompany () {
    return this._BillCompanySet;
  }
  /** set the fields value: HierarchyId (CMF.hierarchy_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("HierarchyId") 
  public void setHierarchyId (Integer value) throws ServiceException
  {
    this.HierarchyId = value;
    this._HierarchyIdSet = true;
  }

  /** Retrieves the HierarchyId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The HierarchyId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the HierarchyId field
   */
   public String getHierarchyIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHierarchyIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHierarchyIdAsFormattedString");
       return fmtMgr.formatNumber(this.getHierarchyId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HierarchyId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getHierarchyIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the HierarchyId field from a formatted string
   *
   * @param _value the HierarchyId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the HierarchyId field
   */
   public void setHierarchyIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHierarchyIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setHierarchyId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HierarchyId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setHierarchyIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setHierarchyIdFromFormattedString");
   }

  /** get the value of the field: HierarchyId (CMF.hierarchy_id)
   * @return Integer the value
   */
  public Integer getHierarchyId () {
    return this.HierarchyId;
  }
  /** Change the field to not being actively set: HierarchyId (CMF.hierarchy_id)
   */
  public void unsetHierarchyId () {
    this._HierarchyIdSet = false;
  }
  /** See if the field is actively set: HierarchyId (CMF.hierarchy_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetHierarchyId () {
    return this._HierarchyIdSet;
  }
  /** set the fields value: BillCity (CMF.bill_city)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillCity") 
  public void setBillCity (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 35))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillCity", "setBillCity");
    }
    this.BillCity = value;
    this._BillCitySet = true;
  }

  /** Retrieves the BillCity field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillCity field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillCity field
   */
   public String getBillCityAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCityAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCityAsFormattedString");
       return fmtMgr.formatString(this.getBillCity());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillCity");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillCityAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillCity field from a formatted string
   *
   * @param _value the BillCity field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillCity field
   */
   public void setBillCityFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCityFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillCity(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillCity");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillCityFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillCityFromFormattedString");
   }

  /** get the value of the field: BillCity (CMF.bill_city)
   * @return String the value
   */
  public String getBillCity () {
    return this.BillCity;
  }
  /** Change the field to not being actively set: BillCity (CMF.bill_city)
   */
  public void unsetBillCity () {
    this._BillCitySet = false;
  }
  /** See if the field is actively set: BillCity (CMF.bill_city)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillCity () {
    return this._BillCitySet;
  }
  /** set the fields value: BillState (CMF.bill_state)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillState") 
  public void setBillState (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 28))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillState", "setBillState");
    }
    this.BillState = value;
    this._BillStateSet = true;
  }

  /** Retrieves the BillState field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillState field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillState field
   */
   public String getBillStateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillStateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillStateAsFormattedString");
       return fmtMgr.formatString(this.getBillState());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillState");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillStateAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillState field from a formatted string
   *
   * @param _value the BillState field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillState field
   */
   public void setBillStateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillStateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillState(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillState");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillStateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillStateFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated BillState field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BillState field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillState field
   */

  public String getBillStateDisplayValue(Locale _locale, IntegerEquals CountryCode) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillStateDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBillStateEnumeration(_locale, CountryCode);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillStateDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getBillState()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillState");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillStateDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated BillState field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the BillState field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillState field
   */
  public Enumeration getBillStateEnumeration(Locale _locale, IntegerEquals CountryCode) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillStateEnumeration");
    EnumerationFilter enumFilter = new EnumerationFilter();
    enumFilter.addFilterCondition("CountryCode", CountryCode);

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("StateProvince", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillStateEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillState");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillStateEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated BillState field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setBillStateFromDisplayValue(String _value, Locale _locale, IntegerEquals CountryCode) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillStateFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBillStateEnumeration(_locale, CountryCode);
      this.setBillState((String)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), String.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillState");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillStateFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillStateFromDisplayValue");
  }

  /** get the value of the field: BillState (CMF.bill_state)
   * @return String the value
   */
  public String getBillState () {
    return this.BillState;
  }
  /** Change the field to not being actively set: BillState (CMF.bill_state)
   */
  public void unsetBillState () {
    this._BillStateSet = false;
  }
  /** See if the field is actively set: BillState (CMF.bill_state)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillState () {
    return this._BillStateSet;
  }
  /** set the fields value: BillCountryCode (CMF.bill_country_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillCountryCode") 
  public void setBillCountryCode (Integer value) throws ServiceException
  {
    this.BillCountryCode = value;
    this._BillCountryCodeSet = true;
  }

  /** Retrieves the BillCountryCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillCountryCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillCountryCode field
   */
   public String getBillCountryCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCountryCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCountryCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getBillCountryCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillCountryCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillCountryCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillCountryCode field from a formatted string
   *
   * @param _value the BillCountryCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillCountryCode field
   */
   public void setBillCountryCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCountryCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillCountryCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillCountryCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillCountryCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillCountryCodeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated BillCountryCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BillCountryCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillCountryCode field
   */

  public String getBillCountryCodeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCountryCodeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBillCountryCodeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCountryCodeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getBillCountryCode()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCountryCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillCountryCodeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated BillCountryCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the BillCountryCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillCountryCode field
   */
  public Enumeration getBillCountryCodeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCountryCodeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("CountryCode", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCountryCodeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCountryCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillCountryCodeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated BillCountryCode field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setBillCountryCodeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillCountryCodeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBillCountryCodeEnumeration(_locale);
      this.setBillCountryCode((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCountryCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillCountryCodeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillCountryCodeFromDisplayValue");
  }

  /** get the value of the field: BillCountryCode (CMF.bill_country_code)
   * @return Integer the value
   */
  public Integer getBillCountryCode () {
    return this.BillCountryCode;
  }
  /** Change the field to not being actively set: BillCountryCode (CMF.bill_country_code)
   */
  public void unsetBillCountryCode () {
    this._BillCountryCodeSet = false;
  }
  /** See if the field is actively set: BillCountryCode (CMF.bill_country_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillCountryCode () {
    return this._BillCountryCodeSet;
  }
  /** set the fields value: BillZip (CMF.bill_zip)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillZip") 
  public void setBillZip (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 16))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillZip", "setBillZip");
    }
    this.BillZip = value;
    this._BillZipSet = true;
  }

  /** Retrieves the BillZip field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillZip field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillZip field
   */
   public String getBillZipAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillZipAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillZipAsFormattedString");
       return fmtMgr.formatString(this.getBillZip());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillZip");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillZipAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillZip field from a formatted string
   *
   * @param _value the BillZip field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillZip field
   */
   public void setBillZipFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillZipFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillZip(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillZip");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillZipFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillZipFromFormattedString");
   }

  /** get the value of the field: BillZip (CMF.bill_zip)
   * @return String the value
   */
  public String getBillZip () {
    return this.BillZip;
  }
  /** Change the field to not being actively set: BillZip (CMF.bill_zip)
   */
  public void unsetBillZip () {
    this._BillZipSet = false;
  }
  /** See if the field is actively set: BillZip (CMF.bill_zip)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillZip () {
    return this._BillZipSet;
  }
  public String toString() {
    return BalanceLineItemQueryObjectHelper.toMap(this, null).toString();
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
    
      super.resetFlags(flag, true);
    
      resetFlags(flag, true);
  }
  /*
   * This method sets the *Set flags to the specified value
   * @param flag value to set for flags
   * @param nonNullOnly set only those flags where the value is not null. 
   */
  public void resetFlags(boolean flag, boolean nonNullOnly) {
    
  /** ApiQueryName field */
    if (!nonNullOnly || (ApiQueryName != null)) _ApiQueryNameSet = flag;
  /** LatestInvoice field */
    if (!nonNullOnly || (LatestInvoice != null)) _LatestInvoiceSet = flag;
  /** CMF.bill_lname field */
    if(!nonNullOnly || (BillLname != null))  _BillLnameSet = flag;
  /** CMF.bill_fname field */
    if(!nonNullOnly || (BillFname != null))  _BillFnameSet = flag;
  /** CMF.bill_company field */
    if(!nonNullOnly || (BillCompany != null))  _BillCompanySet = flag;
  /** CMF.hierarchy_id field */
    if(!nonNullOnly || (HierarchyId != null))  _HierarchyIdSet = flag;
  /** CMF.bill_city field */
    if(!nonNullOnly || (BillCity != null))  _BillCitySet = flag;
  /** CMF.bill_state field */
    if(!nonNullOnly || (BillState != null))  _BillStateSet = flag;
  /** CMF.bill_country_code field */
    if(!nonNullOnly || (BillCountryCode != null))  _BillCountryCodeSet = flag;
  /** CMF.bill_zip field */
    if(!nonNullOnly || (BillZip != null))  _BillZipSet = flag;
      super.resetFlags(flag, nonNullOnly);
    
  }
}
