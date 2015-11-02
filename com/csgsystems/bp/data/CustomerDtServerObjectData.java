/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CustomerDtServerObjectData.java
 * Definition File: Customer/CustomerDtServer.xml
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
  
/** CustomerDtServerObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class CustomerDtServerObjectData extends BaseObjectData implements Serializable
{

  /** CUSTOMER_DOCUMENT.document_id field */
  public    Integer DocumentId  = null;
  protected boolean _DocumentIdSet = false;
  /** CUSTOMER_DOCUMENT.document_type_id field */
  public    Integer DocumentTypeId  = null;
  protected boolean _DocumentTypeIdSet = false;
  /** CUSTOMER_DOCUMENT.source_id field */
  public    Integer SourceId  = null;
  protected boolean _SourceIdSet = false;
  /** CUSTOMER_DOCUMENT.source_id2 field */
  public    Integer SourceId2  = null;
  protected boolean _SourceId2Set = false;
  /** CUSTOMER_DOCUMENT.document_server field */
  public    String DocumentServer  = null;
  protected boolean _DocumentServerSet = false;
  /** CUSTOMER_DOCUMENT.display_filename field */
  public    String DisplayFilename  = null;
  protected boolean _DisplayFilenameSet = false;
  /** BILL_INVOICE.bill_ref_no field */
  public    Integer BillRefNo  = null;
  protected boolean _BillRefNoSet = false;
  /** BILL_INVOICE.bill_ref_resets field */
  public    Integer BillRefResets  = null;
  protected boolean _BillRefResetsSet = false;
  /** BILL_INVOICE.statement_date field */
  public    Date StatementDate  = null;
  protected boolean _StatementDateSet = false;
  /** BILL_INVOICE.prep_date field */
  public    Date PrepDate  = null;
  protected boolean _PrepDateSet = false;
  /** BILL_INVOICE.payment_due_date field */
  public    Date PaymentDueDate  = null;
  protected boolean _PaymentDueDateSet = false;
  /** BILL_INVOICE.account_no field */
  public    Integer AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  private String _objName = "CustomerDtServerObjectData";
  /** Default constructor */
  public CustomerDtServerObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public CustomerDtServerObjectData (CustomerDtServerObjectData other)
  {

    if (other == null) return;
    this.DocumentId = other.DocumentId;
    this._DocumentIdSet = other._DocumentIdSet;
    this.DocumentTypeId = other.DocumentTypeId;
    this._DocumentTypeIdSet = other._DocumentTypeIdSet;
    this.SourceId = other.SourceId;
    this._SourceIdSet = other._SourceIdSet;
    this.SourceId2 = other.SourceId2;
    this._SourceId2Set = other._SourceId2Set;
    this.DocumentServer = other.DocumentServer;
    this._DocumentServerSet = other._DocumentServerSet;
    this.DisplayFilename = other.DisplayFilename;
    this._DisplayFilenameSet = other._DisplayFilenameSet;
    this.BillRefNo = other.BillRefNo;
    this._BillRefNoSet = other._BillRefNoSet;
    this.BillRefResets = other.BillRefResets;
    this._BillRefResetsSet = other._BillRefResetsSet;
    this.StatementDate = other.StatementDate;
    this._StatementDateSet = other._StatementDateSet;
    this.PrepDate = other.PrepDate;
    this._PrepDateSet = other._PrepDateSet;
    this.PaymentDueDate = other.PaymentDueDate;
    this._PaymentDueDateSet = other._PaymentDueDateSet;
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
  }

  /** set the fields value: DocumentId (CUSTOMER_DOCUMENT.document_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DocumentId") 
  public void setDocumentId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DocumentId", "setDocumentId");
    }
    this.DocumentId = value;
    this._DocumentIdSet = true;
  }

  /** Retrieves the DocumentId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DocumentId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DocumentId field
   */
   public String getDocumentIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDocumentIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDocumentIdAsFormattedString");
       return fmtMgr.formatNumber(this.getDocumentId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DocumentId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDocumentIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the DocumentId field from a formatted string
   *
   * @param _value the DocumentId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DocumentId field
   */
   public void setDocumentIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDocumentIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDocumentId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DocumentId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDocumentIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDocumentIdFromFormattedString");
   }

  /** get the value of the field: DocumentId (CUSTOMER_DOCUMENT.document_id)
   * @return Integer the value
   */
  public Integer getDocumentId () {
    return this.DocumentId;
  }
  /** Change the field to not being actively set: DocumentId (CUSTOMER_DOCUMENT.document_id)
   */
  public void unsetDocumentId () {
    this._DocumentIdSet = false;
  }
  /** See if the field is actively set: DocumentId (CUSTOMER_DOCUMENT.document_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetDocumentId () {
    return this._DocumentIdSet;
  }
  /** set the fields value: DocumentTypeId (CUSTOMER_DOCUMENT.document_type_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DocumentTypeId") 
  public void setDocumentTypeId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DocumentTypeId", "setDocumentTypeId");
    }
    this.DocumentTypeId = value;
    this._DocumentTypeIdSet = true;
  }

  /** Retrieves the DocumentTypeId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DocumentTypeId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DocumentTypeId field
   */
   public String getDocumentTypeIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDocumentTypeIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDocumentTypeIdAsFormattedString");
       return fmtMgr.formatNumber(this.getDocumentTypeId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DocumentTypeId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDocumentTypeIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the DocumentTypeId field from a formatted string
   *
   * @param _value the DocumentTypeId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DocumentTypeId field
   */
   public void setDocumentTypeIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDocumentTypeIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDocumentTypeId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DocumentTypeId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDocumentTypeIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDocumentTypeIdFromFormattedString");
   }

  /** get the value of the field: DocumentTypeId (CUSTOMER_DOCUMENT.document_type_id)
   * @return Integer the value
   */
  public Integer getDocumentTypeId () {
    return this.DocumentTypeId;
  }
  /** Change the field to not being actively set: DocumentTypeId (CUSTOMER_DOCUMENT.document_type_id)
   */
  public void unsetDocumentTypeId () {
    this._DocumentTypeIdSet = false;
  }
  /** See if the field is actively set: DocumentTypeId (CUSTOMER_DOCUMENT.document_type_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetDocumentTypeId () {
    return this._DocumentTypeIdSet;
  }
  /** set the fields value: SourceId (CUSTOMER_DOCUMENT.source_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SourceId") 
  public void setSourceId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SourceId", "setSourceId");
    }
    this.SourceId = value;
    this._SourceIdSet = true;
  }

  /** Retrieves the SourceId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SourceId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SourceId field
   */
   public String getSourceIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSourceIdAsFormattedString");
       return fmtMgr.formatNumber(this.getSourceId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SourceId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSourceIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the SourceId field from a formatted string
   *
   * @param _value the SourceId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SourceId field
   */
   public void setSourceIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSourceId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SourceId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSourceIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSourceIdFromFormattedString");
   }

  /** get the value of the field: SourceId (CUSTOMER_DOCUMENT.source_id)
   * @return Integer the value
   */
  public Integer getSourceId () {
    return this.SourceId;
  }
  /** Change the field to not being actively set: SourceId (CUSTOMER_DOCUMENT.source_id)
   */
  public void unsetSourceId () {
    this._SourceIdSet = false;
  }
  /** See if the field is actively set: SourceId (CUSTOMER_DOCUMENT.source_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetSourceId () {
    return this._SourceIdSet;
  }
  /** set the fields value: SourceId2 (CUSTOMER_DOCUMENT.source_id2)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SourceId2") 
  public void setSourceId2 (Integer value) throws ServiceException
  {
    this.SourceId2 = value;
    this._SourceId2Set = true;
  }

  /** Retrieves the SourceId2 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SourceId2 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SourceId2 field
   */
   public String getSourceId2AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceId2AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSourceId2AsFormattedString");
       return fmtMgr.formatNumber(this.getSourceId2(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SourceId2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSourceId2AsFormattedString");
       throw x;
     }
   }
  /** Sets the SourceId2 field from a formatted string
   *
   * @param _value the SourceId2 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SourceId2 field
   */
   public void setSourceId2FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceId2FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSourceId2(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SourceId2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSourceId2FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSourceId2FromFormattedString");
   }

  /** get the value of the field: SourceId2 (CUSTOMER_DOCUMENT.source_id2)
   * @return Integer the value
   */
  public Integer getSourceId2 () {
    return this.SourceId2;
  }
  /** Change the field to not being actively set: SourceId2 (CUSTOMER_DOCUMENT.source_id2)
   */
  public void unsetSourceId2 () {
    this._SourceId2Set = false;
  }
  /** See if the field is actively set: SourceId2 (CUSTOMER_DOCUMENT.source_id2)
   * @return boolean whether the field is actively set
   */
  public boolean issetSourceId2 () {
    return this._SourceId2Set;
  }
  /** set the fields value: DocumentServer (CUSTOMER_DOCUMENT.document_server)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DocumentServer") 
  public void setDocumentServer (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DocumentServer", "setDocumentServer");
    }
    this.DocumentServer = value;
    this._DocumentServerSet = true;
  }

  /** Retrieves the DocumentServer field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DocumentServer field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DocumentServer field
   */
   public String getDocumentServerAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDocumentServerAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDocumentServerAsFormattedString");
       return fmtMgr.formatString(this.getDocumentServer());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DocumentServer");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDocumentServerAsFormattedString");
       throw x;
     }
   }
  /** Sets the DocumentServer field from a formatted string
   *
   * @param _value the DocumentServer field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DocumentServer field
   */
   public void setDocumentServerFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDocumentServerFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDocumentServer(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DocumentServer");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDocumentServerFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDocumentServerFromFormattedString");
   }

  /** get the value of the field: DocumentServer (CUSTOMER_DOCUMENT.document_server)
   * @return String the value
   */
  public String getDocumentServer () {
    return this.DocumentServer;
  }
  /** Change the field to not being actively set: DocumentServer (CUSTOMER_DOCUMENT.document_server)
   */
  public void unsetDocumentServer () {
    this._DocumentServerSet = false;
  }
  /** See if the field is actively set: DocumentServer (CUSTOMER_DOCUMENT.document_server)
   * @return boolean whether the field is actively set
   */
  public boolean issetDocumentServer () {
    return this._DocumentServerSet;
  }
  /** set the fields value: DisplayFilename (CUSTOMER_DOCUMENT.display_filename)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DisplayFilename") 
  public void setDisplayFilename (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 128))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DisplayFilename", "setDisplayFilename");
    }
    this.DisplayFilename = value;
    this._DisplayFilenameSet = true;
  }

  /** Retrieves the DisplayFilename field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DisplayFilename field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DisplayFilename field
   */
   public String getDisplayFilenameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisplayFilenameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDisplayFilenameAsFormattedString");
       return fmtMgr.formatString(this.getDisplayFilename());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DisplayFilename");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDisplayFilenameAsFormattedString");
       throw x;
     }
   }
  /** Sets the DisplayFilename field from a formatted string
   *
   * @param _value the DisplayFilename field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DisplayFilename field
   */
   public void setDisplayFilenameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisplayFilenameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDisplayFilename(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DisplayFilename");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDisplayFilenameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDisplayFilenameFromFormattedString");
   }

  /** get the value of the field: DisplayFilename (CUSTOMER_DOCUMENT.display_filename)
   * @return String the value
   */
  public String getDisplayFilename () {
    return this.DisplayFilename;
  }
  /** Change the field to not being actively set: DisplayFilename (CUSTOMER_DOCUMENT.display_filename)
   */
  public void unsetDisplayFilename () {
    this._DisplayFilenameSet = false;
  }
  /** See if the field is actively set: DisplayFilename (CUSTOMER_DOCUMENT.display_filename)
   * @return boolean whether the field is actively set
   */
  public boolean issetDisplayFilename () {
    return this._DisplayFilenameSet;
  }
  /** set the fields value: BillRefNo (BILL_INVOICE.bill_ref_no)
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

  /** get the value of the field: BillRefNo (BILL_INVOICE.bill_ref_no)
   * @return Integer the value
   */
  public Integer getBillRefNo () {
    return this.BillRefNo;
  }
  /** Change the field to not being actively set: BillRefNo (BILL_INVOICE.bill_ref_no)
   */
  public void unsetBillRefNo () {
    this._BillRefNoSet = false;
  }
  /** See if the field is actively set: BillRefNo (BILL_INVOICE.bill_ref_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefNo () {
    return this._BillRefNoSet;
  }
  /** set the fields value: BillRefResets (BILL_INVOICE.bill_ref_resets)
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

  /** get the value of the field: BillRefResets (BILL_INVOICE.bill_ref_resets)
   * @return Integer the value
   */
  public Integer getBillRefResets () {
    return this.BillRefResets;
  }
  /** Change the field to not being actively set: BillRefResets (BILL_INVOICE.bill_ref_resets)
   */
  public void unsetBillRefResets () {
    this._BillRefResetsSet = false;
  }
  /** See if the field is actively set: BillRefResets (BILL_INVOICE.bill_ref_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefResets () {
    return this._BillRefResetsSet;
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
  /** set the fields value: PrepDate (BILL_INVOICE.prep_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrepDate") 
  public void setPrepDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PrepDate", "setPrepDate");
    }
    this.PrepDate = value;
    this._PrepDateSet = true;
  }

  /** Retrieves the PrepDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrepDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepDate field
   */
   public String getPrepDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepDateAsFormattedString");
       return fmtMgr.formatDate(this.getPrepDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrepDate field from a formatted string
   *
   * @param _value the PrepDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrepDate field
   */
   public void setPrepDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrepDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepDateFromFormattedString");
   }

  /**
   * Retrieves the PrepDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrepDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepDate field
   */
  public String getPrepDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getPrepDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PrepDate field value from a formatted date/time string
   *
   * @param _value the PrepDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrepDate field
   */
  public void setPrepDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrepDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setPrepDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: PrepDate (BILL_INVOICE.prep_date)
   * @return Date the value
   */
  public Date getPrepDate () {
    return this.PrepDate;
  }
  /** Change the field to not being actively set: PrepDate (BILL_INVOICE.prep_date)
   */
  public void unsetPrepDate () {
    this._PrepDateSet = false;
  }
  /** See if the field is actively set: PrepDate (BILL_INVOICE.prep_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrepDate () {
    return this._PrepDateSet;
  }
  /** set the fields value: PaymentDueDate (BILL_INVOICE.payment_due_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PaymentDueDate") 
  public void setPaymentDueDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PaymentDueDate", "setPaymentDueDate");
    }
    this.PaymentDueDate = value;
    this._PaymentDueDateSet = true;
  }

  /** Retrieves the PaymentDueDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PaymentDueDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PaymentDueDate field
   */
   public String getPaymentDueDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentDueDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentDueDateAsFormattedString");
       return fmtMgr.formatDate(this.getPaymentDueDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PaymentDueDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPaymentDueDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the PaymentDueDate field from a formatted string
   *
   * @param _value the PaymentDueDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PaymentDueDate field
   */
   public void setPaymentDueDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentDueDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPaymentDueDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PaymentDueDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPaymentDueDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPaymentDueDateFromFormattedString");
   }

  /**
   * Retrieves the PaymentDueDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PaymentDueDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PaymentDueDate field
   */
  public String getPaymentDueDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentDueDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentDueDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getPaymentDueDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PaymentDueDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPaymentDueDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PaymentDueDate field value from a formatted date/time string
   *
   * @param _value the PaymentDueDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PaymentDueDate field
   */
  public void setPaymentDueDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPaymentDueDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setPaymentDueDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PaymentDueDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPaymentDueDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: PaymentDueDate (BILL_INVOICE.payment_due_date)
   * @return Date the value
   */
  public Date getPaymentDueDate () {
    return this.PaymentDueDate;
  }
  /** Change the field to not being actively set: PaymentDueDate (BILL_INVOICE.payment_due_date)
   */
  public void unsetPaymentDueDate () {
    this._PaymentDueDateSet = false;
  }
  /** See if the field is actively set: PaymentDueDate (BILL_INVOICE.payment_due_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetPaymentDueDate () {
    return this._PaymentDueDateSet;
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
  public String toString() {
    return CustomerDtServerObjectHelper.toMap(this, null).toString();
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
    
  /** CUSTOMER_DOCUMENT.document_id field */
    if(!nonNullOnly || (DocumentId != null))  _DocumentIdSet = flag;
  /** CUSTOMER_DOCUMENT.document_type_id field */
    if(!nonNullOnly || (DocumentTypeId != null))  _DocumentTypeIdSet = flag;
  /** CUSTOMER_DOCUMENT.source_id field */
    if(!nonNullOnly || (SourceId != null))  _SourceIdSet = flag;
  /** CUSTOMER_DOCUMENT.source_id2 field */
    if(!nonNullOnly || (SourceId2 != null))  _SourceId2Set = flag;
  /** CUSTOMER_DOCUMENT.document_server field */
    if(!nonNullOnly || (DocumentServer != null))  _DocumentServerSet = flag;
  /** CUSTOMER_DOCUMENT.display_filename field */
    if(!nonNullOnly || (DisplayFilename != null))  _DisplayFilenameSet = flag;
  /** BILL_INVOICE.bill_ref_no field */
    if(!nonNullOnly || (BillRefNo != null))  _BillRefNoSet = flag;
  /** BILL_INVOICE.bill_ref_resets field */
    if(!nonNullOnly || (BillRefResets != null))  _BillRefResetsSet = flag;
  /** BILL_INVOICE.statement_date field */
    if(!nonNullOnly || (StatementDate != null))  _StatementDateSet = flag;
  /** BILL_INVOICE.prep_date field */
    if(!nonNullOnly || (PrepDate != null))  _PrepDateSet = flag;
  /** BILL_INVOICE.payment_due_date field */
    if(!nonNullOnly || (PaymentDueDate != null))  _PaymentDueDateSet = flag;
  /** BILL_INVOICE.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  }
}
