/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TaxAbandonedObjectKeyData.java
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

/** TaxAbandonedObject's Key Data class. */
public class TaxAbandonedObjectKeyData  extends BaseObjectData
{
  /** TAX_ABANDONED.account_no field */
  public    Integer AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  /** TAX_ABANDONED.bill_ref_no field */
  public    Integer BillRefNo  = null;
  protected boolean _BillRefNoSet = false;
  /** TAX_ABANDONED.bill_ref_resets field */
  public    Integer BillRefResets  = null;
  protected boolean _BillRefResetsSet = false;
  /** TAX_ABANDONED.bill_invoice_row field */
  public    Integer BillInvoiceRow  = null;
  protected boolean _BillInvoiceRowSet = false;
  /** TAX_ABANDONED.tax_pkg_inst_id field */
  public    Integer TaxPkgInstId  = null;
  protected boolean _TaxPkgInstIdSet = false;
  /** TAX_ABANDONED.abandon_reason field */
  public    Integer AbandonReason  = null;
  protected boolean _AbandonReasonSet = false;
  private String _objName = "TaxAbandonedObjectKeyData";
  /** default constructor */
  public TaxAbandonedObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public TaxAbandonedObjectKeyData (TaxAbandonedObjectKeyData other)
  {
    if (other == null) return;
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
    this.BillRefNo = other.BillRefNo;
    this._BillRefNoSet = other._BillRefNoSet;
    this.BillRefResets = other.BillRefResets;
    this._BillRefResetsSet = other._BillRefResetsSet;
    this.BillInvoiceRow = other.BillInvoiceRow;
    this._BillInvoiceRowSet = other._BillInvoiceRowSet;
    this.TaxPkgInstId = other.TaxPkgInstId;
    this._TaxPkgInstIdSet = other._TaxPkgInstIdSet;
    this.AbandonReason = other.AbandonReason;
    this._AbandonReasonSet = other._AbandonReasonSet;
  }
  /** set the fields value: AccountInternalId (TAX_ABANDONED.account_no)
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

  /** get the value of the field: AccountInternalId (TAX_ABANDONED.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (TAX_ABANDONED.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (TAX_ABANDONED.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  /** set the fields value: BillRefNo (TAX_ABANDONED.bill_ref_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillRefNo") 
  public void setBillRefNo (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillRefNo", "setBillRefNo");
    }
    this.BillRefNo = value;
    this._BillRefNoSet = true;
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

  /** get the value of the field: BillRefNo (TAX_ABANDONED.bill_ref_no)
   * @return Integer the value
   */
  public Integer getBillRefNo () {
    return this.BillRefNo;
  }
  /** Change the field to not being actively set: BillRefNo (TAX_ABANDONED.bill_ref_no)
   */
  public void unsetBillRefNo () {
    this._BillRefNoSet = false;
  }
  /** See if the field is actively set: BillRefNo (TAX_ABANDONED.bill_ref_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefNo () {
    return this._BillRefNoSet;
  }
  /** set the fields value: BillRefResets (TAX_ABANDONED.bill_ref_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillRefResets") 
  public void setBillRefResets (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillRefResets", "setBillRefResets");
    }
    this.BillRefResets = value;
    this._BillRefResetsSet = true;
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

  /** get the value of the field: BillRefResets (TAX_ABANDONED.bill_ref_resets)
   * @return Integer the value
   */
  public Integer getBillRefResets () {
    return this.BillRefResets;
  }
  /** Change the field to not being actively set: BillRefResets (TAX_ABANDONED.bill_ref_resets)
   */
  public void unsetBillRefResets () {
    this._BillRefResetsSet = false;
  }
  /** See if the field is actively set: BillRefResets (TAX_ABANDONED.bill_ref_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefResets () {
    return this._BillRefResetsSet;
  }
  /** set the fields value: BillInvoiceRow (TAX_ABANDONED.bill_invoice_row)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillInvoiceRow") 
  public void setBillInvoiceRow (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillInvoiceRow", "setBillInvoiceRow");
    }
    this.BillInvoiceRow = value;
    this._BillInvoiceRowSet = true;
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

  /** get the value of the field: BillInvoiceRow (TAX_ABANDONED.bill_invoice_row)
   * @return Integer the value
   */
  public Integer getBillInvoiceRow () {
    return this.BillInvoiceRow;
  }
  /** Change the field to not being actively set: BillInvoiceRow (TAX_ABANDONED.bill_invoice_row)
   */
  public void unsetBillInvoiceRow () {
    this._BillInvoiceRowSet = false;
  }
  /** See if the field is actively set: BillInvoiceRow (TAX_ABANDONED.bill_invoice_row)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillInvoiceRow () {
    return this._BillInvoiceRowSet;
  }
  /** set the fields value: TaxPkgInstId (TAX_ABANDONED.tax_pkg_inst_id)
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

  /** get the value of the field: TaxPkgInstId (TAX_ABANDONED.tax_pkg_inst_id)
   * @return Integer the value
   */
  public Integer getTaxPkgInstId () {
    return this.TaxPkgInstId;
  }
  /** Change the field to not being actively set: TaxPkgInstId (TAX_ABANDONED.tax_pkg_inst_id)
   */
  public void unsetTaxPkgInstId () {
    this._TaxPkgInstIdSet = false;
  }
  /** See if the field is actively set: TaxPkgInstId (TAX_ABANDONED.tax_pkg_inst_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxPkgInstId () {
    return this._TaxPkgInstIdSet;
  }
  /** set the fields value: AbandonReason (TAX_ABANDONED.abandon_reason)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AbandonReason") 
  public void setAbandonReason (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AbandonReason", "setAbandonReason");
    }
    this.AbandonReason = value;
    this._AbandonReasonSet = true;
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

  /** get the value of the field: AbandonReason (TAX_ABANDONED.abandon_reason)
   * @return Integer the value
   */
  public Integer getAbandonReason () {
    return this.AbandonReason;
  }
  /** Change the field to not being actively set: AbandonReason (TAX_ABANDONED.abandon_reason)
   */
  public void unsetAbandonReason () {
    this._AbandonReasonSet = false;
  }
  /** See if the field is actively set: AbandonReason (TAX_ABANDONED.abandon_reason)
   * @return boolean whether the field is actively set
   */
  public boolean issetAbandonReason () {
    return this._AbandonReasonSet;
  }
  public String toString() {
    return TaxAbandonedObjectKeyHelper.toMap(this, null).toString();
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
    
  /** TAX_ABANDONED.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  /** TAX_ABANDONED.bill_ref_no field */
    if(!nonNullOnly || (BillRefNo != null))  _BillRefNoSet = flag;
  /** TAX_ABANDONED.bill_ref_resets field */
    if(!nonNullOnly || (BillRefResets != null))  _BillRefResetsSet = flag;
  /** TAX_ABANDONED.bill_invoice_row field */
    if(!nonNullOnly || (BillInvoiceRow != null))  _BillInvoiceRowSet = flag;
  /** TAX_ABANDONED.tax_pkg_inst_id field */
    if(!nonNullOnly || (TaxPkgInstId != null))  _TaxPkgInstIdSet = flag;
  /** TAX_ABANDONED.abandon_reason field */
    if(!nonNullOnly || (AbandonReason != null))  _AbandonReasonSet = flag;
  }
}
