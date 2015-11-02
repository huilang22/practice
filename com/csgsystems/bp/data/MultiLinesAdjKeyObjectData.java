/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: MultiLinesAdjKeyObjectData.java
 * Definition File: Customer/MultiLinesAdj.xml
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
  
/** MultiLinesAdjKeyObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class MultiLinesAdjKeyObjectData extends BaseObjectData implements Serializable
{

  /** MULTI_LINES_ADJ.bill_ref_no field */
  public    Integer BillRefNo1  = null;
  protected boolean _BillRefNo1Set = false;
  /** MULTI_LINES_ADJ.bill_ref_resets field */
  public    Integer BillRefResets1  = null;
  protected boolean _BillRefResets1Set = false;
  /** MULTI_LINES_ADJ.account_no field */
  public    Integer AccountNo1  = null;
  protected boolean _AccountNo1Set = false;
  private String _objName = "MultiLinesAdjKeyObjectData";
  /** Default constructor */
  public MultiLinesAdjKeyObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public MultiLinesAdjKeyObjectData (MultiLinesAdjKeyObjectData other)
  {

    if (other == null) return;
    this.BillRefNo1 = other.BillRefNo1;
    this._BillRefNo1Set = other._BillRefNo1Set;
    this.BillRefResets1 = other.BillRefResets1;
    this._BillRefResets1Set = other._BillRefResets1Set;
    this.AccountNo1 = other.AccountNo1;
    this._AccountNo1Set = other._AccountNo1Set;
  }

  /** set the fields value: BillRefNo1 (MULTI_LINES_ADJ.bill_ref_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillRefNo1") 
  public void setBillRefNo1 (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillRefNo1", "setBillRefNo1");
    }
    this.BillRefNo1 = value;
    this._BillRefNo1Set = true;
  }

  /** Retrieves the BillRefNo1 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillRefNo1 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillRefNo1 field
   */
   public String getBillRefNo1AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefNo1AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillRefNo1AsFormattedString");
       return fmtMgr.formatNumber(this.getBillRefNo1(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefNo1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillRefNo1AsFormattedString");
       throw x;
     }
   }
  /** Sets the BillRefNo1 field from a formatted string
   *
   * @param _value the BillRefNo1 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillRefNo1 field
   */
   public void setBillRefNo1FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefNo1FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillRefNo1(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefNo1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillRefNo1FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillRefNo1FromFormattedString");
   }

  /** get the value of the field: BillRefNo1 (MULTI_LINES_ADJ.bill_ref_no)
   * @return Integer the value
   */
  public Integer getBillRefNo1 () {
    return this.BillRefNo1;
  }
  /** Change the field to not being actively set: BillRefNo1 (MULTI_LINES_ADJ.bill_ref_no)
   */
  public void unsetBillRefNo1 () {
    this._BillRefNo1Set = false;
  }
  /** See if the field is actively set: BillRefNo1 (MULTI_LINES_ADJ.bill_ref_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefNo1 () {
    return this._BillRefNo1Set;
  }
  /** set the fields value: BillRefResets1 (MULTI_LINES_ADJ.bill_ref_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillRefResets1") 
  public void setBillRefResets1 (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillRefResets1", "setBillRefResets1");
    }
    this.BillRefResets1 = value;
    this._BillRefResets1Set = true;
  }

  /** Retrieves the BillRefResets1 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillRefResets1 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillRefResets1 field
   */
   public String getBillRefResets1AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefResets1AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillRefResets1AsFormattedString");
       return fmtMgr.formatNumber(this.getBillRefResets1(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefResets1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillRefResets1AsFormattedString");
       throw x;
     }
   }
  /** Sets the BillRefResets1 field from a formatted string
   *
   * @param _value the BillRefResets1 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillRefResets1 field
   */
   public void setBillRefResets1FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefResets1FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillRefResets1(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefResets1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillRefResets1FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillRefResets1FromFormattedString");
   }

  /** get the value of the field: BillRefResets1 (MULTI_LINES_ADJ.bill_ref_resets)
   * @return Integer the value
   */
  public Integer getBillRefResets1 () {
    return this.BillRefResets1;
  }
  /** Change the field to not being actively set: BillRefResets1 (MULTI_LINES_ADJ.bill_ref_resets)
   */
  public void unsetBillRefResets1 () {
    this._BillRefResets1Set = false;
  }
  /** See if the field is actively set: BillRefResets1 (MULTI_LINES_ADJ.bill_ref_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefResets1 () {
    return this._BillRefResets1Set;
  }
  /** set the fields value: AccountNo1 (MULTI_LINES_ADJ.account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountNo1") 
  public void setAccountNo1 (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountNo1", "setAccountNo1");
    }
    this.AccountNo1 = value;
    this._AccountNo1Set = true;
  }

  /** Retrieves the AccountNo1 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountNo1 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountNo1 field
   */
   public String getAccountNo1AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountNo1AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountNo1AsFormattedString");
       return fmtMgr.formatNumber(this.getAccountNo1(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountNo1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountNo1AsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountNo1 field from a formatted string
   *
   * @param _value the AccountNo1 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountNo1 field
   */
   public void setAccountNo1FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountNo1FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountNo1(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountNo1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountNo1FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountNo1FromFormattedString");
   }

  /** get the value of the field: AccountNo1 (MULTI_LINES_ADJ.account_no)
   * @return Integer the value
   */
  public Integer getAccountNo1 () {
    return this.AccountNo1;
  }
  /** Change the field to not being actively set: AccountNo1 (MULTI_LINES_ADJ.account_no)
   */
  public void unsetAccountNo1 () {
    this._AccountNo1Set = false;
  }
  /** See if the field is actively set: AccountNo1 (MULTI_LINES_ADJ.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountNo1 () {
    return this._AccountNo1Set;
  }
  public String toString() {
    return MultiLinesAdjKeyObjectHelper.toMap(this, null).toString();
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
    
  /** MULTI_LINES_ADJ.bill_ref_no field */
    if(!nonNullOnly || (BillRefNo1 != null))  _BillRefNo1Set = flag;
  /** MULTI_LINES_ADJ.bill_ref_resets field */
    if(!nonNullOnly || (BillRefResets1 != null))  _BillRefResets1Set = flag;
  /** MULTI_LINES_ADJ.account_no field */
    if(!nonNullOnly || (AccountNo1 != null))  _AccountNo1Set = flag;
  }
}
