/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PaymentDistributionObjectData.java
 * Definition File: Customer/PaymentDistribution.xml
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
  
/** PaymentDistributionObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class PaymentDistributionObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public PaymentDistributionObjectKeyData Key = null;
  /** ACCOUNT_BALANCES.balance_desc field */
  public    String PrepayBalanceDesc  = null;
  protected boolean _PrepayBalanceDescSet = false;
  /** BMF.open_item_id field */
  public    Integer BmfOpenItemId  = null;
  protected boolean _BmfOpenItemIdSet = false;
  /** BMF.no_bill field */
  public    Boolean NoBill  = null;
  protected boolean _NoBillSet = false;
  /** BMF.bill_ref_no field */
  public    Integer PaymentBillRefNo  = null;
  protected boolean _PaymentBillRefNoSet = false;
  /** BMF.bill_ref_resets field */
  public    Integer PaymentBillRefResets  = null;
  protected boolean _PaymentBillRefResetsSet = false;
  /** BMF_DISTRIBUTION.account_no field */
  public    Integer AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  /** BMF_DISTRIBUTION.bill_ref_no field */
  public    Integer BillRefNo  = null;
  protected boolean _BillRefNoSet = false;
  /** BMF_DISTRIBUTION.bill_ref_resets field */
  public    Integer BillRefResets  = null;
  protected boolean _BillRefResetsSet = false;
  /** BMF_DISTRIBUTION.orig_bill_ref_no field */
  public    Integer OrigBillRefNo  = null;
  protected boolean _OrigBillRefNoSet = false;
  /** BMF_DISTRIBUTION.orig_bill_ref_resets field */
  public    Integer OrigBillRefResets  = null;
  protected boolean _OrigBillRefResetsSet = false;
  /** BMF_DISTRIBUTION.amount field */
  public    BigInteger Amount  = null;
  protected boolean _AmountSet = false;
  /** BMF_DISTRIBUTION.gl_amount field */
  public    BigInteger GlAmount  = null;
  protected boolean _GlAmountSet = false;
  /** BMF_DISTRIBUTION.status field */
  public    Integer Status  = null;
  protected boolean _StatusSet = false;
  /** BMF_DISTRIBUTION.trans_date field */
  public    Date TransDate  = null;
  protected boolean _TransDateSet = false;
  /** BMF_DISTRIBUTION.chg_date field */
  public    Date ChgDate  = null;
  protected boolean _ChgDateSet = false;
  /** BMF_DISTRIBUTION.chg_who field */
  public    String ChgWho  = null;
  protected boolean _ChgWhoSet = false;
  /** BMF_DISTRIBUTION.bmf_trans_type field */
  public    Integer BmfTransType  = null;
  protected boolean _BmfTransTypeSet = false;
  /** BMF_DISTRIBUTION.currency_gain_loss field */
  public    BigInteger CurrencyGainLoss  = null;
  protected boolean _CurrencyGainLossSet = false;
  /** BMF_DISTRIBUTION.currency_code field */
  public    Integer CurrencyCode  = null;
  protected boolean _CurrencyCodeSet = false;
  /** BMF_DISTRIBUTION.open_item_id field */
  public    Integer OpenItemId  = null;
  protected boolean _OpenItemIdSet = false;
  /** BMF_DISTRIBUTION.late_fee_status field */
  public    Integer LateFeeStatus  = null;
  protected boolean _LateFeeStatusSet = false;
  private String _objName = "PaymentDistributionObjectData";
  /** Default constructor */
  public PaymentDistributionObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public PaymentDistributionObjectData (PaymentDistributionObjectData other)
  {

    if (other == null) return;
    this.Key = new PaymentDistributionObjectKeyData (other.Key);
    this.PrepayBalanceDesc = other.PrepayBalanceDesc;
    this._PrepayBalanceDescSet = other._PrepayBalanceDescSet;
    this.BmfOpenItemId = other.BmfOpenItemId;
    this._BmfOpenItemIdSet = other._BmfOpenItemIdSet;
    this.NoBill = other.NoBill;
    this._NoBillSet = other._NoBillSet;
    this.PaymentBillRefNo = other.PaymentBillRefNo;
    this._PaymentBillRefNoSet = other._PaymentBillRefNoSet;
    this.PaymentBillRefResets = other.PaymentBillRefResets;
    this._PaymentBillRefResetsSet = other._PaymentBillRefResetsSet;
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
    this.BillRefNo = other.BillRefNo;
    this._BillRefNoSet = other._BillRefNoSet;
    this.BillRefResets = other.BillRefResets;
    this._BillRefResetsSet = other._BillRefResetsSet;
    this.OrigBillRefNo = other.OrigBillRefNo;
    this._OrigBillRefNoSet = other._OrigBillRefNoSet;
    this.OrigBillRefResets = other.OrigBillRefResets;
    this._OrigBillRefResetsSet = other._OrigBillRefResetsSet;
    this.Amount = other.Amount;
    this._AmountSet = other._AmountSet;
    this.GlAmount = other.GlAmount;
    this._GlAmountSet = other._GlAmountSet;
    this.Status = other.Status;
    this._StatusSet = other._StatusSet;
    this.TransDate = other.TransDate;
    this._TransDateSet = other._TransDateSet;
    this.ChgDate = other.ChgDate;
    this._ChgDateSet = other._ChgDateSet;
    this.ChgWho = other.ChgWho;
    this._ChgWhoSet = other._ChgWhoSet;
    this.BmfTransType = other.BmfTransType;
    this._BmfTransTypeSet = other._BmfTransTypeSet;
    this.CurrencyGainLoss = other.CurrencyGainLoss;
    this._CurrencyGainLossSet = other._CurrencyGainLossSet;
    this.CurrencyCode = other.CurrencyCode;
    this._CurrencyCodeSet = other._CurrencyCodeSet;
    this.OpenItemId = other.OpenItemId;
    this._OpenItemIdSet = other._OpenItemIdSet;
    this.LateFeeStatus = other.LateFeeStatus;
    this._LateFeeStatusSet = other._LateFeeStatusSet;
  }

  /** get the Key for this object
   * @return PaymentDistributionObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public PaymentDistributionObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (PaymentDistributionObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: BmfTrackingId (BMF_DISTRIBUTION.bmf_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBmfTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BmfTrackingId", "setBmfTrackingId");
    }
    if (this.Key == null) this.Key = new PaymentDistributionObjectKeyData ();
    this.Key.BmfTrackingId = value;
    this.Key._BmfTrackingIdSet = true;
  }
  /** get the value of the field: BmfTrackingId (BMF_DISTRIBUTION.bmf_tracking_id)
   * @return Integer the value
   */
  public Integer getBmfTrackingId () {
    if (this.Key == null) return null;
    return this.Key.BmfTrackingId;
  }
  /** Change the field to not being actively set: BmfTrackingId (BMF_DISTRIBUTION.bmf_tracking_id)
   */
  public void unsetBmfTrackingId () {
    if (this.Key == null) return;
    this.Key._BmfTrackingIdSet = false;
  }
  /** See if the field is actively set: BmfTrackingId (BMF_DISTRIBUTION.bmf_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetBmfTrackingId () {
    if (this.Key == null) return false;
    return this.Key._BmfTrackingIdSet;
  }

  /** Retrieves the BmfTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BmfTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfTrackingId field
   */
   public String getBmfTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getBmfTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the BmfTrackingId field from a formatted string
   *
   * @param _value the BmfTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BmfTrackingId field
   */
   public void setBmfTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBmfTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfTrackingIdFromFormattedString");
   }

  /** set the fields value: BmfTrackingIdServ (BMF_DISTRIBUTION.bmf_tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBmfTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BmfTrackingIdServ", "setBmfTrackingIdServ");
    }
    if (this.Key == null) this.Key = new PaymentDistributionObjectKeyData ();
    this.Key.BmfTrackingIdServ = value;
    this.Key._BmfTrackingIdServSet = true;
  }
  /** get the value of the field: BmfTrackingIdServ (BMF_DISTRIBUTION.bmf_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getBmfTrackingIdServ () {
    if (this.Key == null) return null;
    return this.Key.BmfTrackingIdServ;
  }
  /** Change the field to not being actively set: BmfTrackingIdServ (BMF_DISTRIBUTION.bmf_tracking_id_serv)
   */
  public void unsetBmfTrackingIdServ () {
    if (this.Key == null) return;
    this.Key._BmfTrackingIdServSet = false;
  }
  /** See if the field is actively set: BmfTrackingIdServ (BMF_DISTRIBUTION.bmf_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetBmfTrackingIdServ () {
    if (this.Key == null) return false;
    return this.Key._BmfTrackingIdServSet;
  }

  /** Retrieves the BmfTrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BmfTrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfTrackingIdServ field
   */
   public String getBmfTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getBmfTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the BmfTrackingIdServ field from a formatted string
   *
   * @param _value the BmfTrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BmfTrackingIdServ field
   */
   public void setBmfTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBmfTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfTrackingIdServFromFormattedString");
   }

  /** set the fields value: DistribOrder (BMF_DISTRIBUTION.distrib_order)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setDistribOrder (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DistribOrder", "setDistribOrder");
    }
    if (this.Key == null) this.Key = new PaymentDistributionObjectKeyData ();
    this.Key.DistribOrder = value;
    this.Key._DistribOrderSet = true;
  }
  /** get the value of the field: DistribOrder (BMF_DISTRIBUTION.distrib_order)
   * @return Integer the value
   */
  public Integer getDistribOrder () {
    if (this.Key == null) return null;
    return this.Key.DistribOrder;
  }
  /** Change the field to not being actively set: DistribOrder (BMF_DISTRIBUTION.distrib_order)
   */
  public void unsetDistribOrder () {
    if (this.Key == null) return;
    this.Key._DistribOrderSet = false;
  }
  /** See if the field is actively set: DistribOrder (BMF_DISTRIBUTION.distrib_order)
   * @return boolean whether the field is actively set
   */
  public boolean issetDistribOrder () {
    if (this.Key == null) return false;
    return this.Key._DistribOrderSet;
  }

  /** Retrieves the DistribOrder field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DistribOrder field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DistribOrder field
   */
   public String getDistribOrderAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDistribOrderAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDistribOrderAsFormattedString");
       return fmtMgr.formatNumber(this.getDistribOrder(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DistribOrder");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDistribOrderAsFormattedString");
       throw x;
     }
   }
  /** Sets the DistribOrder field from a formatted string
   *
   * @param _value the DistribOrder field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DistribOrder field
   */
   public void setDistribOrderFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDistribOrderFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDistribOrder(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DistribOrder");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDistribOrderFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDistribOrderFromFormattedString");
   }

  /** set the fields value: PrepayBalanceDesc (ACCOUNT_BALANCES.balance_desc)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrepayBalanceDesc") 
  public void setPrepayBalanceDesc (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 85))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PrepayBalanceDesc", "setPrepayBalanceDesc");
    }
    this.PrepayBalanceDesc = value;
    this._PrepayBalanceDescSet = true;
  }

  /** Retrieves the PrepayBalanceDesc field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrepayBalanceDesc field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepayBalanceDesc field
   */
   public String getPrepayBalanceDescAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepayBalanceDescAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepayBalanceDescAsFormattedString");
       return fmtMgr.formatString(this.getPrepayBalanceDesc());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepayBalanceDesc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepayBalanceDescAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrepayBalanceDesc field from a formatted string
   *
   * @param _value the PrepayBalanceDesc field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrepayBalanceDesc field
   */
   public void setPrepayBalanceDescFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepayBalanceDescFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrepayBalanceDesc(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepayBalanceDesc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepayBalanceDescFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepayBalanceDescFromFormattedString");
   }

  /** get the value of the field: PrepayBalanceDesc (ACCOUNT_BALANCES.balance_desc)
   * @return String the value
   */
  public String getPrepayBalanceDesc () {
    return this.PrepayBalanceDesc;
  }
  /** Change the field to not being actively set: PrepayBalanceDesc (ACCOUNT_BALANCES.balance_desc)
   */
  public void unsetPrepayBalanceDesc () {
    this._PrepayBalanceDescSet = false;
  }
  /** See if the field is actively set: PrepayBalanceDesc (ACCOUNT_BALANCES.balance_desc)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrepayBalanceDesc () {
    return this._PrepayBalanceDescSet;
  }
  /** set the fields value: BmfOpenItemId (BMF.open_item_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BmfOpenItemId") 
  public void setBmfOpenItemId (Integer value) throws ServiceException
  {
    this.BmfOpenItemId = value;
    this._BmfOpenItemIdSet = true;
  }

  /** Retrieves the BmfOpenItemId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BmfOpenItemId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfOpenItemId field
   */
   public String getBmfOpenItemIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfOpenItemIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfOpenItemIdAsFormattedString");
       return fmtMgr.formatNumber(this.getBmfOpenItemId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfOpenItemId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfOpenItemIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the BmfOpenItemId field from a formatted string
   *
   * @param _value the BmfOpenItemId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BmfOpenItemId field
   */
   public void setBmfOpenItemIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfOpenItemIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBmfOpenItemId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfOpenItemId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfOpenItemIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfOpenItemIdFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated BmfOpenItemId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BmfOpenItemId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BmfOpenItemId field
   */

  public String getBmfOpenItemIdDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfOpenItemIdDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBmfOpenItemIdEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfOpenItemIdDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getBmfOpenItemId()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfOpenItemId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfOpenItemIdDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated BmfOpenItemId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the BmfOpenItemId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BmfOpenItemId field
   */
  public Enumeration getBmfOpenItemIdEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfOpenItemIdEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("OpenItem", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfOpenItemIdEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfOpenItemId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfOpenItemIdEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated BmfOpenItemId field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setBmfOpenItemIdFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBmfOpenItemIdFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBmfOpenItemIdEnumeration(_locale);
      this.setBmfOpenItemId((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfOpenItemId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfOpenItemIdFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBmfOpenItemIdFromDisplayValue");
  }

  /** get the value of the field: BmfOpenItemId (BMF.open_item_id)
   * @return Integer the value
   */
  public Integer getBmfOpenItemId () {
    return this.BmfOpenItemId;
  }
  /** Change the field to not being actively set: BmfOpenItemId (BMF.open_item_id)
   */
  public void unsetBmfOpenItemId () {
    this._BmfOpenItemIdSet = false;
  }
  /** See if the field is actively set: BmfOpenItemId (BMF.open_item_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetBmfOpenItemId () {
    return this._BmfOpenItemIdSet;
  }
  /** set the fields value: NoBill (BMF.no_bill)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NoBill") 
  public void setNoBill (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "NoBill", "setNoBill");
    }
    this.NoBill = value;
    this._NoBillSet = true;
  }

  /** Retrieves the NoBill field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NoBill field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NoBill field
   */
   public String getNoBillAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoBillAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNoBillAsFormattedString");
       return fmtMgr.formatBoolean(this.getNoBill());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NoBill");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNoBillAsFormattedString");
       throw x;
     }
   }
  /** Sets the NoBill field from a formatted string
   *
   * @param _value the NoBill field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NoBill field
   */
   public void setNoBillFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoBillFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNoBill(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NoBill");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNoBillFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNoBillFromFormattedString");
   }

  /** get the value of the field: NoBill (BMF.no_bill)
   * @return Boolean the value
   */
  public Boolean getNoBill () {
    return this.NoBill;
  }
  /** Change the field to not being actively set: NoBill (BMF.no_bill)
   */
  public void unsetNoBill () {
    this._NoBillSet = false;
  }
  /** See if the field is actively set: NoBill (BMF.no_bill)
   * @return boolean whether the field is actively set
   */
  public boolean issetNoBill () {
    return this._NoBillSet;
  }
  /** set the fields value: PaymentBillRefNo (BMF.bill_ref_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PaymentBillRefNo") 
  public void setPaymentBillRefNo (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PaymentBillRefNo", "setPaymentBillRefNo");
    }
    this.PaymentBillRefNo = value;
    this._PaymentBillRefNoSet = true;
  }

  /** Retrieves the PaymentBillRefNo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PaymentBillRefNo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PaymentBillRefNo field
   */
   public String getPaymentBillRefNoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentBillRefNoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentBillRefNoAsFormattedString");
       return fmtMgr.formatNumber(this.getPaymentBillRefNo(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PaymentBillRefNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPaymentBillRefNoAsFormattedString");
       throw x;
     }
   }
  /** Sets the PaymentBillRefNo field from a formatted string
   *
   * @param _value the PaymentBillRefNo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PaymentBillRefNo field
   */
   public void setPaymentBillRefNoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentBillRefNoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPaymentBillRefNo(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PaymentBillRefNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPaymentBillRefNoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPaymentBillRefNoFromFormattedString");
   }

  /** get the value of the field: PaymentBillRefNo (BMF.bill_ref_no)
   * @return Integer the value
   */
  public Integer getPaymentBillRefNo () {
    return this.PaymentBillRefNo;
  }
  /** Change the field to not being actively set: PaymentBillRefNo (BMF.bill_ref_no)
   */
  public void unsetPaymentBillRefNo () {
    this._PaymentBillRefNoSet = false;
  }
  /** See if the field is actively set: PaymentBillRefNo (BMF.bill_ref_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetPaymentBillRefNo () {
    return this._PaymentBillRefNoSet;
  }
  /** set the fields value: PaymentBillRefResets (BMF.bill_ref_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PaymentBillRefResets") 
  public void setPaymentBillRefResets (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PaymentBillRefResets", "setPaymentBillRefResets");
    }
    this.PaymentBillRefResets = value;
    this._PaymentBillRefResetsSet = true;
  }

  /** Retrieves the PaymentBillRefResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PaymentBillRefResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PaymentBillRefResets field
   */
   public String getPaymentBillRefResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentBillRefResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentBillRefResetsAsFormattedString");
       return fmtMgr.formatNumber(this.getPaymentBillRefResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PaymentBillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPaymentBillRefResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the PaymentBillRefResets field from a formatted string
   *
   * @param _value the PaymentBillRefResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PaymentBillRefResets field
   */
   public void setPaymentBillRefResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentBillRefResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPaymentBillRefResets(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PaymentBillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPaymentBillRefResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPaymentBillRefResetsFromFormattedString");
   }

  /** get the value of the field: PaymentBillRefResets (BMF.bill_ref_resets)
   * @return Integer the value
   */
  public Integer getPaymentBillRefResets () {
    return this.PaymentBillRefResets;
  }
  /** Change the field to not being actively set: PaymentBillRefResets (BMF.bill_ref_resets)
   */
  public void unsetPaymentBillRefResets () {
    this._PaymentBillRefResetsSet = false;
  }
  /** See if the field is actively set: PaymentBillRefResets (BMF.bill_ref_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetPaymentBillRefResets () {
    return this._PaymentBillRefResetsSet;
  }
  /** set the fields value: AccountInternalId (BMF_DISTRIBUTION.account_no)
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

  /** get the value of the field: AccountInternalId (BMF_DISTRIBUTION.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (BMF_DISTRIBUTION.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (BMF_DISTRIBUTION.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  /** set the fields value: BillRefNo (BMF_DISTRIBUTION.bill_ref_no)
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

  /** get the value of the field: BillRefNo (BMF_DISTRIBUTION.bill_ref_no)
   * @return Integer the value
   */
  public Integer getBillRefNo () {
    return this.BillRefNo;
  }
  /** Change the field to not being actively set: BillRefNo (BMF_DISTRIBUTION.bill_ref_no)
   */
  public void unsetBillRefNo () {
    this._BillRefNoSet = false;
  }
  /** See if the field is actively set: BillRefNo (BMF_DISTRIBUTION.bill_ref_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefNo () {
    return this._BillRefNoSet;
  }
  /** set the fields value: BillRefResets (BMF_DISTRIBUTION.bill_ref_resets)
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

  /** get the value of the field: BillRefResets (BMF_DISTRIBUTION.bill_ref_resets)
   * @return Integer the value
   */
  public Integer getBillRefResets () {
    return this.BillRefResets;
  }
  /** Change the field to not being actively set: BillRefResets (BMF_DISTRIBUTION.bill_ref_resets)
   */
  public void unsetBillRefResets () {
    this._BillRefResetsSet = false;
  }
  /** See if the field is actively set: BillRefResets (BMF_DISTRIBUTION.bill_ref_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefResets () {
    return this._BillRefResetsSet;
  }
  /** set the fields value: OrigBillRefNo (BMF_DISTRIBUTION.orig_bill_ref_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigBillRefNo") 
  public void setOrigBillRefNo (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OrigBillRefNo", "setOrigBillRefNo");
    }
    this.OrigBillRefNo = value;
    this._OrigBillRefNoSet = true;
  }

  /** Retrieves the OrigBillRefNo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigBillRefNo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigBillRefNo field
   */
   public String getOrigBillRefNoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBillRefNoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigBillRefNoAsFormattedString");
       return fmtMgr.formatNumber(this.getOrigBillRefNo(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigBillRefNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigBillRefNoAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigBillRefNo field from a formatted string
   *
   * @param _value the OrigBillRefNo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigBillRefNo field
   */
   public void setOrigBillRefNoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBillRefNoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigBillRefNo(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigBillRefNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigBillRefNoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigBillRefNoFromFormattedString");
   }

  /** get the value of the field: OrigBillRefNo (BMF_DISTRIBUTION.orig_bill_ref_no)
   * @return Integer the value
   */
  public Integer getOrigBillRefNo () {
    return this.OrigBillRefNo;
  }
  /** Change the field to not being actively set: OrigBillRefNo (BMF_DISTRIBUTION.orig_bill_ref_no)
   */
  public void unsetOrigBillRefNo () {
    this._OrigBillRefNoSet = false;
  }
  /** See if the field is actively set: OrigBillRefNo (BMF_DISTRIBUTION.orig_bill_ref_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigBillRefNo () {
    return this._OrigBillRefNoSet;
  }
  /** set the fields value: OrigBillRefResets (BMF_DISTRIBUTION.orig_bill_ref_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigBillRefResets") 
  public void setOrigBillRefResets (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OrigBillRefResets", "setOrigBillRefResets");
    }
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

  /** get the value of the field: OrigBillRefResets (BMF_DISTRIBUTION.orig_bill_ref_resets)
   * @return Integer the value
   */
  public Integer getOrigBillRefResets () {
    return this.OrigBillRefResets;
  }
  /** Change the field to not being actively set: OrigBillRefResets (BMF_DISTRIBUTION.orig_bill_ref_resets)
   */
  public void unsetOrigBillRefResets () {
    this._OrigBillRefResetsSet = false;
  }
  /** See if the field is actively set: OrigBillRefResets (BMF_DISTRIBUTION.orig_bill_ref_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigBillRefResets () {
    return this._OrigBillRefResetsSet;
  }
  /** set the fields value: Amount (BMF_DISTRIBUTION.amount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Amount") 
  public void setAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Amount", "setAmount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Amount", "setAmount");
    }
    this.Amount = value;
    this._AmountSet = true;
  }

  /** Retrieves the Amount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Amount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Amount field
   */
   public String getAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Amount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the Amount field from a formatted string
   *
   * @param _value the Amount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Amount field
   */
   public void setAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Amount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountFromFormattedString");
   }

  /**
   * Retrieves the Amount field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The Amount field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the Amount field
   */
  public String getAmountAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getAmount(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Amount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the Amount field value from a formatted currency string
   *
   * @param _value the Amount field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Amount field
   */
  public void setAmountFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAmountFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setAmount(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Amount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountFromFormattedCurrencyString");
  }

  /** get the value of the field: Amount (BMF_DISTRIBUTION.amount)
   * @return BigInteger the value
   */
  public BigInteger getAmount () {
    return this.Amount;
  }
  /** Change the field to not being actively set: Amount (BMF_DISTRIBUTION.amount)
   */
  public void unsetAmount () {
    this._AmountSet = false;
  }
  /** See if the field is actively set: Amount (BMF_DISTRIBUTION.amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetAmount () {
    return this._AmountSet;
  }
  /** set the fields value: GlAmount (BMF_DISTRIBUTION.gl_amount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("GlAmount") 
  public void setGlAmount (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "GlAmount", "setGlAmount");
    }
    this.GlAmount = value;
    this._GlAmountSet = true;
  }

  /** Retrieves the GlAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The GlAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GlAmount field
   */
   public String getGlAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGlAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getGlAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GlAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getGlAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the GlAmount field from a formatted string
   *
   * @param _value the GlAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the GlAmount field
   */
   public void setGlAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setGlAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GlAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setGlAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGlAmountFromFormattedString");
   }

  /**
   * Retrieves the GlAmount field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GlAmount field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the GlAmount field
   */
  public String getGlAmountAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlAmountAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGlAmountAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getGlAmount(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GlAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGlAmountAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the GlAmount field value from a formatted currency string
   *
   * @param _value the GlAmount field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the GlAmount field
   */
  public void setGlAmountFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGlAmountFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setGlAmount(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GlAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGlAmountFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGlAmountFromFormattedCurrencyString");
  }

  /** get the value of the field: GlAmount (BMF_DISTRIBUTION.gl_amount)
   * @return BigInteger the value
   */
  public BigInteger getGlAmount () {
    return this.GlAmount;
  }
  /** Change the field to not being actively set: GlAmount (BMF_DISTRIBUTION.gl_amount)
   */
  public void unsetGlAmount () {
    this._GlAmountSet = false;
  }
  /** See if the field is actively set: GlAmount (BMF_DISTRIBUTION.gl_amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetGlAmount () {
    return this._GlAmountSet;
  }
  /** set the fields value: Status (BMF_DISTRIBUTION.status)
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

  /** get the value of the field: Status (BMF_DISTRIBUTION.status)
   * @return Integer the value
   */
  public Integer getStatus () {
    return this.Status;
  }
  /** Change the field to not being actively set: Status (BMF_DISTRIBUTION.status)
   */
  public void unsetStatus () {
    this._StatusSet = false;
  }
  /** See if the field is actively set: Status (BMF_DISTRIBUTION.status)
   * @return boolean whether the field is actively set
   */
  public boolean issetStatus () {
    return this._StatusSet;
  }
  /** set the fields value: TransDate (BMF_DISTRIBUTION.trans_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TransDate") 
  public void setTransDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TransDate", "setTransDate");
    }
    this.TransDate = value;
    this._TransDateSet = true;
  }

  /** Retrieves the TransDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TransDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransDate field
   */
   public String getTransDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransDateAsFormattedString");
       return fmtMgr.formatDate(this.getTransDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the TransDate field from a formatted string
   *
   * @param _value the TransDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransDate field
   */
   public void setTransDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTransDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransDateFromFormattedString");
   }

  /**
   * Retrieves the TransDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransDate field
   */
  public String getTransDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getTransDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the TransDate field value from a formatted date/time string
   *
   * @param _value the TransDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransDate field
   */
  public void setTransDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setTransDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: TransDate (BMF_DISTRIBUTION.trans_date)
   * @return Date the value
   */
  public Date getTransDate () {
    return this.TransDate;
  }
  /** Change the field to not being actively set: TransDate (BMF_DISTRIBUTION.trans_date)
   */
  public void unsetTransDate () {
    this._TransDateSet = false;
  }
  /** See if the field is actively set: TransDate (BMF_DISTRIBUTION.trans_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransDate () {
    return this._TransDateSet;
  }
  /** set the fields value: ChgDate (BMF_DISTRIBUTION.chg_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChgDate") 
  public void setChgDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChgDate", "setChgDate");
    }
    this.ChgDate = value;
    this._ChgDateSet = true;
  }

  /** Retrieves the ChgDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChgDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDate field
   */
   public String getChgDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateAsFormattedString");
       return fmtMgr.formatDate(this.getChgDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChgDate field from a formatted string
   *
   * @param _value the ChgDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDate field
   */
   public void setChgDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChgDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDateFromFormattedString");
   }

  /**
   * Retrieves the ChgDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDate field
   */
  public String getChgDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getChgDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDate field value from a formatted date/time string
   *
   * @param _value the ChgDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDate field
   */
  public void setChgDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setChgDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ChgDate (BMF_DISTRIBUTION.chg_date)
   * @return Date the value
   */
  public Date getChgDate () {
    return this.ChgDate;
  }
  /** Change the field to not being actively set: ChgDate (BMF_DISTRIBUTION.chg_date)
   */
  public void unsetChgDate () {
    this._ChgDateSet = false;
  }
  /** See if the field is actively set: ChgDate (BMF_DISTRIBUTION.chg_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgDate () {
    return this._ChgDateSet;
  }
  /** set the fields value: ChgWho (BMF_DISTRIBUTION.chg_who)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChgWho") 
  public void setChgWho (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChgWho", "setChgWho");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ChgWho", "setChgWho");
    }
    this.ChgWho = value;
    this._ChgWhoSet = true;
  }

  /** Retrieves the ChgWho field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChgWho field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgWho field
   */
   public String getChgWhoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgWhoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgWhoAsFormattedString");
       return fmtMgr.formatString(this.getChgWho());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgWho");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgWhoAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChgWho field from a formatted string
   *
   * @param _value the ChgWho field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgWho field
   */
   public void setChgWhoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgWhoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChgWho(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgWho");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgWhoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgWhoFromFormattedString");
   }

  /** get the value of the field: ChgWho (BMF_DISTRIBUTION.chg_who)
   * @return String the value
   */
  public String getChgWho () {
    return this.ChgWho;
  }
  /** Change the field to not being actively set: ChgWho (BMF_DISTRIBUTION.chg_who)
   */
  public void unsetChgWho () {
    this._ChgWhoSet = false;
  }
  /** See if the field is actively set: ChgWho (BMF_DISTRIBUTION.chg_who)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgWho () {
    return this._ChgWhoSet;
  }
  /** set the fields value: BmfTransType (BMF_DISTRIBUTION.bmf_trans_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BmfTransType") 
  public void setBmfTransType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BmfTransType", "setBmfTransType");
    }
    this.BmfTransType = value;
    this._BmfTransTypeSet = true;
  }

  /** Retrieves the BmfTransType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BmfTransType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfTransType field
   */
   public String getBmfTransTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTransTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTransTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getBmfTransType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfTransType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTransTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the BmfTransType field from a formatted string
   *
   * @param _value the BmfTransType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BmfTransType field
   */
   public void setBmfTransTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTransTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBmfTransType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfTransType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTransTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfTransTypeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated BmfTransType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BmfTransType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BmfTransType field
   */

  public String getBmfTransTypeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTransTypeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBmfTransTypeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTransTypeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getBmfTransType()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTransType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTransTypeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated BmfTransType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the BmfTransType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BmfTransType field
   */
  public Enumeration getBmfTransTypeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTransTypeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("PaymentType", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTransTypeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTransType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTransTypeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated BmfTransType field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setBmfTransTypeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBmfTransTypeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBmfTransTypeEnumeration(_locale);
      this.setBmfTransType((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTransType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTransTypeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBmfTransTypeFromDisplayValue");
  }

  /** get the value of the field: BmfTransType (BMF_DISTRIBUTION.bmf_trans_type)
   * @return Integer the value
   */
  public Integer getBmfTransType () {
    return this.BmfTransType;
  }
  /** Change the field to not being actively set: BmfTransType (BMF_DISTRIBUTION.bmf_trans_type)
   */
  public void unsetBmfTransType () {
    this._BmfTransTypeSet = false;
  }
  /** See if the field is actively set: BmfTransType (BMF_DISTRIBUTION.bmf_trans_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetBmfTransType () {
    return this._BmfTransTypeSet;
  }
  /** set the fields value: CurrencyGainLoss (BMF_DISTRIBUTION.currency_gain_loss)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CurrencyGainLoss") 
  public void setCurrencyGainLoss (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CurrencyGainLoss", "setCurrencyGainLoss");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CurrencyGainLoss", "setCurrencyGainLoss");
    }
    this.CurrencyGainLoss = value;
    this._CurrencyGainLossSet = true;
  }

  /** Retrieves the CurrencyGainLoss field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CurrencyGainLoss field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CurrencyGainLoss field
   */
   public String getCurrencyGainLossAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyGainLossAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyGainLossAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCurrencyGainLoss(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CurrencyGainLoss");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyGainLossAsFormattedString");
       throw x;
     }
   }
  /** Sets the CurrencyGainLoss field from a formatted string
   *
   * @param _value the CurrencyGainLoss field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CurrencyGainLoss field
   */
   public void setCurrencyGainLossFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyGainLossFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCurrencyGainLoss(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CurrencyGainLoss");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyGainLossFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyGainLossFromFormattedString");
   }

  /**
   * Retrieves the CurrencyGainLoss field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CurrencyGainLoss field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the CurrencyGainLoss field
   */
  public String getCurrencyGainLossAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyGainLossAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyGainLossAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getCurrencyGainLoss(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyGainLoss");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyGainLossAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the CurrencyGainLoss field value from a formatted currency string
   *
   * @param _value the CurrencyGainLoss field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CurrencyGainLoss field
   */
  public void setCurrencyGainLossFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCurrencyGainLossFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setCurrencyGainLoss(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyGainLoss");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyGainLossFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyGainLossFromFormattedCurrencyString");
  }

  /** get the value of the field: CurrencyGainLoss (BMF_DISTRIBUTION.currency_gain_loss)
   * @return BigInteger the value
   */
  public BigInteger getCurrencyGainLoss () {
    return this.CurrencyGainLoss;
  }
  /** Change the field to not being actively set: CurrencyGainLoss (BMF_DISTRIBUTION.currency_gain_loss)
   */
  public void unsetCurrencyGainLoss () {
    this._CurrencyGainLossSet = false;
  }
  /** See if the field is actively set: CurrencyGainLoss (BMF_DISTRIBUTION.currency_gain_loss)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyGainLoss () {
    return this._CurrencyGainLossSet;
  }
  /** set the fields value: CurrencyCode (BMF_DISTRIBUTION.currency_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CurrencyCode") 
  public void setCurrencyCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CurrencyCode", "setCurrencyCode");
    }
    this.CurrencyCode = value;
    this._CurrencyCodeSet = true;
  }

  /** Retrieves the CurrencyCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CurrencyCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CurrencyCode field
   */
   public String getCurrencyCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getCurrencyCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CurrencyCode field from a formatted string
   *
   * @param _value the CurrencyCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CurrencyCode field
   */
   public void setCurrencyCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCurrencyCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyCodeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated CurrencyCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CurrencyCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CurrencyCode field
   */

  public String getCurrencyCodeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCurrencyCodeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getCurrencyCode()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated CurrencyCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the CurrencyCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CurrencyCode field
   */
  public Enumeration getCurrencyCodeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("Currency", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated CurrencyCode field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setCurrencyCodeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCurrencyCodeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCurrencyCodeEnumeration(_locale);
      this.setCurrencyCode((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCurrencyCodeFromDisplayValue");
  }

  /** get the value of the field: CurrencyCode (BMF_DISTRIBUTION.currency_code)
   * @return Integer the value
   */
  public Integer getCurrencyCode () {
    return this.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (BMF_DISTRIBUTION.currency_code)
   */
  public void unsetCurrencyCode () {
    this._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (BMF_DISTRIBUTION.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode () {
    return this._CurrencyCodeSet;
  }
  /** set the fields value: OpenItemId (BMF_DISTRIBUTION.open_item_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OpenItemId") 
  public void setOpenItemId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OpenItemId", "setOpenItemId");
    }
    this.OpenItemId = value;
    this._OpenItemIdSet = true;
  }

  /** Retrieves the OpenItemId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OpenItemId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OpenItemId field
   */
   public String getOpenItemIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdAsFormattedString");
       return fmtMgr.formatNumber(this.getOpenItemId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OpenItemId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOpenItemIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the OpenItemId field from a formatted string
   *
   * @param _value the OpenItemId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OpenItemId field
   */
   public void setOpenItemIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOpenItemId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OpenItemId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOpenItemIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOpenItemIdFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated OpenItemId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the OpenItemId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the OpenItemId field
   */

  public String getOpenItemIdDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getOpenItemIdEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getOpenItemId()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OpenItemId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOpenItemIdDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated OpenItemId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the OpenItemId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the OpenItemId field
   */
  public Enumeration getOpenItemIdEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("OpenItem", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OpenItemId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOpenItemIdEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated OpenItemId field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setOpenItemIdFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOpenItemIdFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getOpenItemIdEnumeration(_locale);
      this.setOpenItemId((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OpenItemId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOpenItemIdFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOpenItemIdFromDisplayValue");
  }

  /** get the value of the field: OpenItemId (BMF_DISTRIBUTION.open_item_id)
   * @return Integer the value
   */
  public Integer getOpenItemId () {
    return this.OpenItemId;
  }
  /** Change the field to not being actively set: OpenItemId (BMF_DISTRIBUTION.open_item_id)
   */
  public void unsetOpenItemId () {
    this._OpenItemIdSet = false;
  }
  /** See if the field is actively set: OpenItemId (BMF_DISTRIBUTION.open_item_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetOpenItemId () {
    return this._OpenItemIdSet;
  }
  /** set the fields value: LateFeeStatus (BMF_DISTRIBUTION.late_fee_status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("LateFeeStatus") 
  public void setLateFeeStatus (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LateFeeStatus", "setLateFeeStatus");
    }
    this.LateFeeStatus = value;
    this._LateFeeStatusSet = true;
  }

  /** Retrieves the LateFeeStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LateFeeStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LateFeeStatus field
   */
   public String getLateFeeStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLateFeeStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLateFeeStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getLateFeeStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LateFeeStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLateFeeStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the LateFeeStatus field from a formatted string
   *
   * @param _value the LateFeeStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LateFeeStatus field
   */
   public void setLateFeeStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLateFeeStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLateFeeStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LateFeeStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLateFeeStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLateFeeStatusFromFormattedString");
   }

  /** get the value of the field: LateFeeStatus (BMF_DISTRIBUTION.late_fee_status)
   * @return Integer the value
   */
  public Integer getLateFeeStatus () {
    return this.LateFeeStatus;
  }
  /** Change the field to not being actively set: LateFeeStatus (BMF_DISTRIBUTION.late_fee_status)
   */
  public void unsetLateFeeStatus () {
    this._LateFeeStatusSet = false;
  }
  /** See if the field is actively set: LateFeeStatus (BMF_DISTRIBUTION.late_fee_status)
   * @return boolean whether the field is actively set
   */
  public boolean issetLateFeeStatus () {
    return this._LateFeeStatusSet;
  }
  public String toString() {
    return PaymentDistributionObjectHelper.toMap(this, null).toString();
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
  /** ACCOUNT_BALANCES.balance_desc field */
    if(!nonNullOnly || (PrepayBalanceDesc != null))  _PrepayBalanceDescSet = flag;
  /** BMF.open_item_id field */
    if(!nonNullOnly || (BmfOpenItemId != null))  _BmfOpenItemIdSet = flag;
  /** BMF.no_bill field */
    if(!nonNullOnly || (NoBill != null))  _NoBillSet = flag;
  /** BMF.bill_ref_no field */
    if(!nonNullOnly || (PaymentBillRefNo != null))  _PaymentBillRefNoSet = flag;
  /** BMF.bill_ref_resets field */
    if(!nonNullOnly || (PaymentBillRefResets != null))  _PaymentBillRefResetsSet = flag;
  /** BMF_DISTRIBUTION.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  /** BMF_DISTRIBUTION.bill_ref_no field */
    if(!nonNullOnly || (BillRefNo != null))  _BillRefNoSet = flag;
  /** BMF_DISTRIBUTION.bill_ref_resets field */
    if(!nonNullOnly || (BillRefResets != null))  _BillRefResetsSet = flag;
  /** BMF_DISTRIBUTION.orig_bill_ref_no field */
    if(!nonNullOnly || (OrigBillRefNo != null))  _OrigBillRefNoSet = flag;
  /** BMF_DISTRIBUTION.orig_bill_ref_resets field */
    if(!nonNullOnly || (OrigBillRefResets != null))  _OrigBillRefResetsSet = flag;
  /** BMF_DISTRIBUTION.amount field */
    if(!nonNullOnly || (Amount != null))  _AmountSet = flag;
  /** BMF_DISTRIBUTION.gl_amount field */
    if(!nonNullOnly || (GlAmount != null))  _GlAmountSet = flag;
  /** BMF_DISTRIBUTION.status field */
    if(!nonNullOnly || (Status != null))  _StatusSet = flag;
  /** BMF_DISTRIBUTION.trans_date field */
    if(!nonNullOnly || (TransDate != null))  _TransDateSet = flag;
  /** BMF_DISTRIBUTION.chg_date field */
    if(!nonNullOnly || (ChgDate != null))  _ChgDateSet = flag;
  /** BMF_DISTRIBUTION.chg_who field */
    if(!nonNullOnly || (ChgWho != null))  _ChgWhoSet = flag;
  /** BMF_DISTRIBUTION.bmf_trans_type field */
    if(!nonNullOnly || (BmfTransType != null))  _BmfTransTypeSet = flag;
  /** BMF_DISTRIBUTION.currency_gain_loss field */
    if(!nonNullOnly || (CurrencyGainLoss != null))  _CurrencyGainLossSet = flag;
  /** BMF_DISTRIBUTION.currency_code field */
    if(!nonNullOnly || (CurrencyCode != null))  _CurrencyCodeSet = flag;
  /** BMF_DISTRIBUTION.open_item_id field */
    if(!nonNullOnly || (OpenItemId != null))  _OpenItemIdSet = flag;
  /** BMF_DISTRIBUTION.late_fee_status field */
    if(!nonNullOnly || (LateFeeStatus != null))  _LateFeeStatusSet = flag;
  }
}
