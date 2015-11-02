/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ServiceInstanceQuoteObjectData.java
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
  
/** ServiceInstanceQuoteObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class ServiceInstanceQuoteObjectData extends BaseObjectData implements Serializable
{

  /** SiSubscrNo field */
  public    Integer SiSubscrNo  = null;
  protected boolean _SiSubscrNoSet = false;
  /** SiSubscrNoResets field */
  public    Integer SiSubscrNoResets  = null;
  protected boolean _SiSubscrNoResetsSet = false;
  /** SiServiceOrderId field */
  public    BigInteger SiServiceOrderId  = null;
  protected boolean _SiServiceOrderIdSet = false;
  /** SiEmfConfigId field */
  public    Integer SiEmfConfigId  = null;
  protected boolean _SiEmfConfigIdSet = false;
  /** SiAmount field */
  public    BigInteger SiAmount  = null;
  protected boolean _SiAmountSet = false;
  /** SiDiscount field */
  public    BigInteger SiDiscount  = null;
  protected boolean _SiDiscountSet = false;
  /** SiFederalTax field */
  public    BigInteger SiFederalTax  = null;
  protected boolean _SiFederalTaxSet = false;
  /** SiStateTax field */
  public    BigInteger SiStateTax  = null;
  protected boolean _SiStateTaxSet = false;
  /** SiCountyTax field */
  public    BigInteger SiCountyTax  = null;
  protected boolean _SiCountyTaxSet = false;
  /** SiCityTax field */
  public    BigInteger SiCityTax  = null;
  protected boolean _SiCityTaxSet = false;
  /** SiOtherTax field */
  public    BigInteger SiOtherTax  = null;
  protected boolean _SiOtherTaxSet = false;
  /** si_charge_element object */
  public ChargeElementObjectData[] si_charge_element = null;

  /** si_contract_quote object */
  public ContractQuoteObjectData[] si_contract_quote = null;

  private String _objName = "ServiceInstanceQuoteObjectData";
  /** Default constructor */
  public ServiceInstanceQuoteObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public ServiceInstanceQuoteObjectData (ServiceInstanceQuoteObjectData other)
  {

    if (other == null) return;
    this.SiSubscrNo = other.SiSubscrNo;
    this._SiSubscrNoSet = other._SiSubscrNoSet;
    this.SiSubscrNoResets = other.SiSubscrNoResets;
    this._SiSubscrNoResetsSet = other._SiSubscrNoResetsSet;
    this.SiServiceOrderId = other.SiServiceOrderId;
    this._SiServiceOrderIdSet = other._SiServiceOrderIdSet;
    this.SiEmfConfigId = other.SiEmfConfigId;
    this._SiEmfConfigIdSet = other._SiEmfConfigIdSet;
    this.SiAmount = other.SiAmount;
    this._SiAmountSet = other._SiAmountSet;
    this.SiDiscount = other.SiDiscount;
    this._SiDiscountSet = other._SiDiscountSet;
    this.SiFederalTax = other.SiFederalTax;
    this._SiFederalTaxSet = other._SiFederalTaxSet;
    this.SiStateTax = other.SiStateTax;
    this._SiStateTaxSet = other._SiStateTaxSet;
    this.SiCountyTax = other.SiCountyTax;
    this._SiCountyTaxSet = other._SiCountyTaxSet;
    this.SiCityTax = other.SiCityTax;
    this._SiCityTaxSet = other._SiCityTaxSet;
    this.SiOtherTax = other.SiOtherTax;
    this._SiOtherTaxSet = other._SiOtherTaxSet;
    if (other.si_charge_element != null)
    {
      this.si_charge_element = new ChargeElementObjectData[other.si_charge_element.length];
      for (int i = 0; other.si_charge_element != null && i < other.si_charge_element.length; i++)
      {
        if (other.si_charge_element[i] != null)  this.si_charge_element[i] = new ChargeElementObjectData (other.si_charge_element[i]);
      }
    }

    if (other.si_contract_quote != null)
    {
      this.si_contract_quote = new ContractQuoteObjectData[other.si_contract_quote.length];
      for (int i = 0; other.si_contract_quote != null && i < other.si_contract_quote.length; i++)
      {
        if (other.si_contract_quote[i] != null)  this.si_contract_quote[i] = new ContractQuoteObjectData (other.si_contract_quote[i]);
      }
    }

  }

  /** set the fields value: SiSubscrNo
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setSiSubscrNo (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SiSubscrNo", "setSiSubscrNo");
    }
    this.SiSubscrNo = value;
    this._SiSubscrNoSet = true;
  }
  /** get the value of the field: SiSubscrNo
   * @return Integer the value
   */
  public Integer getSiSubscrNo ()
  {
    return this.SiSubscrNo;
  }
  /** Change the field to not being actively set: SiSubscrNo
   */
  public void unsetSiSubscrNo ()
  {
    this._SiSubscrNoSet = false;
  }
  /** See if the field is actively set: SiSubscrNo
   * @return boolean whether the field is actively set
   */
  public boolean issetSiSubscrNo ()
  {
    return this._SiSubscrNoSet;
  }

  /** Retrieves the SiSubscrNo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SiSubscrNo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SiSubscrNo field
   */
   public String getSiSubscrNoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSiSubscrNoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSiSubscrNoAsFormattedString");
       return fmtMgr.formatNumber(this.getSiSubscrNo(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SiSubscrNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSiSubscrNoAsFormattedString");
       throw x;
     }
   }
  /** Sets the SiSubscrNo field from a formatted string
   *
   * @param _value the SiSubscrNo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SiSubscrNo field
   */
   public void setSiSubscrNoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSiSubscrNoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSiSubscrNo(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SiSubscrNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSiSubscrNoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSiSubscrNoFromFormattedString");
   }

  /** set the fields value: SiSubscrNoResets
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setSiSubscrNoResets (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SiSubscrNoResets", "setSiSubscrNoResets");
    }
    this.SiSubscrNoResets = value;
    this._SiSubscrNoResetsSet = true;
  }
  /** get the value of the field: SiSubscrNoResets
   * @return Integer the value
   */
  public Integer getSiSubscrNoResets ()
  {
    return this.SiSubscrNoResets;
  }
  /** Change the field to not being actively set: SiSubscrNoResets
   */
  public void unsetSiSubscrNoResets ()
  {
    this._SiSubscrNoResetsSet = false;
  }
  /** See if the field is actively set: SiSubscrNoResets
   * @return boolean whether the field is actively set
   */
  public boolean issetSiSubscrNoResets ()
  {
    return this._SiSubscrNoResetsSet;
  }

  /** Retrieves the SiSubscrNoResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SiSubscrNoResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SiSubscrNoResets field
   */
   public String getSiSubscrNoResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSiSubscrNoResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSiSubscrNoResetsAsFormattedString");
       return fmtMgr.formatNumber(this.getSiSubscrNoResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SiSubscrNoResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSiSubscrNoResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the SiSubscrNoResets field from a formatted string
   *
   * @param _value the SiSubscrNoResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SiSubscrNoResets field
   */
   public void setSiSubscrNoResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSiSubscrNoResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSiSubscrNoResets(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SiSubscrNoResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSiSubscrNoResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSiSubscrNoResetsFromFormattedString");
   }

  /** set the fields value: SiServiceOrderId
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setSiServiceOrderId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SiServiceOrderId", "setSiServiceOrderId");
    }
    this.SiServiceOrderId = value;
    this._SiServiceOrderIdSet = true;
  }
  /** get the value of the field: SiServiceOrderId
   * @return BigInteger the value
   */
  public BigInteger getSiServiceOrderId ()
  {
    return this.SiServiceOrderId;
  }
  /** Change the field to not being actively set: SiServiceOrderId
   */
  public void unsetSiServiceOrderId ()
  {
    this._SiServiceOrderIdSet = false;
  }
  /** See if the field is actively set: SiServiceOrderId
   * @return boolean whether the field is actively set
   */
  public boolean issetSiServiceOrderId ()
  {
    return this._SiServiceOrderIdSet;
  }

  /** Retrieves the SiServiceOrderId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SiServiceOrderId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SiServiceOrderId field
   */
   public String getSiServiceOrderIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSiServiceOrderIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSiServiceOrderIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getSiServiceOrderId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SiServiceOrderId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSiServiceOrderIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the SiServiceOrderId field from a formatted string
   *
   * @param _value the SiServiceOrderId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SiServiceOrderId field
   */
   public void setSiServiceOrderIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSiServiceOrderIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSiServiceOrderId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SiServiceOrderId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSiServiceOrderIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSiServiceOrderIdFromFormattedString");
   }

  /** set the fields value: SiEmfConfigId
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setSiEmfConfigId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SiEmfConfigId", "setSiEmfConfigId");
    }
    this.SiEmfConfigId = value;
    this._SiEmfConfigIdSet = true;
  }
  /** get the value of the field: SiEmfConfigId
   * @return Integer the value
   */
  public Integer getSiEmfConfigId ()
  {
    return this.SiEmfConfigId;
  }
  /** Change the field to not being actively set: SiEmfConfigId
   */
  public void unsetSiEmfConfigId ()
  {
    this._SiEmfConfigIdSet = false;
  }
  /** See if the field is actively set: SiEmfConfigId
   * @return boolean whether the field is actively set
   */
  public boolean issetSiEmfConfigId ()
  {
    return this._SiEmfConfigIdSet;
  }

  /** Retrieves the SiEmfConfigId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SiEmfConfigId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SiEmfConfigId field
   */
   public String getSiEmfConfigIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSiEmfConfigIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSiEmfConfigIdAsFormattedString");
       return fmtMgr.formatNumber(this.getSiEmfConfigId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SiEmfConfigId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSiEmfConfigIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the SiEmfConfigId field from a formatted string
   *
   * @param _value the SiEmfConfigId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SiEmfConfigId field
   */
   public void setSiEmfConfigIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSiEmfConfigIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSiEmfConfigId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SiEmfConfigId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSiEmfConfigIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSiEmfConfigIdFromFormattedString");
   }

  /** set the fields value: SiAmount
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setSiAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SiAmount", "setSiAmount");
    }
    this.SiAmount = value;
    this._SiAmountSet = true;
  }
  /** get the value of the field: SiAmount
   * @return BigInteger the value
   */
  public BigInteger getSiAmount ()
  {
    return this.SiAmount;
  }
  /** Change the field to not being actively set: SiAmount
   */
  public void unsetSiAmount ()
  {
    this._SiAmountSet = false;
  }
  /** See if the field is actively set: SiAmount
   * @return boolean whether the field is actively set
   */
  public boolean issetSiAmount ()
  {
    return this._SiAmountSet;
  }

  /** Retrieves the SiAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SiAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SiAmount field
   */
   public String getSiAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSiAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSiAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getSiAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SiAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSiAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the SiAmount field from a formatted string
   *
   * @param _value the SiAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SiAmount field
   */
   public void setSiAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSiAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSiAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SiAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSiAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSiAmountFromFormattedString");
   }

  /** set the fields value: SiDiscount
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setSiDiscount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SiDiscount", "setSiDiscount");
    }
    this.SiDiscount = value;
    this._SiDiscountSet = true;
  }
  /** get the value of the field: SiDiscount
   * @return BigInteger the value
   */
  public BigInteger getSiDiscount ()
  {
    return this.SiDiscount;
  }
  /** Change the field to not being actively set: SiDiscount
   */
  public void unsetSiDiscount ()
  {
    this._SiDiscountSet = false;
  }
  /** See if the field is actively set: SiDiscount
   * @return boolean whether the field is actively set
   */
  public boolean issetSiDiscount ()
  {
    return this._SiDiscountSet;
  }

  /** Retrieves the SiDiscount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SiDiscount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SiDiscount field
   */
   public String getSiDiscountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSiDiscountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSiDiscountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getSiDiscount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SiDiscount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSiDiscountAsFormattedString");
       throw x;
     }
   }
  /** Sets the SiDiscount field from a formatted string
   *
   * @param _value the SiDiscount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SiDiscount field
   */
   public void setSiDiscountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSiDiscountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSiDiscount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SiDiscount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSiDiscountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSiDiscountFromFormattedString");
   }

  /** set the fields value: SiFederalTax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setSiFederalTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SiFederalTax", "setSiFederalTax");
    }
    this.SiFederalTax = value;
    this._SiFederalTaxSet = true;
  }
  /** get the value of the field: SiFederalTax
   * @return BigInteger the value
   */
  public BigInteger getSiFederalTax ()
  {
    return this.SiFederalTax;
  }
  /** Change the field to not being actively set: SiFederalTax
   */
  public void unsetSiFederalTax ()
  {
    this._SiFederalTaxSet = false;
  }
  /** See if the field is actively set: SiFederalTax
   * @return boolean whether the field is actively set
   */
  public boolean issetSiFederalTax ()
  {
    return this._SiFederalTaxSet;
  }

  /** Retrieves the SiFederalTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SiFederalTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SiFederalTax field
   */
   public String getSiFederalTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSiFederalTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSiFederalTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getSiFederalTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SiFederalTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSiFederalTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the SiFederalTax field from a formatted string
   *
   * @param _value the SiFederalTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SiFederalTax field
   */
   public void setSiFederalTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSiFederalTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSiFederalTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SiFederalTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSiFederalTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSiFederalTaxFromFormattedString");
   }

  /** set the fields value: SiStateTax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setSiStateTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SiStateTax", "setSiStateTax");
    }
    this.SiStateTax = value;
    this._SiStateTaxSet = true;
  }
  /** get the value of the field: SiStateTax
   * @return BigInteger the value
   */
  public BigInteger getSiStateTax ()
  {
    return this.SiStateTax;
  }
  /** Change the field to not being actively set: SiStateTax
   */
  public void unsetSiStateTax ()
  {
    this._SiStateTaxSet = false;
  }
  /** See if the field is actively set: SiStateTax
   * @return boolean whether the field is actively set
   */
  public boolean issetSiStateTax ()
  {
    return this._SiStateTaxSet;
  }

  /** Retrieves the SiStateTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SiStateTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SiStateTax field
   */
   public String getSiStateTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSiStateTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSiStateTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getSiStateTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SiStateTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSiStateTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the SiStateTax field from a formatted string
   *
   * @param _value the SiStateTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SiStateTax field
   */
   public void setSiStateTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSiStateTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSiStateTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SiStateTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSiStateTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSiStateTaxFromFormattedString");
   }

  /** set the fields value: SiCountyTax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setSiCountyTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SiCountyTax", "setSiCountyTax");
    }
    this.SiCountyTax = value;
    this._SiCountyTaxSet = true;
  }
  /** get the value of the field: SiCountyTax
   * @return BigInteger the value
   */
  public BigInteger getSiCountyTax ()
  {
    return this.SiCountyTax;
  }
  /** Change the field to not being actively set: SiCountyTax
   */
  public void unsetSiCountyTax ()
  {
    this._SiCountyTaxSet = false;
  }
  /** See if the field is actively set: SiCountyTax
   * @return boolean whether the field is actively set
   */
  public boolean issetSiCountyTax ()
  {
    return this._SiCountyTaxSet;
  }

  /** Retrieves the SiCountyTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SiCountyTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SiCountyTax field
   */
   public String getSiCountyTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSiCountyTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSiCountyTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getSiCountyTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SiCountyTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSiCountyTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the SiCountyTax field from a formatted string
   *
   * @param _value the SiCountyTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SiCountyTax field
   */
   public void setSiCountyTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSiCountyTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSiCountyTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SiCountyTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSiCountyTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSiCountyTaxFromFormattedString");
   }

  /** set the fields value: SiCityTax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setSiCityTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SiCityTax", "setSiCityTax");
    }
    this.SiCityTax = value;
    this._SiCityTaxSet = true;
  }
  /** get the value of the field: SiCityTax
   * @return BigInteger the value
   */
  public BigInteger getSiCityTax ()
  {
    return this.SiCityTax;
  }
  /** Change the field to not being actively set: SiCityTax
   */
  public void unsetSiCityTax ()
  {
    this._SiCityTaxSet = false;
  }
  /** See if the field is actively set: SiCityTax
   * @return boolean whether the field is actively set
   */
  public boolean issetSiCityTax ()
  {
    return this._SiCityTaxSet;
  }

  /** Retrieves the SiCityTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SiCityTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SiCityTax field
   */
   public String getSiCityTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSiCityTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSiCityTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getSiCityTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SiCityTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSiCityTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the SiCityTax field from a formatted string
   *
   * @param _value the SiCityTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SiCityTax field
   */
   public void setSiCityTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSiCityTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSiCityTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SiCityTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSiCityTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSiCityTaxFromFormattedString");
   }

  /** set the fields value: SiOtherTax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setSiOtherTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SiOtherTax", "setSiOtherTax");
    }
    this.SiOtherTax = value;
    this._SiOtherTaxSet = true;
  }
  /** get the value of the field: SiOtherTax
   * @return BigInteger the value
   */
  public BigInteger getSiOtherTax ()
  {
    return this.SiOtherTax;
  }
  /** Change the field to not being actively set: SiOtherTax
   */
  public void unsetSiOtherTax ()
  {
    this._SiOtherTaxSet = false;
  }
  /** See if the field is actively set: SiOtherTax
   * @return boolean whether the field is actively set
   */
  public boolean issetSiOtherTax ()
  {
    return this._SiOtherTaxSet;
  }

  /** Retrieves the SiOtherTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SiOtherTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SiOtherTax field
   */
   public String getSiOtherTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSiOtherTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSiOtherTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getSiOtherTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SiOtherTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSiOtherTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the SiOtherTax field from a formatted string
   *
   * @param _value the SiOtherTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SiOtherTax field
   */
   public void setSiOtherTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSiOtherTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSiOtherTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SiOtherTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSiOtherTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSiOtherTaxFromFormattedString");
   }

  /** get the object for ChargeElementObject
   * @return SiChargeElementData[] the object
   */
  public ChargeElementObjectData[] getSiChargeElement ()
  {
    return this.si_charge_element;
  }
  /** set the object for SiChargeElement
   * @param value the new object
   */
  public void setSiChargeElement (ChargeElementObjectData[] value)
  {
    this.si_charge_element = value;
  }
  /** get the object for ContractQuoteObject
   * @return SiContractQuoteData[] the object
   */
  public ContractQuoteObjectData[] getSiContractQuote ()
  {
    return this.si_contract_quote;
  }
  /** set the object for SiContractQuote
   * @param value the new object
   */
  public void setSiContractQuote (ContractQuoteObjectData[] value)
  {
    this.si_contract_quote = value;
  }
  public String toString() {
    return ServiceInstanceQuoteObjectHelper.toMap(this, null).toString();
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
    
  /** SiSubscrNo field */
    if (!nonNullOnly || (SiSubscrNo != null)) _SiSubscrNoSet = flag;
  /** SiSubscrNoResets field */
    if (!nonNullOnly || (SiSubscrNoResets != null)) _SiSubscrNoResetsSet = flag;
  /** SiServiceOrderId field */
    if (!nonNullOnly || (SiServiceOrderId != null)) _SiServiceOrderIdSet = flag;
  /** SiEmfConfigId field */
    if (!nonNullOnly || (SiEmfConfigId != null)) _SiEmfConfigIdSet = flag;
  /** SiAmount field */
    if (!nonNullOnly || (SiAmount != null)) _SiAmountSet = flag;
  /** SiDiscount field */
    if (!nonNullOnly || (SiDiscount != null)) _SiDiscountSet = flag;
  /** SiFederalTax field */
    if (!nonNullOnly || (SiFederalTax != null)) _SiFederalTaxSet = flag;
  /** SiStateTax field */
    if (!nonNullOnly || (SiStateTax != null)) _SiStateTaxSet = flag;
  /** SiCountyTax field */
    if (!nonNullOnly || (SiCountyTax != null)) _SiCountyTaxSet = flag;
  /** SiCityTax field */
    if (!nonNullOnly || (SiCityTax != null)) _SiCityTaxSet = flag;
  /** SiOtherTax field */
    if (!nonNullOnly || (SiOtherTax != null)) _SiOtherTaxSet = flag;
  /** si_charge_element object */
  
    if (si_charge_element != null) {
      for (int i = 0; i < si_charge_element.length; i++) {
        if(si_charge_element[i] != null) si_charge_element[i].resetFlags(flag, nonNullOnly);
      }
    }
    
  /** si_contract_quote object */
  
    if (si_contract_quote != null) {
      for (int i = 0; i < si_contract_quote.length; i++) {
        if(si_contract_quote[i] != null) si_contract_quote[i].resetFlags(flag, nonNullOnly);
      }
    }
    
  }
}
