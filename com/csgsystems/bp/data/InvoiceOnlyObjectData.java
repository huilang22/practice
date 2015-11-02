/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InvoiceOnlyObjectData.java
 * Definition File: Customer/Invoice.xml
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
  
/** InvoiceOnlyObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class InvoiceOnlyObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public InvoiceOnlyObjectKeyData Key = null;
  /** BILL_INVOICE.account_no field */
  public    Integer AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  /** BILL_INVOICE.prep_status field */
  public    Integer PrepStatus  = null;
  protected boolean _PrepStatusSet = false;
  /** BILL_INVOICE.orig_bill_refno field */
  public    Integer OrigBillRefno  = null;
  protected boolean _OrigBillRefnoSet = false;
  /** BILL_INVOICE.orig_bill_ref_resets field */
  public    Integer OrigBillRefResets  = null;
  protected boolean _OrigBillRefResetsSet = false;
  /** BILL_INVOICE.to_date field */
  public    Date ToDate  = null;
  protected boolean _ToDateSet = false;
  /** BILL_INVOICE.from_date field */
  public    Date FromDate  = null;
  protected boolean _FromDateSet = false;
  /** BILL_INVOICE.statement_date field */
  public    Date StatementDate  = null;
  protected boolean _StatementDateSet = false;
  private String _objName = "InvoiceOnlyObjectData";
  /** Default constructor */
  public InvoiceOnlyObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public InvoiceOnlyObjectData (InvoiceOnlyObjectData other)
  {

    if (other == null) return;
    this.Key = new InvoiceOnlyObjectKeyData (other.Key);
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
    this.PrepStatus = other.PrepStatus;
    this._PrepStatusSet = other._PrepStatusSet;
    this.OrigBillRefno = other.OrigBillRefno;
    this._OrigBillRefnoSet = other._OrigBillRefnoSet;
    this.OrigBillRefResets = other.OrigBillRefResets;
    this._OrigBillRefResetsSet = other._OrigBillRefResetsSet;
    this.ToDate = other.ToDate;
    this._ToDateSet = other._ToDateSet;
    this.FromDate = other.FromDate;
    this._FromDateSet = other._FromDateSet;
    this.StatementDate = other.StatementDate;
    this._StatementDateSet = other._StatementDateSet;
  }

  /** get the Key for this object
   * @return InvoiceOnlyObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public InvoiceOnlyObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (InvoiceOnlyObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: BillRefNo (BILL_INVOICE.bill_ref_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBillRefNo (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillRefNo", "setBillRefNo");
    }
    if (this.Key == null) this.Key = new InvoiceOnlyObjectKeyData ();
    this.Key.BillRefNo = value;
    this.Key._BillRefNoSet = true;
  }
  /** get the value of the field: BillRefNo (BILL_INVOICE.bill_ref_no)
   * @return Integer the value
   */
  public Integer getBillRefNo () {
    if (this.Key == null) return null;
    return this.Key.BillRefNo;
  }
  /** Change the field to not being actively set: BillRefNo (BILL_INVOICE.bill_ref_no)
   */
  public void unsetBillRefNo () {
    if (this.Key == null) return;
    this.Key._BillRefNoSet = false;
  }
  /** See if the field is actively set: BillRefNo (BILL_INVOICE.bill_ref_no)
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

  /** set the fields value: BillRefResets (BILL_INVOICE.bill_ref_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBillRefResets (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillRefResets", "setBillRefResets");
    }
    if (this.Key == null) this.Key = new InvoiceOnlyObjectKeyData ();
    this.Key.BillRefResets = value;
    this.Key._BillRefResetsSet = true;
  }
  /** get the value of the field: BillRefResets (BILL_INVOICE.bill_ref_resets)
   * @return Integer the value
   */
  public Integer getBillRefResets () {
    if (this.Key == null) return null;
    return this.Key.BillRefResets;
  }
  /** Change the field to not being actively set: BillRefResets (BILL_INVOICE.bill_ref_resets)
   */
  public void unsetBillRefResets () {
    if (this.Key == null) return;
    this.Key._BillRefResetsSet = false;
  }
  /** See if the field is actively set: BillRefResets (BILL_INVOICE.bill_ref_resets)
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

  /** set the fields value: AccountInternalId (BILL_INVOICE.account_no)
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

  /** get the value of the field: AccountInternalId (BILL_INVOICE.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (BILL_INVOICE.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (BILL_INVOICE.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  /** set the fields value: PrepStatus (BILL_INVOICE.prep_status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrepStatus") 
  public void setPrepStatus (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PrepStatus", "setPrepStatus");
    }
    this.PrepStatus = value;
    this._PrepStatusSet = true;
  }

  /** Retrieves the PrepStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrepStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepStatus field
   */
   public String getPrepStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getPrepStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrepStatus field from a formatted string
   *
   * @param _value the PrepStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrepStatus field
   */
   public void setPrepStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrepStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepStatusFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated PrepStatus field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the PrepStatus field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the PrepStatus field
   */

  public String getPrepStatusDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepStatusDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getPrepStatusEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepStatusDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getPrepStatus()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepStatus");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepStatusDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated PrepStatus field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the PrepStatus field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the PrepStatus field
   */
  public Enumeration getPrepStatusEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepStatusEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("BillPrepStatus", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepStatusEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepStatus");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepStatusEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated PrepStatus field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setPrepStatusFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrepStatusFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getPrepStatusEnumeration(_locale);
      this.setPrepStatus((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepStatus");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepStatusFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrepStatusFromDisplayValue");
  }

  /** get the value of the field: PrepStatus (BILL_INVOICE.prep_status)
   * @return Integer the value
   */
  public Integer getPrepStatus () {
    return this.PrepStatus;
  }
  /** Change the field to not being actively set: PrepStatus (BILL_INVOICE.prep_status)
   */
  public void unsetPrepStatus () {
    this._PrepStatusSet = false;
  }
  /** See if the field is actively set: PrepStatus (BILL_INVOICE.prep_status)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrepStatus () {
    return this._PrepStatusSet;
  }
  /** set the fields value: OrigBillRefno (BILL_INVOICE.orig_bill_refno)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigBillRefno") 
  public void setOrigBillRefno (Integer value) throws ServiceException
  {
    this.OrigBillRefno = value;
    this._OrigBillRefnoSet = true;
  }

  /** Retrieves the OrigBillRefno field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigBillRefno field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigBillRefno field
   */
   public String getOrigBillRefnoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBillRefnoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigBillRefnoAsFormattedString");
       return fmtMgr.formatNumber(this.getOrigBillRefno(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigBillRefno");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigBillRefnoAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigBillRefno field from a formatted string
   *
   * @param _value the OrigBillRefno field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigBillRefno field
   */
   public void setOrigBillRefnoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBillRefnoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigBillRefno(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigBillRefno");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigBillRefnoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigBillRefnoFromFormattedString");
   }

  /** get the value of the field: OrigBillRefno (BILL_INVOICE.orig_bill_refno)
   * @return Integer the value
   */
  public Integer getOrigBillRefno () {
    return this.OrigBillRefno;
  }
  /** Change the field to not being actively set: OrigBillRefno (BILL_INVOICE.orig_bill_refno)
   */
  public void unsetOrigBillRefno () {
    this._OrigBillRefnoSet = false;
  }
  /** See if the field is actively set: OrigBillRefno (BILL_INVOICE.orig_bill_refno)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigBillRefno () {
    return this._OrigBillRefnoSet;
  }
  /** set the fields value: OrigBillRefResets (BILL_INVOICE.orig_bill_ref_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigBillRefResets") 
  public void setOrigBillRefResets (Integer value) throws ServiceException
  {
    this.OrigBillRefResets = value;
    this._OrigBillRefResetsSet = true;
  }

  /** Retrieves the OrigBillRefResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigBillRefResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigBillRefResets field
   */
   public String getOrigBillRefResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBillRefResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigBillRefResetsAsFormattedString");
       return fmtMgr.formatNumber(this.getOrigBillRefResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigBillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigBillRefResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigBillRefResets field from a formatted string
   *
   * @param _value the OrigBillRefResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigBillRefResets field
   */
   public void setOrigBillRefResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBillRefResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigBillRefResets(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigBillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigBillRefResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigBillRefResetsFromFormattedString");
   }

  /** get the value of the field: OrigBillRefResets (BILL_INVOICE.orig_bill_ref_resets)
   * @return Integer the value
   */
  public Integer getOrigBillRefResets () {
    return this.OrigBillRefResets;
  }
  /** Change the field to not being actively set: OrigBillRefResets (BILL_INVOICE.orig_bill_ref_resets)
   */
  public void unsetOrigBillRefResets () {
    this._OrigBillRefResetsSet = false;
  }
  /** See if the field is actively set: OrigBillRefResets (BILL_INVOICE.orig_bill_ref_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigBillRefResets () {
    return this._OrigBillRefResetsSet;
  }
  /** set the fields value: ToDate (BILL_INVOICE.to_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ToDate") 
  public void setToDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ToDate", "setToDate");
    }
    this.ToDate = value;
    this._ToDateSet = true;
  }

  /** Retrieves the ToDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ToDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ToDate field
   */
   public String getToDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getToDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getToDateAsFormattedString");
       return fmtMgr.formatDate(this.getToDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ToDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getToDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ToDate field from a formatted string
   *
   * @param _value the ToDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ToDate field
   */
   public void setToDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getToDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setToDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ToDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setToDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setToDateFromFormattedString");
   }

  /**
   * Retrieves the ToDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ToDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ToDate field
   */
  public String getToDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getToDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getToDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getToDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ToDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getToDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ToDate field value from a formatted date/time string
   *
   * @param _value the ToDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ToDate field
   */
  public void setToDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setToDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setToDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ToDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setToDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ToDate (BILL_INVOICE.to_date)
   * @return Date the value
   */
  public Date getToDate () {
    return this.ToDate;
  }
  /** Change the field to not being actively set: ToDate (BILL_INVOICE.to_date)
   */
  public void unsetToDate () {
    this._ToDateSet = false;
  }
  /** See if the field is actively set: ToDate (BILL_INVOICE.to_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetToDate () {
    return this._ToDateSet;
  }
  /** set the fields value: FromDate (BILL_INVOICE.from_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FromDate") 
  public void setFromDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FromDate", "setFromDate");
    }
    this.FromDate = value;
    this._FromDateSet = true;
  }

  /** Retrieves the FromDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FromDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FromDate field
   */
   public String getFromDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFromDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFromDateAsFormattedString");
       return fmtMgr.formatDate(this.getFromDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FromDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFromDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the FromDate field from a formatted string
   *
   * @param _value the FromDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FromDate field
   */
   public void setFromDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFromDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFromDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FromDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFromDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFromDateFromFormattedString");
   }

  /**
   * Retrieves the FromDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FromDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the FromDate field
   */
  public String getFromDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFromDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFromDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getFromDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FromDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFromDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the FromDate field value from a formatted date/time string
   *
   * @param _value the FromDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FromDate field
   */
  public void setFromDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFromDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setFromDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FromDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFromDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: FromDate (BILL_INVOICE.from_date)
   * @return Date the value
   */
  public Date getFromDate () {
    return this.FromDate;
  }
  /** Change the field to not being actively set: FromDate (BILL_INVOICE.from_date)
   */
  public void unsetFromDate () {
    this._FromDateSet = false;
  }
  /** See if the field is actively set: FromDate (BILL_INVOICE.from_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetFromDate () {
    return this._FromDateSet;
  }
  /** set the fields value: StatementDate (BILL_INVOICE.statement_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StatementDate") 
  public void setStatementDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "StatementDate", "setStatementDate");
    }
    this.StatementDate = value;
    this._StatementDateSet = true;
  }

  /** Retrieves the StatementDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StatementDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatementDate field
   */
   public String getStatementDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatementDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatementDateAsFormattedString");
       return fmtMgr.formatDate(this.getStatementDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatementDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatementDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the StatementDate field from a formatted string
   *
   * @param _value the StatementDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StatementDate field
   */
   public void setStatementDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatementDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStatementDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatementDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatementDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatementDateFromFormattedString");
   }

  /**
   * Retrieves the StatementDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StatementDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatementDate field
   */
  public String getStatementDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatementDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatementDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getStatementDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatementDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatementDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the StatementDate field value from a formatted date/time string
   *
   * @param _value the StatementDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StatementDate field
   */
  public void setStatementDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStatementDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setStatementDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatementDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatementDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: StatementDate (BILL_INVOICE.statement_date)
   * @return Date the value
   */
  public Date getStatementDate () {
    return this.StatementDate;
  }
  /** Change the field to not being actively set: StatementDate (BILL_INVOICE.statement_date)
   */
  public void unsetStatementDate () {
    this._StatementDateSet = false;
  }
  /** See if the field is actively set: StatementDate (BILL_INVOICE.statement_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetStatementDate () {
    return this._StatementDateSet;
  }
  public String toString() {
    return InvoiceOnlyObjectHelper.toMap(this, null).toString();
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
  /** BILL_INVOICE.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  /** BILL_INVOICE.prep_status field */
    if(!nonNullOnly || (PrepStatus != null))  _PrepStatusSet = flag;
  /** BILL_INVOICE.orig_bill_refno field */
    if(!nonNullOnly || (OrigBillRefno != null))  _OrigBillRefnoSet = flag;
  /** BILL_INVOICE.orig_bill_ref_resets field */
    if(!nonNullOnly || (OrigBillRefResets != null))  _OrigBillRefResetsSet = flag;
  /** BILL_INVOICE.to_date field */
    if(!nonNullOnly || (ToDate != null))  _ToDateSet = flag;
  /** BILL_INVOICE.from_date field */
    if(!nonNullOnly || (FromDate != null))  _FromDateSet = flag;
  /** BILL_INVOICE.statement_date field */
    if(!nonNullOnly || (StatementDate != null))  _StatementDateSet = flag;
  }
}
