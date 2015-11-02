/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: OrderServerLocateObjectKeyData.java
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

/** OrderServerLocateObject's Key Data class. */
public class OrderServerLocateObjectKeyData  extends BaseObjectData
{
  /** ORD_ORDER_LOOKUP.order_id field */
  public    BigInteger OrderId  = null;
  protected boolean _OrderIdSet = false;
  private String _objName = "OrderServerLocateObjectKeyData";
  /** default constructor */
  public OrderServerLocateObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public OrderServerLocateObjectKeyData (OrderServerLocateObjectKeyData other)
  {
    if (other == null) return;
    this.OrderId = other.OrderId;
    this._OrderIdSet = other._OrderIdSet;
  }
  /** set the fields value: OrderId (ORD_ORDER_LOOKUP.order_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrderId") 
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
    this.OrderId = value;
    this._OrderIdSet = true;
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

  /** get the value of the field: OrderId (ORD_ORDER_LOOKUP.order_id)
   * @return BigInteger the value
   */
  public BigInteger getOrderId () {
    return this.OrderId;
  }
  /** Change the field to not being actively set: OrderId (ORD_ORDER_LOOKUP.order_id)
   */
  public void unsetOrderId () {
    this._OrderIdSet = false;
  }
  /** See if the field is actively set: OrderId (ORD_ORDER_LOOKUP.order_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrderId () {
    return this._OrderIdSet;
  }
  public String toString() {
    return OrderServerLocateObjectKeyHelper.toMap(this, null).toString();
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
    
  /** ORD_ORDER_LOOKUP.order_id field */
    if(!nonNullOnly || (OrderId != null))  _OrderIdSet = flag;
  }
}
