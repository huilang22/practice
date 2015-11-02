/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: MultiLinesAdjObjectData.java
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
  
/** MultiLinesAdjObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class MultiLinesAdjObjectData extends BaseObjectData implements Serializable
{

  /** MULTI_LINES_ADJ.msg_id field */
  public    Integer MsgId  = null;
  protected boolean _MsgIdSet = false;
  /** MULTI_LINES_ADJ.msg_id2 field */
  public    Integer MsgId2  = null;
  protected boolean _MsgId2Set = false;
  /** MULTI_LINES_ADJ.msg_id_serv field */
  public    Integer MsgIdServ  = null;
  protected boolean _MsgIdServSet = false;
  /** MULTI_LINES_ADJ.split_row_num field */
  public    Integer SplitRowNum  = null;
  protected boolean _SplitRowNumSet = false;
  /** MULTI_LINES_ADJ.bill_ref_no field */
  public    Integer BillRefNo  = null;
  protected boolean _BillRefNoSet = false;
  /** MULTI_LINES_ADJ.bill_ref_resets field */
  public    Integer BillRefResets  = null;
  protected boolean _BillRefResetsSet = false;
  /** MULTI_LINES_ADJ.account_no field */
  public    Integer AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  /** MULTI_LINES_ADJ.adj_trans_code field */
  public    Integer AdjTransCode  = null;
  protected boolean _AdjTransCodeSet = false;
  /** MULTI_LINES_ADJ.amt_eligible_calc field */
  public    BigInteger AmtEligibleCalc  = null;
  protected boolean _AmtEligibleCalcSet = false;
  /** MULTI_LINES_ADJ.row_number field */
  public    Integer RowNumber  = null;
  protected boolean _RowNumberSet = false;
  private String _objName = "MultiLinesAdjObjectData";
  /** Default constructor */
  public MultiLinesAdjObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public MultiLinesAdjObjectData (MultiLinesAdjObjectData other)
  {

    if (other == null) return;
    this.MsgId = other.MsgId;
    this._MsgIdSet = other._MsgIdSet;
    this.MsgId2 = other.MsgId2;
    this._MsgId2Set = other._MsgId2Set;
    this.MsgIdServ = other.MsgIdServ;
    this._MsgIdServSet = other._MsgIdServSet;
    this.SplitRowNum = other.SplitRowNum;
    this._SplitRowNumSet = other._SplitRowNumSet;
    this.BillRefNo = other.BillRefNo;
    this._BillRefNoSet = other._BillRefNoSet;
    this.BillRefResets = other.BillRefResets;
    this._BillRefResetsSet = other._BillRefResetsSet;
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
    this.AdjTransCode = other.AdjTransCode;
    this._AdjTransCodeSet = other._AdjTransCodeSet;
    this.AmtEligibleCalc = other.AmtEligibleCalc;
    this._AmtEligibleCalcSet = other._AmtEligibleCalcSet;
    this.RowNumber = other.RowNumber;
    this._RowNumberSet = other._RowNumberSet;
  }

  /** set the fields value: MsgId (MULTI_LINES_ADJ.msg_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MsgId") 
  public void setMsgId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MsgId", "setMsgId");
    }
    this.MsgId = value;
    this._MsgIdSet = true;
  }

  /** Retrieves the MsgId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MsgId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgId field
   */
   public String getMsgIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgIdAsFormattedString");
       return fmtMgr.formatNumber(this.getMsgId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the MsgId field from a formatted string
   *
   * @param _value the MsgId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MsgId field
   */
   public void setMsgIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMsgId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgIdFromFormattedString");
   }

  /** get the value of the field: MsgId (MULTI_LINES_ADJ.msg_id)
   * @return Integer the value
   */
  public Integer getMsgId () {
    return this.MsgId;
  }
  /** Change the field to not being actively set: MsgId (MULTI_LINES_ADJ.msg_id)
   */
  public void unsetMsgId () {
    this._MsgIdSet = false;
  }
  /** See if the field is actively set: MsgId (MULTI_LINES_ADJ.msg_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetMsgId () {
    return this._MsgIdSet;
  }
  /** set the fields value: MsgId2 (MULTI_LINES_ADJ.msg_id2)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MsgId2") 
  public void setMsgId2 (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MsgId2", "setMsgId2");
    }
    this.MsgId2 = value;
    this._MsgId2Set = true;
  }

  /** Retrieves the MsgId2 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MsgId2 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgId2 field
   */
   public String getMsgId2AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgId2AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgId2AsFormattedString");
       return fmtMgr.formatNumber(this.getMsgId2(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgId2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgId2AsFormattedString");
       throw x;
     }
   }
  /** Sets the MsgId2 field from a formatted string
   *
   * @param _value the MsgId2 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MsgId2 field
   */
   public void setMsgId2FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgId2FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMsgId2(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgId2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgId2FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgId2FromFormattedString");
   }

  /** get the value of the field: MsgId2 (MULTI_LINES_ADJ.msg_id2)
   * @return Integer the value
   */
  public Integer getMsgId2 () {
    return this.MsgId2;
  }
  /** Change the field to not being actively set: MsgId2 (MULTI_LINES_ADJ.msg_id2)
   */
  public void unsetMsgId2 () {
    this._MsgId2Set = false;
  }
  /** See if the field is actively set: MsgId2 (MULTI_LINES_ADJ.msg_id2)
   * @return boolean whether the field is actively set
   */
  public boolean issetMsgId2 () {
    return this._MsgId2Set;
  }
  /** set the fields value: MsgIdServ (MULTI_LINES_ADJ.msg_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MsgIdServ") 
  public void setMsgIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MsgIdServ", "setMsgIdServ");
    }
    this.MsgIdServ = value;
    this._MsgIdServSet = true;
  }

  /** Retrieves the MsgIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MsgIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgIdServ field
   */
   public String getMsgIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getMsgIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the MsgIdServ field from a formatted string
   *
   * @param _value the MsgIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MsgIdServ field
   */
   public void setMsgIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMsgIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgIdServFromFormattedString");
   }

  /** get the value of the field: MsgIdServ (MULTI_LINES_ADJ.msg_id_serv)
   * @return Integer the value
   */
  public Integer getMsgIdServ () {
    return this.MsgIdServ;
  }
  /** Change the field to not being actively set: MsgIdServ (MULTI_LINES_ADJ.msg_id_serv)
   */
  public void unsetMsgIdServ () {
    this._MsgIdServSet = false;
  }
  /** See if the field is actively set: MsgIdServ (MULTI_LINES_ADJ.msg_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetMsgIdServ () {
    return this._MsgIdServSet;
  }
  /** set the fields value: SplitRowNum (MULTI_LINES_ADJ.split_row_num)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SplitRowNum") 
  public void setSplitRowNum (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SplitRowNum", "setSplitRowNum");
    }
    this.SplitRowNum = value;
    this._SplitRowNumSet = true;
  }

  /** Retrieves the SplitRowNum field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SplitRowNum field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SplitRowNum field
   */
   public String getSplitRowNumAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSplitRowNumAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSplitRowNumAsFormattedString");
       return fmtMgr.formatNumber(this.getSplitRowNum(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SplitRowNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSplitRowNumAsFormattedString");
       throw x;
     }
   }
  /** Sets the SplitRowNum field from a formatted string
   *
   * @param _value the SplitRowNum field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SplitRowNum field
   */
   public void setSplitRowNumFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSplitRowNumFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSplitRowNum(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SplitRowNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSplitRowNumFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSplitRowNumFromFormattedString");
   }

  /** get the value of the field: SplitRowNum (MULTI_LINES_ADJ.split_row_num)
   * @return Integer the value
   */
  public Integer getSplitRowNum () {
    return this.SplitRowNum;
  }
  /** Change the field to not being actively set: SplitRowNum (MULTI_LINES_ADJ.split_row_num)
   */
  public void unsetSplitRowNum () {
    this._SplitRowNumSet = false;
  }
  /** See if the field is actively set: SplitRowNum (MULTI_LINES_ADJ.split_row_num)
   * @return boolean whether the field is actively set
   */
  public boolean issetSplitRowNum () {
    return this._SplitRowNumSet;
  }
  /** set the fields value: BillRefNo (MULTI_LINES_ADJ.bill_ref_no)
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

  /** get the value of the field: BillRefNo (MULTI_LINES_ADJ.bill_ref_no)
   * @return Integer the value
   */
  public Integer getBillRefNo () {
    return this.BillRefNo;
  }
  /** Change the field to not being actively set: BillRefNo (MULTI_LINES_ADJ.bill_ref_no)
   */
  public void unsetBillRefNo () {
    this._BillRefNoSet = false;
  }
  /** See if the field is actively set: BillRefNo (MULTI_LINES_ADJ.bill_ref_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefNo () {
    return this._BillRefNoSet;
  }
  /** set the fields value: BillRefResets (MULTI_LINES_ADJ.bill_ref_resets)
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

  /** get the value of the field: BillRefResets (MULTI_LINES_ADJ.bill_ref_resets)
   * @return Integer the value
   */
  public Integer getBillRefResets () {
    return this.BillRefResets;
  }
  /** Change the field to not being actively set: BillRefResets (MULTI_LINES_ADJ.bill_ref_resets)
   */
  public void unsetBillRefResets () {
    this._BillRefResetsSet = false;
  }
  /** See if the field is actively set: BillRefResets (MULTI_LINES_ADJ.bill_ref_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefResets () {
    return this._BillRefResetsSet;
  }
  /** set the fields value: AccountInternalId (MULTI_LINES_ADJ.account_no)
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

  /** get the value of the field: AccountInternalId (MULTI_LINES_ADJ.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (MULTI_LINES_ADJ.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (MULTI_LINES_ADJ.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  /** set the fields value: AdjTransCode (MULTI_LINES_ADJ.adj_trans_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AdjTransCode") 
  public void setAdjTransCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AdjTransCode", "setAdjTransCode");
    }
    this.AdjTransCode = value;
    this._AdjTransCodeSet = true;
  }

  /** Retrieves the AdjTransCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AdjTransCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AdjTransCode field
   */
   public String getAdjTransCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjTransCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjTransCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getAdjTransCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AdjTransCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAdjTransCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the AdjTransCode field from a formatted string
   *
   * @param _value the AdjTransCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AdjTransCode field
   */
   public void setAdjTransCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjTransCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAdjTransCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AdjTransCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAdjTransCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAdjTransCodeFromFormattedString");
   }

  /** get the value of the field: AdjTransCode (MULTI_LINES_ADJ.adj_trans_code)
   * @return Integer the value
   */
  public Integer getAdjTransCode () {
    return this.AdjTransCode;
  }
  /** Change the field to not being actively set: AdjTransCode (MULTI_LINES_ADJ.adj_trans_code)
   */
  public void unsetAdjTransCode () {
    this._AdjTransCodeSet = false;
  }
  /** See if the field is actively set: AdjTransCode (MULTI_LINES_ADJ.adj_trans_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetAdjTransCode () {
    return this._AdjTransCodeSet;
  }
  /** set the fields value: AmtEligibleCalc (MULTI_LINES_ADJ.amt_eligible_calc)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AmtEligibleCalc") 
  public void setAmtEligibleCalc (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AmtEligibleCalc", "setAmtEligibleCalc");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AmtEligibleCalc", "setAmtEligibleCalc");
    }
    this.AmtEligibleCalc = value;
    this._AmtEligibleCalcSet = true;
  }

  /** Retrieves the AmtEligibleCalc field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AmtEligibleCalc field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AmtEligibleCalc field
   */
   public String getAmtEligibleCalcAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmtEligibleCalcAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmtEligibleCalcAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAmtEligibleCalc(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AmtEligibleCalc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmtEligibleCalcAsFormattedString");
       throw x;
     }
   }
  /** Sets the AmtEligibleCalc field from a formatted string
   *
   * @param _value the AmtEligibleCalc field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AmtEligibleCalc field
   */
   public void setAmtEligibleCalcFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmtEligibleCalcFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAmtEligibleCalc(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AmtEligibleCalc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmtEligibleCalcFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmtEligibleCalcFromFormattedString");
   }

  /** get the value of the field: AmtEligibleCalc (MULTI_LINES_ADJ.amt_eligible_calc)
   * @return BigInteger the value
   */
  public BigInteger getAmtEligibleCalc () {
    return this.AmtEligibleCalc;
  }
  /** Change the field to not being actively set: AmtEligibleCalc (MULTI_LINES_ADJ.amt_eligible_calc)
   */
  public void unsetAmtEligibleCalc () {
    this._AmtEligibleCalcSet = false;
  }
  /** See if the field is actively set: AmtEligibleCalc (MULTI_LINES_ADJ.amt_eligible_calc)
   * @return boolean whether the field is actively set
   */
  public boolean issetAmtEligibleCalc () {
    return this._AmtEligibleCalcSet;
  }
  /** set the fields value: RowNumber (MULTI_LINES_ADJ.row_number)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RowNumber") 
  public void setRowNumber (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RowNumber", "setRowNumber");
    }
    this.RowNumber = value;
    this._RowNumberSet = true;
  }

  /** Retrieves the RowNumber field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RowNumber field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RowNumber field
   */
   public String getRowNumberAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRowNumberAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRowNumberAsFormattedString");
       return fmtMgr.formatNumber(this.getRowNumber(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RowNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRowNumberAsFormattedString");
       throw x;
     }
   }
  /** Sets the RowNumber field from a formatted string
   *
   * @param _value the RowNumber field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RowNumber field
   */
   public void setRowNumberFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRowNumberFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRowNumber(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RowNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRowNumberFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRowNumberFromFormattedString");
   }

  /** get the value of the field: RowNumber (MULTI_LINES_ADJ.row_number)
   * @return Integer the value
   */
  public Integer getRowNumber () {
    return this.RowNumber;
  }
  /** Change the field to not being actively set: RowNumber (MULTI_LINES_ADJ.row_number)
   */
  public void unsetRowNumber () {
    this._RowNumberSet = false;
  }
  /** See if the field is actively set: RowNumber (MULTI_LINES_ADJ.row_number)
   * @return boolean whether the field is actively set
   */
  public boolean issetRowNumber () {
    return this._RowNumberSet;
  }
  public String toString() {
    return MultiLinesAdjObjectHelper.toMap(this, null).toString();
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
    
  /** MULTI_LINES_ADJ.msg_id field */
    if(!nonNullOnly || (MsgId != null))  _MsgIdSet = flag;
  /** MULTI_LINES_ADJ.msg_id2 field */
    if(!nonNullOnly || (MsgId2 != null))  _MsgId2Set = flag;
  /** MULTI_LINES_ADJ.msg_id_serv field */
    if(!nonNullOnly || (MsgIdServ != null))  _MsgIdServSet = flag;
  /** MULTI_LINES_ADJ.split_row_num field */
    if(!nonNullOnly || (SplitRowNum != null))  _SplitRowNumSet = flag;
  /** MULTI_LINES_ADJ.bill_ref_no field */
    if(!nonNullOnly || (BillRefNo != null))  _BillRefNoSet = flag;
  /** MULTI_LINES_ADJ.bill_ref_resets field */
    if(!nonNullOnly || (BillRefResets != null))  _BillRefResetsSet = flag;
  /** MULTI_LINES_ADJ.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  /** MULTI_LINES_ADJ.adj_trans_code field */
    if(!nonNullOnly || (AdjTransCode != null))  _AdjTransCodeSet = flag;
  /** MULTI_LINES_ADJ.amt_eligible_calc field */
    if(!nonNullOnly || (AmtEligibleCalc != null))  _AmtEligibleCalcSet = flag;
  /** MULTI_LINES_ADJ.row_number field */
    if(!nonNullOnly || (RowNumber != null))  _RowNumberSet = flag;
  }
}
