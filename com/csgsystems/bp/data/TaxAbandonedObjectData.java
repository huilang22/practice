/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TaxAbandonedObjectData.java
 * Definition File: Customer/TaxAbandoned.xml
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
  
/** TaxAbandonedObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class TaxAbandonedObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public TaxAbandonedObjectKeyData Key = null;
  /** TAX_ABANDONED.federal_tax field */
  public    BigInteger FederalTax  = null;
  protected boolean _FederalTaxSet = false;
  /** TAX_ABANDONED.state_tax field */
  public    BigInteger StateTax  = null;
  protected boolean _StateTaxSet = false;
  /** TAX_ABANDONED.county_tax field */
  public    BigInteger CountyTax  = null;
  protected boolean _CountyTaxSet = false;
  /** TAX_ABANDONED.city_tax field */
  public    BigInteger CityTax  = null;
  protected boolean _CityTaxSet = false;
  /** TAX_ABANDONED.other_tax field */
  public    BigInteger OtherTax  = null;
  protected boolean _OtherTaxSet = false;
  private String _objName = "TaxAbandonedObjectData";
  /** Default constructor */
  public TaxAbandonedObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public TaxAbandonedObjectData (TaxAbandonedObjectData other)
  {

    if (other == null) return;
    this.Key = new TaxAbandonedObjectKeyData (other.Key);
    this.FederalTax = other.FederalTax;
    this._FederalTaxSet = other._FederalTaxSet;
    this.StateTax = other.StateTax;
    this._StateTaxSet = other._StateTaxSet;
    this.CountyTax = other.CountyTax;
    this._CountyTaxSet = other._CountyTaxSet;
    this.CityTax = other.CityTax;
    this._CityTaxSet = other._CityTaxSet;
    this.OtherTax = other.OtherTax;
    this._OtherTaxSet = other._OtherTaxSet;
  }

  /** get the Key for this object
   * @return TaxAbandonedObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public TaxAbandonedObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (TaxAbandonedObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: AccountInternalId (TAX_ABANDONED.account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAccountInternalId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountInternalId", "setAccountInternalId");
    }
    if (this.Key == null) this.Key = new TaxAbandonedObjectKeyData ();
    this.Key.AccountInternalId = value;
    this.Key._AccountInternalIdSet = true;
  }
  /** get the value of the field: AccountInternalId (TAX_ABANDONED.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    if (this.Key == null) return null;
    return this.Key.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (TAX_ABANDONED.account_no)
   */
  public void unsetAccountInternalId () {
    if (this.Key == null) return;
    this.Key._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (TAX_ABANDONED.account_no)
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

  /** set the fields value: BillRefNo (TAX_ABANDONED.bill_ref_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBillRefNo (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillRefNo", "setBillRefNo");
    }
    if (this.Key == null) this.Key = new TaxAbandonedObjectKeyData ();
    this.Key.BillRefNo = value;
    this.Key._BillRefNoSet = true;
  }
  /** get the value of the field: BillRefNo (TAX_ABANDONED.bill_ref_no)
   * @return Integer the value
   */
  public Integer getBillRefNo () {
    if (this.Key == null) return null;
    return this.Key.BillRefNo;
  }
  /** Change the field to not being actively set: BillRefNo (TAX_ABANDONED.bill_ref_no)
   */
  public void unsetBillRefNo () {
    if (this.Key == null) return;
    this.Key._BillRefNoSet = false;
  }
  /** See if the field is actively set: BillRefNo (TAX_ABANDONED.bill_ref_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefNo () {
    if (this.Key == null) return false;
    return this.Key._BillRefNoSet;
  }

  /** Retrieves the BillRefNo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillRefNo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillRefNo field
   */
   public String getBillRefNoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefNoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillRefNoAsFormattedString");
       return fmtMgr.formatNumber(this.getBillRefNo(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillRefNoAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillRefNo field from a formatted string
   *
   * @param _value the BillRefNo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillRefNo field
   */
   public void setBillRefNoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefNoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillRefNo(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillRefNoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillRefNoFromFormattedString");
   }

  /** set the fields value: BillRefResets (TAX_ABANDONED.bill_ref_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBillRefResets (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillRefResets", "setBillRefResets");
    }
    if (this.Key == null) this.Key = new TaxAbandonedObjectKeyData ();
    this.Key.BillRefResets = value;
    this.Key._BillRefResetsSet = true;
  }
  /** get the value of the field: BillRefResets (TAX_ABANDONED.bill_ref_resets)
   * @return Integer the value
   */
  public Integer getBillRefResets () {
    if (this.Key == null) return null;
    return this.Key.BillRefResets;
  }
  /** Change the field to not being actively set: BillRefResets (TAX_ABANDONED.bill_ref_resets)
   */
  public void unsetBillRefResets () {
    if (this.Key == null) return;
    this.Key._BillRefResetsSet = false;
  }
  /** See if the field is actively set: BillRefResets (TAX_ABANDONED.bill_ref_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefResets () {
    if (this.Key == null) return false;
    return this.Key._BillRefResetsSet;
  }

  /** Retrieves the BillRefResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillRefResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillRefResets field
   */
   public String getBillRefResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillRefResetsAsFormattedString");
       return fmtMgr.formatNumber(this.getBillRefResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillRefResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillRefResets field from a formatted string
   *
   * @param _value the BillRefResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillRefResets field
   */
   public void setBillRefResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillRefResets(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillRefResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillRefResetsFromFormattedString");
   }

  /** set the fields value: BillInvoiceRow (TAX_ABANDONED.bill_invoice_row)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBillInvoiceRow (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillInvoiceRow", "setBillInvoiceRow");
    }
    if (this.Key == null) this.Key = new TaxAbandonedObjectKeyData ();
    this.Key.BillInvoiceRow = value;
    this.Key._BillInvoiceRowSet = true;
  }
  /** get the value of the field: BillInvoiceRow (TAX_ABANDONED.bill_invoice_row)
   * @return Integer the value
   */
  public Integer getBillInvoiceRow () {
    if (this.Key == null) return null;
    return this.Key.BillInvoiceRow;
  }
  /** Change the field to not being actively set: BillInvoiceRow (TAX_ABANDONED.bill_invoice_row)
   */
  public void unsetBillInvoiceRow () {
    if (this.Key == null) return;
    this.Key._BillInvoiceRowSet = false;
  }
  /** See if the field is actively set: BillInvoiceRow (TAX_ABANDONED.bill_invoice_row)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillInvoiceRow () {
    if (this.Key == null) return false;
    return this.Key._BillInvoiceRowSet;
  }

  /** Retrieves the BillInvoiceRow field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillInvoiceRow field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillInvoiceRow field
   */
   public String getBillInvoiceRowAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillInvoiceRowAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillInvoiceRowAsFormattedString");
       return fmtMgr.formatNumber(this.getBillInvoiceRow(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillInvoiceRow");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillInvoiceRowAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillInvoiceRow field from a formatted string
   *
   * @param _value the BillInvoiceRow field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillInvoiceRow field
   */
   public void setBillInvoiceRowFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillInvoiceRowFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillInvoiceRow(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillInvoiceRow");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillInvoiceRowFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillInvoiceRowFromFormattedString");
   }

  /** set the fields value: TaxPkgInstId (TAX_ABANDONED.tax_pkg_inst_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTaxPkgInstId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TaxPkgInstId", "setTaxPkgInstId");
    }
    if (this.Key == null) this.Key = new TaxAbandonedObjectKeyData ();
    this.Key.TaxPkgInstId = value;
    this.Key._TaxPkgInstIdSet = true;
  }
  /** get the value of the field: TaxPkgInstId (TAX_ABANDONED.tax_pkg_inst_id)
   * @return Integer the value
   */
  public Integer getTaxPkgInstId () {
    if (this.Key == null) return null;
    return this.Key.TaxPkgInstId;
  }
  /** Change the field to not being actively set: TaxPkgInstId (TAX_ABANDONED.tax_pkg_inst_id)
   */
  public void unsetTaxPkgInstId () {
    if (this.Key == null) return;
    this.Key._TaxPkgInstIdSet = false;
  }
  /** See if the field is actively set: TaxPkgInstId (TAX_ABANDONED.tax_pkg_inst_id)
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

  /** set the fields value: AbandonReason (TAX_ABANDONED.abandon_reason)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAbandonReason (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AbandonReason", "setAbandonReason");
    }
    if (this.Key == null) this.Key = new TaxAbandonedObjectKeyData ();
    this.Key.AbandonReason = value;
    this.Key._AbandonReasonSet = true;
  }
  /** get the value of the field: AbandonReason (TAX_ABANDONED.abandon_reason)
   * @return Integer the value
   */
  public Integer getAbandonReason () {
    if (this.Key == null) return null;
    return this.Key.AbandonReason;
  }
  /** Change the field to not being actively set: AbandonReason (TAX_ABANDONED.abandon_reason)
   */
  public void unsetAbandonReason () {
    if (this.Key == null) return;
    this.Key._AbandonReasonSet = false;
  }
  /** See if the field is actively set: AbandonReason (TAX_ABANDONED.abandon_reason)
   * @return boolean whether the field is actively set
   */
  public boolean issetAbandonReason () {
    if (this.Key == null) return false;
    return this.Key._AbandonReasonSet;
  }

  /** Retrieves the AbandonReason field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AbandonReason field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AbandonReason field
   */
   public String getAbandonReasonAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAbandonReasonAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAbandonReasonAsFormattedString");
       return fmtMgr.formatNumber(this.getAbandonReason(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AbandonReason");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAbandonReasonAsFormattedString");
       throw x;
     }
   }
  /** Sets the AbandonReason field from a formatted string
   *
   * @param _value the AbandonReason field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AbandonReason field
   */
   public void setAbandonReasonFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAbandonReasonFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAbandonReason(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AbandonReason");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAbandonReasonFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAbandonReasonFromFormattedString");
   }

  /** set the fields value: FederalTax (TAX_ABANDONED.federal_tax)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FederalTax") 
  public void setFederalTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FederalTax", "setFederalTax");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FederalTax", "setFederalTax");
    }
    this.FederalTax = value;
    this._FederalTaxSet = true;
  }

  /** Retrieves the FederalTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FederalTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FederalTax field
   */
   public String getFederalTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFederalTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFederalTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getFederalTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FederalTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFederalTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the FederalTax field from a formatted string
   *
   * @param _value the FederalTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FederalTax field
   */
   public void setFederalTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFederalTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFederalTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FederalTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFederalTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFederalTaxFromFormattedString");
   }

  /** get the value of the field: FederalTax (TAX_ABANDONED.federal_tax)
   * @return BigInteger the value
   */
  public BigInteger getFederalTax () {
    return this.FederalTax;
  }
  /** Change the field to not being actively set: FederalTax (TAX_ABANDONED.federal_tax)
   */
  public void unsetFederalTax () {
    this._FederalTaxSet = false;
  }
  /** See if the field is actively set: FederalTax (TAX_ABANDONED.federal_tax)
   * @return boolean whether the field is actively set
   */
  public boolean issetFederalTax () {
    return this._FederalTaxSet;
  }
  /** set the fields value: StateTax (TAX_ABANDONED.state_tax)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StateTax") 
  public void setStateTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "StateTax", "setStateTax");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "StateTax", "setStateTax");
    }
    this.StateTax = value;
    this._StateTaxSet = true;
  }

  /** Retrieves the StateTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StateTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StateTax field
   */
   public String getStateTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStateTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getStateTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StateTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStateTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the StateTax field from a formatted string
   *
   * @param _value the StateTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StateTax field
   */
   public void setStateTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStateTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StateTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStateTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStateTaxFromFormattedString");
   }

  /** get the value of the field: StateTax (TAX_ABANDONED.state_tax)
   * @return BigInteger the value
   */
  public BigInteger getStateTax () {
    return this.StateTax;
  }
  /** Change the field to not being actively set: StateTax (TAX_ABANDONED.state_tax)
   */
  public void unsetStateTax () {
    this._StateTaxSet = false;
  }
  /** See if the field is actively set: StateTax (TAX_ABANDONED.state_tax)
   * @return boolean whether the field is actively set
   */
  public boolean issetStateTax () {
    return this._StateTaxSet;
  }
  /** set the fields value: CountyTax (TAX_ABANDONED.county_tax)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CountyTax") 
  public void setCountyTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CountyTax", "setCountyTax");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CountyTax", "setCountyTax");
    }
    this.CountyTax = value;
    this._CountyTaxSet = true;
  }

  /** Retrieves the CountyTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CountyTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountyTax field
   */
   public String getCountyTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountyTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountyTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCountyTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountyTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountyTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the CountyTax field from a formatted string
   *
   * @param _value the CountyTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CountyTax field
   */
   public void setCountyTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountyTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCountyTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountyTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountyTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountyTaxFromFormattedString");
   }

  /** get the value of the field: CountyTax (TAX_ABANDONED.county_tax)
   * @return BigInteger the value
   */
  public BigInteger getCountyTax () {
    return this.CountyTax;
  }
  /** Change the field to not being actively set: CountyTax (TAX_ABANDONED.county_tax)
   */
  public void unsetCountyTax () {
    this._CountyTaxSet = false;
  }
  /** See if the field is actively set: CountyTax (TAX_ABANDONED.county_tax)
   * @return boolean whether the field is actively set
   */
  public boolean issetCountyTax () {
    return this._CountyTaxSet;
  }
  /** set the fields value: CityTax (TAX_ABANDONED.city_tax)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CityTax") 
  public void setCityTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CityTax", "setCityTax");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CityTax", "setCityTax");
    }
    this.CityTax = value;
    this._CityTaxSet = true;
  }

  /** Retrieves the CityTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CityTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CityTax field
   */
   public String getCityTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCityTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCityTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCityTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CityTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCityTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the CityTax field from a formatted string
   *
   * @param _value the CityTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CityTax field
   */
   public void setCityTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCityTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCityTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CityTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCityTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCityTaxFromFormattedString");
   }

  /** get the value of the field: CityTax (TAX_ABANDONED.city_tax)
   * @return BigInteger the value
   */
  public BigInteger getCityTax () {
    return this.CityTax;
  }
  /** Change the field to not being actively set: CityTax (TAX_ABANDONED.city_tax)
   */
  public void unsetCityTax () {
    this._CityTaxSet = false;
  }
  /** See if the field is actively set: CityTax (TAX_ABANDONED.city_tax)
   * @return boolean whether the field is actively set
   */
  public boolean issetCityTax () {
    return this._CityTaxSet;
  }
  /** set the fields value: OtherTax (TAX_ABANDONED.other_tax)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OtherTax") 
  public void setOtherTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OtherTax", "setOtherTax");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "OtherTax", "setOtherTax");
    }
    this.OtherTax = value;
    this._OtherTaxSet = true;
  }

  /** Retrieves the OtherTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OtherTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OtherTax field
   */
   public String getOtherTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOtherTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOtherTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getOtherTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OtherTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOtherTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the OtherTax field from a formatted string
   *
   * @param _value the OtherTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OtherTax field
   */
   public void setOtherTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOtherTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOtherTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OtherTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOtherTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOtherTaxFromFormattedString");
   }

  /** get the value of the field: OtherTax (TAX_ABANDONED.other_tax)
   * @return BigInteger the value
   */
  public BigInteger getOtherTax () {
    return this.OtherTax;
  }
  /** Change the field to not being actively set: OtherTax (TAX_ABANDONED.other_tax)
   */
  public void unsetOtherTax () {
    this._OtherTaxSet = false;
  }
  /** See if the field is actively set: OtherTax (TAX_ABANDONED.other_tax)
   * @return boolean whether the field is actively set
   */
  public boolean issetOtherTax () {
    return this._OtherTaxSet;
  }
  public String toString() {
    return TaxAbandonedObjectHelper.toMap(this, null).toString();
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
  /** TAX_ABANDONED.federal_tax field */
    if(!nonNullOnly || (FederalTax != null))  _FederalTaxSet = flag;
  /** TAX_ABANDONED.state_tax field */
    if(!nonNullOnly || (StateTax != null))  _StateTaxSet = flag;
  /** TAX_ABANDONED.county_tax field */
    if(!nonNullOnly || (CountyTax != null))  _CountyTaxSet = flag;
  /** TAX_ABANDONED.city_tax field */
    if(!nonNullOnly || (CityTax != null))  _CityTaxSet = flag;
  /** TAX_ABANDONED.other_tax field */
    if(!nonNullOnly || (OtherTax != null))  _OtherTaxSet = flag;
  }
}
