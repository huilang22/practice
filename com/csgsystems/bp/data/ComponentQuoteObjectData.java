/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ComponentQuoteObjectData.java
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
  
/** ComponentQuoteObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class ComponentQuoteObjectData extends BaseObjectData implements Serializable
{

  /** CmComponentInstId field */
  public    Integer CmComponentInstId  = null;
  protected boolean _CmComponentInstIdSet = false;
  /** CmComponentInstIdServ field */
  public    Integer CmComponentInstIdServ  = null;
  protected boolean _CmComponentInstIdServSet = false;
  /** CmComponentId field */
  public    Integer CmComponentId  = null;
  protected boolean _CmComponentIdSet = false;
  /** CmAmount field */
  public    BigInteger CmAmount  = null;
  protected boolean _CmAmountSet = false;
  /** CmDiscount field */
  public    BigInteger CmDiscount  = null;
  protected boolean _CmDiscountSet = false;
  /** CmFederalTax field */
  public    BigInteger CmFederalTax  = null;
  protected boolean _CmFederalTaxSet = false;
  /** CmStateTax field */
  public    BigInteger CmStateTax  = null;
  protected boolean _CmStateTaxSet = false;
  /** CmCountyTax field */
  public    BigInteger CmCountyTax  = null;
  protected boolean _CmCountyTaxSet = false;
  /** CmCityTax field */
  public    BigInteger CmCityTax  = null;
  protected boolean _CmCityTaxSet = false;
  /** CmOtherTax field */
  public    BigInteger CmOtherTax  = null;
  protected boolean _CmOtherTaxSet = false;
  /** cm_charge_element object */
  public ChargeElementObjectData[] cm_charge_element = null;

  /** cm_contract_quote object */
  public ContractQuoteObjectData[] cm_contract_quote = null;

  private String _objName = "ComponentQuoteObjectData";
  /** Default constructor */
  public ComponentQuoteObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public ComponentQuoteObjectData (ComponentQuoteObjectData other)
  {

    if (other == null) return;
    this.CmComponentInstId = other.CmComponentInstId;
    this._CmComponentInstIdSet = other._CmComponentInstIdSet;
    this.CmComponentInstIdServ = other.CmComponentInstIdServ;
    this._CmComponentInstIdServSet = other._CmComponentInstIdServSet;
    this.CmComponentId = other.CmComponentId;
    this._CmComponentIdSet = other._CmComponentIdSet;
    this.CmAmount = other.CmAmount;
    this._CmAmountSet = other._CmAmountSet;
    this.CmDiscount = other.CmDiscount;
    this._CmDiscountSet = other._CmDiscountSet;
    this.CmFederalTax = other.CmFederalTax;
    this._CmFederalTaxSet = other._CmFederalTaxSet;
    this.CmStateTax = other.CmStateTax;
    this._CmStateTaxSet = other._CmStateTaxSet;
    this.CmCountyTax = other.CmCountyTax;
    this._CmCountyTaxSet = other._CmCountyTaxSet;
    this.CmCityTax = other.CmCityTax;
    this._CmCityTaxSet = other._CmCityTaxSet;
    this.CmOtherTax = other.CmOtherTax;
    this._CmOtherTaxSet = other._CmOtherTaxSet;
    if (other.cm_charge_element != null)
    {
      this.cm_charge_element = new ChargeElementObjectData[other.cm_charge_element.length];
      for (int i = 0; other.cm_charge_element != null && i < other.cm_charge_element.length; i++)
      {
        if (other.cm_charge_element[i] != null)  this.cm_charge_element[i] = new ChargeElementObjectData (other.cm_charge_element[i]);
      }
    }

    if (other.cm_contract_quote != null)
    {
      this.cm_contract_quote = new ContractQuoteObjectData[other.cm_contract_quote.length];
      for (int i = 0; other.cm_contract_quote != null && i < other.cm_contract_quote.length; i++)
      {
        if (other.cm_contract_quote[i] != null)  this.cm_contract_quote[i] = new ContractQuoteObjectData (other.cm_contract_quote[i]);
      }
    }

  }

  /** set the fields value: CmComponentInstId
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCmComponentInstId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CmComponentInstId", "setCmComponentInstId");
    }
    this.CmComponentInstId = value;
    this._CmComponentInstIdSet = true;
  }
  /** get the value of the field: CmComponentInstId
   * @return Integer the value
   */
  public Integer getCmComponentInstId ()
  {
    return this.CmComponentInstId;
  }
  /** Change the field to not being actively set: CmComponentInstId
   */
  public void unsetCmComponentInstId ()
  {
    this._CmComponentInstIdSet = false;
  }
  /** See if the field is actively set: CmComponentInstId
   * @return boolean whether the field is actively set
   */
  public boolean issetCmComponentInstId ()
  {
    return this._CmComponentInstIdSet;
  }

  /** Retrieves the CmComponentInstId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CmComponentInstId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CmComponentInstId field
   */
   public String getCmComponentInstIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmComponentInstIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCmComponentInstIdAsFormattedString");
       return fmtMgr.formatNumber(this.getCmComponentInstId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CmComponentInstId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCmComponentInstIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the CmComponentInstId field from a formatted string
   *
   * @param _value the CmComponentInstId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CmComponentInstId field
   */
   public void setCmComponentInstIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmComponentInstIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCmComponentInstId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CmComponentInstId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCmComponentInstIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCmComponentInstIdFromFormattedString");
   }

  /** set the fields value: CmComponentInstIdServ
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCmComponentInstIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CmComponentInstIdServ", "setCmComponentInstIdServ");
    }
    this.CmComponentInstIdServ = value;
    this._CmComponentInstIdServSet = true;
  }
  /** get the value of the field: CmComponentInstIdServ
   * @return Integer the value
   */
  public Integer getCmComponentInstIdServ ()
  {
    return this.CmComponentInstIdServ;
  }
  /** Change the field to not being actively set: CmComponentInstIdServ
   */
  public void unsetCmComponentInstIdServ ()
  {
    this._CmComponentInstIdServSet = false;
  }
  /** See if the field is actively set: CmComponentInstIdServ
   * @return boolean whether the field is actively set
   */
  public boolean issetCmComponentInstIdServ ()
  {
    return this._CmComponentInstIdServSet;
  }

  /** Retrieves the CmComponentInstIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CmComponentInstIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CmComponentInstIdServ field
   */
   public String getCmComponentInstIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmComponentInstIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCmComponentInstIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getCmComponentInstIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CmComponentInstIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCmComponentInstIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the CmComponentInstIdServ field from a formatted string
   *
   * @param _value the CmComponentInstIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CmComponentInstIdServ field
   */
   public void setCmComponentInstIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmComponentInstIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCmComponentInstIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CmComponentInstIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCmComponentInstIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCmComponentInstIdServFromFormattedString");
   }

  /** set the fields value: CmComponentId
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCmComponentId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CmComponentId", "setCmComponentId");
    }
    this.CmComponentId = value;
    this._CmComponentIdSet = true;
  }
  /** get the value of the field: CmComponentId
   * @return Integer the value
   */
  public Integer getCmComponentId ()
  {
    return this.CmComponentId;
  }
  /** Change the field to not being actively set: CmComponentId
   */
  public void unsetCmComponentId ()
  {
    this._CmComponentIdSet = false;
  }
  /** See if the field is actively set: CmComponentId
   * @return boolean whether the field is actively set
   */
  public boolean issetCmComponentId ()
  {
    return this._CmComponentIdSet;
  }

  /** Retrieves the CmComponentId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CmComponentId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CmComponentId field
   */
   public String getCmComponentIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmComponentIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCmComponentIdAsFormattedString");
       return fmtMgr.formatNumber(this.getCmComponentId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CmComponentId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCmComponentIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the CmComponentId field from a formatted string
   *
   * @param _value the CmComponentId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CmComponentId field
   */
   public void setCmComponentIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmComponentIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCmComponentId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CmComponentId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCmComponentIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCmComponentIdFromFormattedString");
   }

  /** set the fields value: CmAmount
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCmAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CmAmount", "setCmAmount");
    }
    this.CmAmount = value;
    this._CmAmountSet = true;
  }
  /** get the value of the field: CmAmount
   * @return BigInteger the value
   */
  public BigInteger getCmAmount ()
  {
    return this.CmAmount;
  }
  /** Change the field to not being actively set: CmAmount
   */
  public void unsetCmAmount ()
  {
    this._CmAmountSet = false;
  }
  /** See if the field is actively set: CmAmount
   * @return boolean whether the field is actively set
   */
  public boolean issetCmAmount ()
  {
    return this._CmAmountSet;
  }

  /** Retrieves the CmAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CmAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CmAmount field
   */
   public String getCmAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCmAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCmAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CmAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCmAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the CmAmount field from a formatted string
   *
   * @param _value the CmAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CmAmount field
   */
   public void setCmAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCmAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CmAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCmAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCmAmountFromFormattedString");
   }

  /** set the fields value: CmDiscount
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCmDiscount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CmDiscount", "setCmDiscount");
    }
    this.CmDiscount = value;
    this._CmDiscountSet = true;
  }
  /** get the value of the field: CmDiscount
   * @return BigInteger the value
   */
  public BigInteger getCmDiscount ()
  {
    return this.CmDiscount;
  }
  /** Change the field to not being actively set: CmDiscount
   */
  public void unsetCmDiscount ()
  {
    this._CmDiscountSet = false;
  }
  /** See if the field is actively set: CmDiscount
   * @return boolean whether the field is actively set
   */
  public boolean issetCmDiscount ()
  {
    return this._CmDiscountSet;
  }

  /** Retrieves the CmDiscount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CmDiscount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CmDiscount field
   */
   public String getCmDiscountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmDiscountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCmDiscountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCmDiscount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CmDiscount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCmDiscountAsFormattedString");
       throw x;
     }
   }
  /** Sets the CmDiscount field from a formatted string
   *
   * @param _value the CmDiscount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CmDiscount field
   */
   public void setCmDiscountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmDiscountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCmDiscount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CmDiscount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCmDiscountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCmDiscountFromFormattedString");
   }

  /** set the fields value: CmFederalTax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCmFederalTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CmFederalTax", "setCmFederalTax");
    }
    this.CmFederalTax = value;
    this._CmFederalTaxSet = true;
  }
  /** get the value of the field: CmFederalTax
   * @return BigInteger the value
   */
  public BigInteger getCmFederalTax ()
  {
    return this.CmFederalTax;
  }
  /** Change the field to not being actively set: CmFederalTax
   */
  public void unsetCmFederalTax ()
  {
    this._CmFederalTaxSet = false;
  }
  /** See if the field is actively set: CmFederalTax
   * @return boolean whether the field is actively set
   */
  public boolean issetCmFederalTax ()
  {
    return this._CmFederalTaxSet;
  }

  /** Retrieves the CmFederalTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CmFederalTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CmFederalTax field
   */
   public String getCmFederalTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmFederalTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCmFederalTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCmFederalTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CmFederalTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCmFederalTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the CmFederalTax field from a formatted string
   *
   * @param _value the CmFederalTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CmFederalTax field
   */
   public void setCmFederalTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmFederalTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCmFederalTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CmFederalTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCmFederalTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCmFederalTaxFromFormattedString");
   }

  /** set the fields value: CmStateTax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCmStateTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CmStateTax", "setCmStateTax");
    }
    this.CmStateTax = value;
    this._CmStateTaxSet = true;
  }
  /** get the value of the field: CmStateTax
   * @return BigInteger the value
   */
  public BigInteger getCmStateTax ()
  {
    return this.CmStateTax;
  }
  /** Change the field to not being actively set: CmStateTax
   */
  public void unsetCmStateTax ()
  {
    this._CmStateTaxSet = false;
  }
  /** See if the field is actively set: CmStateTax
   * @return boolean whether the field is actively set
   */
  public boolean issetCmStateTax ()
  {
    return this._CmStateTaxSet;
  }

  /** Retrieves the CmStateTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CmStateTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CmStateTax field
   */
   public String getCmStateTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmStateTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCmStateTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCmStateTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CmStateTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCmStateTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the CmStateTax field from a formatted string
   *
   * @param _value the CmStateTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CmStateTax field
   */
   public void setCmStateTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmStateTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCmStateTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CmStateTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCmStateTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCmStateTaxFromFormattedString");
   }

  /** set the fields value: CmCountyTax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCmCountyTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CmCountyTax", "setCmCountyTax");
    }
    this.CmCountyTax = value;
    this._CmCountyTaxSet = true;
  }
  /** get the value of the field: CmCountyTax
   * @return BigInteger the value
   */
  public BigInteger getCmCountyTax ()
  {
    return this.CmCountyTax;
  }
  /** Change the field to not being actively set: CmCountyTax
   */
  public void unsetCmCountyTax ()
  {
    this._CmCountyTaxSet = false;
  }
  /** See if the field is actively set: CmCountyTax
   * @return boolean whether the field is actively set
   */
  public boolean issetCmCountyTax ()
  {
    return this._CmCountyTaxSet;
  }

  /** Retrieves the CmCountyTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CmCountyTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CmCountyTax field
   */
   public String getCmCountyTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmCountyTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCmCountyTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCmCountyTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CmCountyTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCmCountyTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the CmCountyTax field from a formatted string
   *
   * @param _value the CmCountyTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CmCountyTax field
   */
   public void setCmCountyTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmCountyTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCmCountyTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CmCountyTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCmCountyTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCmCountyTaxFromFormattedString");
   }

  /** set the fields value: CmCityTax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCmCityTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CmCityTax", "setCmCityTax");
    }
    this.CmCityTax = value;
    this._CmCityTaxSet = true;
  }
  /** get the value of the field: CmCityTax
   * @return BigInteger the value
   */
  public BigInteger getCmCityTax ()
  {
    return this.CmCityTax;
  }
  /** Change the field to not being actively set: CmCityTax
   */
  public void unsetCmCityTax ()
  {
    this._CmCityTaxSet = false;
  }
  /** See if the field is actively set: CmCityTax
   * @return boolean whether the field is actively set
   */
  public boolean issetCmCityTax ()
  {
    return this._CmCityTaxSet;
  }

  /** Retrieves the CmCityTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CmCityTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CmCityTax field
   */
   public String getCmCityTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmCityTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCmCityTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCmCityTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CmCityTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCmCityTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the CmCityTax field from a formatted string
   *
   * @param _value the CmCityTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CmCityTax field
   */
   public void setCmCityTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmCityTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCmCityTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CmCityTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCmCityTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCmCityTaxFromFormattedString");
   }

  /** set the fields value: CmOtherTax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCmOtherTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CmOtherTax", "setCmOtherTax");
    }
    this.CmOtherTax = value;
    this._CmOtherTaxSet = true;
  }
  /** get the value of the field: CmOtherTax
   * @return BigInteger the value
   */
  public BigInteger getCmOtherTax ()
  {
    return this.CmOtherTax;
  }
  /** Change the field to not being actively set: CmOtherTax
   */
  public void unsetCmOtherTax ()
  {
    this._CmOtherTaxSet = false;
  }
  /** See if the field is actively set: CmOtherTax
   * @return boolean whether the field is actively set
   */
  public boolean issetCmOtherTax ()
  {
    return this._CmOtherTaxSet;
  }

  /** Retrieves the CmOtherTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CmOtherTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CmOtherTax field
   */
   public String getCmOtherTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmOtherTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCmOtherTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCmOtherTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CmOtherTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCmOtherTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the CmOtherTax field from a formatted string
   *
   * @param _value the CmOtherTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CmOtherTax field
   */
   public void setCmOtherTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmOtherTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCmOtherTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CmOtherTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCmOtherTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCmOtherTaxFromFormattedString");
   }

  /** get the object for ChargeElementObject
   * @return CmChargeElementData[] the object
   */
  public ChargeElementObjectData[] getCmChargeElement ()
  {
    return this.cm_charge_element;
  }
  /** set the object for CmChargeElement
   * @param value the new object
   */
  public void setCmChargeElement (ChargeElementObjectData[] value)
  {
    this.cm_charge_element = value;
  }
  /** get the object for ContractQuoteObject
   * @return CmContractQuoteData[] the object
   */
  public ContractQuoteObjectData[] getCmContractQuote ()
  {
    return this.cm_contract_quote;
  }
  /** set the object for CmContractQuote
   * @param value the new object
   */
  public void setCmContractQuote (ContractQuoteObjectData[] value)
  {
    this.cm_contract_quote = value;
  }
  public String toString() {
    return ComponentQuoteObjectHelper.toMap(this, null).toString();
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
    
  /** CmComponentInstId field */
    if (!nonNullOnly || (CmComponentInstId != null)) _CmComponentInstIdSet = flag;
  /** CmComponentInstIdServ field */
    if (!nonNullOnly || (CmComponentInstIdServ != null)) _CmComponentInstIdServSet = flag;
  /** CmComponentId field */
    if (!nonNullOnly || (CmComponentId != null)) _CmComponentIdSet = flag;
  /** CmAmount field */
    if (!nonNullOnly || (CmAmount != null)) _CmAmountSet = flag;
  /** CmDiscount field */
    if (!nonNullOnly || (CmDiscount != null)) _CmDiscountSet = flag;
  /** CmFederalTax field */
    if (!nonNullOnly || (CmFederalTax != null)) _CmFederalTaxSet = flag;
  /** CmStateTax field */
    if (!nonNullOnly || (CmStateTax != null)) _CmStateTaxSet = flag;
  /** CmCountyTax field */
    if (!nonNullOnly || (CmCountyTax != null)) _CmCountyTaxSet = flag;
  /** CmCityTax field */
    if (!nonNullOnly || (CmCityTax != null)) _CmCityTaxSet = flag;
  /** CmOtherTax field */
    if (!nonNullOnly || (CmOtherTax != null)) _CmOtherTaxSet = flag;
  /** cm_charge_element object */
  
    if (cm_charge_element != null) {
      for (int i = 0; i < cm_charge_element.length; i++) {
        if(cm_charge_element[i] != null) cm_charge_element[i].resetFlags(flag, nonNullOnly);
      }
    }
    
  /** cm_contract_quote object */
  
    if (cm_contract_quote != null) {
      for (int i = 0; i < cm_contract_quote.length; i++) {
        if(cm_contract_quote[i] != null) cm_contract_quote[i].resetFlags(flag, nonNullOnly);
      }
    }
    
  }
}
