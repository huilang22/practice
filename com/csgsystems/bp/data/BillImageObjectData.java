/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillImageObjectData.java
 * Definition File: Customer/BillImage.xml
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
  
/** BillImageObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class BillImageObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public BillImageObjectKeyData Key = null;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
  public    String AccountExternalId  = null;
  protected boolean _AccountExternalIdSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
  public    Integer AccountExternalIdType  = null;
  protected boolean _AccountExternalIdTypeSet = false;
  /** BILL_IMAGE.account_no field */
  public    Integer AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  /** BILL_IMAGE.from_date field */
  public    Date FromDate  = null;
  protected boolean _FromDateSet = false;
  /** BILL_IMAGE.to_date field */
  public    Date ToDate  = null;
  protected boolean _ToDateSet = false;
  /** BILL_IMAGE.bill_date field */
  public    Date BillDate  = null;
  protected boolean _BillDateSet = false;
  /** BILL_IMAGE.due_date field */
  public    Date DueDate  = null;
  protected boolean _DueDateSet = false;
  /** BILL_IMAGE.bill_lname field */
  public    String BillLname  = null;
  protected boolean _BillLnameSet = false;
  /** BILL_IMAGE.bill_fname field */
  public    String BillFname  = null;
  protected boolean _BillFnameSet = false;
  /** BILL_IMAGE.bill_company field */
  public    String BillCompany  = null;
  protected boolean _BillCompanySet = false;
  /** BILL_IMAGE.contact1_name field */
  public    String Contact1Name  = null;
  protected boolean _Contact1NameSet = false;
  /** BILL_IMAGE.contact2_name field */
  public    String Contact2Name  = null;
  protected boolean _Contact2NameSet = false;
  /** BILL_IMAGE.bill_image field */
  public    String BillImage  = null;
  protected boolean _BillImageSet = false;
  /** BILL_IMAGE.image_size field */
  public    Integer ImageSize  = null;
  protected boolean _ImageSizeSet = false;
  /** BILL_IMAGE.compression_type field */
  public    Integer CompressionType  = null;
  protected boolean _CompressionTypeSet = false;
  /** BILL_IMAGE.compressed_size field */
  public    Integer CompressedSize  = null;
  protected boolean _CompressedSizeSet = false;
  /** BILL_IMAGE.arch_flag field */
  public    Boolean ArchFlag  = null;
  protected boolean _ArchFlagSet = false;
  private String _objName = "BillImageObjectData";
  /** Default constructor */
  public BillImageObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public BillImageObjectData (BillImageObjectData other)
  {

    if (other == null) return;
    this.Key = new BillImageObjectKeyData (other.Key);
    this.AccountExternalId = other.AccountExternalId;
    this._AccountExternalIdSet = other._AccountExternalIdSet;
    this.AccountExternalIdType = other.AccountExternalIdType;
    this._AccountExternalIdTypeSet = other._AccountExternalIdTypeSet;
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
    this.FromDate = other.FromDate;
    this._FromDateSet = other._FromDateSet;
    this.ToDate = other.ToDate;
    this._ToDateSet = other._ToDateSet;
    this.BillDate = other.BillDate;
    this._BillDateSet = other._BillDateSet;
    this.DueDate = other.DueDate;
    this._DueDateSet = other._DueDateSet;
    this.BillLname = other.BillLname;
    this._BillLnameSet = other._BillLnameSet;
    this.BillFname = other.BillFname;
    this._BillFnameSet = other._BillFnameSet;
    this.BillCompany = other.BillCompany;
    this._BillCompanySet = other._BillCompanySet;
    this.Contact1Name = other.Contact1Name;
    this._Contact1NameSet = other._Contact1NameSet;
    this.Contact2Name = other.Contact2Name;
    this._Contact2NameSet = other._Contact2NameSet;
    this.BillImage = other.BillImage;
    this._BillImageSet = other._BillImageSet;
    this.ImageSize = other.ImageSize;
    this._ImageSizeSet = other._ImageSizeSet;
    this.CompressionType = other.CompressionType;
    this._CompressionTypeSet = other._CompressionTypeSet;
    this.CompressedSize = other.CompressedSize;
    this._CompressedSizeSet = other._CompressedSizeSet;
    this.ArchFlag = other.ArchFlag;
    this._ArchFlagSet = other._ArchFlagSet;
  }

  /** get the Key for this object
   * @return BillImageObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public BillImageObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (BillImageObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: BillRefNo (BILL_IMAGE.bill_ref_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBillRefNo (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillRefNo", "setBillRefNo");
    }
    if (this.Key == null) this.Key = new BillImageObjectKeyData ();
    this.Key.BillRefNo = value;
    this.Key._BillRefNoSet = true;
  }
  /** get the value of the field: BillRefNo (BILL_IMAGE.bill_ref_no)
   * @return Integer the value
   */
  public Integer getBillRefNo () {
    if (this.Key == null) return null;
    return this.Key.BillRefNo;
  }
  /** Change the field to not being actively set: BillRefNo (BILL_IMAGE.bill_ref_no)
   */
  public void unsetBillRefNo () {
    if (this.Key == null) return;
    this.Key._BillRefNoSet = false;
  }
  /** See if the field is actively set: BillRefNo (BILL_IMAGE.bill_ref_no)
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

  /** set the fields value: BillRefResets (BILL_IMAGE.bill_ref_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBillRefResets (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillRefResets", "setBillRefResets");
    }
    if (this.Key == null) this.Key = new BillImageObjectKeyData ();
    this.Key.BillRefResets = value;
    this.Key._BillRefResetsSet = true;
  }
  /** get the value of the field: BillRefResets (BILL_IMAGE.bill_ref_resets)
   * @return Integer the value
   */
  public Integer getBillRefResets () {
    if (this.Key == null) return null;
    return this.Key.BillRefResets;
  }
  /** Change the field to not being actively set: BillRefResets (BILL_IMAGE.bill_ref_resets)
   */
  public void unsetBillRefResets () {
    if (this.Key == null) return;
    this.Key._BillRefResetsSet = false;
  }
  /** See if the field is actively set: BillRefResets (BILL_IMAGE.bill_ref_resets)
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

  /** set the fields value: ImageType (BILL_IMAGE.image_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setImageType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ImageType", "setImageType");
    }
    if (this.Key == null) this.Key = new BillImageObjectKeyData ();
    this.Key.ImageType = value;
    this.Key._ImageTypeSet = true;
  }
  /** get the value of the field: ImageType (BILL_IMAGE.image_type)
   * @return Integer the value
   */
  public Integer getImageType () {
    if (this.Key == null) return null;
    return this.Key.ImageType;
  }
  /** Change the field to not being actively set: ImageType (BILL_IMAGE.image_type)
   */
  public void unsetImageType () {
    if (this.Key == null) return;
    this.Key._ImageTypeSet = false;
  }
  /** See if the field is actively set: ImageType (BILL_IMAGE.image_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetImageType () {
    if (this.Key == null) return false;
    return this.Key._ImageTypeSet;
  }

  /** Retrieves the ImageType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ImageType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ImageType field
   */
   public String getImageTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getImageTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getImageTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getImageType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ImageType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getImageTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ImageType field from a formatted string
   *
   * @param _value the ImageType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ImageType field
   */
   public void setImageTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getImageTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setImageType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ImageType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setImageTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setImageTypeFromFormattedString");
   }

  /** set the fields value: PageNo (BILL_IMAGE.page_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPageNo (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PageNo", "setPageNo");
    }
    if (this.Key == null) this.Key = new BillImageObjectKeyData ();
    this.Key.PageNo = value;
    this.Key._PageNoSet = true;
  }
  /** get the value of the field: PageNo (BILL_IMAGE.page_no)
   * @return Integer the value
   */
  public Integer getPageNo () {
    if (this.Key == null) return null;
    return this.Key.PageNo;
  }
  /** Change the field to not being actively set: PageNo (BILL_IMAGE.page_no)
   */
  public void unsetPageNo () {
    if (this.Key == null) return;
    this.Key._PageNoSet = false;
  }
  /** See if the field is actively set: PageNo (BILL_IMAGE.page_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetPageNo () {
    if (this.Key == null) return false;
    return this.Key._PageNoSet;
  }

  /** Retrieves the PageNo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PageNo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PageNo field
   */
   public String getPageNoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPageNoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPageNoAsFormattedString");
       return fmtMgr.formatNumber(this.getPageNo(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PageNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPageNoAsFormattedString");
       throw x;
     }
   }
  /** Sets the PageNo field from a formatted string
   *
   * @param _value the PageNo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PageNo field
   */
   public void setPageNoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPageNoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPageNo(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PageNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPageNoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPageNoFromFormattedString");
   }

  /** set the fields value: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountExternalId") 
  public void setAccountExternalId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountExternalId", "setAccountExternalId");
    }
    if (value != null && !DataHelper.validLength (value, 144))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AccountExternalId", "setAccountExternalId");
    }
    this.AccountExternalId = value;
    this._AccountExternalIdSet = true;
  }

  /** Retrieves the AccountExternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountExternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountExternalId field
   */
   public String getAccountExternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdAsFormattedString");
       return fmtMgr.formatString(this.getAccountExternalId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountExternalId field from a formatted string
   *
   * @param _value the AccountExternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountExternalId field
   */
   public void setAccountExternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountExternalId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdFromFormattedString");
   }

  /** get the value of the field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return String the value
   */
  public String getAccountExternalId () {
    return this.AccountExternalId;
  }
  /** Change the field to not being actively set: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   */
  public void unsetAccountExternalId () {
    this._AccountExternalIdSet = false;
  }
  /** See if the field is actively set: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountExternalId () {
    return this._AccountExternalIdSet;
  }
  /** set the fields value: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountExternalIdType") 
  public void setAccountExternalIdType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountExternalIdType", "setAccountExternalIdType");
    }
    this.AccountExternalIdType = value;
    this._AccountExternalIdTypeSet = true;
  }

  /** Retrieves the AccountExternalIdType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountExternalIdType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountExternalIdType field
   */
   public String getAccountExternalIdTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getAccountExternalIdType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountExternalIdType field from a formatted string
   *
   * @param _value the AccountExternalIdType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountExternalIdType field
   */
   public void setAccountExternalIdTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountExternalIdType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdTypeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated AccountExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AccountExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccountExternalIdType field
   */

  public String getAccountExternalIdTypeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAccountExternalIdTypeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdTypeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getAccountExternalIdType()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdTypeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated AccountExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the AccountExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccountExternalIdType field
   */
  public Enumeration getAccountExternalIdTypeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ExternalIdType", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdTypeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdTypeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated AccountExternalIdType field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setAccountExternalIdTypeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountExternalIdTypeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAccountExternalIdTypeEnumeration(_locale);
      this.setAccountExternalIdType((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdTypeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountExternalIdTypeFromDisplayValue");
  }

  /** get the value of the field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return Integer the value
   */
  public Integer getAccountExternalIdType () {
    return this.AccountExternalIdType;
  }
  /** Change the field to not being actively set: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   */
  public void unsetAccountExternalIdType () {
    this._AccountExternalIdTypeSet = false;
  }
  /** See if the field is actively set: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountExternalIdType () {
    return this._AccountExternalIdTypeSet;
  }
  /** set the fields value: AccountInternalId (BILL_IMAGE.account_no)
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

  /** get the value of the field: AccountInternalId (BILL_IMAGE.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (BILL_IMAGE.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (BILL_IMAGE.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  /** set the fields value: FromDate (BILL_IMAGE.from_date)
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

  /** get the value of the field: FromDate (BILL_IMAGE.from_date)
   * @return Date the value
   */
  public Date getFromDate () {
    return this.FromDate;
  }
  /** Change the field to not being actively set: FromDate (BILL_IMAGE.from_date)
   */
  public void unsetFromDate () {
    this._FromDateSet = false;
  }
  /** See if the field is actively set: FromDate (BILL_IMAGE.from_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetFromDate () {
    return this._FromDateSet;
  }
  /** set the fields value: ToDate (BILL_IMAGE.to_date)
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

  /** get the value of the field: ToDate (BILL_IMAGE.to_date)
   * @return Date the value
   */
  public Date getToDate () {
    return this.ToDate;
  }
  /** Change the field to not being actively set: ToDate (BILL_IMAGE.to_date)
   */
  public void unsetToDate () {
    this._ToDateSet = false;
  }
  /** See if the field is actively set: ToDate (BILL_IMAGE.to_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetToDate () {
    return this._ToDateSet;
  }
  /** set the fields value: BillDate (BILL_IMAGE.bill_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillDate") 
  public void setBillDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillDate", "setBillDate");
    }
    this.BillDate = value;
    this._BillDateSet = true;
  }

  /** Retrieves the BillDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillDate field
   */
   public String getBillDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillDateAsFormattedString");
       return fmtMgr.formatDate(this.getBillDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillDate field from a formatted string
   *
   * @param _value the BillDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillDate field
   */
   public void setBillDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillDateFromFormattedString");
   }

  /**
   * Retrieves the BillDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillDate field
   */
  public String getBillDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getBillDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the BillDate field value from a formatted date/time string
   *
   * @param _value the BillDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillDate field
   */
  public void setBillDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setBillDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: BillDate (BILL_IMAGE.bill_date)
   * @return Date the value
   */
  public Date getBillDate () {
    return this.BillDate;
  }
  /** Change the field to not being actively set: BillDate (BILL_IMAGE.bill_date)
   */
  public void unsetBillDate () {
    this._BillDateSet = false;
  }
  /** See if the field is actively set: BillDate (BILL_IMAGE.bill_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillDate () {
    return this._BillDateSet;
  }
  /** set the fields value: DueDate (BILL_IMAGE.due_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DueDate") 
  public void setDueDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DueDate", "setDueDate");
    }
    this.DueDate = value;
    this._DueDateSet = true;
  }

  /** Retrieves the DueDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DueDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DueDate field
   */
   public String getDueDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDueDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDueDateAsFormattedString");
       return fmtMgr.formatDate(this.getDueDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DueDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDueDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the DueDate field from a formatted string
   *
   * @param _value the DueDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DueDate field
   */
   public void setDueDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDueDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDueDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DueDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDueDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDueDateFromFormattedString");
   }

  /**
   * Retrieves the DueDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DueDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the DueDate field
   */
  public String getDueDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDueDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDueDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getDueDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DueDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDueDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the DueDate field value from a formatted date/time string
   *
   * @param _value the DueDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DueDate field
   */
  public void setDueDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDueDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setDueDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DueDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDueDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: DueDate (BILL_IMAGE.due_date)
   * @return Date the value
   */
  public Date getDueDate () {
    return this.DueDate;
  }
  /** Change the field to not being actively set: DueDate (BILL_IMAGE.due_date)
   */
  public void unsetDueDate () {
    this._DueDateSet = false;
  }
  /** See if the field is actively set: DueDate (BILL_IMAGE.due_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetDueDate () {
    return this._DueDateSet;
  }
  /** set the fields value: BillLname (BILL_IMAGE.bill_lname)
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

  /** get the value of the field: BillLname (BILL_IMAGE.bill_lname)
   * @return String the value
   */
  public String getBillLname () {
    return this.BillLname;
  }
  /** Change the field to not being actively set: BillLname (BILL_IMAGE.bill_lname)
   */
  public void unsetBillLname () {
    this._BillLnameSet = false;
  }
  /** See if the field is actively set: BillLname (BILL_IMAGE.bill_lname)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillLname () {
    return this._BillLnameSet;
  }
  /** set the fields value: BillFname (BILL_IMAGE.bill_fname)
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

  /** get the value of the field: BillFname (BILL_IMAGE.bill_fname)
   * @return String the value
   */
  public String getBillFname () {
    return this.BillFname;
  }
  /** Change the field to not being actively set: BillFname (BILL_IMAGE.bill_fname)
   */
  public void unsetBillFname () {
    this._BillFnameSet = false;
  }
  /** See if the field is actively set: BillFname (BILL_IMAGE.bill_fname)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillFname () {
    return this._BillFnameSet;
  }
  /** set the fields value: BillCompany (BILL_IMAGE.bill_company)
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

  /** get the value of the field: BillCompany (BILL_IMAGE.bill_company)
   * @return String the value
   */
  public String getBillCompany () {
    return this.BillCompany;
  }
  /** Change the field to not being actively set: BillCompany (BILL_IMAGE.bill_company)
   */
  public void unsetBillCompany () {
    this._BillCompanySet = false;
  }
  /** See if the field is actively set: BillCompany (BILL_IMAGE.bill_company)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillCompany () {
    return this._BillCompanySet;
  }
  /** set the fields value: Contact1Name (BILL_IMAGE.contact1_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Contact1Name") 
  public void setContact1Name (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 60))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Contact1Name", "setContact1Name");
    }
    this.Contact1Name = value;
    this._Contact1NameSet = true;
  }

  /** Retrieves the Contact1Name field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Contact1Name field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Contact1Name field
   */
   public String getContact1NameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContact1NameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContact1NameAsFormattedString");
       return fmtMgr.formatString(this.getContact1Name());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Contact1Name");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getContact1NameAsFormattedString");
       throw x;
     }
   }
  /** Sets the Contact1Name field from a formatted string
   *
   * @param _value the Contact1Name field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Contact1Name field
   */
   public void setContact1NameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContact1NameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setContact1Name(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Contact1Name");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setContact1NameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContact1NameFromFormattedString");
   }

  /** get the value of the field: Contact1Name (BILL_IMAGE.contact1_name)
   * @return String the value
   */
  public String getContact1Name () {
    return this.Contact1Name;
  }
  /** Change the field to not being actively set: Contact1Name (BILL_IMAGE.contact1_name)
   */
  public void unsetContact1Name () {
    this._Contact1NameSet = false;
  }
  /** See if the field is actively set: Contact1Name (BILL_IMAGE.contact1_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetContact1Name () {
    return this._Contact1NameSet;
  }
  /** set the fields value: Contact2Name (BILL_IMAGE.contact2_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Contact2Name") 
  public void setContact2Name (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 60))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Contact2Name", "setContact2Name");
    }
    this.Contact2Name = value;
    this._Contact2NameSet = true;
  }

  /** Retrieves the Contact2Name field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Contact2Name field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Contact2Name field
   */
   public String getContact2NameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContact2NameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContact2NameAsFormattedString");
       return fmtMgr.formatString(this.getContact2Name());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Contact2Name");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getContact2NameAsFormattedString");
       throw x;
     }
   }
  /** Sets the Contact2Name field from a formatted string
   *
   * @param _value the Contact2Name field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Contact2Name field
   */
   public void setContact2NameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContact2NameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setContact2Name(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Contact2Name");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setContact2NameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContact2NameFromFormattedString");
   }

  /** get the value of the field: Contact2Name (BILL_IMAGE.contact2_name)
   * @return String the value
   */
  public String getContact2Name () {
    return this.Contact2Name;
  }
  /** Change the field to not being actively set: Contact2Name (BILL_IMAGE.contact2_name)
   */
  public void unsetContact2Name () {
    this._Contact2NameSet = false;
  }
  /** See if the field is actively set: Contact2Name (BILL_IMAGE.contact2_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetContact2Name () {
    return this._Contact2NameSet;
  }
  /** set the fields value: BillImage (BILL_IMAGE.bill_image)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillImage") 
  public void setBillImage (String value) throws ServiceException
  {
    this.BillImage = value;
    this._BillImageSet = true;
  }

  /** Retrieves the BillImage field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillImage field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillImage field
   */
   public String getBillImageAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillImageAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillImageAsFormattedString");
       return fmtMgr.formatString(this.getBillImage());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillImage");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillImageAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillImage field from a formatted string
   *
   * @param _value the BillImage field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillImage field
   */
   public void setBillImageFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillImageFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillImage(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillImage");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillImageFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillImageFromFormattedString");
   }

  /** get the value of the field: BillImage (BILL_IMAGE.bill_image)
   * @return String the value
   */
  public String getBillImage () {
    return this.BillImage;
  }
  /** Change the field to not being actively set: BillImage (BILL_IMAGE.bill_image)
   */
  public void unsetBillImage () {
    this._BillImageSet = false;
  }
  /** See if the field is actively set: BillImage (BILL_IMAGE.bill_image)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillImage () {
    return this._BillImageSet;
  }
  /** set the fields value: ImageSize (BILL_IMAGE.image_size)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ImageSize") 
  public void setImageSize (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ImageSize", "setImageSize");
    }
    this.ImageSize = value;
    this._ImageSizeSet = true;
  }

  /** Retrieves the ImageSize field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ImageSize field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ImageSize field
   */
   public String getImageSizeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getImageSizeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getImageSizeAsFormattedString");
       return fmtMgr.formatNumber(this.getImageSize(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ImageSize");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getImageSizeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ImageSize field from a formatted string
   *
   * @param _value the ImageSize field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ImageSize field
   */
   public void setImageSizeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getImageSizeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setImageSize(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ImageSize");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setImageSizeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setImageSizeFromFormattedString");
   }

  /** get the value of the field: ImageSize (BILL_IMAGE.image_size)
   * @return Integer the value
   */
  public Integer getImageSize () {
    return this.ImageSize;
  }
  /** Change the field to not being actively set: ImageSize (BILL_IMAGE.image_size)
   */
  public void unsetImageSize () {
    this._ImageSizeSet = false;
  }
  /** See if the field is actively set: ImageSize (BILL_IMAGE.image_size)
   * @return boolean whether the field is actively set
   */
  public boolean issetImageSize () {
    return this._ImageSizeSet;
  }
  /** set the fields value: CompressionType (BILL_IMAGE.compression_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CompressionType") 
  public void setCompressionType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CompressionType", "setCompressionType");
    }
    this.CompressionType = value;
    this._CompressionTypeSet = true;
  }

  /** Retrieves the CompressionType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CompressionType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CompressionType field
   */
   public String getCompressionTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCompressionTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCompressionTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getCompressionType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CompressionType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCompressionTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CompressionType field from a formatted string
   *
   * @param _value the CompressionType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CompressionType field
   */
   public void setCompressionTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCompressionTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCompressionType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CompressionType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCompressionTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCompressionTypeFromFormattedString");
   }

  /** get the value of the field: CompressionType (BILL_IMAGE.compression_type)
   * @return Integer the value
   */
  public Integer getCompressionType () {
    return this.CompressionType;
  }
  /** Change the field to not being actively set: CompressionType (BILL_IMAGE.compression_type)
   */
  public void unsetCompressionType () {
    this._CompressionTypeSet = false;
  }
  /** See if the field is actively set: CompressionType (BILL_IMAGE.compression_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetCompressionType () {
    return this._CompressionTypeSet;
  }
  /** set the fields value: CompressedSize (BILL_IMAGE.compressed_size)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CompressedSize") 
  public void setCompressedSize (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CompressedSize", "setCompressedSize");
    }
    this.CompressedSize = value;
    this._CompressedSizeSet = true;
  }

  /** Retrieves the CompressedSize field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CompressedSize field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CompressedSize field
   */
   public String getCompressedSizeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCompressedSizeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCompressedSizeAsFormattedString");
       return fmtMgr.formatNumber(this.getCompressedSize(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CompressedSize");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCompressedSizeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CompressedSize field from a formatted string
   *
   * @param _value the CompressedSize field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CompressedSize field
   */
   public void setCompressedSizeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCompressedSizeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCompressedSize(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CompressedSize");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCompressedSizeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCompressedSizeFromFormattedString");
   }

  /** get the value of the field: CompressedSize (BILL_IMAGE.compressed_size)
   * @return Integer the value
   */
  public Integer getCompressedSize () {
    return this.CompressedSize;
  }
  /** Change the field to not being actively set: CompressedSize (BILL_IMAGE.compressed_size)
   */
  public void unsetCompressedSize () {
    this._CompressedSizeSet = false;
  }
  /** See if the field is actively set: CompressedSize (BILL_IMAGE.compressed_size)
   * @return boolean whether the field is actively set
   */
  public boolean issetCompressedSize () {
    return this._CompressedSizeSet;
  }
  /** set the fields value: ArchFlag (BILL_IMAGE.arch_flag)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ArchFlag") 
  public void setArchFlag (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ArchFlag", "setArchFlag");
    }
    this.ArchFlag = value;
    this._ArchFlagSet = true;
  }

  /** Retrieves the ArchFlag field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ArchFlag field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ArchFlag field
   */
   public String getArchFlagAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getArchFlagAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getArchFlagAsFormattedString");
       return fmtMgr.formatBoolean(this.getArchFlag());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ArchFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getArchFlagAsFormattedString");
       throw x;
     }
   }
  /** Sets the ArchFlag field from a formatted string
   *
   * @param _value the ArchFlag field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ArchFlag field
   */
   public void setArchFlagFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getArchFlagFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setArchFlag(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ArchFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setArchFlagFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setArchFlagFromFormattedString");
   }

  /** get the value of the field: ArchFlag (BILL_IMAGE.arch_flag)
   * @return Boolean the value
   */
  public Boolean getArchFlag () {
    return this.ArchFlag;
  }
  /** Change the field to not being actively set: ArchFlag (BILL_IMAGE.arch_flag)
   */
  public void unsetArchFlag () {
    this._ArchFlagSet = false;
  }
  /** See if the field is actively set: ArchFlag (BILL_IMAGE.arch_flag)
   * @return boolean whether the field is actively set
   */
  public boolean issetArchFlag () {
    return this._ArchFlagSet;
  }
  public String toString() {
    return BillImageObjectHelper.toMap(this, null).toString();
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
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
    if(!nonNullOnly || (AccountExternalId != null))  _AccountExternalIdSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
    if(!nonNullOnly || (AccountExternalIdType != null))  _AccountExternalIdTypeSet = flag;
  /** BILL_IMAGE.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  /** BILL_IMAGE.from_date field */
    if(!nonNullOnly || (FromDate != null))  _FromDateSet = flag;
  /** BILL_IMAGE.to_date field */
    if(!nonNullOnly || (ToDate != null))  _ToDateSet = flag;
  /** BILL_IMAGE.bill_date field */
    if(!nonNullOnly || (BillDate != null))  _BillDateSet = flag;
  /** BILL_IMAGE.due_date field */
    if(!nonNullOnly || (DueDate != null))  _DueDateSet = flag;
  /** BILL_IMAGE.bill_lname field */
    if(!nonNullOnly || (BillLname != null))  _BillLnameSet = flag;
  /** BILL_IMAGE.bill_fname field */
    if(!nonNullOnly || (BillFname != null))  _BillFnameSet = flag;
  /** BILL_IMAGE.bill_company field */
    if(!nonNullOnly || (BillCompany != null))  _BillCompanySet = flag;
  /** BILL_IMAGE.contact1_name field */
    if(!nonNullOnly || (Contact1Name != null))  _Contact1NameSet = flag;
  /** BILL_IMAGE.contact2_name field */
    if(!nonNullOnly || (Contact2Name != null))  _Contact2NameSet = flag;
  /** BILL_IMAGE.bill_image field */
    if(!nonNullOnly || (BillImage != null))  _BillImageSet = flag;
  /** BILL_IMAGE.image_size field */
    if(!nonNullOnly || (ImageSize != null))  _ImageSizeSet = flag;
  /** BILL_IMAGE.compression_type field */
    if(!nonNullOnly || (CompressionType != null))  _CompressionTypeSet = flag;
  /** BILL_IMAGE.compressed_size field */
    if(!nonNullOnly || (CompressedSize != null))  _CompressedSizeSet = flag;
  /** BILL_IMAGE.arch_flag field */
    if(!nonNullOnly || (ArchFlag != null))  _ArchFlagSet = flag;
  }
}
