/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountQuoteObjectData.java
 * Definition File: Customer/OrderQuote.xml
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
  
/** AccountQuoteObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class AccountQuoteObjectData extends BaseObjectData implements Serializable
{

  /** AcAccountNo field */
  public    Integer AcAccountNo  = null;
  protected boolean _AcAccountNoSet = false;
  /** AcServiceOrderId field */
  public    BigInteger AcServiceOrderId  = null;
  protected boolean _AcServiceOrderIdSet = false;
  /** AcAmount field */
  public    BigInteger AcAmount  = null;
  protected boolean _AcAmountSet = false;
  /** AcDiscount field */
  public    BigInteger AcDiscount  = null;
  protected boolean _AcDiscountSet = false;
  /** AcFederalTax field */
  public    BigInteger AcFederalTax  = null;
  protected boolean _AcFederalTaxSet = false;
  /** AcStateTax field */
  public    BigInteger AcStateTax  = null;
  protected boolean _AcStateTaxSet = false;
  /** AcCountyTax field */
  public    BigInteger AcCountyTax  = null;
  protected boolean _AcCountyTaxSet = false;
  /** AcCityTax field */
  public    BigInteger AcCityTax  = null;
  protected boolean _AcCityTaxSet = false;
  /** AcOtherTax field */
  public    BigInteger AcOtherTax  = null;
  protected boolean _AcOtherTaxSet = false;
  /** ac_charge_element object */
  public ChargeElementObjectData[] ac_charge_element = null;

  /** ac_service_instance_quote object */
  public ServiceInstanceQuoteObjectData[] ac_service_instance_quote = null;

  /** ac_contract_quote object */
  public ContractQuoteObjectData[] ac_contract_quote = null;

  /** ac_package_quote object */
  public PackageQuoteObjectData[] ac_package_quote = null;

  private String _objName = "AccountQuoteObjectData";
  /** Default constructor */
  public AccountQuoteObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public AccountQuoteObjectData (AccountQuoteObjectData other)
  {

    if (other == null) return;
    this.AcAccountNo = other.AcAccountNo;
    this._AcAccountNoSet = other._AcAccountNoSet;
    this.AcServiceOrderId = other.AcServiceOrderId;
    this._AcServiceOrderIdSet = other._AcServiceOrderIdSet;
    this.AcAmount = other.AcAmount;
    this._AcAmountSet = other._AcAmountSet;
    this.AcDiscount = other.AcDiscount;
    this._AcDiscountSet = other._AcDiscountSet;
    this.AcFederalTax = other.AcFederalTax;
    this._AcFederalTaxSet = other._AcFederalTaxSet;
    this.AcStateTax = other.AcStateTax;
    this._AcStateTaxSet = other._AcStateTaxSet;
    this.AcCountyTax = other.AcCountyTax;
    this._AcCountyTaxSet = other._AcCountyTaxSet;
    this.AcCityTax = other.AcCityTax;
    this._AcCityTaxSet = other._AcCityTaxSet;
    this.AcOtherTax = other.AcOtherTax;
    this._AcOtherTaxSet = other._AcOtherTaxSet;
    if (other.ac_charge_element != null)
    {
      this.ac_charge_element = new ChargeElementObjectData[other.ac_charge_element.length];
      for (int i = 0; other.ac_charge_element != null && i < other.ac_charge_element.length; i++)
      {
        if (other.ac_charge_element[i] != null)  this.ac_charge_element[i] = new ChargeElementObjectData (other.ac_charge_element[i]);
      }
    }

    if (other.ac_service_instance_quote != null)
    {
      this.ac_service_instance_quote = new ServiceInstanceQuoteObjectData[other.ac_service_instance_quote.length];
      for (int i = 0; other.ac_service_instance_quote != null && i < other.ac_service_instance_quote.length; i++)
      {
        if (other.ac_service_instance_quote[i] != null)  this.ac_service_instance_quote[i] = new ServiceInstanceQuoteObjectData (other.ac_service_instance_quote[i]);
      }
    }

    if (other.ac_contract_quote != null)
    {
      this.ac_contract_quote = new ContractQuoteObjectData[other.ac_contract_quote.length];
      for (int i = 0; other.ac_contract_quote != null && i < other.ac_contract_quote.length; i++)
      {
        if (other.ac_contract_quote[i] != null)  this.ac_contract_quote[i] = new ContractQuoteObjectData (other.ac_contract_quote[i]);
      }
    }

    if (other.ac_package_quote != null)
    {
      this.ac_package_quote = new PackageQuoteObjectData[other.ac_package_quote.length];
      for (int i = 0; other.ac_package_quote != null && i < other.ac_package_quote.length; i++)
      {
        if (other.ac_package_quote[i] != null)  this.ac_package_quote[i] = new PackageQuoteObjectData (other.ac_package_quote[i]);
      }
    }

  }

  /** set the fields value: AcAccountNo
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAcAccountNo (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AcAccountNo", "setAcAccountNo");
    }
    this.AcAccountNo = value;
    this._AcAccountNoSet = true;
  }
  /** get the value of the field: AcAccountNo
   * @return Integer the value
   */
  public Integer getAcAccountNo ()
  {
    return this.AcAccountNo;
  }
  /** Change the field to not being actively set: AcAccountNo
   */
  public void unsetAcAccountNo ()
  {
    this._AcAccountNoSet = false;
  }
  /** See if the field is actively set: AcAccountNo
   * @return boolean whether the field is actively set
   */
  public boolean issetAcAccountNo ()
  {
    return this._AcAccountNoSet;
  }

  /** Retrieves the AcAccountNo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AcAccountNo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AcAccountNo field
   */
   public String getAcAccountNoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcAccountNoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAcAccountNoAsFormattedString");
       return fmtMgr.formatNumber(this.getAcAccountNo(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcAccountNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAcAccountNoAsFormattedString");
       throw x;
     }
   }
  /** Sets the AcAccountNo field from a formatted string
   *
   * @param _value the AcAccountNo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AcAccountNo field
   */
   public void setAcAccountNoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcAccountNoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAcAccountNo(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcAccountNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAcAccountNoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAcAccountNoFromFormattedString");
   }

  /** set the fields value: AcServiceOrderId
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAcServiceOrderId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AcServiceOrderId", "setAcServiceOrderId");
    }
    this.AcServiceOrderId = value;
    this._AcServiceOrderIdSet = true;
  }
  /** get the value of the field: AcServiceOrderId
   * @return BigInteger the value
   */
  public BigInteger getAcServiceOrderId ()
  {
    return this.AcServiceOrderId;
  }
  /** Change the field to not being actively set: AcServiceOrderId
   */
  public void unsetAcServiceOrderId ()
  {
    this._AcServiceOrderIdSet = false;
  }
  /** See if the field is actively set: AcServiceOrderId
   * @return boolean whether the field is actively set
   */
  public boolean issetAcServiceOrderId ()
  {
    return this._AcServiceOrderIdSet;
  }

  /** Retrieves the AcServiceOrderId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AcServiceOrderId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AcServiceOrderId field
   */
   public String getAcServiceOrderIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcServiceOrderIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAcServiceOrderIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAcServiceOrderId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcServiceOrderId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAcServiceOrderIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AcServiceOrderId field from a formatted string
   *
   * @param _value the AcServiceOrderId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AcServiceOrderId field
   */
   public void setAcServiceOrderIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcServiceOrderIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAcServiceOrderId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcServiceOrderId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAcServiceOrderIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAcServiceOrderIdFromFormattedString");
   }

  /** set the fields value: AcAmount
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAcAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AcAmount", "setAcAmount");
    }
    this.AcAmount = value;
    this._AcAmountSet = true;
  }
  /** get the value of the field: AcAmount
   * @return BigInteger the value
   */
  public BigInteger getAcAmount ()
  {
    return this.AcAmount;
  }
  /** Change the field to not being actively set: AcAmount
   */
  public void unsetAcAmount ()
  {
    this._AcAmountSet = false;
  }
  /** See if the field is actively set: AcAmount
   * @return boolean whether the field is actively set
   */
  public boolean issetAcAmount ()
  {
    return this._AcAmountSet;
  }

  /** Retrieves the AcAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AcAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AcAmount field
   */
   public String getAcAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAcAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAcAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAcAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the AcAmount field from a formatted string
   *
   * @param _value the AcAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AcAmount field
   */
   public void setAcAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAcAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAcAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAcAmountFromFormattedString");
   }

  /** set the fields value: AcDiscount
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAcDiscount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AcDiscount", "setAcDiscount");
    }
    this.AcDiscount = value;
    this._AcDiscountSet = true;
  }
  /** get the value of the field: AcDiscount
   * @return BigInteger the value
   */
  public BigInteger getAcDiscount ()
  {
    return this.AcDiscount;
  }
  /** Change the field to not being actively set: AcDiscount
   */
  public void unsetAcDiscount ()
  {
    this._AcDiscountSet = false;
  }
  /** See if the field is actively set: AcDiscount
   * @return boolean whether the field is actively set
   */
  public boolean issetAcDiscount ()
  {
    return this._AcDiscountSet;
  }

  /** Retrieves the AcDiscount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AcDiscount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AcDiscount field
   */
   public String getAcDiscountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcDiscountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAcDiscountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAcDiscount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcDiscount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAcDiscountAsFormattedString");
       throw x;
     }
   }
  /** Sets the AcDiscount field from a formatted string
   *
   * @param _value the AcDiscount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AcDiscount field
   */
   public void setAcDiscountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcDiscountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAcDiscount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcDiscount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAcDiscountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAcDiscountFromFormattedString");
   }

  /** set the fields value: AcFederalTax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAcFederalTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AcFederalTax", "setAcFederalTax");
    }
    this.AcFederalTax = value;
    this._AcFederalTaxSet = true;
  }
  /** get the value of the field: AcFederalTax
   * @return BigInteger the value
   */
  public BigInteger getAcFederalTax ()
  {
    return this.AcFederalTax;
  }
  /** Change the field to not being actively set: AcFederalTax
   */
  public void unsetAcFederalTax ()
  {
    this._AcFederalTaxSet = false;
  }
  /** See if the field is actively set: AcFederalTax
   * @return boolean whether the field is actively set
   */
  public boolean issetAcFederalTax ()
  {
    return this._AcFederalTaxSet;
  }

  /** Retrieves the AcFederalTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AcFederalTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AcFederalTax field
   */
   public String getAcFederalTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcFederalTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAcFederalTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAcFederalTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcFederalTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAcFederalTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the AcFederalTax field from a formatted string
   *
   * @param _value the AcFederalTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AcFederalTax field
   */
   public void setAcFederalTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcFederalTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAcFederalTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcFederalTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAcFederalTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAcFederalTaxFromFormattedString");
   }

  /** set the fields value: AcStateTax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAcStateTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AcStateTax", "setAcStateTax");
    }
    this.AcStateTax = value;
    this._AcStateTaxSet = true;
  }
  /** get the value of the field: AcStateTax
   * @return BigInteger the value
   */
  public BigInteger getAcStateTax ()
  {
    return this.AcStateTax;
  }
  /** Change the field to not being actively set: AcStateTax
   */
  public void unsetAcStateTax ()
  {
    this._AcStateTaxSet = false;
  }
  /** See if the field is actively set: AcStateTax
   * @return boolean whether the field is actively set
   */
  public boolean issetAcStateTax ()
  {
    return this._AcStateTaxSet;
  }

  /** Retrieves the AcStateTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AcStateTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AcStateTax field
   */
   public String getAcStateTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcStateTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAcStateTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAcStateTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcStateTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAcStateTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the AcStateTax field from a formatted string
   *
   * @param _value the AcStateTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AcStateTax field
   */
   public void setAcStateTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcStateTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAcStateTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcStateTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAcStateTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAcStateTaxFromFormattedString");
   }

  /** set the fields value: AcCountyTax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAcCountyTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AcCountyTax", "setAcCountyTax");
    }
    this.AcCountyTax = value;
    this._AcCountyTaxSet = true;
  }
  /** get the value of the field: AcCountyTax
   * @return BigInteger the value
   */
  public BigInteger getAcCountyTax ()
  {
    return this.AcCountyTax;
  }
  /** Change the field to not being actively set: AcCountyTax
   */
  public void unsetAcCountyTax ()
  {
    this._AcCountyTaxSet = false;
  }
  /** See if the field is actively set: AcCountyTax
   * @return boolean whether the field is actively set
   */
  public boolean issetAcCountyTax ()
  {
    return this._AcCountyTaxSet;
  }

  /** Retrieves the AcCountyTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AcCountyTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AcCountyTax field
   */
   public String getAcCountyTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcCountyTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAcCountyTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAcCountyTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcCountyTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAcCountyTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the AcCountyTax field from a formatted string
   *
   * @param _value the AcCountyTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AcCountyTax field
   */
   public void setAcCountyTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcCountyTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAcCountyTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcCountyTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAcCountyTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAcCountyTaxFromFormattedString");
   }

  /** set the fields value: AcCityTax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAcCityTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AcCityTax", "setAcCityTax");
    }
    this.AcCityTax = value;
    this._AcCityTaxSet = true;
  }
  /** get the value of the field: AcCityTax
   * @return BigInteger the value
   */
  public BigInteger getAcCityTax ()
  {
    return this.AcCityTax;
  }
  /** Change the field to not being actively set: AcCityTax
   */
  public void unsetAcCityTax ()
  {
    this._AcCityTaxSet = false;
  }
  /** See if the field is actively set: AcCityTax
   * @return boolean whether the field is actively set
   */
  public boolean issetAcCityTax ()
  {
    return this._AcCityTaxSet;
  }

  /** Retrieves the AcCityTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AcCityTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AcCityTax field
   */
   public String getAcCityTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcCityTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAcCityTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAcCityTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcCityTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAcCityTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the AcCityTax field from a formatted string
   *
   * @param _value the AcCityTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AcCityTax field
   */
   public void setAcCityTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcCityTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAcCityTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcCityTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAcCityTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAcCityTaxFromFormattedString");
   }

  /** set the fields value: AcOtherTax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAcOtherTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AcOtherTax", "setAcOtherTax");
    }
    this.AcOtherTax = value;
    this._AcOtherTaxSet = true;
  }
  /** get the value of the field: AcOtherTax
   * @return BigInteger the value
   */
  public BigInteger getAcOtherTax ()
  {
    return this.AcOtherTax;
  }
  /** Change the field to not being actively set: AcOtherTax
   */
  public void unsetAcOtherTax ()
  {
    this._AcOtherTaxSet = false;
  }
  /** See if the field is actively set: AcOtherTax
   * @return boolean whether the field is actively set
   */
  public boolean issetAcOtherTax ()
  {
    return this._AcOtherTaxSet;
  }

  /** Retrieves the AcOtherTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AcOtherTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AcOtherTax field
   */
   public String getAcOtherTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcOtherTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAcOtherTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAcOtherTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcOtherTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAcOtherTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the AcOtherTax field from a formatted string
   *
   * @param _value the AcOtherTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AcOtherTax field
   */
   public void setAcOtherTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcOtherTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAcOtherTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcOtherTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAcOtherTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAcOtherTaxFromFormattedString");
   }

  /** get the object for ChargeElementObject
   * @return AcChargeElementData[] the object
   */
  public ChargeElementObjectData[] getAcChargeElement ()
  {
    return this.ac_charge_element;
  }
  /** set the object for AcChargeElement
   * @param value the new object
   */
  public void setAcChargeElement (ChargeElementObjectData[] value)
  {
    this.ac_charge_element = value;
  }
  /** get the object for ServiceInstanceQuoteObject
   * @return AcServiceInstanceQuoteData[] the object
   */
  public ServiceInstanceQuoteObjectData[] getAcServiceInstanceQuote ()
  {
    return this.ac_service_instance_quote;
  }
  /** set the object for AcServiceInstanceQuote
   * @param value the new object
   */
  public void setAcServiceInstanceQuote (ServiceInstanceQuoteObjectData[] value)
  {
    this.ac_service_instance_quote = value;
  }
  /** get the object for ContractQuoteObject
   * @return AcContractQuoteData[] the object
   */
  public ContractQuoteObjectData[] getAcContractQuote ()
  {
    return this.ac_contract_quote;
  }
  /** set the object for AcContractQuote
   * @param value the new object
   */
  public void setAcContractQuote (ContractQuoteObjectData[] value)
  {
    this.ac_contract_quote = value;
  }
  /** get the object for PackageQuoteObject
   * @return AcPackageQuoteData[] the object
   */
  public PackageQuoteObjectData[] getAcPackageQuote ()
  {
    return this.ac_package_quote;
  }
  /** set the object for AcPackageQuote
   * @param value the new object
   */
  public void setAcPackageQuote (PackageQuoteObjectData[] value)
  {
    this.ac_package_quote = value;
  }
  public String toString() {
    return AccountQuoteObjectHelper.toMap(this, null).toString();
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
    
  /** AcAccountNo field */
    if (!nonNullOnly || (AcAccountNo != null)) _AcAccountNoSet = flag;
  /** AcServiceOrderId field */
    if (!nonNullOnly || (AcServiceOrderId != null)) _AcServiceOrderIdSet = flag;
  /** AcAmount field */
    if (!nonNullOnly || (AcAmount != null)) _AcAmountSet = flag;
  /** AcDiscount field */
    if (!nonNullOnly || (AcDiscount != null)) _AcDiscountSet = flag;
  /** AcFederalTax field */
    if (!nonNullOnly || (AcFederalTax != null)) _AcFederalTaxSet = flag;
  /** AcStateTax field */
    if (!nonNullOnly || (AcStateTax != null)) _AcStateTaxSet = flag;
  /** AcCountyTax field */
    if (!nonNullOnly || (AcCountyTax != null)) _AcCountyTaxSet = flag;
  /** AcCityTax field */
    if (!nonNullOnly || (AcCityTax != null)) _AcCityTaxSet = flag;
  /** AcOtherTax field */
    if (!nonNullOnly || (AcOtherTax != null)) _AcOtherTaxSet = flag;
  /** ac_charge_element object */
  
    if (ac_charge_element != null) {
      for (int i = 0; i < ac_charge_element.length; i++) {
        if(ac_charge_element[i] != null) ac_charge_element[i].resetFlags(flag, nonNullOnly);
      }
    }
    
  /** ac_service_instance_quote object */
  
    if (ac_service_instance_quote != null) {
      for (int i = 0; i < ac_service_instance_quote.length; i++) {
        if(ac_service_instance_quote[i] != null) ac_service_instance_quote[i].resetFlags(flag, nonNullOnly);
      }
    }
    
  /** ac_contract_quote object */
  
    if (ac_contract_quote != null) {
      for (int i = 0; i < ac_contract_quote.length; i++) {
        if(ac_contract_quote[i] != null) ac_contract_quote[i].resetFlags(flag, nonNullOnly);
      }
    }
    
  /** ac_package_quote object */
  
    if (ac_package_quote != null) {
      for (int i = 0; i < ac_package_quote.length; i++) {
        if(ac_package_quote[i] != null) ac_package_quote[i].resetFlags(flag, nonNullOnly);
      }
    }
    
  }
}
