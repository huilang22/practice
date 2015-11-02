/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InvoiceDetailQueryObjectData.java
 * Definition File: Customer/InvoiceDetail.xml
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

import com.csgsystems.bp.data.*;

import com.csgsystems.api.base.BaseObjectData;
  
/** InvoiceDetailQueryObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class InvoiceDetailQueryObjectData extends InvoiceDetailObjectData  implements Serializable
{

  /** ApiQueryName field */
  public    String ApiQueryName  = null;
  protected boolean _ApiQueryNameSet = false;
  /** LatestInvoice field */
  public    Boolean LatestInvoice  = null;
  protected boolean _LatestInvoiceSet = false;
  /** ShowZeroRatedCharges field */
  public    Boolean ShowZeroRatedCharges  = null;
  protected boolean _ShowZeroRatedChargesSet = false;
  /** BPCurrencyAttribute field */
  public    BigInteger BPCurrencyAttribute  = null;
  protected boolean _BPCurrencyAttributeSet = false;
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
  /** NRC_TRANS_DESCR.type_id_nrc field */
  public    Integer TypeIdNrc  = null;
  protected boolean _TypeIdNrcSet = false;
  private String _objName = "InvoiceDetailQueryObjectData";
  /** Default constructor */
  public InvoiceDetailQueryObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public InvoiceDetailQueryObjectData (InvoiceDetailQueryObjectData other)
  {

    super (other);

    if (other == null) return;
    this.ApiQueryName = other.ApiQueryName;
    this._ApiQueryNameSet = other._ApiQueryNameSet;
    this.LatestInvoice = other.LatestInvoice;
    this._LatestInvoiceSet = other._LatestInvoiceSet;
    this.ShowZeroRatedCharges = other.ShowZeroRatedCharges;
    this._ShowZeroRatedChargesSet = other._ShowZeroRatedChargesSet;
    this.BPCurrencyAttribute = other.BPCurrencyAttribute;
    this._BPCurrencyAttributeSet = other._BPCurrencyAttributeSet;
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
    this.TypeIdNrc = other.TypeIdNrc;
    this._TypeIdNrcSet = other._TypeIdNrcSet;
  }

  /** Constructor to copy base class fields. 
   * @param other the object to copy
   */
  public InvoiceDetailQueryObjectData (InvoiceDetailObjectData other)
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

  /** set the fields value: ShowZeroRatedCharges
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setShowZeroRatedCharges (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ShowZeroRatedCharges", "setShowZeroRatedCharges");
    }
    this.ShowZeroRatedCharges = value;
    this._ShowZeroRatedChargesSet = true;
  }
  /** get the value of the field: ShowZeroRatedCharges
   * @return Boolean the value
   */
  public Boolean getShowZeroRatedCharges ()
  {
    return this.ShowZeroRatedCharges;
  }
  /** Change the field to not being actively set: ShowZeroRatedCharges
   */
  public void unsetShowZeroRatedCharges ()
  {
    this._ShowZeroRatedChargesSet = false;
  }
  /** See if the field is actively set: ShowZeroRatedCharges
   * @return boolean whether the field is actively set
   */
  public boolean issetShowZeroRatedCharges ()
  {
    return this._ShowZeroRatedChargesSet;
  }

  /** Retrieves the ShowZeroRatedCharges field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ShowZeroRatedCharges field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ShowZeroRatedCharges field
   */
   public String getShowZeroRatedChargesAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getShowZeroRatedChargesAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getShowZeroRatedChargesAsFormattedString");
       return fmtMgr.formatBoolean(this.getShowZeroRatedCharges());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ShowZeroRatedCharges");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getShowZeroRatedChargesAsFormattedString");
       throw x;
     }
   }
  /** Sets the ShowZeroRatedCharges field from a formatted string
   *
   * @param _value the ShowZeroRatedCharges field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ShowZeroRatedCharges field
   */
   public void setShowZeroRatedChargesFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getShowZeroRatedChargesFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setShowZeroRatedCharges(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ShowZeroRatedCharges");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setShowZeroRatedChargesFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setShowZeroRatedChargesFromFormattedString");
   }

  /** set the fields value: BPCurrencyAttribute
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBPCurrencyAttribute (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BPCurrencyAttribute", "setBPCurrencyAttribute");
    }
    this.BPCurrencyAttribute = value;
    this._BPCurrencyAttributeSet = true;
  }
  /** get the value of the field: BPCurrencyAttribute
   * @return BigInteger the value
   */
  public BigInteger getBPCurrencyAttribute ()
  {
    return this.BPCurrencyAttribute;
  }
  /** Change the field to not being actively set: BPCurrencyAttribute
   */
  public void unsetBPCurrencyAttribute ()
  {
    this._BPCurrencyAttributeSet = false;
  }
  /** See if the field is actively set: BPCurrencyAttribute
   * @return boolean whether the field is actively set
   */
  public boolean issetBPCurrencyAttribute ()
  {
    return this._BPCurrencyAttributeSet;
  }

  /** Retrieves the BPCurrencyAttribute field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BPCurrencyAttribute field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BPCurrencyAttribute field
   */
   public String getBPCurrencyAttributeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBPCurrencyAttributeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBPCurrencyAttributeAsFormattedString");
       return fmtMgr.formatBigInteger(this.getBPCurrencyAttribute(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BPCurrencyAttribute");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBPCurrencyAttributeAsFormattedString");
       throw x;
     }
   }
  /** Sets the BPCurrencyAttribute field from a formatted string
   *
   * @param _value the BPCurrencyAttribute field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BPCurrencyAttribute field
   */
   public void setBPCurrencyAttributeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBPCurrencyAttributeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBPCurrencyAttribute(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BPCurrencyAttribute");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBPCurrencyAttributeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBPCurrencyAttributeFromFormattedString");
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
  /** set the fields value: TypeIdNrc (NRC_TRANS_DESCR.type_id_nrc)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TypeIdNrc") 
  public void setTypeIdNrc (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TypeIdNrc", "setTypeIdNrc");
    }
    this.TypeIdNrc = value;
    this._TypeIdNrcSet = true;
  }

  /** Retrieves the TypeIdNrc field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TypeIdNrc field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TypeIdNrc field
   */
   public String getTypeIdNrcAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTypeIdNrcAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTypeIdNrcAsFormattedString");
       return fmtMgr.formatNumber(this.getTypeIdNrc(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TypeIdNrc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTypeIdNrcAsFormattedString");
       throw x;
     }
   }
  /** Sets the TypeIdNrc field from a formatted string
   *
   * @param _value the TypeIdNrc field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TypeIdNrc field
   */
   public void setTypeIdNrcFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTypeIdNrcFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTypeIdNrc(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TypeIdNrc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTypeIdNrcFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTypeIdNrcFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated TypeIdNrc field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the TypeIdNrc field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the TypeIdNrc field
   */

  public String getTypeIdNrcDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTypeIdNrcDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getTypeIdNrcEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTypeIdNrcDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getTypeIdNrc()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TypeIdNrc");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTypeIdNrcDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated TypeIdNrc field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the TypeIdNrc field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the TypeIdNrc field
   */
  public Enumeration getTypeIdNrcEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTypeIdNrcEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ChargeType", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTypeIdNrcEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TypeIdNrc");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTypeIdNrcEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated TypeIdNrc field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setTypeIdNrcFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTypeIdNrcFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getTypeIdNrcEnumeration(_locale);
      this.setTypeIdNrc((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TypeIdNrc");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTypeIdNrcFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTypeIdNrcFromDisplayValue");
  }

  /** get the value of the field: TypeIdNrc (NRC_TRANS_DESCR.type_id_nrc)
   * @return Integer the value
   */
  public Integer getTypeIdNrc () {
    return this.TypeIdNrc;
  }
  /** Change the field to not being actively set: TypeIdNrc (NRC_TRANS_DESCR.type_id_nrc)
   */
  public void unsetTypeIdNrc () {
    this._TypeIdNrcSet = false;
  }
  /** See if the field is actively set: TypeIdNrc (NRC_TRANS_DESCR.type_id_nrc)
   * @return boolean whether the field is actively set
   */
  public boolean issetTypeIdNrc () {
    return this._TypeIdNrcSet;
  }
  public String toString() {
    return InvoiceDetailQueryObjectHelper.toMap(this, null).toString();
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
  /** ShowZeroRatedCharges field */
    if (!nonNullOnly || (ShowZeroRatedCharges != null)) _ShowZeroRatedChargesSet = flag;
  /** BPCurrencyAttribute field */
    if (!nonNullOnly || (BPCurrencyAttribute != null)) _BPCurrencyAttributeSet = flag;
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
  /** NRC_TRANS_DESCR.type_id_nrc field */
    if(!nonNullOnly || (TypeIdNrc != null))  _TypeIdNrcSet = flag;
      super.resetFlags(flag, nonNullOnly);
    
  }
}
