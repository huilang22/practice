/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillImagePageObjectData.java
 * Definition File: Customer/BillImagePage.xml
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
  
/** BillImagePageObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class BillImagePageObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public BillImagePageObjectKeyData Key = null;
  /** PageText field */
  public    String PageText  = null;
  protected boolean _PageTextSet = false;
  /** ReverseSearch field */
  public    Boolean ReverseSearch  = null;
  protected boolean _ReverseSearchSet = false;
  private String _objName = "BillImagePageObjectData";
  /** Default constructor */
  public BillImagePageObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public BillImagePageObjectData (BillImagePageObjectData other)
  {

    if (other == null) return;
    this.Key = new BillImagePageObjectKeyData (other.Key);
    this.PageText = other.PageText;
    this._PageTextSet = other._PageTextSet;
    this.ReverseSearch = other.ReverseSearch;
    this._ReverseSearchSet = other._ReverseSearchSet;
  }

  /** get the Key for this object
   * @return BillImagePageObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public BillImagePageObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (BillImagePageObjectKeyData Key)
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
    if (this.Key == null) this.Key = new BillImagePageObjectKeyData ();
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
    if (this.Key == null) this.Key = new BillImagePageObjectKeyData ();
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
    if (this.Key == null) this.Key = new BillImagePageObjectKeyData ();
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
    if (this.Key == null) this.Key = new BillImagePageObjectKeyData ();
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

  /** set the fields value: PageText
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPageText (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PageText", "setPageText");
    }
    this.PageText = value;
    this._PageTextSet = true;
  }
  /** get the value of the field: PageText
   * @return String the value
   */
  public String getPageText ()
  {
    return this.PageText;
  }
  /** Change the field to not being actively set: PageText
   */
  public void unsetPageText ()
  {
    this._PageTextSet = false;
  }
  /** See if the field is actively set: PageText
   * @return boolean whether the field is actively set
   */
  public boolean issetPageText ()
  {
    return this._PageTextSet;
  }

  /** Retrieves the PageText field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PageText field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PageText field
   */
   public String getPageTextAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPageTextAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPageTextAsFormattedString");
       return fmtMgr.formatString(this.getPageText());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PageText");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPageTextAsFormattedString");
       throw x;
     }
   }
  /** Sets the PageText field from a formatted string
   *
   * @param _value the PageText field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PageText field
   */
   public void setPageTextFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPageTextFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPageText(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PageText");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPageTextFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPageTextFromFormattedString");
   }

  /** set the fields value: ReverseSearch
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setReverseSearch (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ReverseSearch", "setReverseSearch");
    }
    this.ReverseSearch = value;
    this._ReverseSearchSet = true;
  }
  /** get the value of the field: ReverseSearch
   * @return Boolean the value
   */
  public Boolean getReverseSearch ()
  {
    return this.ReverseSearch;
  }
  /** Change the field to not being actively set: ReverseSearch
   */
  public void unsetReverseSearch ()
  {
    this._ReverseSearchSet = false;
  }
  /** See if the field is actively set: ReverseSearch
   * @return boolean whether the field is actively set
   */
  public boolean issetReverseSearch ()
  {
    return this._ReverseSearchSet;
  }

  /** Retrieves the ReverseSearch field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ReverseSearch field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ReverseSearch field
   */
   public String getReverseSearchAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getReverseSearchAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getReverseSearchAsFormattedString");
       return fmtMgr.formatBoolean(this.getReverseSearch());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ReverseSearch");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getReverseSearchAsFormattedString");
       throw x;
     }
   }
  /** Sets the ReverseSearch field from a formatted string
   *
   * @param _value the ReverseSearch field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ReverseSearch field
   */
   public void setReverseSearchFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getReverseSearchFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setReverseSearch(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ReverseSearch");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setReverseSearchFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setReverseSearchFromFormattedString");
   }

  public String toString() {
    return BillImagePageObjectHelper.toMap(this, null).toString();
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
  /** PageText field */
    if (!nonNullOnly || (PageText != null)) _PageTextSet = flag;
  /** ReverseSearch field */
    if (!nonNullOnly || (ReverseSearch != null)) _ReverseSearchSet = flag;
  }
}
