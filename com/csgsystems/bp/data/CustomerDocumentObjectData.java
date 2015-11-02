/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CustomerDocumentObjectData.java
 * Definition File: Customer/CustomerDocument.xml
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
  
/** CustomerDocumentObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class CustomerDocumentObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public CustomerDocumentObjectKeyData Key = null;
  /** CUSTOMER_DOCUMENT.document_type_id field */
  public    Integer DocumentTypeId  = null;
  protected boolean _DocumentTypeIdSet = false;
  /** CUSTOMER_DOCUMENT.source_id field */
  public    Integer SourceId  = null;
  protected boolean _SourceIdSet = false;
  /** CUSTOMER_DOCUMENT.source_id2 field */
  public    Integer SourceId2  = null;
  protected boolean _SourceId2Set = false;
  /** CUSTOMER_DOCUMENT.bill_disp_meth field */
  public    Integer BillDispMeth  = null;
  protected boolean _BillDispMethSet = false;
  /** CUSTOMER_DOCUMENT.bill_fmt_opt field */
  public    Integer BillFmtOpt  = null;
  protected boolean _BillFmtOptSet = false;
  /** CUSTOMER_DOCUMENT.bill_fmt_type field */
  public    String BillFmtType  = null;
  protected boolean _BillFmtTypeSet = false;
  /** CUSTOMER_DOCUMENT.address_id field */
  public    BigInteger AddressId  = null;
  protected boolean _AddressIdSet = false;
  /** CUSTOMER_DOCUMENT.status field */
  public    Integer Status  = null;
  protected boolean _StatusSet = false;
  /** CUSTOMER_DOCUMENT.processed_date field */
  public    Date ProcessedDate  = null;
  protected boolean _ProcessedDateSet = false;
  /** CUSTOMER_DOCUMENT.document_server field */
  public    String DocumentServer  = null;
  protected boolean _DocumentServerSet = false;
  /** CUSTOMER_DOCUMENT.display_filename field */
  public    String DisplayFilename  = null;
  protected boolean _DisplayFilenameSet = false;
  private String _objName = "CustomerDocumentObjectData";
  /** Default constructor */
  public CustomerDocumentObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public CustomerDocumentObjectData (CustomerDocumentObjectData other)
  {

    if (other == null) return;
    this.Key = new CustomerDocumentObjectKeyData (other.Key);
    this.DocumentTypeId = other.DocumentTypeId;
    this._DocumentTypeIdSet = other._DocumentTypeIdSet;
    this.SourceId = other.SourceId;
    this._SourceIdSet = other._SourceIdSet;
    this.SourceId2 = other.SourceId2;
    this._SourceId2Set = other._SourceId2Set;
    this.BillDispMeth = other.BillDispMeth;
    this._BillDispMethSet = other._BillDispMethSet;
    this.BillFmtOpt = other.BillFmtOpt;
    this._BillFmtOptSet = other._BillFmtOptSet;
    this.BillFmtType = other.BillFmtType;
    this._BillFmtTypeSet = other._BillFmtTypeSet;
    this.AddressId = other.AddressId;
    this._AddressIdSet = other._AddressIdSet;
    this.Status = other.Status;
    this._StatusSet = other._StatusSet;
    this.ProcessedDate = other.ProcessedDate;
    this._ProcessedDateSet = other._ProcessedDateSet;
    this.DocumentServer = other.DocumentServer;
    this._DocumentServerSet = other._DocumentServerSet;
    this.DisplayFilename = other.DisplayFilename;
    this._DisplayFilenameSet = other._DisplayFilenameSet;
  }

  /** get the Key for this object
   * @return CustomerDocumentObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public CustomerDocumentObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (CustomerDocumentObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: DocumentId (CUSTOMER_DOCUMENT.document_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setDocumentId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DocumentId", "setDocumentId");
    }
    if (this.Key == null) this.Key = new CustomerDocumentObjectKeyData ();
    this.Key.DocumentId = value;
    this.Key._DocumentIdSet = true;
  }
  /** get the value of the field: DocumentId (CUSTOMER_DOCUMENT.document_id)
   * @return Integer the value
   */
  public Integer getDocumentId () {
    if (this.Key == null) return null;
    return this.Key.DocumentId;
  }
  /** Change the field to not being actively set: DocumentId (CUSTOMER_DOCUMENT.document_id)
   */
  public void unsetDocumentId () {
    if (this.Key == null) return;
    this.Key._DocumentIdSet = false;
  }
  /** See if the field is actively set: DocumentId (CUSTOMER_DOCUMENT.document_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetDocumentId () {
    if (this.Key == null) return false;
    return this.Key._DocumentIdSet;
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
  /** set the fields value: BillDispMeth (CUSTOMER_DOCUMENT.bill_disp_meth)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillDispMeth") 
  public void setBillDispMeth (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillDispMeth", "setBillDispMeth");
    }
    this.BillDispMeth = value;
    this._BillDispMethSet = true;
  }

  /** Retrieves the BillDispMeth field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillDispMeth field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillDispMeth field
   */
   public String getBillDispMethAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillDispMethAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillDispMethAsFormattedString");
       return fmtMgr.formatNumber(this.getBillDispMeth(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillDispMeth");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillDispMethAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillDispMeth field from a formatted string
   *
   * @param _value the BillDispMeth field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillDispMeth field
   */
   public void setBillDispMethFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillDispMethFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillDispMeth(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillDispMeth");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillDispMethFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillDispMethFromFormattedString");
   }

  /** get the value of the field: BillDispMeth (CUSTOMER_DOCUMENT.bill_disp_meth)
   * @return Integer the value
   */
  public Integer getBillDispMeth () {
    return this.BillDispMeth;
  }
  /** Change the field to not being actively set: BillDispMeth (CUSTOMER_DOCUMENT.bill_disp_meth)
   */
  public void unsetBillDispMeth () {
    this._BillDispMethSet = false;
  }
  /** See if the field is actively set: BillDispMeth (CUSTOMER_DOCUMENT.bill_disp_meth)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillDispMeth () {
    return this._BillDispMethSet;
  }
  /** set the fields value: BillFmtOpt (CUSTOMER_DOCUMENT.bill_fmt_opt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillFmtOpt") 
  public void setBillFmtOpt (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillFmtOpt", "setBillFmtOpt");
    }
    this.BillFmtOpt = value;
    this._BillFmtOptSet = true;
  }

  /** Retrieves the BillFmtOpt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillFmtOpt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillFmtOpt field
   */
   public String getBillFmtOptAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFmtOptAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillFmtOptAsFormattedString");
       return fmtMgr.formatNumber(this.getBillFmtOpt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillFmtOpt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillFmtOptAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillFmtOpt field from a formatted string
   *
   * @param _value the BillFmtOpt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillFmtOpt field
   */
   public void setBillFmtOptFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFmtOptFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillFmtOpt(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillFmtOpt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillFmtOptFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillFmtOptFromFormattedString");
   }

  /** get the value of the field: BillFmtOpt (CUSTOMER_DOCUMENT.bill_fmt_opt)
   * @return Integer the value
   */
  public Integer getBillFmtOpt () {
    return this.BillFmtOpt;
  }
  /** Change the field to not being actively set: BillFmtOpt (CUSTOMER_DOCUMENT.bill_fmt_opt)
   */
  public void unsetBillFmtOpt () {
    this._BillFmtOptSet = false;
  }
  /** See if the field is actively set: BillFmtOpt (CUSTOMER_DOCUMENT.bill_fmt_opt)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillFmtOpt () {
    return this._BillFmtOptSet;
  }
  /** set the fields value: BillFmtType (CUSTOMER_DOCUMENT.bill_fmt_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillFmtType") 
  public void setBillFmtType (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillFmtType", "setBillFmtType");
    }
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillFmtType", "setBillFmtType");
    }
    this.BillFmtType = value;
    this._BillFmtTypeSet = true;
  }

  /** Retrieves the BillFmtType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillFmtType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillFmtType field
   */
   public String getBillFmtTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFmtTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillFmtTypeAsFormattedString");
       return fmtMgr.formatString(this.getBillFmtType());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillFmtType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillFmtTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillFmtType field from a formatted string
   *
   * @param _value the BillFmtType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillFmtType field
   */
   public void setBillFmtTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFmtTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillFmtType(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillFmtType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillFmtTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillFmtTypeFromFormattedString");
   }

  /** get the value of the field: BillFmtType (CUSTOMER_DOCUMENT.bill_fmt_type)
   * @return String the value
   */
  public String getBillFmtType () {
    return this.BillFmtType;
  }
  /** Change the field to not being actively set: BillFmtType (CUSTOMER_DOCUMENT.bill_fmt_type)
   */
  public void unsetBillFmtType () {
    this._BillFmtTypeSet = false;
  }
  /** See if the field is actively set: BillFmtType (CUSTOMER_DOCUMENT.bill_fmt_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillFmtType () {
    return this._BillFmtTypeSet;
  }
  /** set the fields value: AddressId (CUSTOMER_DOCUMENT.address_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AddressId") 
  public void setAddressId (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AddressId", "setAddressId");
    }
    this.AddressId = value;
    this._AddressIdSet = true;
  }

  /** Retrieves the AddressId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AddressId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AddressId field
   */
   public String getAddressIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddressIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAddressIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAddressId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AddressId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAddressIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AddressId field from a formatted string
   *
   * @param _value the AddressId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AddressId field
   */
   public void setAddressIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddressIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAddressId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AddressId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAddressIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAddressIdFromFormattedString");
   }

  /** get the value of the field: AddressId (CUSTOMER_DOCUMENT.address_id)
   * @return BigInteger the value
   */
  public BigInteger getAddressId () {
    return this.AddressId;
  }
  /** Change the field to not being actively set: AddressId (CUSTOMER_DOCUMENT.address_id)
   */
  public void unsetAddressId () {
    this._AddressIdSet = false;
  }
  /** See if the field is actively set: AddressId (CUSTOMER_DOCUMENT.address_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAddressId () {
    return this._AddressIdSet;
  }
  /** set the fields value: Status (CUSTOMER_DOCUMENT.status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Status") 
  public void setStatus (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Status", "setStatus");
    }
    this.Status = value;
    this._StatusSet = true;
  }

  /** Retrieves the Status field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Status field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Status field
   */
   public String getStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Status");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the Status field from a formatted string
   *
   * @param _value the Status field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Status field
   */
   public void setStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Status");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusFromFormattedString");
   }

  /** get the value of the field: Status (CUSTOMER_DOCUMENT.status)
   * @return Integer the value
   */
  public Integer getStatus () {
    return this.Status;
  }
  /** Change the field to not being actively set: Status (CUSTOMER_DOCUMENT.status)
   */
  public void unsetStatus () {
    this._StatusSet = false;
  }
  /** See if the field is actively set: Status (CUSTOMER_DOCUMENT.status)
   * @return boolean whether the field is actively set
   */
  public boolean issetStatus () {
    return this._StatusSet;
  }
  /** set the fields value: ProcessedDate (CUSTOMER_DOCUMENT.processed_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProcessedDate") 
  public void setProcessedDate (Date value) throws ServiceException
  {
    this.ProcessedDate = value;
    this._ProcessedDateSet = true;
  }

  /** Retrieves the ProcessedDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProcessedDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProcessedDate field
   */
   public String getProcessedDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProcessedDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProcessedDateAsFormattedString");
       return fmtMgr.formatDate(this.getProcessedDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProcessedDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProcessedDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProcessedDate field from a formatted string
   *
   * @param _value the ProcessedDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProcessedDate field
   */
   public void setProcessedDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProcessedDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProcessedDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProcessedDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProcessedDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProcessedDateFromFormattedString");
   }

  /**
   * Retrieves the ProcessedDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProcessedDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProcessedDate field
   */
  public String getProcessedDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProcessedDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProcessedDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getProcessedDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProcessedDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProcessedDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ProcessedDate field value from a formatted date/time string
   *
   * @param _value the ProcessedDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProcessedDate field
   */
  public void setProcessedDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProcessedDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setProcessedDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProcessedDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProcessedDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ProcessedDate (CUSTOMER_DOCUMENT.processed_date)
   * @return Date the value
   */
  public Date getProcessedDate () {
    return this.ProcessedDate;
  }
  /** Change the field to not being actively set: ProcessedDate (CUSTOMER_DOCUMENT.processed_date)
   */
  public void unsetProcessedDate () {
    this._ProcessedDateSet = false;
  }
  /** See if the field is actively set: ProcessedDate (CUSTOMER_DOCUMENT.processed_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetProcessedDate () {
    return this._ProcessedDateSet;
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
  public String toString() {
    return CustomerDocumentObjectHelper.toMap(this, null).toString();
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
  /** CUSTOMER_DOCUMENT.document_type_id field */
    if(!nonNullOnly || (DocumentTypeId != null))  _DocumentTypeIdSet = flag;
  /** CUSTOMER_DOCUMENT.source_id field */
    if(!nonNullOnly || (SourceId != null))  _SourceIdSet = flag;
  /** CUSTOMER_DOCUMENT.source_id2 field */
    if(!nonNullOnly || (SourceId2 != null))  _SourceId2Set = flag;
  /** CUSTOMER_DOCUMENT.bill_disp_meth field */
    if(!nonNullOnly || (BillDispMeth != null))  _BillDispMethSet = flag;
  /** CUSTOMER_DOCUMENT.bill_fmt_opt field */
    if(!nonNullOnly || (BillFmtOpt != null))  _BillFmtOptSet = flag;
  /** CUSTOMER_DOCUMENT.bill_fmt_type field */
    if(!nonNullOnly || (BillFmtType != null))  _BillFmtTypeSet = flag;
  /** CUSTOMER_DOCUMENT.address_id field */
    if(!nonNullOnly || (AddressId != null))  _AddressIdSet = flag;
  /** CUSTOMER_DOCUMENT.status field */
    if(!nonNullOnly || (Status != null))  _StatusSet = flag;
  /** CUSTOMER_DOCUMENT.processed_date field */
    if(!nonNullOnly || (ProcessedDate != null))  _ProcessedDateSet = flag;
  /** CUSTOMER_DOCUMENT.document_server field */
    if(!nonNullOnly || (DocumentServer != null))  _DocumentServerSet = flag;
  /** CUSTOMER_DOCUMENT.display_filename field */
    if(!nonNullOnly || (DisplayFilename != null))  _DisplayFilenameSet = flag;
  }
}
