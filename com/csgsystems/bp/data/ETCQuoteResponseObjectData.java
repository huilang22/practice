/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ETCQuoteResponseObjectData.java
 * Definition File: Customer/EarlyTerminationCharge.xml
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
  
/** ETCQuoteResponseObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class ETCQuoteResponseObjectData extends ETCQuoteRequestObjectData  implements Serializable
{

  /** AccountExternalId field */
  public    String AccountExternalId  = null;
  protected boolean _AccountExternalIdSet = false;
  /** AccountExternalIdType field */
  public    Integer AccountExternalIdType  = null;
  protected boolean _AccountExternalIdTypeSet = false;
  /** ServiceExternalId field */
  public    String ServiceExternalId  = null;
  protected boolean _ServiceExternalIdSet = false;
  /** ServiceExternalIdType field */
  public    Integer ServiceExternalIdType  = null;
  protected boolean _ServiceExternalIdTypeSet = false;
  /** EtcQuoteAmount field */
  public    BigInteger EtcQuoteAmount  = null;
  protected boolean _EtcQuoteAmountSet = false;
  /** ETCNRCDesc field */
  public    String ETCNRCDesc  = null;
  protected boolean _ETCNRCDescSet = false;
  /** ETCCtrDesc field */
  public    String ETCCtrDesc  = null;
  protected boolean _ETCCtrDescSet = false;
  /** ETCRCDesc field */
  public    String ETCRCDesc  = null;
  protected boolean _ETCRCDescSet = false;
  /** InstallmentAmtQuote field */
  public    BigInteger InstallmentAmtQuote  = null;
  protected boolean _InstallmentAmtQuoteSet = false;
  /** InstallmentNum field */
  public    Integer InstallmentNum  = null;
  protected boolean _InstallmentNumSet = false;
  /** ContractLevel field */
  public    Integer ContractLevel  = null;
  protected boolean _ContractLevelSet = false;
  /** CurrencyCode field */
  public    Integer CurrencyCode  = null;
  protected boolean _CurrencyCodeSet = false;
  /** ContractEndDate field */
  public    Date ContractEndDate  = null;
  protected boolean _ContractEndDateSet = false;
  private String _objName = "ETCQuoteResponseObjectData";
  /** Default constructor */
  public ETCQuoteResponseObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public ETCQuoteResponseObjectData (ETCQuoteResponseObjectData other)
  {

    super (other);

    if (other == null) return;
    this.AccountExternalId = other.AccountExternalId;
    this._AccountExternalIdSet = other._AccountExternalIdSet;
    this.AccountExternalIdType = other.AccountExternalIdType;
    this._AccountExternalIdTypeSet = other._AccountExternalIdTypeSet;
    this.ServiceExternalId = other.ServiceExternalId;
    this._ServiceExternalIdSet = other._ServiceExternalIdSet;
    this.ServiceExternalIdType = other.ServiceExternalIdType;
    this._ServiceExternalIdTypeSet = other._ServiceExternalIdTypeSet;
    this.EtcQuoteAmount = other.EtcQuoteAmount;
    this._EtcQuoteAmountSet = other._EtcQuoteAmountSet;
    this.ETCNRCDesc = other.ETCNRCDesc;
    this._ETCNRCDescSet = other._ETCNRCDescSet;
    this.ETCCtrDesc = other.ETCCtrDesc;
    this._ETCCtrDescSet = other._ETCCtrDescSet;
    this.ETCRCDesc = other.ETCRCDesc;
    this._ETCRCDescSet = other._ETCRCDescSet;
    this.InstallmentAmtQuote = other.InstallmentAmtQuote;
    this._InstallmentAmtQuoteSet = other._InstallmentAmtQuoteSet;
    this.InstallmentNum = other.InstallmentNum;
    this._InstallmentNumSet = other._InstallmentNumSet;
    this.ContractLevel = other.ContractLevel;
    this._ContractLevelSet = other._ContractLevelSet;
    this.CurrencyCode = other.CurrencyCode;
    this._CurrencyCodeSet = other._CurrencyCodeSet;
    this.ContractEndDate = other.ContractEndDate;
    this._ContractEndDateSet = other._ContractEndDateSet;
  }

  /** Constructor to copy base class fields. 
   * @param other the object to copy
   */
  public ETCQuoteResponseObjectData (ETCQuoteRequestObjectData other)
  {
    super (other);

  }

  /** set the fields value: AccountExternalId
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAccountExternalId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountExternalId", "setAccountExternalId");
    }
    this.AccountExternalId = value;
    this._AccountExternalIdSet = true;
  }
  /** get the value of the field: AccountExternalId
   * @return String the value
   */
  public String getAccountExternalId ()
  {
    return this.AccountExternalId;
  }
  /** Change the field to not being actively set: AccountExternalId
   */
  public void unsetAccountExternalId ()
  {
    this._AccountExternalIdSet = false;
  }
  /** See if the field is actively set: AccountExternalId
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountExternalId ()
  {
    return this._AccountExternalIdSet;
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

  /** set the fields value: AccountExternalIdType
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAccountExternalIdType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountExternalIdType", "setAccountExternalIdType");
    }
    this.AccountExternalIdType = value;
    this._AccountExternalIdTypeSet = true;
  }
  /** get the value of the field: AccountExternalIdType
   * @return Integer the value
   */
  public Integer getAccountExternalIdType ()
  {
    return this.AccountExternalIdType;
  }
  /** Change the field to not being actively set: AccountExternalIdType
   */
  public void unsetAccountExternalIdType ()
  {
    this._AccountExternalIdTypeSet = false;
  }
  /** See if the field is actively set: AccountExternalIdType
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountExternalIdType ()
  {
    return this._AccountExternalIdTypeSet;
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

  /** set the fields value: ServiceExternalId
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setServiceExternalId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServiceExternalId", "setServiceExternalId");
    }
    this.ServiceExternalId = value;
    this._ServiceExternalIdSet = true;
  }
  /** get the value of the field: ServiceExternalId
   * @return String the value
   */
  public String getServiceExternalId ()
  {
    return this.ServiceExternalId;
  }
  /** Change the field to not being actively set: ServiceExternalId
   */
  public void unsetServiceExternalId ()
  {
    this._ServiceExternalIdSet = false;
  }
  /** See if the field is actively set: ServiceExternalId
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceExternalId ()
  {
    return this._ServiceExternalIdSet;
  }

  /** Retrieves the ServiceExternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceExternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceExternalId field
   */
   public String getServiceExternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceExternalIdAsFormattedString");
       return fmtMgr.formatString(this.getServiceExternalId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceExternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceExternalId field from a formatted string
   *
   * @param _value the ServiceExternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceExternalId field
   */
   public void setServiceExternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceExternalId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceExternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceExternalIdFromFormattedString");
   }

  /** set the fields value: ServiceExternalIdType
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setServiceExternalIdType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServiceExternalIdType", "setServiceExternalIdType");
    }
    this.ServiceExternalIdType = value;
    this._ServiceExternalIdTypeSet = true;
  }
  /** get the value of the field: ServiceExternalIdType
   * @return Integer the value
   */
  public Integer getServiceExternalIdType ()
  {
    return this.ServiceExternalIdType;
  }
  /** Change the field to not being actively set: ServiceExternalIdType
   */
  public void unsetServiceExternalIdType ()
  {
    this._ServiceExternalIdTypeSet = false;
  }
  /** See if the field is actively set: ServiceExternalIdType
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceExternalIdType ()
  {
    return this._ServiceExternalIdTypeSet;
  }

  /** Retrieves the ServiceExternalIdType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceExternalIdType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceExternalIdType field
   */
   public String getServiceExternalIdTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceExternalIdTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getServiceExternalIdType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceExternalIdTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceExternalIdType field from a formatted string
   *
   * @param _value the ServiceExternalIdType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceExternalIdType field
   */
   public void setServiceExternalIdTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceExternalIdType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceExternalIdTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceExternalIdTypeFromFormattedString");
   }

  /** set the fields value: EtcQuoteAmount
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setEtcQuoteAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "EtcQuoteAmount", "setEtcQuoteAmount");
    }
    this.EtcQuoteAmount = value;
    this._EtcQuoteAmountSet = true;
  }
  /** get the value of the field: EtcQuoteAmount
   * @return BigInteger the value
   */
  public BigInteger getEtcQuoteAmount ()
  {
    return this.EtcQuoteAmount;
  }
  /** Change the field to not being actively set: EtcQuoteAmount
   */
  public void unsetEtcQuoteAmount ()
  {
    this._EtcQuoteAmountSet = false;
  }
  /** See if the field is actively set: EtcQuoteAmount
   * @return boolean whether the field is actively set
   */
  public boolean issetEtcQuoteAmount ()
  {
    return this._EtcQuoteAmountSet;
  }

  /** Retrieves the EtcQuoteAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EtcQuoteAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EtcQuoteAmount field
   */
   public String getEtcQuoteAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEtcQuoteAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEtcQuoteAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getEtcQuoteAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EtcQuoteAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEtcQuoteAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the EtcQuoteAmount field from a formatted string
   *
   * @param _value the EtcQuoteAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EtcQuoteAmount field
   */
   public void setEtcQuoteAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEtcQuoteAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEtcQuoteAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EtcQuoteAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEtcQuoteAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEtcQuoteAmountFromFormattedString");
   }

  /** set the fields value: ETCNRCDesc
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setETCNRCDesc (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ETCNRCDesc", "setETCNRCDesc");
    }
    this.ETCNRCDesc = value;
    this._ETCNRCDescSet = true;
  }
  /** get the value of the field: ETCNRCDesc
   * @return String the value
   */
  public String getETCNRCDesc ()
  {
    return this.ETCNRCDesc;
  }
  /** Change the field to not being actively set: ETCNRCDesc
   */
  public void unsetETCNRCDesc ()
  {
    this._ETCNRCDescSet = false;
  }
  /** See if the field is actively set: ETCNRCDesc
   * @return boolean whether the field is actively set
   */
  public boolean issetETCNRCDesc ()
  {
    return this._ETCNRCDescSet;
  }

  /** Retrieves the ETCNRCDesc field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ETCNRCDesc field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ETCNRCDesc field
   */
   public String getETCNRCDescAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getETCNRCDescAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getETCNRCDescAsFormattedString");
       return fmtMgr.formatString(this.getETCNRCDesc());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ETCNRCDesc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getETCNRCDescAsFormattedString");
       throw x;
     }
   }
  /** Sets the ETCNRCDesc field from a formatted string
   *
   * @param _value the ETCNRCDesc field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ETCNRCDesc field
   */
   public void setETCNRCDescFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getETCNRCDescFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setETCNRCDesc(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ETCNRCDesc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setETCNRCDescFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setETCNRCDescFromFormattedString");
   }

  /** set the fields value: ETCCtrDesc
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setETCCtrDesc (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ETCCtrDesc", "setETCCtrDesc");
    }
    this.ETCCtrDesc = value;
    this._ETCCtrDescSet = true;
  }
  /** get the value of the field: ETCCtrDesc
   * @return String the value
   */
  public String getETCCtrDesc ()
  {
    return this.ETCCtrDesc;
  }
  /** Change the field to not being actively set: ETCCtrDesc
   */
  public void unsetETCCtrDesc ()
  {
    this._ETCCtrDescSet = false;
  }
  /** See if the field is actively set: ETCCtrDesc
   * @return boolean whether the field is actively set
   */
  public boolean issetETCCtrDesc ()
  {
    return this._ETCCtrDescSet;
  }

  /** Retrieves the ETCCtrDesc field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ETCCtrDesc field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ETCCtrDesc field
   */
   public String getETCCtrDescAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getETCCtrDescAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getETCCtrDescAsFormattedString");
       return fmtMgr.formatString(this.getETCCtrDesc());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ETCCtrDesc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getETCCtrDescAsFormattedString");
       throw x;
     }
   }
  /** Sets the ETCCtrDesc field from a formatted string
   *
   * @param _value the ETCCtrDesc field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ETCCtrDesc field
   */
   public void setETCCtrDescFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getETCCtrDescFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setETCCtrDesc(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ETCCtrDesc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setETCCtrDescFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setETCCtrDescFromFormattedString");
   }

  /** set the fields value: ETCRCDesc
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setETCRCDesc (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ETCRCDesc", "setETCRCDesc");
    }
    this.ETCRCDesc = value;
    this._ETCRCDescSet = true;
  }
  /** get the value of the field: ETCRCDesc
   * @return String the value
   */
  public String getETCRCDesc ()
  {
    return this.ETCRCDesc;
  }
  /** Change the field to not being actively set: ETCRCDesc
   */
  public void unsetETCRCDesc ()
  {
    this._ETCRCDescSet = false;
  }
  /** See if the field is actively set: ETCRCDesc
   * @return boolean whether the field is actively set
   */
  public boolean issetETCRCDesc ()
  {
    return this._ETCRCDescSet;
  }

  /** Retrieves the ETCRCDesc field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ETCRCDesc field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ETCRCDesc field
   */
   public String getETCRCDescAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getETCRCDescAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getETCRCDescAsFormattedString");
       return fmtMgr.formatString(this.getETCRCDesc());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ETCRCDesc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getETCRCDescAsFormattedString");
       throw x;
     }
   }
  /** Sets the ETCRCDesc field from a formatted string
   *
   * @param _value the ETCRCDesc field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ETCRCDesc field
   */
   public void setETCRCDescFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getETCRCDescFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setETCRCDesc(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ETCRCDesc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setETCRCDescFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setETCRCDescFromFormattedString");
   }

  /** set the fields value: InstallmentAmtQuote
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setInstallmentAmtQuote (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InstallmentAmtQuote", "setInstallmentAmtQuote");
    }
    this.InstallmentAmtQuote = value;
    this._InstallmentAmtQuoteSet = true;
  }
  /** get the value of the field: InstallmentAmtQuote
   * @return BigInteger the value
   */
  public BigInteger getInstallmentAmtQuote ()
  {
    return this.InstallmentAmtQuote;
  }
  /** Change the field to not being actively set: InstallmentAmtQuote
   */
  public void unsetInstallmentAmtQuote ()
  {
    this._InstallmentAmtQuoteSet = false;
  }
  /** See if the field is actively set: InstallmentAmtQuote
   * @return boolean whether the field is actively set
   */
  public boolean issetInstallmentAmtQuote ()
  {
    return this._InstallmentAmtQuoteSet;
  }

  /** Retrieves the InstallmentAmtQuote field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InstallmentAmtQuote field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InstallmentAmtQuote field
   */
   public String getInstallmentAmtQuoteAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInstallmentAmtQuoteAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInstallmentAmtQuoteAsFormattedString");
       return fmtMgr.formatBigInteger(this.getInstallmentAmtQuote(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InstallmentAmtQuote");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInstallmentAmtQuoteAsFormattedString");
       throw x;
     }
   }
  /** Sets the InstallmentAmtQuote field from a formatted string
   *
   * @param _value the InstallmentAmtQuote field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InstallmentAmtQuote field
   */
   public void setInstallmentAmtQuoteFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInstallmentAmtQuoteFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInstallmentAmtQuote(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InstallmentAmtQuote");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInstallmentAmtQuoteFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInstallmentAmtQuoteFromFormattedString");
   }

  /** set the fields value: InstallmentNum
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setInstallmentNum (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InstallmentNum", "setInstallmentNum");
    }
    this.InstallmentNum = value;
    this._InstallmentNumSet = true;
  }
  /** get the value of the field: InstallmentNum
   * @return Integer the value
   */
  public Integer getInstallmentNum ()
  {
    return this.InstallmentNum;
  }
  /** Change the field to not being actively set: InstallmentNum
   */
  public void unsetInstallmentNum ()
  {
    this._InstallmentNumSet = false;
  }
  /** See if the field is actively set: InstallmentNum
   * @return boolean whether the field is actively set
   */
  public boolean issetInstallmentNum ()
  {
    return this._InstallmentNumSet;
  }

  /** Retrieves the InstallmentNum field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InstallmentNum field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InstallmentNum field
   */
   public String getInstallmentNumAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInstallmentNumAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInstallmentNumAsFormattedString");
       return fmtMgr.formatNumber(this.getInstallmentNum(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InstallmentNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInstallmentNumAsFormattedString");
       throw x;
     }
   }
  /** Sets the InstallmentNum field from a formatted string
   *
   * @param _value the InstallmentNum field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InstallmentNum field
   */
   public void setInstallmentNumFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInstallmentNumFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInstallmentNum(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InstallmentNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInstallmentNumFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInstallmentNumFromFormattedString");
   }

  /** set the fields value: ContractLevel
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setContractLevel (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ContractLevel", "setContractLevel");
    }
    this.ContractLevel = value;
    this._ContractLevelSet = true;
  }
  /** get the value of the field: ContractLevel
   * @return Integer the value
   */
  public Integer getContractLevel ()
  {
    return this.ContractLevel;
  }
  /** Change the field to not being actively set: ContractLevel
   */
  public void unsetContractLevel ()
  {
    this._ContractLevelSet = false;
  }
  /** See if the field is actively set: ContractLevel
   * @return boolean whether the field is actively set
   */
  public boolean issetContractLevel ()
  {
    return this._ContractLevelSet;
  }

  /** Retrieves the ContractLevel field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ContractLevel field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContractLevel field
   */
   public String getContractLevelAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractLevelAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractLevelAsFormattedString");
       return fmtMgr.formatNumber(this.getContractLevel(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContractLevel");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractLevelAsFormattedString");
       throw x;
     }
   }
  /** Sets the ContractLevel field from a formatted string
   *
   * @param _value the ContractLevel field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ContractLevel field
   */
   public void setContractLevelFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractLevelFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setContractLevel(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContractLevel");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractLevelFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContractLevelFromFormattedString");
   }

  /** set the fields value: CurrencyCode
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCurrencyCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CurrencyCode", "setCurrencyCode");
    }
    this.CurrencyCode = value;
    this._CurrencyCodeSet = true;
  }
  /** get the value of the field: CurrencyCode
   * @return Integer the value
   */
  public Integer getCurrencyCode ()
  {
    return this.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode
   */
  public void unsetCurrencyCode ()
  {
    this._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode ()
  {
    return this._CurrencyCodeSet;
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

  /** set the fields value: ContractEndDate
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setContractEndDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ContractEndDate", "setContractEndDate");
    }
    this.ContractEndDate = value;
    this._ContractEndDateSet = true;
  }
  /** get the value of the field: ContractEndDate
   * @return Date the value
   */
  public Date getContractEndDate ()
  {
    return this.ContractEndDate;
  }
  /** Change the field to not being actively set: ContractEndDate
   */
  public void unsetContractEndDate ()
  {
    this._ContractEndDateSet = false;
  }
  /** See if the field is actively set: ContractEndDate
   * @return boolean whether the field is actively set
   */
  public boolean issetContractEndDate ()
  {
    return this._ContractEndDateSet;
  }

  /** Retrieves the ContractEndDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ContractEndDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContractEndDate field
   */
   public String getContractEndDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractEndDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractEndDateAsFormattedString");
       return fmtMgr.formatDate(this.getContractEndDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContractEndDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractEndDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ContractEndDate field from a formatted string
   *
   * @param _value the ContractEndDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ContractEndDate field
   */
   public void setContractEndDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractEndDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setContractEndDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContractEndDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractEndDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContractEndDateFromFormattedString");
   }

  /**
   * Retrieves the ContractEndDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ContractEndDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContractEndDate field
   */
  public String getContractEndDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractEndDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractEndDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getContractEndDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractEndDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractEndDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ContractEndDate field value from a formatted date/time string
   *
   * @param _value the ContractEndDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ContractEndDate field
   */
  public void setContractEndDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContractEndDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setContractEndDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractEndDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractEndDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  public String toString() {
    return ETCQuoteResponseObjectHelper.toMap(this, null).toString();
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
    
      super.resetFlags(flag, true);
    
      resetFlags(flag, true);
  }
  /*
   * This method sets the *Set flags to the specified value
   * @param flag value to set for flags
   * @param nonNullOnly set only those flags where the value is not null. 
   */
  public void resetFlags(boolean flag, boolean nonNullOnly) {
    
  /** AccountExternalId field */
    if (!nonNullOnly || (AccountExternalId != null)) _AccountExternalIdSet = flag;
  /** AccountExternalIdType field */
    if (!nonNullOnly || (AccountExternalIdType != null)) _AccountExternalIdTypeSet = flag;
  /** ServiceExternalId field */
    if (!nonNullOnly || (ServiceExternalId != null)) _ServiceExternalIdSet = flag;
  /** ServiceExternalIdType field */
    if (!nonNullOnly || (ServiceExternalIdType != null)) _ServiceExternalIdTypeSet = flag;
  /** EtcQuoteAmount field */
    if (!nonNullOnly || (EtcQuoteAmount != null)) _EtcQuoteAmountSet = flag;
  /** ETCNRCDesc field */
    if (!nonNullOnly || (ETCNRCDesc != null)) _ETCNRCDescSet = flag;
  /** ETCCtrDesc field */
    if (!nonNullOnly || (ETCCtrDesc != null)) _ETCCtrDescSet = flag;
  /** ETCRCDesc field */
    if (!nonNullOnly || (ETCRCDesc != null)) _ETCRCDescSet = flag;
  /** InstallmentAmtQuote field */
    if (!nonNullOnly || (InstallmentAmtQuote != null)) _InstallmentAmtQuoteSet = flag;
  /** InstallmentNum field */
    if (!nonNullOnly || (InstallmentNum != null)) _InstallmentNumSet = flag;
  /** ContractLevel field */
    if (!nonNullOnly || (ContractLevel != null)) _ContractLevelSet = flag;
  /** CurrencyCode field */
    if (!nonNullOnly || (CurrencyCode != null)) _CurrencyCodeSet = flag;
  /** ContractEndDate field */
    if (!nonNullOnly || (ContractEndDate != null)) _ContractEndDateSet = flag;
      super.resetFlags(flag, nonNullOnly);
    
  }
}
