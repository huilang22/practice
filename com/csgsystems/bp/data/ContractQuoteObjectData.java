/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ContractQuoteObjectData.java
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
  
/** ContractQuoteObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class ContractQuoteObjectData extends BaseObjectData implements Serializable
{

  /** CnTrackingId field */
  public    Integer CnTrackingId  = null;
  protected boolean _CnTrackingIdSet = false;
  /** CnTrackingIdServ field */
  public    Integer CnTrackingIdServ  = null;
  protected boolean _CnTrackingIdServSet = false;
  /** CnContractId field */
  public    String CnContractId  = null;
  protected boolean _CnContractIdSet = false;
  /** CnContractType field */
  public    Integer CnContractType  = null;
  protected boolean _CnContractTypeSet = false;
  /** CnAmount field */
  public    BigInteger CnAmount  = null;
  protected boolean _CnAmountSet = false;
  /** CnDiscount field */
  public    BigInteger CnDiscount  = null;
  protected boolean _CnDiscountSet = false;
  /** CnFederalTax field */
  public    BigInteger CnFederalTax  = null;
  protected boolean _CnFederalTaxSet = false;
  /** CnStateTax field */
  public    BigInteger CnStateTax  = null;
  protected boolean _CnStateTaxSet = false;
  /** CnCountyTax field */
  public    BigInteger CnCountyTax  = null;
  protected boolean _CnCountyTaxSet = false;
  /** CnCityTax field */
  public    BigInteger CnCityTax  = null;
  protected boolean _CnCityTaxSet = false;
  /** CnOtherTax field */
  public    BigInteger CnOtherTax  = null;
  protected boolean _CnOtherTaxSet = false;
  /** cn_charge_element object */
  public ChargeElementObjectData[] cn_charge_element = null;

  private String _objName = "ContractQuoteObjectData";
  /** Default constructor */
  public ContractQuoteObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public ContractQuoteObjectData (ContractQuoteObjectData other)
  {

    if (other == null) return;
    this.CnTrackingId = other.CnTrackingId;
    this._CnTrackingIdSet = other._CnTrackingIdSet;
    this.CnTrackingIdServ = other.CnTrackingIdServ;
    this._CnTrackingIdServSet = other._CnTrackingIdServSet;
    this.CnContractId = other.CnContractId;
    this._CnContractIdSet = other._CnContractIdSet;
    this.CnContractType = other.CnContractType;
    this._CnContractTypeSet = other._CnContractTypeSet;
    this.CnAmount = other.CnAmount;
    this._CnAmountSet = other._CnAmountSet;
    this.CnDiscount = other.CnDiscount;
    this._CnDiscountSet = other._CnDiscountSet;
    this.CnFederalTax = other.CnFederalTax;
    this._CnFederalTaxSet = other._CnFederalTaxSet;
    this.CnStateTax = other.CnStateTax;
    this._CnStateTaxSet = other._CnStateTaxSet;
    this.CnCountyTax = other.CnCountyTax;
    this._CnCountyTaxSet = other._CnCountyTaxSet;
    this.CnCityTax = other.CnCityTax;
    this._CnCityTaxSet = other._CnCityTaxSet;
    this.CnOtherTax = other.CnOtherTax;
    this._CnOtherTaxSet = other._CnOtherTaxSet;
    if (other.cn_charge_element != null)
    {
      this.cn_charge_element = new ChargeElementObjectData[other.cn_charge_element.length];
      for (int i = 0; other.cn_charge_element != null && i < other.cn_charge_element.length; i++)
      {
        if (other.cn_charge_element[i] != null)  this.cn_charge_element[i] = new ChargeElementObjectData (other.cn_charge_element[i]);
      }
    }

  }

  /** set the fields value: CnTrackingId
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCnTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CnTrackingId", "setCnTrackingId");
    }
    this.CnTrackingId = value;
    this._CnTrackingIdSet = true;
  }
  /** get the value of the field: CnTrackingId
   * @return Integer the value
   */
  public Integer getCnTrackingId ()
  {
    return this.CnTrackingId;
  }
  /** Change the field to not being actively set: CnTrackingId
   */
  public void unsetCnTrackingId ()
  {
    this._CnTrackingIdSet = false;
  }
  /** See if the field is actively set: CnTrackingId
   * @return boolean whether the field is actively set
   */
  public boolean issetCnTrackingId ()
  {
    return this._CnTrackingIdSet;
  }

  /** Retrieves the CnTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CnTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CnTrackingId field
   */
   public String getCnTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCnTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCnTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getCnTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CnTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCnTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the CnTrackingId field from a formatted string
   *
   * @param _value the CnTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CnTrackingId field
   */
   public void setCnTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCnTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCnTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CnTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCnTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCnTrackingIdFromFormattedString");
   }

  /** set the fields value: CnTrackingIdServ
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCnTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CnTrackingIdServ", "setCnTrackingIdServ");
    }
    this.CnTrackingIdServ = value;
    this._CnTrackingIdServSet = true;
  }
  /** get the value of the field: CnTrackingIdServ
   * @return Integer the value
   */
  public Integer getCnTrackingIdServ ()
  {
    return this.CnTrackingIdServ;
  }
  /** Change the field to not being actively set: CnTrackingIdServ
   */
  public void unsetCnTrackingIdServ ()
  {
    this._CnTrackingIdServSet = false;
  }
  /** See if the field is actively set: CnTrackingIdServ
   * @return boolean whether the field is actively set
   */
  public boolean issetCnTrackingIdServ ()
  {
    return this._CnTrackingIdServSet;
  }

  /** Retrieves the CnTrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CnTrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CnTrackingIdServ field
   */
   public String getCnTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCnTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCnTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getCnTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CnTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCnTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the CnTrackingIdServ field from a formatted string
   *
   * @param _value the CnTrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CnTrackingIdServ field
   */
   public void setCnTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCnTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCnTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CnTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCnTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCnTrackingIdServFromFormattedString");
   }

  /** set the fields value: CnContractId
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCnContractId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CnContractId", "setCnContractId");
    }
    this.CnContractId = value;
    this._CnContractIdSet = true;
  }
  /** get the value of the field: CnContractId
   * @return String the value
   */
  public String getCnContractId ()
  {
    return this.CnContractId;
  }
  /** Change the field to not being actively set: CnContractId
   */
  public void unsetCnContractId ()
  {
    this._CnContractIdSet = false;
  }
  /** See if the field is actively set: CnContractId
   * @return boolean whether the field is actively set
   */
  public boolean issetCnContractId ()
  {
    return this._CnContractIdSet;
  }

  /** Retrieves the CnContractId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CnContractId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CnContractId field
   */
   public String getCnContractIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCnContractIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCnContractIdAsFormattedString");
       return fmtMgr.formatString(this.getCnContractId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CnContractId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCnContractIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the CnContractId field from a formatted string
   *
   * @param _value the CnContractId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CnContractId field
   */
   public void setCnContractIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCnContractIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCnContractId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CnContractId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCnContractIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCnContractIdFromFormattedString");
   }

  /** set the fields value: CnContractType
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCnContractType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CnContractType", "setCnContractType");
    }
    this.CnContractType = value;
    this._CnContractTypeSet = true;
  }
  /** get the value of the field: CnContractType
   * @return Integer the value
   */
  public Integer getCnContractType ()
  {
    return this.CnContractType;
  }
  /** Change the field to not being actively set: CnContractType
   */
  public void unsetCnContractType ()
  {
    this._CnContractTypeSet = false;
  }
  /** See if the field is actively set: CnContractType
   * @return boolean whether the field is actively set
   */
  public boolean issetCnContractType ()
  {
    return this._CnContractTypeSet;
  }

  /** Retrieves the CnContractType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CnContractType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CnContractType field
   */
   public String getCnContractTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCnContractTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCnContractTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getCnContractType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CnContractType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCnContractTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CnContractType field from a formatted string
   *
   * @param _value the CnContractType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CnContractType field
   */
   public void setCnContractTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCnContractTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCnContractType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CnContractType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCnContractTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCnContractTypeFromFormattedString");
   }

  /** set the fields value: CnAmount
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCnAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CnAmount", "setCnAmount");
    }
    this.CnAmount = value;
    this._CnAmountSet = true;
  }
  /** get the value of the field: CnAmount
   * @return BigInteger the value
   */
  public BigInteger getCnAmount ()
  {
    return this.CnAmount;
  }
  /** Change the field to not being actively set: CnAmount
   */
  public void unsetCnAmount ()
  {
    this._CnAmountSet = false;
  }
  /** See if the field is actively set: CnAmount
   * @return boolean whether the field is actively set
   */
  public boolean issetCnAmount ()
  {
    return this._CnAmountSet;
  }

  /** Retrieves the CnAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CnAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CnAmount field
   */
   public String getCnAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCnAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCnAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCnAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CnAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCnAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the CnAmount field from a formatted string
   *
   * @param _value the CnAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CnAmount field
   */
   public void setCnAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCnAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCnAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CnAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCnAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCnAmountFromFormattedString");
   }

  /** set the fields value: CnDiscount
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCnDiscount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CnDiscount", "setCnDiscount");
    }
    this.CnDiscount = value;
    this._CnDiscountSet = true;
  }
  /** get the value of the field: CnDiscount
   * @return BigInteger the value
   */
  public BigInteger getCnDiscount ()
  {
    return this.CnDiscount;
  }
  /** Change the field to not being actively set: CnDiscount
   */
  public void unsetCnDiscount ()
  {
    this._CnDiscountSet = false;
  }
  /** See if the field is actively set: CnDiscount
   * @return boolean whether the field is actively set
   */
  public boolean issetCnDiscount ()
  {
    return this._CnDiscountSet;
  }

  /** Retrieves the CnDiscount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CnDiscount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CnDiscount field
   */
   public String getCnDiscountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCnDiscountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCnDiscountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCnDiscount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CnDiscount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCnDiscountAsFormattedString");
       throw x;
     }
   }
  /** Sets the CnDiscount field from a formatted string
   *
   * @param _value the CnDiscount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CnDiscount field
   */
   public void setCnDiscountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCnDiscountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCnDiscount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CnDiscount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCnDiscountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCnDiscountFromFormattedString");
   }

  /** set the fields value: CnFederalTax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCnFederalTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CnFederalTax", "setCnFederalTax");
    }
    this.CnFederalTax = value;
    this._CnFederalTaxSet = true;
  }
  /** get the value of the field: CnFederalTax
   * @return BigInteger the value
   */
  public BigInteger getCnFederalTax ()
  {
    return this.CnFederalTax;
  }
  /** Change the field to not being actively set: CnFederalTax
   */
  public void unsetCnFederalTax ()
  {
    this._CnFederalTaxSet = false;
  }
  /** See if the field is actively set: CnFederalTax
   * @return boolean whether the field is actively set
   */
  public boolean issetCnFederalTax ()
  {
    return this._CnFederalTaxSet;
  }

  /** Retrieves the CnFederalTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CnFederalTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CnFederalTax field
   */
   public String getCnFederalTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCnFederalTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCnFederalTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCnFederalTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CnFederalTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCnFederalTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the CnFederalTax field from a formatted string
   *
   * @param _value the CnFederalTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CnFederalTax field
   */
   public void setCnFederalTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCnFederalTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCnFederalTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CnFederalTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCnFederalTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCnFederalTaxFromFormattedString");
   }

  /** set the fields value: CnStateTax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCnStateTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CnStateTax", "setCnStateTax");
    }
    this.CnStateTax = value;
    this._CnStateTaxSet = true;
  }
  /** get the value of the field: CnStateTax
   * @return BigInteger the value
   */
  public BigInteger getCnStateTax ()
  {
    return this.CnStateTax;
  }
  /** Change the field to not being actively set: CnStateTax
   */
  public void unsetCnStateTax ()
  {
    this._CnStateTaxSet = false;
  }
  /** See if the field is actively set: CnStateTax
   * @return boolean whether the field is actively set
   */
  public boolean issetCnStateTax ()
  {
    return this._CnStateTaxSet;
  }

  /** Retrieves the CnStateTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CnStateTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CnStateTax field
   */
   public String getCnStateTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCnStateTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCnStateTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCnStateTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CnStateTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCnStateTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the CnStateTax field from a formatted string
   *
   * @param _value the CnStateTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CnStateTax field
   */
   public void setCnStateTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCnStateTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCnStateTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CnStateTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCnStateTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCnStateTaxFromFormattedString");
   }

  /** set the fields value: CnCountyTax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCnCountyTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CnCountyTax", "setCnCountyTax");
    }
    this.CnCountyTax = value;
    this._CnCountyTaxSet = true;
  }
  /** get the value of the field: CnCountyTax
   * @return BigInteger the value
   */
  public BigInteger getCnCountyTax ()
  {
    return this.CnCountyTax;
  }
  /** Change the field to not being actively set: CnCountyTax
   */
  public void unsetCnCountyTax ()
  {
    this._CnCountyTaxSet = false;
  }
  /** See if the field is actively set: CnCountyTax
   * @return boolean whether the field is actively set
   */
  public boolean issetCnCountyTax ()
  {
    return this._CnCountyTaxSet;
  }

  /** Retrieves the CnCountyTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CnCountyTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CnCountyTax field
   */
   public String getCnCountyTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCnCountyTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCnCountyTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCnCountyTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CnCountyTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCnCountyTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the CnCountyTax field from a formatted string
   *
   * @param _value the CnCountyTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CnCountyTax field
   */
   public void setCnCountyTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCnCountyTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCnCountyTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CnCountyTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCnCountyTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCnCountyTaxFromFormattedString");
   }

  /** set the fields value: CnCityTax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCnCityTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CnCityTax", "setCnCityTax");
    }
    this.CnCityTax = value;
    this._CnCityTaxSet = true;
  }
  /** get the value of the field: CnCityTax
   * @return BigInteger the value
   */
  public BigInteger getCnCityTax ()
  {
    return this.CnCityTax;
  }
  /** Change the field to not being actively set: CnCityTax
   */
  public void unsetCnCityTax ()
  {
    this._CnCityTaxSet = false;
  }
  /** See if the field is actively set: CnCityTax
   * @return boolean whether the field is actively set
   */
  public boolean issetCnCityTax ()
  {
    return this._CnCityTaxSet;
  }

  /** Retrieves the CnCityTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CnCityTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CnCityTax field
   */
   public String getCnCityTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCnCityTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCnCityTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCnCityTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CnCityTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCnCityTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the CnCityTax field from a formatted string
   *
   * @param _value the CnCityTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CnCityTax field
   */
   public void setCnCityTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCnCityTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCnCityTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CnCityTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCnCityTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCnCityTaxFromFormattedString");
   }

  /** set the fields value: CnOtherTax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCnOtherTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CnOtherTax", "setCnOtherTax");
    }
    this.CnOtherTax = value;
    this._CnOtherTaxSet = true;
  }
  /** get the value of the field: CnOtherTax
   * @return BigInteger the value
   */
  public BigInteger getCnOtherTax ()
  {
    return this.CnOtherTax;
  }
  /** Change the field to not being actively set: CnOtherTax
   */
  public void unsetCnOtherTax ()
  {
    this._CnOtherTaxSet = false;
  }
  /** See if the field is actively set: CnOtherTax
   * @return boolean whether the field is actively set
   */
  public boolean issetCnOtherTax ()
  {
    return this._CnOtherTaxSet;
  }

  /** Retrieves the CnOtherTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CnOtherTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CnOtherTax field
   */
   public String getCnOtherTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCnOtherTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCnOtherTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCnOtherTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CnOtherTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCnOtherTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the CnOtherTax field from a formatted string
   *
   * @param _value the CnOtherTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CnOtherTax field
   */
   public void setCnOtherTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCnOtherTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCnOtherTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CnOtherTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCnOtherTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCnOtherTaxFromFormattedString");
   }

  /** get the object for ChargeElementObject
   * @return CnChargeElementData[] the object
   */
  public ChargeElementObjectData[] getCnChargeElement ()
  {
    return this.cn_charge_element;
  }
  /** set the object for CnChargeElement
   * @param value the new object
   */
  public void setCnChargeElement (ChargeElementObjectData[] value)
  {
    this.cn_charge_element = value;
  }
  public String toString() {
    return ContractQuoteObjectHelper.toMap(this, null).toString();
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
    
  /** CnTrackingId field */
    if (!nonNullOnly || (CnTrackingId != null)) _CnTrackingIdSet = flag;
  /** CnTrackingIdServ field */
    if (!nonNullOnly || (CnTrackingIdServ != null)) _CnTrackingIdServSet = flag;
  /** CnContractId field */
    if (!nonNullOnly || (CnContractId != null)) _CnContractIdSet = flag;
  /** CnContractType field */
    if (!nonNullOnly || (CnContractType != null)) _CnContractTypeSet = flag;
  /** CnAmount field */
    if (!nonNullOnly || (CnAmount != null)) _CnAmountSet = flag;
  /** CnDiscount field */
    if (!nonNullOnly || (CnDiscount != null)) _CnDiscountSet = flag;
  /** CnFederalTax field */
    if (!nonNullOnly || (CnFederalTax != null)) _CnFederalTaxSet = flag;
  /** CnStateTax field */
    if (!nonNullOnly || (CnStateTax != null)) _CnStateTaxSet = flag;
  /** CnCountyTax field */
    if (!nonNullOnly || (CnCountyTax != null)) _CnCountyTaxSet = flag;
  /** CnCityTax field */
    if (!nonNullOnly || (CnCityTax != null)) _CnCityTaxSet = flag;
  /** CnOtherTax field */
    if (!nonNullOnly || (CnOtherTax != null)) _CnOtherTaxSet = flag;
  /** cn_charge_element object */
  
    if (cn_charge_element != null) {
      for (int i = 0; i < cn_charge_element.length; i++) {
        if(cn_charge_element[i] != null) cn_charge_element[i].resetFlags(flag, nonNullOnly);
      }
    }
    
  }
}
