/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: OrderServerLocateObjectData.java
 * Definition File: Catalog/AccountLocate.xml
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
  
/** OrderServerLocateObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class OrderServerLocateObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public OrderServerLocateObjectKeyData Key = null;
  /** SERVER_LOOKUP.server_id field */
  public    Integer ServerId  = null;
  protected boolean _ServerIdSet = false;
  /** ORD_ORDER_LOOKUP.account_no field */
  public    Integer AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  /** ORD_ORDER_LOOKUP.order_number field */
  public    String OrderNumber  = null;
  protected boolean _OrderNumberSet = false;
  /** ORD_ORDER_LOOKUP.order_status_id field */
  public    Integer OrderStatusId  = null;
  protected boolean _OrderStatusIdSet = false;
  /** ORD_ORDER_LOOKUP.contact_fname field */
  public    String ContactFname  = null;
  protected boolean _ContactFnameSet = false;
  /** ORD_ORDER_LOOKUP.contact_lname field */
  public    String ContactLname  = null;
  protected boolean _ContactLnameSet = false;
  /** ORD_ORDER_LOOKUP.contact_company field */
  public    String ContactCompany  = null;
  protected boolean _ContactCompanySet = false;
  /** ORD_ORDER_LOOKUP.contact_fname_find field */
  public    String ContactFnameFind  = null;
  protected boolean _ContactFnameFindSet = false;
  /** ORD_ORDER_LOOKUP.contact_lname_find field */
  public    String ContactLnameFind  = null;
  protected boolean _ContactLnameFindSet = false;
  /** ORD_ORDER_LOOKUP.contact_company_find field */
  public    String ContactCompanyFind  = null;
  protected boolean _ContactCompanyFindSet = false;
  /** ORD_ORDER_LOOKUP.contact_email field */
  public    String ContactEmail  = null;
  protected boolean _ContactEmailSet = false;
  /** ORD_ORDER_LOOKUP.batch_id field */
  public    BigInteger BatchId  = null;
  protected boolean _BatchIdSet = false;
  private String _objName = "OrderServerLocateObjectData";
  /** Default constructor */
  public OrderServerLocateObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public OrderServerLocateObjectData (OrderServerLocateObjectData other)
  {

    if (other == null) return;
    this.Key = new OrderServerLocateObjectKeyData (other.Key);
    this.ServerId = other.ServerId;
    this._ServerIdSet = other._ServerIdSet;
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
    this.OrderNumber = other.OrderNumber;
    this._OrderNumberSet = other._OrderNumberSet;
    this.OrderStatusId = other.OrderStatusId;
    this._OrderStatusIdSet = other._OrderStatusIdSet;
    this.ContactFname = other.ContactFname;
    this._ContactFnameSet = other._ContactFnameSet;
    this.ContactLname = other.ContactLname;
    this._ContactLnameSet = other._ContactLnameSet;
    this.ContactCompany = other.ContactCompany;
    this._ContactCompanySet = other._ContactCompanySet;
    this.ContactFnameFind = other.ContactFnameFind;
    this._ContactFnameFindSet = other._ContactFnameFindSet;
    this.ContactLnameFind = other.ContactLnameFind;
    this._ContactLnameFindSet = other._ContactLnameFindSet;
    this.ContactCompanyFind = other.ContactCompanyFind;
    this._ContactCompanyFindSet = other._ContactCompanyFindSet;
    this.ContactEmail = other.ContactEmail;
    this._ContactEmailSet = other._ContactEmailSet;
    this.BatchId = other.BatchId;
    this._BatchIdSet = other._BatchIdSet;
  }

  /** get the Key for this object
   * @return OrderServerLocateObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public OrderServerLocateObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (OrderServerLocateObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: OrderId (ORD_ORDER_LOOKUP.order_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setOrderId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OrderId", "setOrderId");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "OrderId", "setOrderId");
    }
    if (this.Key == null) this.Key = new OrderServerLocateObjectKeyData ();
    this.Key.OrderId = value;
    this.Key._OrderIdSet = true;
  }
  /** get the value of the field: OrderId (ORD_ORDER_LOOKUP.order_id)
   * @return BigInteger the value
   */
  public BigInteger getOrderId () {
    if (this.Key == null) return null;
    return this.Key.OrderId;
  }
  /** Change the field to not being actively set: OrderId (ORD_ORDER_LOOKUP.order_id)
   */
  public void unsetOrderId () {
    if (this.Key == null) return;
    this.Key._OrderIdSet = false;
  }
  /** See if the field is actively set: OrderId (ORD_ORDER_LOOKUP.order_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrderId () {
    if (this.Key == null) return false;
    return this.Key._OrderIdSet;
  }

  /** Retrieves the OrderId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrderId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrderId field
   */
   public String getOrderIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrderIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrderIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getOrderId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrderId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrderIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrderId field from a formatted string
   *
   * @param _value the OrderId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrderId field
   */
   public void setOrderIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrderIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrderId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrderId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrderIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrderIdFromFormattedString");
   }

  /** set the fields value: ServerId (SERVER_LOOKUP.server_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServerId") 
  public void setServerId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServerId", "setServerId");
    }
    this.ServerId = value;
    this._ServerIdSet = true;
  }

  /** Retrieves the ServerId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServerId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServerId field
   */
   public String getServerIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServerIdAsFormattedString");
       return fmtMgr.formatNumber(this.getServerId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServerId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServerIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServerId field from a formatted string
   *
   * @param _value the ServerId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServerId field
   */
   public void setServerIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServerId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServerId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServerIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServerIdFromFormattedString");
   }

  /** get the value of the field: ServerId (SERVER_LOOKUP.server_id)
   * @return Integer the value
   */
  public Integer getServerId () {
    return this.ServerId;
  }
  /** Change the field to not being actively set: ServerId (SERVER_LOOKUP.server_id)
   */
  public void unsetServerId () {
    this._ServerIdSet = false;
  }
  /** See if the field is actively set: ServerId (SERVER_LOOKUP.server_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetServerId () {
    return this._ServerIdSet;
  }
  /** set the fields value: AccountInternalId (ORD_ORDER_LOOKUP.account_no)
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

  /** get the value of the field: AccountInternalId (ORD_ORDER_LOOKUP.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (ORD_ORDER_LOOKUP.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (ORD_ORDER_LOOKUP.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  /** set the fields value: OrderNumber (ORD_ORDER_LOOKUP.order_number)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrderNumber") 
  public void setOrderNumber (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OrderNumber", "setOrderNumber");
    }
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "OrderNumber", "setOrderNumber");
    }
    this.OrderNumber = value;
    this._OrderNumberSet = true;
  }

  /** Retrieves the OrderNumber field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrderNumber field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrderNumber field
   */
   public String getOrderNumberAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrderNumberAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrderNumberAsFormattedString");
       return fmtMgr.formatString(this.getOrderNumber());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrderNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrderNumberAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrderNumber field from a formatted string
   *
   * @param _value the OrderNumber field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrderNumber field
   */
   public void setOrderNumberFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrderNumberFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrderNumber(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrderNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrderNumberFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrderNumberFromFormattedString");
   }

  /** get the value of the field: OrderNumber (ORD_ORDER_LOOKUP.order_number)
   * @return String the value
   */
  public String getOrderNumber () {
    return this.OrderNumber;
  }
  /** Change the field to not being actively set: OrderNumber (ORD_ORDER_LOOKUP.order_number)
   */
  public void unsetOrderNumber () {
    this._OrderNumberSet = false;
  }
  /** See if the field is actively set: OrderNumber (ORD_ORDER_LOOKUP.order_number)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrderNumber () {
    return this._OrderNumberSet;
  }
  /** set the fields value: OrderStatusId (ORD_ORDER_LOOKUP.order_status_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrderStatusId") 
  public void setOrderStatusId (Integer value) throws ServiceException
  {
    this.OrderStatusId = value;
    this._OrderStatusIdSet = true;
  }

  /** Retrieves the OrderStatusId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrderStatusId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrderStatusId field
   */
   public String getOrderStatusIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrderStatusIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrderStatusIdAsFormattedString");
       return fmtMgr.formatNumber(this.getOrderStatusId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrderStatusId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrderStatusIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrderStatusId field from a formatted string
   *
   * @param _value the OrderStatusId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrderStatusId field
   */
   public void setOrderStatusIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrderStatusIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrderStatusId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrderStatusId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrderStatusIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrderStatusIdFromFormattedString");
   }

  /** get the value of the field: OrderStatusId (ORD_ORDER_LOOKUP.order_status_id)
   * @return Integer the value
   */
  public Integer getOrderStatusId () {
    return this.OrderStatusId;
  }
  /** Change the field to not being actively set: OrderStatusId (ORD_ORDER_LOOKUP.order_status_id)
   */
  public void unsetOrderStatusId () {
    this._OrderStatusIdSet = false;
  }
  /** See if the field is actively set: OrderStatusId (ORD_ORDER_LOOKUP.order_status_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrderStatusId () {
    return this._OrderStatusIdSet;
  }
  /** set the fields value: ContactFname (ORD_ORDER_LOOKUP.contact_fname)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ContactFname") 
  public void setContactFname (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 28))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ContactFname", "setContactFname");
    }
    this.ContactFname = value;
    this._ContactFnameSet = true;
  }

  /** Retrieves the ContactFname field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ContactFname field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContactFname field
   */
   public String getContactFnameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContactFnameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContactFnameAsFormattedString");
       return fmtMgr.formatString(this.getContactFname());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContactFname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getContactFnameAsFormattedString");
       throw x;
     }
   }
  /** Sets the ContactFname field from a formatted string
   *
   * @param _value the ContactFname field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ContactFname field
   */
   public void setContactFnameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContactFnameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setContactFname(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContactFname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setContactFnameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContactFnameFromFormattedString");
   }

  /** get the value of the field: ContactFname (ORD_ORDER_LOOKUP.contact_fname)
   * @return String the value
   */
  public String getContactFname () {
    return this.ContactFname;
  }
  /** Change the field to not being actively set: ContactFname (ORD_ORDER_LOOKUP.contact_fname)
   */
  public void unsetContactFname () {
    this._ContactFnameSet = false;
  }
  /** See if the field is actively set: ContactFname (ORD_ORDER_LOOKUP.contact_fname)
   * @return boolean whether the field is actively set
   */
  public boolean issetContactFname () {
    return this._ContactFnameSet;
  }
  /** set the fields value: ContactLname (ORD_ORDER_LOOKUP.contact_lname)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ContactLname") 
  public void setContactLname (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 56))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ContactLname", "setContactLname");
    }
    this.ContactLname = value;
    this._ContactLnameSet = true;
  }

  /** Retrieves the ContactLname field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ContactLname field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContactLname field
   */
   public String getContactLnameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContactLnameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContactLnameAsFormattedString");
       return fmtMgr.formatString(this.getContactLname());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContactLname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getContactLnameAsFormattedString");
       throw x;
     }
   }
  /** Sets the ContactLname field from a formatted string
   *
   * @param _value the ContactLname field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ContactLname field
   */
   public void setContactLnameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContactLnameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setContactLname(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContactLname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setContactLnameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContactLnameFromFormattedString");
   }

  /** get the value of the field: ContactLname (ORD_ORDER_LOOKUP.contact_lname)
   * @return String the value
   */
  public String getContactLname () {
    return this.ContactLname;
  }
  /** Change the field to not being actively set: ContactLname (ORD_ORDER_LOOKUP.contact_lname)
   */
  public void unsetContactLname () {
    this._ContactLnameSet = false;
  }
  /** See if the field is actively set: ContactLname (ORD_ORDER_LOOKUP.contact_lname)
   * @return boolean whether the field is actively set
   */
  public boolean issetContactLname () {
    return this._ContactLnameSet;
  }
  /** set the fields value: ContactCompany (ORD_ORDER_LOOKUP.contact_company)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ContactCompany") 
  public void setContactCompany (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 56))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ContactCompany", "setContactCompany");
    }
    this.ContactCompany = value;
    this._ContactCompanySet = true;
  }

  /** Retrieves the ContactCompany field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ContactCompany field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContactCompany field
   */
   public String getContactCompanyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContactCompanyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContactCompanyAsFormattedString");
       return fmtMgr.formatString(this.getContactCompany());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContactCompany");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getContactCompanyAsFormattedString");
       throw x;
     }
   }
  /** Sets the ContactCompany field from a formatted string
   *
   * @param _value the ContactCompany field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ContactCompany field
   */
   public void setContactCompanyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContactCompanyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setContactCompany(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContactCompany");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setContactCompanyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContactCompanyFromFormattedString");
   }

  /** get the value of the field: ContactCompany (ORD_ORDER_LOOKUP.contact_company)
   * @return String the value
   */
  public String getContactCompany () {
    return this.ContactCompany;
  }
  /** Change the field to not being actively set: ContactCompany (ORD_ORDER_LOOKUP.contact_company)
   */
  public void unsetContactCompany () {
    this._ContactCompanySet = false;
  }
  /** See if the field is actively set: ContactCompany (ORD_ORDER_LOOKUP.contact_company)
   * @return boolean whether the field is actively set
   */
  public boolean issetContactCompany () {
    return this._ContactCompanySet;
  }
  /** set the fields value: ContactFnameFind (ORD_ORDER_LOOKUP.contact_fname_find)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ContactFnameFind") 
  public void setContactFnameFind (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 28))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ContactFnameFind", "setContactFnameFind");
    }
    this.ContactFnameFind = value;
    this._ContactFnameFindSet = true;
  }

  /** Retrieves the ContactFnameFind field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ContactFnameFind field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContactFnameFind field
   */
   public String getContactFnameFindAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContactFnameFindAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContactFnameFindAsFormattedString");
       return fmtMgr.formatString(this.getContactFnameFind());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContactFnameFind");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getContactFnameFindAsFormattedString");
       throw x;
     }
   }
  /** Sets the ContactFnameFind field from a formatted string
   *
   * @param _value the ContactFnameFind field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ContactFnameFind field
   */
   public void setContactFnameFindFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContactFnameFindFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setContactFnameFind(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContactFnameFind");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setContactFnameFindFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContactFnameFindFromFormattedString");
   }

  /** get the value of the field: ContactFnameFind (ORD_ORDER_LOOKUP.contact_fname_find)
   * @return String the value
   */
  public String getContactFnameFind () {
    return this.ContactFnameFind;
  }
  /** Change the field to not being actively set: ContactFnameFind (ORD_ORDER_LOOKUP.contact_fname_find)
   */
  public void unsetContactFnameFind () {
    this._ContactFnameFindSet = false;
  }
  /** See if the field is actively set: ContactFnameFind (ORD_ORDER_LOOKUP.contact_fname_find)
   * @return boolean whether the field is actively set
   */
  public boolean issetContactFnameFind () {
    return this._ContactFnameFindSet;
  }
  /** set the fields value: ContactLnameFind (ORD_ORDER_LOOKUP.contact_lname_find)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ContactLnameFind") 
  public void setContactLnameFind (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 56))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ContactLnameFind", "setContactLnameFind");
    }
    this.ContactLnameFind = value;
    this._ContactLnameFindSet = true;
  }

  /** Retrieves the ContactLnameFind field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ContactLnameFind field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContactLnameFind field
   */
   public String getContactLnameFindAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContactLnameFindAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContactLnameFindAsFormattedString");
       return fmtMgr.formatString(this.getContactLnameFind());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContactLnameFind");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getContactLnameFindAsFormattedString");
       throw x;
     }
   }
  /** Sets the ContactLnameFind field from a formatted string
   *
   * @param _value the ContactLnameFind field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ContactLnameFind field
   */
   public void setContactLnameFindFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContactLnameFindFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setContactLnameFind(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContactLnameFind");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setContactLnameFindFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContactLnameFindFromFormattedString");
   }

  /** get the value of the field: ContactLnameFind (ORD_ORDER_LOOKUP.contact_lname_find)
   * @return String the value
   */
  public String getContactLnameFind () {
    return this.ContactLnameFind;
  }
  /** Change the field to not being actively set: ContactLnameFind (ORD_ORDER_LOOKUP.contact_lname_find)
   */
  public void unsetContactLnameFind () {
    this._ContactLnameFindSet = false;
  }
  /** See if the field is actively set: ContactLnameFind (ORD_ORDER_LOOKUP.contact_lname_find)
   * @return boolean whether the field is actively set
   */
  public boolean issetContactLnameFind () {
    return this._ContactLnameFindSet;
  }
  /** set the fields value: ContactCompanyFind (ORD_ORDER_LOOKUP.contact_company_find)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ContactCompanyFind") 
  public void setContactCompanyFind (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 56))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ContactCompanyFind", "setContactCompanyFind");
    }
    this.ContactCompanyFind = value;
    this._ContactCompanyFindSet = true;
  }

  /** Retrieves the ContactCompanyFind field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ContactCompanyFind field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContactCompanyFind field
   */
   public String getContactCompanyFindAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContactCompanyFindAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContactCompanyFindAsFormattedString");
       return fmtMgr.formatString(this.getContactCompanyFind());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContactCompanyFind");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getContactCompanyFindAsFormattedString");
       throw x;
     }
   }
  /** Sets the ContactCompanyFind field from a formatted string
   *
   * @param _value the ContactCompanyFind field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ContactCompanyFind field
   */
   public void setContactCompanyFindFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContactCompanyFindFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setContactCompanyFind(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContactCompanyFind");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setContactCompanyFindFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContactCompanyFindFromFormattedString");
   }

  /** get the value of the field: ContactCompanyFind (ORD_ORDER_LOOKUP.contact_company_find)
   * @return String the value
   */
  public String getContactCompanyFind () {
    return this.ContactCompanyFind;
  }
  /** Change the field to not being actively set: ContactCompanyFind (ORD_ORDER_LOOKUP.contact_company_find)
   */
  public void unsetContactCompanyFind () {
    this._ContactCompanyFindSet = false;
  }
  /** See if the field is actively set: ContactCompanyFind (ORD_ORDER_LOOKUP.contact_company_find)
   * @return boolean whether the field is actively set
   */
  public boolean issetContactCompanyFind () {
    return this._ContactCompanyFindSet;
  }
  /** set the fields value: ContactEmail (ORD_ORDER_LOOKUP.contact_email)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ContactEmail") 
  public void setContactEmail (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 144))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ContactEmail", "setContactEmail");
    }
    this.ContactEmail = value;
    this._ContactEmailSet = true;
  }

  /** Retrieves the ContactEmail field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ContactEmail field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContactEmail field
   */
   public String getContactEmailAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContactEmailAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContactEmailAsFormattedString");
       return fmtMgr.formatString(this.getContactEmail());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContactEmail");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getContactEmailAsFormattedString");
       throw x;
     }
   }
  /** Sets the ContactEmail field from a formatted string
   *
   * @param _value the ContactEmail field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ContactEmail field
   */
   public void setContactEmailFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContactEmailFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setContactEmail(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContactEmail");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setContactEmailFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContactEmailFromFormattedString");
   }

  /** get the value of the field: ContactEmail (ORD_ORDER_LOOKUP.contact_email)
   * @return String the value
   */
  public String getContactEmail () {
    return this.ContactEmail;
  }
  /** Change the field to not being actively set: ContactEmail (ORD_ORDER_LOOKUP.contact_email)
   */
  public void unsetContactEmail () {
    this._ContactEmailSet = false;
  }
  /** See if the field is actively set: ContactEmail (ORD_ORDER_LOOKUP.contact_email)
   * @return boolean whether the field is actively set
   */
  public boolean issetContactEmail () {
    return this._ContactEmailSet;
  }
  /** set the fields value: BatchId (ORD_ORDER_LOOKUP.batch_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BatchId") 
  public void setBatchId (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BatchId", "setBatchId");
    }
    this.BatchId = value;
    this._BatchIdSet = true;
  }

  /** Retrieves the BatchId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BatchId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BatchId field
   */
   public String getBatchIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBatchIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBatchIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getBatchId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BatchId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBatchIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the BatchId field from a formatted string
   *
   * @param _value the BatchId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BatchId field
   */
   public void setBatchIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBatchIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBatchId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BatchId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBatchIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBatchIdFromFormattedString");
   }

  /** get the value of the field: BatchId (ORD_ORDER_LOOKUP.batch_id)
   * @return BigInteger the value
   */
  public BigInteger getBatchId () {
    return this.BatchId;
  }
  /** Change the field to not being actively set: BatchId (ORD_ORDER_LOOKUP.batch_id)
   */
  public void unsetBatchId () {
    this._BatchIdSet = false;
  }
  /** See if the field is actively set: BatchId (ORD_ORDER_LOOKUP.batch_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetBatchId () {
    return this._BatchIdSet;
  }
  public String toString() {
    return OrderServerLocateObjectHelper.toMap(this, null).toString();
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
  /** SERVER_LOOKUP.server_id field */
    if(!nonNullOnly || (ServerId != null))  _ServerIdSet = flag;
  /** ORD_ORDER_LOOKUP.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  /** ORD_ORDER_LOOKUP.order_number field */
    if(!nonNullOnly || (OrderNumber != null))  _OrderNumberSet = flag;
  /** ORD_ORDER_LOOKUP.order_status_id field */
    if(!nonNullOnly || (OrderStatusId != null))  _OrderStatusIdSet = flag;
  /** ORD_ORDER_LOOKUP.contact_fname field */
    if(!nonNullOnly || (ContactFname != null))  _ContactFnameSet = flag;
  /** ORD_ORDER_LOOKUP.contact_lname field */
    if(!nonNullOnly || (ContactLname != null))  _ContactLnameSet = flag;
  /** ORD_ORDER_LOOKUP.contact_company field */
    if(!nonNullOnly || (ContactCompany != null))  _ContactCompanySet = flag;
  /** ORD_ORDER_LOOKUP.contact_fname_find field */
    if(!nonNullOnly || (ContactFnameFind != null))  _ContactFnameFindSet = flag;
  /** ORD_ORDER_LOOKUP.contact_lname_find field */
    if(!nonNullOnly || (ContactLnameFind != null))  _ContactLnameFindSet = flag;
  /** ORD_ORDER_LOOKUP.contact_company_find field */
    if(!nonNullOnly || (ContactCompanyFind != null))  _ContactCompanyFindSet = flag;
  /** ORD_ORDER_LOOKUP.contact_email field */
    if(!nonNullOnly || (ContactEmail != null))  _ContactEmailSet = flag;
  /** ORD_ORDER_LOOKUP.batch_id field */
    if(!nonNullOnly || (BatchId != null))  _BatchIdSet = flag;
  }
}
