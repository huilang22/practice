/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AbiBillMessagesObjectData.java
 * Definition File: Customer/AbiBillMessages.xml
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
  
/** AbiBillMessagesObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class AbiBillMessagesObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public AbiBillMessagesObjectKeyData Key = null;
  /** ABI_BILL_MESSAGES.message_text field */
  public    String MessageText  = null;
  protected boolean _MessageTextSet = false;
  /** ABI_BILL_MESSAGES.language_code field */
  public    BigInteger LanguageCode  = null;
  protected boolean _LanguageCodeSet = false;
  /** ABI_BILL_MESSAGES.account_no field */
  public    BigInteger AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  /** ABI_BILL_MESSAGES.subscr_no field */
  public    BigInteger ServiceInternalId  = null;
  protected boolean _ServiceInternalIdSet = false;
  /** ABI_BILL_MESSAGES.subscr_no_resets field */
  public    BigInteger ServiceInternalIdResets  = null;
  protected boolean _ServiceInternalIdResetsSet = false;
  /** ABI_BILL_MESSAGES.file_id field */
  public    BigInteger FileId  = null;
  protected boolean _FileIdSet = false;
  /** ABI_BILL_MESSAGES.file_id_serv field */
  public    BigInteger FileIdServ  = null;
  protected boolean _FileIdServSet = false;
  /** ABI_BILL_MESSAGES.lob_id field */
  public    BigInteger LobId  = null;
  protected boolean _LobIdSet = false;
  /** ABI_BILL_MESSAGES.transaction_id field */
  public    BigInteger TransactionId  = null;
  protected boolean _TransactionIdSet = false;
  /** ABI_BILL_MESSAGES.external_invoice_id field */
  public    BigInteger ExternalInvoiceId  = null;
  protected boolean _ExternalInvoiceIdSet = false;
  /** ABI_BILL_MESSAGES.invoice_record_seq field */
  public    BigInteger InvoiceRecordSeq  = null;
  protected boolean _InvoiceRecordSeqSet = false;
  /** ABI_BILL_MESSAGES.bill_ref_no field */
  public    BigInteger BillRefNo  = null;
  protected boolean _BillRefNoSet = false;
  /** ABI_BILL_MESSAGES.bill_ref_resets field */
  public    BigInteger BillRefResets  = null;
  protected boolean _BillRefResetsSet = false;
  private String _objName = "AbiBillMessagesObjectData";
  /** Default constructor */
  public AbiBillMessagesObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public AbiBillMessagesObjectData (AbiBillMessagesObjectData other)
  {

    if (other == null) return;
    this.Key = new AbiBillMessagesObjectKeyData (other.Key);
    this.MessageText = other.MessageText;
    this._MessageTextSet = other._MessageTextSet;
    this.LanguageCode = other.LanguageCode;
    this._LanguageCodeSet = other._LanguageCodeSet;
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
    this.ServiceInternalId = other.ServiceInternalId;
    this._ServiceInternalIdSet = other._ServiceInternalIdSet;
    this.ServiceInternalIdResets = other.ServiceInternalIdResets;
    this._ServiceInternalIdResetsSet = other._ServiceInternalIdResetsSet;
    this.FileId = other.FileId;
    this._FileIdSet = other._FileIdSet;
    this.FileIdServ = other.FileIdServ;
    this._FileIdServSet = other._FileIdServSet;
    this.LobId = other.LobId;
    this._LobIdSet = other._LobIdSet;
    this.TransactionId = other.TransactionId;
    this._TransactionIdSet = other._TransactionIdSet;
    this.ExternalInvoiceId = other.ExternalInvoiceId;
    this._ExternalInvoiceIdSet = other._ExternalInvoiceIdSet;
    this.InvoiceRecordSeq = other.InvoiceRecordSeq;
    this._InvoiceRecordSeqSet = other._InvoiceRecordSeqSet;
    this.BillRefNo = other.BillRefNo;
    this._BillRefNoSet = other._BillRefNoSet;
    this.BillRefResets = other.BillRefResets;
    this._BillRefResetsSet = other._BillRefResetsSet;
  }

  /** get the Key for this object
   * @return AbiBillMessagesObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public AbiBillMessagesObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (AbiBillMessagesObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: MessageId (ABI_BILL_MESSAGES.message_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setMessageId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MessageId", "setMessageId");
    }
    if (this.Key == null) this.Key = new AbiBillMessagesObjectKeyData ();
    this.Key.MessageId = value;
    this.Key._MessageIdSet = true;
  }
  /** get the value of the field: MessageId (ABI_BILL_MESSAGES.message_id)
   * @return Integer the value
   */
  public Integer getMessageId () {
    if (this.Key == null) return null;
    return this.Key.MessageId;
  }
  /** Change the field to not being actively set: MessageId (ABI_BILL_MESSAGES.message_id)
   */
  public void unsetMessageId () {
    if (this.Key == null) return;
    this.Key._MessageIdSet = false;
  }
  /** See if the field is actively set: MessageId (ABI_BILL_MESSAGES.message_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetMessageId () {
    if (this.Key == null) return false;
    return this.Key._MessageIdSet;
  }

  /** Retrieves the MessageId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MessageId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MessageId field
   */
   public String getMessageIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMessageIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMessageIdAsFormattedString");
       return fmtMgr.formatNumber(this.getMessageId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MessageId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMessageIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the MessageId field from a formatted string
   *
   * @param _value the MessageId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MessageId field
   */
   public void setMessageIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMessageIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMessageId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MessageId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMessageIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMessageIdFromFormattedString");
   }

  /** set the fields value: MessageText (ABI_BILL_MESSAGES.message_text)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MessageText") 
  public void setMessageText (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MessageText", "setMessageText");
    }
    if (value != null && !DataHelper.validLength (value, 4000))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "MessageText", "setMessageText");
    }
    this.MessageText = value;
    this._MessageTextSet = true;
  }

  /** Retrieves the MessageText field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MessageText field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MessageText field
   */
   public String getMessageTextAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMessageTextAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMessageTextAsFormattedString");
       return fmtMgr.formatString(this.getMessageText());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MessageText");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMessageTextAsFormattedString");
       throw x;
     }
   }
  /** Sets the MessageText field from a formatted string
   *
   * @param _value the MessageText field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MessageText field
   */
   public void setMessageTextFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMessageTextFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMessageText(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MessageText");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMessageTextFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMessageTextFromFormattedString");
   }

  /** get the value of the field: MessageText (ABI_BILL_MESSAGES.message_text)
   * @return String the value
   */
  public String getMessageText () {
    return this.MessageText;
  }
  /** Change the field to not being actively set: MessageText (ABI_BILL_MESSAGES.message_text)
   */
  public void unsetMessageText () {
    this._MessageTextSet = false;
  }
  /** See if the field is actively set: MessageText (ABI_BILL_MESSAGES.message_text)
   * @return boolean whether the field is actively set
   */
  public boolean issetMessageText () {
    return this._MessageTextSet;
  }
  /** set the fields value: LanguageCode (ABI_BILL_MESSAGES.language_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("LanguageCode") 
  public void setLanguageCode (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LanguageCode", "setLanguageCode");
    }
    if (value != null && !DataHelper.validLength (value, 6))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "LanguageCode", "setLanguageCode");
    }
    this.LanguageCode = value;
    this._LanguageCodeSet = true;
  }

  /** Retrieves the LanguageCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LanguageCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LanguageCode field
   */
   public String getLanguageCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeAsFormattedString");
       return fmtMgr.formatBigInteger(this.getLanguageCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LanguageCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the LanguageCode field from a formatted string
   *
   * @param _value the LanguageCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LanguageCode field
   */
   public void setLanguageCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLanguageCode(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LanguageCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLanguageCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLanguageCodeFromFormattedString");
   }

  /** get the value of the field: LanguageCode (ABI_BILL_MESSAGES.language_code)
   * @return BigInteger the value
   */
  public BigInteger getLanguageCode () {
    return this.LanguageCode;
  }
  /** Change the field to not being actively set: LanguageCode (ABI_BILL_MESSAGES.language_code)
   */
  public void unsetLanguageCode () {
    this._LanguageCodeSet = false;
  }
  /** See if the field is actively set: LanguageCode (ABI_BILL_MESSAGES.language_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetLanguageCode () {
    return this._LanguageCodeSet;
  }
  /** set the fields value: AccountInternalId (ABI_BILL_MESSAGES.account_no)
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

  /** get the value of the field: AccountInternalId (ABI_BILL_MESSAGES.account_no)
   * @return BigInteger the value
   */
  public BigInteger getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (ABI_BILL_MESSAGES.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (ABI_BILL_MESSAGES.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  /** set the fields value: ServiceInternalId (ABI_BILL_MESSAGES.subscr_no)
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

  /** get the value of the field: ServiceInternalId (ABI_BILL_MESSAGES.subscr_no)
   * @return BigInteger the value
   */
  public BigInteger getServiceInternalId () {
    return this.ServiceInternalId;
  }
  /** Change the field to not being actively set: ServiceInternalId (ABI_BILL_MESSAGES.subscr_no)
   */
  public void unsetServiceInternalId () {
    this._ServiceInternalIdSet = false;
  }
  /** See if the field is actively set: ServiceInternalId (ABI_BILL_MESSAGES.subscr_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceInternalId () {
    return this._ServiceInternalIdSet;
  }
  /** set the fields value: ServiceInternalIdResets (ABI_BILL_MESSAGES.subscr_no_resets)
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

  /** get the value of the field: ServiceInternalIdResets (ABI_BILL_MESSAGES.subscr_no_resets)
   * @return BigInteger the value
   */
  public BigInteger getServiceInternalIdResets () {
    return this.ServiceInternalIdResets;
  }
  /** Change the field to not being actively set: ServiceInternalIdResets (ABI_BILL_MESSAGES.subscr_no_resets)
   */
  public void unsetServiceInternalIdResets () {
    this._ServiceInternalIdResetsSet = false;
  }
  /** See if the field is actively set: ServiceInternalIdResets (ABI_BILL_MESSAGES.subscr_no_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceInternalIdResets () {
    return this._ServiceInternalIdResetsSet;
  }
  /** set the fields value: FileId (ABI_BILL_MESSAGES.file_id)
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

  /** get the value of the field: FileId (ABI_BILL_MESSAGES.file_id)
   * @return BigInteger the value
   */
  public BigInteger getFileId () {
    return this.FileId;
  }
  /** Change the field to not being actively set: FileId (ABI_BILL_MESSAGES.file_id)
   */
  public void unsetFileId () {
    this._FileIdSet = false;
  }
  /** See if the field is actively set: FileId (ABI_BILL_MESSAGES.file_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetFileId () {
    return this._FileIdSet;
  }
  /** set the fields value: FileIdServ (ABI_BILL_MESSAGES.file_id_serv)
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

  /** get the value of the field: FileIdServ (ABI_BILL_MESSAGES.file_id_serv)
   * @return BigInteger the value
   */
  public BigInteger getFileIdServ () {
    return this.FileIdServ;
  }
  /** Change the field to not being actively set: FileIdServ (ABI_BILL_MESSAGES.file_id_serv)
   */
  public void unsetFileIdServ () {
    this._FileIdServSet = false;
  }
  /** See if the field is actively set: FileIdServ (ABI_BILL_MESSAGES.file_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetFileIdServ () {
    return this._FileIdServSet;
  }
  /** set the fields value: LobId (ABI_BILL_MESSAGES.lob_id)
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

  /** get the value of the field: LobId (ABI_BILL_MESSAGES.lob_id)
   * @return BigInteger the value
   */
  public BigInteger getLobId () {
    return this.LobId;
  }
  /** Change the field to not being actively set: LobId (ABI_BILL_MESSAGES.lob_id)
   */
  public void unsetLobId () {
    this._LobIdSet = false;
  }
  /** See if the field is actively set: LobId (ABI_BILL_MESSAGES.lob_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetLobId () {
    return this._LobIdSet;
  }
  /** set the fields value: TransactionId (ABI_BILL_MESSAGES.transaction_id)
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

  /** get the value of the field: TransactionId (ABI_BILL_MESSAGES.transaction_id)
   * @return BigInteger the value
   */
  public BigInteger getTransactionId () {
    return this.TransactionId;
  }
  /** Change the field to not being actively set: TransactionId (ABI_BILL_MESSAGES.transaction_id)
   */
  public void unsetTransactionId () {
    this._TransactionIdSet = false;
  }
  /** See if the field is actively set: TransactionId (ABI_BILL_MESSAGES.transaction_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransactionId () {
    return this._TransactionIdSet;
  }
  /** set the fields value: ExternalInvoiceId (ABI_BILL_MESSAGES.external_invoice_id)
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

  /** get the value of the field: ExternalInvoiceId (ABI_BILL_MESSAGES.external_invoice_id)
   * @return BigInteger the value
   */
  public BigInteger getExternalInvoiceId () {
    return this.ExternalInvoiceId;
  }
  /** Change the field to not being actively set: ExternalInvoiceId (ABI_BILL_MESSAGES.external_invoice_id)
   */
  public void unsetExternalInvoiceId () {
    this._ExternalInvoiceIdSet = false;
  }
  /** See if the field is actively set: ExternalInvoiceId (ABI_BILL_MESSAGES.external_invoice_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetExternalInvoiceId () {
    return this._ExternalInvoiceIdSet;
  }
  /** set the fields value: InvoiceRecordSeq (ABI_BILL_MESSAGES.invoice_record_seq)
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

  /** get the value of the field: InvoiceRecordSeq (ABI_BILL_MESSAGES.invoice_record_seq)
   * @return BigInteger the value
   */
  public BigInteger getInvoiceRecordSeq () {
    return this.InvoiceRecordSeq;
  }
  /** Change the field to not being actively set: InvoiceRecordSeq (ABI_BILL_MESSAGES.invoice_record_seq)
   */
  public void unsetInvoiceRecordSeq () {
    this._InvoiceRecordSeqSet = false;
  }
  /** See if the field is actively set: InvoiceRecordSeq (ABI_BILL_MESSAGES.invoice_record_seq)
   * @return boolean whether the field is actively set
   */
  public boolean issetInvoiceRecordSeq () {
    return this._InvoiceRecordSeqSet;
  }
  /** set the fields value: BillRefNo (ABI_BILL_MESSAGES.bill_ref_no)
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

  /** get the value of the field: BillRefNo (ABI_BILL_MESSAGES.bill_ref_no)
   * @return BigInteger the value
   */
  public BigInteger getBillRefNo () {
    return this.BillRefNo;
  }
  /** Change the field to not being actively set: BillRefNo (ABI_BILL_MESSAGES.bill_ref_no)
   */
  public void unsetBillRefNo () {
    this._BillRefNoSet = false;
  }
  /** See if the field is actively set: BillRefNo (ABI_BILL_MESSAGES.bill_ref_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefNo () {
    return this._BillRefNoSet;
  }
  /** set the fields value: BillRefResets (ABI_BILL_MESSAGES.bill_ref_resets)
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

  /** get the value of the field: BillRefResets (ABI_BILL_MESSAGES.bill_ref_resets)
   * @return BigInteger the value
   */
  public BigInteger getBillRefResets () {
    return this.BillRefResets;
  }
  /** Change the field to not being actively set: BillRefResets (ABI_BILL_MESSAGES.bill_ref_resets)
   */
  public void unsetBillRefResets () {
    this._BillRefResetsSet = false;
  }
  /** See if the field is actively set: BillRefResets (ABI_BILL_MESSAGES.bill_ref_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefResets () {
    return this._BillRefResetsSet;
  }
  public String toString() {
    return AbiBillMessagesObjectHelper.toMap(this, null).toString();
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
  /** ABI_BILL_MESSAGES.message_text field */
    if(!nonNullOnly || (MessageText != null))  _MessageTextSet = flag;
  /** ABI_BILL_MESSAGES.language_code field */
    if(!nonNullOnly || (LanguageCode != null))  _LanguageCodeSet = flag;
  /** ABI_BILL_MESSAGES.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  /** ABI_BILL_MESSAGES.subscr_no field */
    if(!nonNullOnly || (ServiceInternalId != null))  _ServiceInternalIdSet = flag;
  /** ABI_BILL_MESSAGES.subscr_no_resets field */
    if(!nonNullOnly || (ServiceInternalIdResets != null))  _ServiceInternalIdResetsSet = flag;
  /** ABI_BILL_MESSAGES.file_id field */
    if(!nonNullOnly || (FileId != null))  _FileIdSet = flag;
  /** ABI_BILL_MESSAGES.file_id_serv field */
    if(!nonNullOnly || (FileIdServ != null))  _FileIdServSet = flag;
  /** ABI_BILL_MESSAGES.lob_id field */
    if(!nonNullOnly || (LobId != null))  _LobIdSet = flag;
  /** ABI_BILL_MESSAGES.transaction_id field */
    if(!nonNullOnly || (TransactionId != null))  _TransactionIdSet = flag;
  /** ABI_BILL_MESSAGES.external_invoice_id field */
    if(!nonNullOnly || (ExternalInvoiceId != null))  _ExternalInvoiceIdSet = flag;
  /** ABI_BILL_MESSAGES.invoice_record_seq field */
    if(!nonNullOnly || (InvoiceRecordSeq != null))  _InvoiceRecordSeqSet = flag;
  /** ABI_BILL_MESSAGES.bill_ref_no field */
    if(!nonNullOnly || (BillRefNo != null))  _BillRefNoSet = flag;
  /** ABI_BILL_MESSAGES.bill_ref_resets field */
    if(!nonNullOnly || (BillRefResets != null))  _BillRefResetsSet = flag;
  }
}
