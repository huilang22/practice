/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ContractDiscountObjectKeyData.java
 * Definition File: Customer/ContractDiscount.xml
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

/** ContractDiscountObject's Key Data class. */
public class ContractDiscountObjectKeyData  extends BaseObjectData
{
  /** DISCOUNT_PLANS.discount_id field */
  public    Integer DiscountId  = null;
  protected boolean _DiscountIdSet = false;
  /** CONTRACT_TYPES.contract_type field */
  public    Integer ContractType  = null;
  protected boolean _ContractTypeSet = false;
  private String _objName = "ContractDiscountObjectKeyData";
  /** default constructor */
  public ContractDiscountObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public ContractDiscountObjectKeyData (ContractDiscountObjectKeyData other)
  {
    if (other == null) return;
    this.DiscountId = other.DiscountId;
    this._DiscountIdSet = other._DiscountIdSet;
    this.ContractType = other.ContractType;
    this._ContractTypeSet = other._ContractTypeSet;
  }
  /** set the fields value: DiscountId (DISCOUNT_PLANS.discount_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DiscountId") 
  public void setDiscountId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DiscountId", "setDiscountId");
    }
    this.DiscountId = value;
    this._DiscountIdSet = true;
  }

  /** Retrieves the DiscountId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DiscountId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DiscountId field
   */
   public String getDiscountIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountIdAsFormattedString");
       return fmtMgr.formatNumber(this.getDiscountId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DiscountId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the DiscountId field from a formatted string
   *
   * @param _value the DiscountId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DiscountId field
   */
   public void setDiscountIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDiscountId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DiscountId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountIdFromFormattedString");
   }

  /** get the value of the field: DiscountId (DISCOUNT_PLANS.discount_id)
   * @return Integer the value
   */
  public Integer getDiscountId () {
    return this.DiscountId;
  }
  /** Change the field to not being actively set: DiscountId (DISCOUNT_PLANS.discount_id)
   */
  public void unsetDiscountId () {
    this._DiscountIdSet = false;
  }
  /** See if the field is actively set: DiscountId (DISCOUNT_PLANS.discount_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetDiscountId () {
    return this._DiscountIdSet;
  }
  /** set the fields value: ContractType (CONTRACT_TYPES.contract_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ContractType") 
  public void setContractType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ContractType", "setContractType");
    }
    this.ContractType = value;
    this._ContractTypeSet = true;
  }

  /** Retrieves the ContractType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ContractType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContractType field
   */
   public String getContractTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getContractType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContractType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ContractType field from a formatted string
   *
   * @param _value the ContractType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ContractType field
   */
   public void setContractTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setContractType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContractType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContractTypeFromFormattedString");
   }

  /** get the value of the field: ContractType (CONTRACT_TYPES.contract_type)
   * @return Integer the value
   */
  public Integer getContractType () {
    return this.ContractType;
  }
  /** Change the field to not being actively set: ContractType (CONTRACT_TYPES.contract_type)
   */
  public void unsetContractType () {
    this._ContractTypeSet = false;
  }
  /** See if the field is actively set: ContractType (CONTRACT_TYPES.contract_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetContractType () {
    return this._ContractTypeSet;
  }
  public String toString() {
    return ContractDiscountObjectKeyHelper.toMap(this, null).toString();
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
    
  /** DISCOUNT_PLANS.discount_id field */
    if(!nonNullOnly || (DiscountId != null))  _DiscountIdSet = flag;
  /** CONTRACT_TYPES.contract_type field */
    if(!nonNullOnly || (ContractType != null))  _ContractTypeSet = flag;
  }
}
