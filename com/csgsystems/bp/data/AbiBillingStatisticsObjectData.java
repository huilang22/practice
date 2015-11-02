/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AbiBillingStatisticsObjectData.java
 * Definition File: Customer/AbiBillingStatistics.xml
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
  
/** AbiBillingStatisticsObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class AbiBillingStatisticsObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public AbiBillingStatisticsObjectKeyData Key = null;
  /** ABI_BILLING_STATISTICS.statistic_value field */
  public    BigInteger StatisticValue  = null;
  protected boolean _StatisticValueSet = false;
  /** ABI_BILLING_STATISTICS.currency field */
  public    BigInteger Currency  = null;
  protected boolean _CurrencySet = false;
  /** ABI_BILLING_STATISTICS.statistic_type field */
  public    BigInteger StatisticType  = null;
  protected boolean _StatisticTypeSet = false;
  /** ABI_BILLING_STATISTICS.description field */
  public    String Description  = null;
  protected boolean _DescriptionSet = false;
  /** ABI_BILLING_STATISTICS.account_no field */
  public    BigInteger AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  /** ABI_BILLING_STATISTICS.subscr_no field */
  public    BigInteger ServiceInternalId  = null;
  protected boolean _ServiceInternalIdSet = false;
  /** ABI_BILLING_STATISTICS.subscr_no_resets field */
  public    BigInteger ServiceInternalIdResets  = null;
  protected boolean _ServiceInternalIdResetsSet = false;
  /** ABI_BILLING_STATISTICS.external_invoice_id field */
  public    BigInteger ExternalInvoiceId  = null;
  protected boolean _ExternalInvoiceIdSet = false;
  /** ABI_BILLING_STATISTICS.invoice_record_seq field */
  public    BigInteger InvoiceRecordSeq  = null;
  protected boolean _InvoiceRecordSeqSet = false;
  /** ABI_BILLING_STATISTICS.file_id field */
  public    BigInteger FileId  = null;
  protected boolean _FileIdSet = false;
  /** ABI_BILLING_STATISTICS.file_id_serv field */
  public    BigInteger FileIdServ  = null;
  protected boolean _FileIdServSet = false;
  /** ABI_BILLING_STATISTICS.lob_id field */
  public    BigInteger LobId  = null;
  protected boolean _LobIdSet = false;
  /** ABI_BILLING_STATISTICS.transaction_id field */
  public    BigInteger TransactionId  = null;
  protected boolean _TransactionIdSet = false;
  /** ABI_BILLING_STATISTICS.bill_ref_no field */
  public    BigInteger BillRefNo  = null;
  protected boolean _BillRefNoSet = false;
  /** ABI_BILLING_STATISTICS.bill_ref_resets field */
  public    BigInteger BillRefResets  = null;
  protected boolean _BillRefResetsSet = false;
  private String _objName = "AbiBillingStatisticsObjectData";
  /** Default constructor */
  public AbiBillingStatisticsObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public AbiBillingStatisticsObjectData (AbiBillingStatisticsObjectData other)
  {

    if (other == null) return;
    this.Key = new AbiBillingStatisticsObjectKeyData (other.Key);
    this.StatisticValue = other.StatisticValue;
    this._StatisticValueSet = other._StatisticValueSet;
    this.Currency = other.Currency;
    this._CurrencySet = other._CurrencySet;
    this.StatisticType = other.StatisticType;
    this._StatisticTypeSet = other._StatisticTypeSet;
    this.Description = other.Description;
    this._DescriptionSet = other._DescriptionSet;
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
    this.ServiceInternalId = other.ServiceInternalId;
    this._ServiceInternalIdSet = other._ServiceInternalIdSet;
    this.ServiceInternalIdResets = other.ServiceInternalIdResets;
    this._ServiceInternalIdResetsSet = other._ServiceInternalIdResetsSet;
    this.ExternalInvoiceId = other.ExternalInvoiceId;
    this._ExternalInvoiceIdSet = other._ExternalInvoiceIdSet;
    this.InvoiceRecordSeq = other.InvoiceRecordSeq;
    this._InvoiceRecordSeqSet = other._InvoiceRecordSeqSet;
    this.FileId = other.FileId;
    this._FileIdSet = other._FileIdSet;
    this.FileIdServ = other.FileIdServ;
    this._FileIdServSet = other._FileIdServSet;
    this.LobId = other.LobId;
    this._LobIdSet = other._LobIdSet;
    this.TransactionId = other.TransactionId;
    this._TransactionIdSet = other._TransactionIdSet;
    this.BillRefNo = other.BillRefNo;
    this._BillRefNoSet = other._BillRefNoSet;
    this.BillRefResets = other.BillRefResets;
    this._BillRefResetsSet = other._BillRefResetsSet;
  }

  /** get the Key for this object
   * @return AbiBillingStatisticsObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public AbiBillingStatisticsObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (AbiBillingStatisticsObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: StatisticId (ABI_BILLING_STATISTICS.statistic_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setStatisticId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "StatisticId", "setStatisticId");
    }
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "StatisticId", "setStatisticId");
    }
    if (this.Key == null) this.Key = new AbiBillingStatisticsObjectKeyData ();
    this.Key.StatisticId = value;
    this.Key._StatisticIdSet = true;
  }
  /** get the value of the field: StatisticId (ABI_BILLING_STATISTICS.statistic_id)
   * @return BigInteger the value
   */
  public BigInteger getStatisticId () {
    if (this.Key == null) return null;
    return this.Key.StatisticId;
  }
  /** Change the field to not being actively set: StatisticId (ABI_BILLING_STATISTICS.statistic_id)
   */
  public void unsetStatisticId () {
    if (this.Key == null) return;
    this.Key._StatisticIdSet = false;
  }
  /** See if the field is actively set: StatisticId (ABI_BILLING_STATISTICS.statistic_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetStatisticId () {
    if (this.Key == null) return false;
    return this.Key._StatisticIdSet;
  }

  /** Retrieves the StatisticId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StatisticId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatisticId field
   */
   public String getStatisticIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatisticIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatisticIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getStatisticId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatisticId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatisticIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the StatisticId field from a formatted string
   *
   * @param _value the StatisticId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StatisticId field
   */
   public void setStatisticIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatisticIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStatisticId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatisticId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatisticIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatisticIdFromFormattedString");
   }

  /** set the fields value: StatisticValue (ABI_BILLING_STATISTICS.statistic_value)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StatisticValue") 
  public void setStatisticValue (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "StatisticValue", "setStatisticValue");
    }
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "StatisticValue", "setStatisticValue");
    }
    this.StatisticValue = value;
    this._StatisticValueSet = true;
  }

  /** Retrieves the StatisticValue field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StatisticValue field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatisticValue field
   */
   public String getStatisticValueAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatisticValueAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatisticValueAsFormattedString");
       return fmtMgr.formatBigInteger(this.getStatisticValue(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatisticValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatisticValueAsFormattedString");
       throw x;
     }
   }
  /** Sets the StatisticValue field from a formatted string
   *
   * @param _value the StatisticValue field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StatisticValue field
   */
   public void setStatisticValueFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatisticValueFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStatisticValue(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatisticValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatisticValueFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatisticValueFromFormattedString");
   }

  /** get the value of the field: StatisticValue (ABI_BILLING_STATISTICS.statistic_value)
   * @return BigInteger the value
   */
  public BigInteger getStatisticValue () {
    return this.StatisticValue;
  }
  /** Change the field to not being actively set: StatisticValue (ABI_BILLING_STATISTICS.statistic_value)
   */
  public void unsetStatisticValue () {
    this._StatisticValueSet = false;
  }
  /** See if the field is actively set: StatisticValue (ABI_BILLING_STATISTICS.statistic_value)
   * @return boolean whether the field is actively set
   */
  public boolean issetStatisticValue () {
    return this._StatisticValueSet;
  }
  /** set the fields value: Currency (ABI_BILLING_STATISTICS.currency)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Currency") 
  public void setCurrency (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 6))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Currency", "setCurrency");
    }
    this.Currency = value;
    this._CurrencySet = true;
  }

  /** Retrieves the Currency field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Currency field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Currency field
   */
   public String getCurrencyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCurrency(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Currency");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyAsFormattedString");
       throw x;
     }
   }
  /** Sets the Currency field from a formatted string
   *
   * @param _value the Currency field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Currency field
   */
   public void setCurrencyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCurrency(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Currency");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyFromFormattedString");
   }

  /** get the value of the field: Currency (ABI_BILLING_STATISTICS.currency)
   * @return BigInteger the value
   */
  public BigInteger getCurrency () {
    return this.Currency;
  }
  /** Change the field to not being actively set: Currency (ABI_BILLING_STATISTICS.currency)
   */
  public void unsetCurrency () {
    this._CurrencySet = false;
  }
  /** See if the field is actively set: Currency (ABI_BILLING_STATISTICS.currency)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrency () {
    return this._CurrencySet;
  }
  /** set the fields value: StatisticType (ABI_BILLING_STATISTICS.statistic_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StatisticType") 
  public void setStatisticType (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "StatisticType", "setStatisticType");
    }
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "StatisticType", "setStatisticType");
    }
    this.StatisticType = value;
    this._StatisticTypeSet = true;
  }

  /** Retrieves the StatisticType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StatisticType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatisticType field
   */
   public String getStatisticTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatisticTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatisticTypeAsFormattedString");
       return fmtMgr.formatBigInteger(this.getStatisticType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatisticType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatisticTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the StatisticType field from a formatted string
   *
   * @param _value the StatisticType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StatisticType field
   */
   public void setStatisticTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatisticTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStatisticType(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatisticType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatisticTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatisticTypeFromFormattedString");
   }

  /** get the value of the field: StatisticType (ABI_BILLING_STATISTICS.statistic_type)
   * @return BigInteger the value
   */
  public BigInteger getStatisticType () {
    return this.StatisticType;
  }
  /** Change the field to not being actively set: StatisticType (ABI_BILLING_STATISTICS.statistic_type)
   */
  public void unsetStatisticType () {
    this._StatisticTypeSet = false;
  }
  /** See if the field is actively set: StatisticType (ABI_BILLING_STATISTICS.statistic_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetStatisticType () {
    return this._StatisticTypeSet;
  }
  /** set the fields value: Description (ABI_BILLING_STATISTICS.description)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Description") 
  public void setDescription (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 255))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Description", "setDescription");
    }
    this.Description = value;
    this._DescriptionSet = true;
  }

  /** Retrieves the Description field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Description field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Description field
   */
   public String getDescriptionAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDescriptionAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDescriptionAsFormattedString");
       return fmtMgr.formatString(this.getDescription());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Description");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDescriptionAsFormattedString");
       throw x;
     }
   }
  /** Sets the Description field from a formatted string
   *
   * @param _value the Description field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Description field
   */
   public void setDescriptionFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDescriptionFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDescription(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Description");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDescriptionFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDescriptionFromFormattedString");
   }

  /** get the value of the field: Description (ABI_BILLING_STATISTICS.description)
   * @return String the value
   */
  public String getDescription () {
    return this.Description;
  }
  /** Change the field to not being actively set: Description (ABI_BILLING_STATISTICS.description)
   */
  public void unsetDescription () {
    this._DescriptionSet = false;
  }
  /** See if the field is actively set: Description (ABI_BILLING_STATISTICS.description)
   * @return boolean whether the field is actively set
   */
  public boolean issetDescription () {
    return this._DescriptionSet;
  }
  /** set the fields value: AccountInternalId (ABI_BILLING_STATISTICS.account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountInternalId") 
  public void setAccountInternalId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountInternalId", "setAccountInternalId");
    }
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AccountInternalId", "setAccountInternalId");
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
       return fmtMgr.formatBigInteger(this.getAccountInternalId(), _locale);
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
       this.setAccountInternalId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountInternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountInternalIdFromFormattedString");
   }

  /** get the value of the field: AccountInternalId (ABI_BILLING_STATISTICS.account_no)
   * @return BigInteger the value
   */
  public BigInteger getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (ABI_BILLING_STATISTICS.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (ABI_BILLING_STATISTICS.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  /** set the fields value: ServiceInternalId (ABI_BILLING_STATISTICS.subscr_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceInternalId") 
  public void setServiceInternalId (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ServiceInternalId", "setServiceInternalId");
    }
    this.ServiceInternalId = value;
    this._ServiceInternalIdSet = true;
  }

  /** Retrieves the ServiceInternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceInternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInternalId field
   */
   public String getServiceInternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInternalIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getServiceInternalId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceInternalId field from a formatted string
   *
   * @param _value the ServiceInternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceInternalId field
   */
   public void setServiceInternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceInternalId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInternalIdFromFormattedString");
   }

  /** get the value of the field: ServiceInternalId (ABI_BILLING_STATISTICS.subscr_no)
   * @return BigInteger the value
   */
  public BigInteger getServiceInternalId () {
    return this.ServiceInternalId;
  }
  /** Change the field to not being actively set: ServiceInternalId (ABI_BILLING_STATISTICS.subscr_no)
   */
  public void unsetServiceInternalId () {
    this._ServiceInternalIdSet = false;
  }
  /** See if the field is actively set: ServiceInternalId (ABI_BILLING_STATISTICS.subscr_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceInternalId () {
    return this._ServiceInternalIdSet;
  }
  /** set the fields value: ServiceInternalIdResets (ABI_BILLING_STATISTICS.subscr_no_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceInternalIdResets") 
  public void setServiceInternalIdResets (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 6))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ServiceInternalIdResets", "setServiceInternalIdResets");
    }
    this.ServiceInternalIdResets = value;
    this._ServiceInternalIdResetsSet = true;
  }

  /** Retrieves the ServiceInternalIdResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceInternalIdResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInternalIdResets field
   */
   public String getServiceInternalIdResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInternalIdResetsAsFormattedString");
       return fmtMgr.formatBigInteger(this.getServiceInternalIdResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceInternalIdResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInternalIdResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceInternalIdResets field from a formatted string
   *
   * @param _value the ServiceInternalIdResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceInternalIdResets field
   */
   public void setServiceInternalIdResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceInternalIdResets(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceInternalIdResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInternalIdResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInternalIdResetsFromFormattedString");
   }

  /** get the value of the field: ServiceInternalIdResets (ABI_BILLING_STATISTICS.subscr_no_resets)
   * @return BigInteger the value
   */
  public BigInteger getServiceInternalIdResets () {
    return this.ServiceInternalIdResets;
  }
  /** Change the field to not being actively set: ServiceInternalIdResets (ABI_BILLING_STATISTICS.subscr_no_resets)
   */
  public void unsetServiceInternalIdResets () {
    this._ServiceInternalIdResetsSet = false;
  }
  /** See if the field is actively set: ServiceInternalIdResets (ABI_BILLING_STATISTICS.subscr_no_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceInternalIdResets () {
    return this._ServiceInternalIdResetsSet;
  }
  /** set the fields value: ExternalInvoiceId (ABI_BILLING_STATISTICS.external_invoice_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ExternalInvoiceId") 
  public void setExternalInvoiceId (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ExternalInvoiceId", "setExternalInvoiceId");
    }
    this.ExternalInvoiceId = value;
    this._ExternalInvoiceIdSet = true;
  }

  /** Retrieves the ExternalInvoiceId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ExternalInvoiceId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalInvoiceId field
   */
   public String getExternalInvoiceIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalInvoiceIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalInvoiceIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getExternalInvoiceId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExternalInvoiceId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalInvoiceIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ExternalInvoiceId field from a formatted string
   *
   * @param _value the ExternalInvoiceId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExternalInvoiceId field
   */
   public void setExternalInvoiceIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalInvoiceIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setExternalInvoiceId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExternalInvoiceId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalInvoiceIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalInvoiceIdFromFormattedString");
   }

  /** get the value of the field: ExternalInvoiceId (ABI_BILLING_STATISTICS.external_invoice_id)
   * @return BigInteger the value
   */
  public BigInteger getExternalInvoiceId () {
    return this.ExternalInvoiceId;
  }
  /** Change the field to not being actively set: ExternalInvoiceId (ABI_BILLING_STATISTICS.external_invoice_id)
   */
  public void unsetExternalInvoiceId () {
    this._ExternalInvoiceIdSet = false;
  }
  /** See if the field is actively set: ExternalInvoiceId (ABI_BILLING_STATISTICS.external_invoice_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetExternalInvoiceId () {
    return this._ExternalInvoiceIdSet;
  }
  /** set the fields value: InvoiceRecordSeq (ABI_BILLING_STATISTICS.invoice_record_seq)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("InvoiceRecordSeq") 
  public void setInvoiceRecordSeq (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "InvoiceRecordSeq", "setInvoiceRecordSeq");
    }
    this.InvoiceRecordSeq = value;
    this._InvoiceRecordSeqSet = true;
  }

  /** Retrieves the InvoiceRecordSeq field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InvoiceRecordSeq field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InvoiceRecordSeq field
   */
   public String getInvoiceRecordSeqAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInvoiceRecordSeqAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoiceRecordSeqAsFormattedString");
       return fmtMgr.formatBigInteger(this.getInvoiceRecordSeq(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InvoiceRecordSeq");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInvoiceRecordSeqAsFormattedString");
       throw x;
     }
   }
  /** Sets the InvoiceRecordSeq field from a formatted string
   *
   * @param _value the InvoiceRecordSeq field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InvoiceRecordSeq field
   */
   public void setInvoiceRecordSeqFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInvoiceRecordSeqFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInvoiceRecordSeq(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InvoiceRecordSeq");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInvoiceRecordSeqFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInvoiceRecordSeqFromFormattedString");
   }

  /** get the value of the field: InvoiceRecordSeq (ABI_BILLING_STATISTICS.invoice_record_seq)
   * @return BigInteger the value
   */
  public BigInteger getInvoiceRecordSeq () {
    return this.InvoiceRecordSeq;
  }
  /** Change the field to not being actively set: InvoiceRecordSeq (ABI_BILLING_STATISTICS.invoice_record_seq)
   */
  public void unsetInvoiceRecordSeq () {
    this._InvoiceRecordSeqSet = false;
  }
  /** See if the field is actively set: InvoiceRecordSeq (ABI_BILLING_STATISTICS.invoice_record_seq)
   * @return boolean whether the field is actively set
   */
  public boolean issetInvoiceRecordSeq () {
    return this._InvoiceRecordSeqSet;
  }
  /** set the fields value: FileId (ABI_BILLING_STATISTICS.file_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FileId") 
  public void setFileId (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FileId", "setFileId");
    }
    this.FileId = value;
    this._FileIdSet = true;
  }

  /** Retrieves the FileId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FileId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FileId field
   */
   public String getFileIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFileIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFileIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getFileId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FileId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFileIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the FileId field from a formatted string
   *
   * @param _value the FileId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FileId field
   */
   public void setFileIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFileIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFileId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FileId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFileIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFileIdFromFormattedString");
   }

  /** get the value of the field: FileId (ABI_BILLING_STATISTICS.file_id)
   * @return BigInteger the value
   */
  public BigInteger getFileId () {
    return this.FileId;
  }
  /** Change the field to not being actively set: FileId (ABI_BILLING_STATISTICS.file_id)
   */
  public void unsetFileId () {
    this._FileIdSet = false;
  }
  /** See if the field is actively set: FileId (ABI_BILLING_STATISTICS.file_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetFileId () {
    return this._FileIdSet;
  }
  /** set the fields value: FileIdServ (ABI_BILLING_STATISTICS.file_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FileIdServ") 
  public void setFileIdServ (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 3))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FileIdServ", "setFileIdServ");
    }
    this.FileIdServ = value;
    this._FileIdServSet = true;
  }

  /** Retrieves the FileIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FileIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FileIdServ field
   */
   public String getFileIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFileIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFileIdServAsFormattedString");
       return fmtMgr.formatBigInteger(this.getFileIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FileIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFileIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the FileIdServ field from a formatted string
   *
   * @param _value the FileIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FileIdServ field
   */
   public void setFileIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFileIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFileIdServ(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FileIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFileIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFileIdServFromFormattedString");
   }

  /** get the value of the field: FileIdServ (ABI_BILLING_STATISTICS.file_id_serv)
   * @return BigInteger the value
   */
  public BigInteger getFileIdServ () {
    return this.FileIdServ;
  }
  /** Change the field to not being actively set: FileIdServ (ABI_BILLING_STATISTICS.file_id_serv)
   */
  public void unsetFileIdServ () {
    this._FileIdServSet = false;
  }
  /** See if the field is actively set: FileIdServ (ABI_BILLING_STATISTICS.file_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetFileIdServ () {
    return this._FileIdServSet;
  }
  /** set the fields value: LobId (ABI_BILLING_STATISTICS.lob_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("LobId") 
  public void setLobId (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "LobId", "setLobId");
    }
    this.LobId = value;
    this._LobIdSet = true;
  }

  /** Retrieves the LobId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LobId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LobId field
   */
   public String getLobIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLobIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLobIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getLobId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LobId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLobIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the LobId field from a formatted string
   *
   * @param _value the LobId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LobId field
   */
   public void setLobIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLobIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLobId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LobId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLobIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLobIdFromFormattedString");
   }

  /** get the value of the field: LobId (ABI_BILLING_STATISTICS.lob_id)
   * @return BigInteger the value
   */
  public BigInteger getLobId () {
    return this.LobId;
  }
  /** Change the field to not being actively set: LobId (ABI_BILLING_STATISTICS.lob_id)
   */
  public void unsetLobId () {
    this._LobIdSet = false;
  }
  /** See if the field is actively set: LobId (ABI_BILLING_STATISTICS.lob_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetLobId () {
    return this._LobIdSet;
  }
  /** set the fields value: TransactionId (ABI_BILLING_STATISTICS.transaction_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TransactionId") 
  public void setTransactionId (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "TransactionId", "setTransactionId");
    }
    this.TransactionId = value;
    this._TransactionIdSet = true;
  }

  /** Retrieves the TransactionId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TransactionId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransactionId field
   */
   public String getTransactionIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransactionIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransactionIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getTransactionId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransactionId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransactionIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the TransactionId field from a formatted string
   *
   * @param _value the TransactionId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransactionId field
   */
   public void setTransactionIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransactionIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTransactionId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransactionId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransactionIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransactionIdFromFormattedString");
   }

  /** get the value of the field: TransactionId (ABI_BILLING_STATISTICS.transaction_id)
   * @return BigInteger the value
   */
  public BigInteger getTransactionId () {
    return this.TransactionId;
  }
  /** Change the field to not being actively set: TransactionId (ABI_BILLING_STATISTICS.transaction_id)
   */
  public void unsetTransactionId () {
    this._TransactionIdSet = false;
  }
  /** See if the field is actively set: TransactionId (ABI_BILLING_STATISTICS.transaction_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransactionId () {
    return this._TransactionIdSet;
  }
  /** set the fields value: BillRefNo (ABI_BILLING_STATISTICS.bill_ref_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillRefNo") 
  public void setBillRefNo (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillRefNo", "setBillRefNo");
    }
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillRefNo", "setBillRefNo");
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
       return fmtMgr.formatBigInteger(this.getBillRefNo(), _locale);
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
       this.setBillRefNo(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillRefNoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillRefNoFromFormattedString");
   }

  /** get the value of the field: BillRefNo (ABI_BILLING_STATISTICS.bill_ref_no)
   * @return BigInteger the value
   */
  public BigInteger getBillRefNo () {
    return this.BillRefNo;
  }
  /** Change the field to not being actively set: BillRefNo (ABI_BILLING_STATISTICS.bill_ref_no)
   */
  public void unsetBillRefNo () {
    this._BillRefNoSet = false;
  }
  /** See if the field is actively set: BillRefNo (ABI_BILLING_STATISTICS.bill_ref_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefNo () {
    return this._BillRefNoSet;
  }
  /** set the fields value: BillRefResets (ABI_BILLING_STATISTICS.bill_ref_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillRefResets") 
  public void setBillRefResets (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillRefResets", "setBillRefResets");
    }
    if (value != null && !DataHelper.validLength (value, 3))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillRefResets", "setBillRefResets");
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
       return fmtMgr.formatBigInteger(this.getBillRefResets(), _locale);
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
       this.setBillRefResets(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillRefResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillRefResetsFromFormattedString");
   }

  /** get the value of the field: BillRefResets (ABI_BILLING_STATISTICS.bill_ref_resets)
   * @return BigInteger the value
   */
  public BigInteger getBillRefResets () {
    return this.BillRefResets;
  }
  /** Change the field to not being actively set: BillRefResets (ABI_BILLING_STATISTICS.bill_ref_resets)
   */
  public void unsetBillRefResets () {
    this._BillRefResetsSet = false;
  }
  /** See if the field is actively set: BillRefResets (ABI_BILLING_STATISTICS.bill_ref_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefResets () {
    return this._BillRefResetsSet;
  }
  public String toString() {
    return AbiBillingStatisticsObjectHelper.toMap(this, null).toString();
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
  /** ABI_BILLING_STATISTICS.statistic_value field */
    if(!nonNullOnly || (StatisticValue != null))  _StatisticValueSet = flag;
  /** ABI_BILLING_STATISTICS.currency field */
    if(!nonNullOnly || (Currency != null))  _CurrencySet = flag;
  /** ABI_BILLING_STATISTICS.statistic_type field */
    if(!nonNullOnly || (StatisticType != null))  _StatisticTypeSet = flag;
  /** ABI_BILLING_STATISTICS.description field */
    if(!nonNullOnly || (Description != null))  _DescriptionSet = flag;
  /** ABI_BILLING_STATISTICS.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  /** ABI_BILLING_STATISTICS.subscr_no field */
    if(!nonNullOnly || (ServiceInternalId != null))  _ServiceInternalIdSet = flag;
  /** ABI_BILLING_STATISTICS.subscr_no_resets field */
    if(!nonNullOnly || (ServiceInternalIdResets != null))  _ServiceInternalIdResetsSet = flag;
  /** ABI_BILLING_STATISTICS.external_invoice_id field */
    if(!nonNullOnly || (ExternalInvoiceId != null))  _ExternalInvoiceIdSet = flag;
  /** ABI_BILLING_STATISTICS.invoice_record_seq field */
    if(!nonNullOnly || (InvoiceRecordSeq != null))  _InvoiceRecordSeqSet = flag;
  /** ABI_BILLING_STATISTICS.file_id field */
    if(!nonNullOnly || (FileId != null))  _FileIdSet = flag;
  /** ABI_BILLING_STATISTICS.file_id_serv field */
    if(!nonNullOnly || (FileIdServ != null))  _FileIdServSet = flag;
  /** ABI_BILLING_STATISTICS.lob_id field */
    if(!nonNullOnly || (LobId != null))  _LobIdSet = flag;
  /** ABI_BILLING_STATISTICS.transaction_id field */
    if(!nonNullOnly || (TransactionId != null))  _TransactionIdSet = flag;
  /** ABI_BILLING_STATISTICS.bill_ref_no field */
    if(!nonNullOnly || (BillRefNo != null))  _BillRefNoSet = flag;
  /** ABI_BILLING_STATISTICS.bill_ref_resets field */
    if(!nonNullOnly || (BillRefResets != null))  _BillRefResetsSet = flag;
  }
}
