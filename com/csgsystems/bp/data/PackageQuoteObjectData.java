/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PackageQuoteObjectData.java
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
  
/** PackageQuoteObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class PackageQuoteObjectData extends BaseObjectData implements Serializable
{

  /** PkPackageInstId field */
  public    Integer PkPackageInstId  = null;
  protected boolean _PkPackageInstIdSet = false;
  /** PkPackageInstIdServ field */
  public    Integer PkPackageInstIdServ  = null;
  protected boolean _PkPackageInstIdServSet = false;
  /** PkPackageId field */
  public    Integer PkPackageId  = null;
  protected boolean _PkPackageIdSet = false;
  /** PkAmount field */
  public    BigInteger PkAmount  = null;
  protected boolean _PkAmountSet = false;
  /** PkDiscount field */
  public    BigInteger PkDiscount  = null;
  protected boolean _PkDiscountSet = false;
  /** PkFederalTax field */
  public    BigInteger PkFederalTax  = null;
  protected boolean _PkFederalTaxSet = false;
  /** PkStateTax field */
  public    BigInteger PkStateTax  = null;
  protected boolean _PkStateTaxSet = false;
  /** PkCountyTax field */
  public    BigInteger PkCountyTax  = null;
  protected boolean _PkCountyTaxSet = false;
  /** PkCityTax field */
  public    BigInteger PkCityTax  = null;
  protected boolean _PkCityTaxSet = false;
  /** PkOtherTax field */
  public    BigInteger PkOtherTax  = null;
  protected boolean _PkOtherTaxSet = false;
  /** pk_component_quote object */
  public ComponentQuoteObjectData[] pk_component_quote = null;

  private String _objName = "PackageQuoteObjectData";
  /** Default constructor */
  public PackageQuoteObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public PackageQuoteObjectData (PackageQuoteObjectData other)
  {

    if (other == null) return;
    this.PkPackageInstId = other.PkPackageInstId;
    this._PkPackageInstIdSet = other._PkPackageInstIdSet;
    this.PkPackageInstIdServ = other.PkPackageInstIdServ;
    this._PkPackageInstIdServSet = other._PkPackageInstIdServSet;
    this.PkPackageId = other.PkPackageId;
    this._PkPackageIdSet = other._PkPackageIdSet;
    this.PkAmount = other.PkAmount;
    this._PkAmountSet = other._PkAmountSet;
    this.PkDiscount = other.PkDiscount;
    this._PkDiscountSet = other._PkDiscountSet;
    this.PkFederalTax = other.PkFederalTax;
    this._PkFederalTaxSet = other._PkFederalTaxSet;
    this.PkStateTax = other.PkStateTax;
    this._PkStateTaxSet = other._PkStateTaxSet;
    this.PkCountyTax = other.PkCountyTax;
    this._PkCountyTaxSet = other._PkCountyTaxSet;
    this.PkCityTax = other.PkCityTax;
    this._PkCityTaxSet = other._PkCityTaxSet;
    this.PkOtherTax = other.PkOtherTax;
    this._PkOtherTaxSet = other._PkOtherTaxSet;
    if (other.pk_component_quote != null)
    {
      this.pk_component_quote = new ComponentQuoteObjectData[other.pk_component_quote.length];
      for (int i = 0; other.pk_component_quote != null && i < other.pk_component_quote.length; i++)
      {
        if (other.pk_component_quote[i] != null)  this.pk_component_quote[i] = new ComponentQuoteObjectData (other.pk_component_quote[i]);
      }
    }

  }

  /** set the fields value: PkPackageInstId
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPkPackageInstId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PkPackageInstId", "setPkPackageInstId");
    }
    this.PkPackageInstId = value;
    this._PkPackageInstIdSet = true;
  }
  /** get the value of the field: PkPackageInstId
   * @return Integer the value
   */
  public Integer getPkPackageInstId ()
  {
    return this.PkPackageInstId;
  }
  /** Change the field to not being actively set: PkPackageInstId
   */
  public void unsetPkPackageInstId ()
  {
    this._PkPackageInstIdSet = false;
  }
  /** See if the field is actively set: PkPackageInstId
   * @return boolean whether the field is actively set
   */
  public boolean issetPkPackageInstId ()
  {
    return this._PkPackageInstIdSet;
  }

  /** Retrieves the PkPackageInstId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PkPackageInstId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PkPackageInstId field
   */
   public String getPkPackageInstIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPkPackageInstIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPkPackageInstIdAsFormattedString");
       return fmtMgr.formatNumber(this.getPkPackageInstId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PkPackageInstId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPkPackageInstIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the PkPackageInstId field from a formatted string
   *
   * @param _value the PkPackageInstId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PkPackageInstId field
   */
   public void setPkPackageInstIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPkPackageInstIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPkPackageInstId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PkPackageInstId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPkPackageInstIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPkPackageInstIdFromFormattedString");
   }

  /** set the fields value: PkPackageInstIdServ
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPkPackageInstIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PkPackageInstIdServ", "setPkPackageInstIdServ");
    }
    this.PkPackageInstIdServ = value;
    this._PkPackageInstIdServSet = true;
  }
  /** get the value of the field: PkPackageInstIdServ
   * @return Integer the value
   */
  public Integer getPkPackageInstIdServ ()
  {
    return this.PkPackageInstIdServ;
  }
  /** Change the field to not being actively set: PkPackageInstIdServ
   */
  public void unsetPkPackageInstIdServ ()
  {
    this._PkPackageInstIdServSet = false;
  }
  /** See if the field is actively set: PkPackageInstIdServ
   * @return boolean whether the field is actively set
   */
  public boolean issetPkPackageInstIdServ ()
  {
    return this._PkPackageInstIdServSet;
  }

  /** Retrieves the PkPackageInstIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PkPackageInstIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PkPackageInstIdServ field
   */
   public String getPkPackageInstIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPkPackageInstIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPkPackageInstIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getPkPackageInstIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PkPackageInstIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPkPackageInstIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the PkPackageInstIdServ field from a formatted string
   *
   * @param _value the PkPackageInstIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PkPackageInstIdServ field
   */
   public void setPkPackageInstIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPkPackageInstIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPkPackageInstIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PkPackageInstIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPkPackageInstIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPkPackageInstIdServFromFormattedString");
   }

  /** set the fields value: PkPackageId
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPkPackageId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PkPackageId", "setPkPackageId");
    }
    this.PkPackageId = value;
    this._PkPackageIdSet = true;
  }
  /** get the value of the field: PkPackageId
   * @return Integer the value
   */
  public Integer getPkPackageId ()
  {
    return this.PkPackageId;
  }
  /** Change the field to not being actively set: PkPackageId
   */
  public void unsetPkPackageId ()
  {
    this._PkPackageIdSet = false;
  }
  /** See if the field is actively set: PkPackageId
   * @return boolean whether the field is actively set
   */
  public boolean issetPkPackageId ()
  {
    return this._PkPackageIdSet;
  }

  /** Retrieves the PkPackageId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PkPackageId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PkPackageId field
   */
   public String getPkPackageIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPkPackageIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPkPackageIdAsFormattedString");
       return fmtMgr.formatNumber(this.getPkPackageId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PkPackageId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPkPackageIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the PkPackageId field from a formatted string
   *
   * @param _value the PkPackageId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PkPackageId field
   */
   public void setPkPackageIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPkPackageIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPkPackageId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PkPackageId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPkPackageIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPkPackageIdFromFormattedString");
   }

  /** set the fields value: PkAmount
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPkAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PkAmount", "setPkAmount");
    }
    this.PkAmount = value;
    this._PkAmountSet = true;
  }
  /** get the value of the field: PkAmount
   * @return BigInteger the value
   */
  public BigInteger getPkAmount ()
  {
    return this.PkAmount;
  }
  /** Change the field to not being actively set: PkAmount
   */
  public void unsetPkAmount ()
  {
    this._PkAmountSet = false;
  }
  /** See if the field is actively set: PkAmount
   * @return boolean whether the field is actively set
   */
  public boolean issetPkAmount ()
  {
    return this._PkAmountSet;
  }

  /** Retrieves the PkAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PkAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PkAmount field
   */
   public String getPkAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPkAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPkAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getPkAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PkAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPkAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the PkAmount field from a formatted string
   *
   * @param _value the PkAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PkAmount field
   */
   public void setPkAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPkAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPkAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PkAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPkAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPkAmountFromFormattedString");
   }

  /** set the fields value: PkDiscount
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPkDiscount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PkDiscount", "setPkDiscount");
    }
    this.PkDiscount = value;
    this._PkDiscountSet = true;
  }
  /** get the value of the field: PkDiscount
   * @return BigInteger the value
   */
  public BigInteger getPkDiscount ()
  {
    return this.PkDiscount;
  }
  /** Change the field to not being actively set: PkDiscount
   */
  public void unsetPkDiscount ()
  {
    this._PkDiscountSet = false;
  }
  /** See if the field is actively set: PkDiscount
   * @return boolean whether the field is actively set
   */
  public boolean issetPkDiscount ()
  {
    return this._PkDiscountSet;
  }

  /** Retrieves the PkDiscount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PkDiscount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PkDiscount field
   */
   public String getPkDiscountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPkDiscountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPkDiscountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getPkDiscount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PkDiscount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPkDiscountAsFormattedString");
       throw x;
     }
   }
  /** Sets the PkDiscount field from a formatted string
   *
   * @param _value the PkDiscount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PkDiscount field
   */
   public void setPkDiscountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPkDiscountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPkDiscount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PkDiscount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPkDiscountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPkDiscountFromFormattedString");
   }

  /** set the fields value: PkFederalTax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPkFederalTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PkFederalTax", "setPkFederalTax");
    }
    this.PkFederalTax = value;
    this._PkFederalTaxSet = true;
  }
  /** get the value of the field: PkFederalTax
   * @return BigInteger the value
   */
  public BigInteger getPkFederalTax ()
  {
    return this.PkFederalTax;
  }
  /** Change the field to not being actively set: PkFederalTax
   */
  public void unsetPkFederalTax ()
  {
    this._PkFederalTaxSet = false;
  }
  /** See if the field is actively set: PkFederalTax
   * @return boolean whether the field is actively set
   */
  public boolean issetPkFederalTax ()
  {
    return this._PkFederalTaxSet;
  }

  /** Retrieves the PkFederalTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PkFederalTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PkFederalTax field
   */
   public String getPkFederalTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPkFederalTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPkFederalTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getPkFederalTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PkFederalTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPkFederalTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the PkFederalTax field from a formatted string
   *
   * @param _value the PkFederalTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PkFederalTax field
   */
   public void setPkFederalTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPkFederalTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPkFederalTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PkFederalTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPkFederalTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPkFederalTaxFromFormattedString");
   }

  /** set the fields value: PkStateTax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPkStateTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PkStateTax", "setPkStateTax");
    }
    this.PkStateTax = value;
    this._PkStateTaxSet = true;
  }
  /** get the value of the field: PkStateTax
   * @return BigInteger the value
   */
  public BigInteger getPkStateTax ()
  {
    return this.PkStateTax;
  }
  /** Change the field to not being actively set: PkStateTax
   */
  public void unsetPkStateTax ()
  {
    this._PkStateTaxSet = false;
  }
  /** See if the field is actively set: PkStateTax
   * @return boolean whether the field is actively set
   */
  public boolean issetPkStateTax ()
  {
    return this._PkStateTaxSet;
  }

  /** Retrieves the PkStateTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PkStateTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PkStateTax field
   */
   public String getPkStateTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPkStateTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPkStateTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getPkStateTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PkStateTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPkStateTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the PkStateTax field from a formatted string
   *
   * @param _value the PkStateTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PkStateTax field
   */
   public void setPkStateTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPkStateTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPkStateTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PkStateTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPkStateTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPkStateTaxFromFormattedString");
   }

  /** set the fields value: PkCountyTax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPkCountyTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PkCountyTax", "setPkCountyTax");
    }
    this.PkCountyTax = value;
    this._PkCountyTaxSet = true;
  }
  /** get the value of the field: PkCountyTax
   * @return BigInteger the value
   */
  public BigInteger getPkCountyTax ()
  {
    return this.PkCountyTax;
  }
  /** Change the field to not being actively set: PkCountyTax
   */
  public void unsetPkCountyTax ()
  {
    this._PkCountyTaxSet = false;
  }
  /** See if the field is actively set: PkCountyTax
   * @return boolean whether the field is actively set
   */
  public boolean issetPkCountyTax ()
  {
    return this._PkCountyTaxSet;
  }

  /** Retrieves the PkCountyTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PkCountyTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PkCountyTax field
   */
   public String getPkCountyTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPkCountyTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPkCountyTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getPkCountyTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PkCountyTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPkCountyTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the PkCountyTax field from a formatted string
   *
   * @param _value the PkCountyTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PkCountyTax field
   */
   public void setPkCountyTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPkCountyTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPkCountyTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PkCountyTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPkCountyTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPkCountyTaxFromFormattedString");
   }

  /** set the fields value: PkCityTax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPkCityTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PkCityTax", "setPkCityTax");
    }
    this.PkCityTax = value;
    this._PkCityTaxSet = true;
  }
  /** get the value of the field: PkCityTax
   * @return BigInteger the value
   */
  public BigInteger getPkCityTax ()
  {
    return this.PkCityTax;
  }
  /** Change the field to not being actively set: PkCityTax
   */
  public void unsetPkCityTax ()
  {
    this._PkCityTaxSet = false;
  }
  /** See if the field is actively set: PkCityTax
   * @return boolean whether the field is actively set
   */
  public boolean issetPkCityTax ()
  {
    return this._PkCityTaxSet;
  }

  /** Retrieves the PkCityTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PkCityTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PkCityTax field
   */
   public String getPkCityTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPkCityTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPkCityTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getPkCityTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PkCityTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPkCityTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the PkCityTax field from a formatted string
   *
   * @param _value the PkCityTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PkCityTax field
   */
   public void setPkCityTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPkCityTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPkCityTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PkCityTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPkCityTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPkCityTaxFromFormattedString");
   }

  /** set the fields value: PkOtherTax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPkOtherTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PkOtherTax", "setPkOtherTax");
    }
    this.PkOtherTax = value;
    this._PkOtherTaxSet = true;
  }
  /** get the value of the field: PkOtherTax
   * @return BigInteger the value
   */
  public BigInteger getPkOtherTax ()
  {
    return this.PkOtherTax;
  }
  /** Change the field to not being actively set: PkOtherTax
   */
  public void unsetPkOtherTax ()
  {
    this._PkOtherTaxSet = false;
  }
  /** See if the field is actively set: PkOtherTax
   * @return boolean whether the field is actively set
   */
  public boolean issetPkOtherTax ()
  {
    return this._PkOtherTaxSet;
  }

  /** Retrieves the PkOtherTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PkOtherTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PkOtherTax field
   */
   public String getPkOtherTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPkOtherTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPkOtherTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getPkOtherTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PkOtherTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPkOtherTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the PkOtherTax field from a formatted string
   *
   * @param _value the PkOtherTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PkOtherTax field
   */
   public void setPkOtherTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPkOtherTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPkOtherTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PkOtherTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPkOtherTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPkOtherTaxFromFormattedString");
   }

  /** get the object for ComponentQuoteObject
   * @return PkComponentQuoteData[] the object
   */
  public ComponentQuoteObjectData[] getPkComponentQuote ()
  {
    return this.pk_component_quote;
  }
  /** set the object for PkComponentQuote
   * @param value the new object
   */
  public void setPkComponentQuote (ComponentQuoteObjectData[] value)
  {
    this.pk_component_quote = value;
  }
  public String toString() {
    return PackageQuoteObjectHelper.toMap(this, null).toString();
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
    
  /** PkPackageInstId field */
    if (!nonNullOnly || (PkPackageInstId != null)) _PkPackageInstIdSet = flag;
  /** PkPackageInstIdServ field */
    if (!nonNullOnly || (PkPackageInstIdServ != null)) _PkPackageInstIdServSet = flag;
  /** PkPackageId field */
    if (!nonNullOnly || (PkPackageId != null)) _PkPackageIdSet = flag;
  /** PkAmount field */
    if (!nonNullOnly || (PkAmount != null)) _PkAmountSet = flag;
  /** PkDiscount field */
    if (!nonNullOnly || (PkDiscount != null)) _PkDiscountSet = flag;
  /** PkFederalTax field */
    if (!nonNullOnly || (PkFederalTax != null)) _PkFederalTaxSet = flag;
  /** PkStateTax field */
    if (!nonNullOnly || (PkStateTax != null)) _PkStateTaxSet = flag;
  /** PkCountyTax field */
    if (!nonNullOnly || (PkCountyTax != null)) _PkCountyTaxSet = flag;
  /** PkCityTax field */
    if (!nonNullOnly || (PkCityTax != null)) _PkCityTaxSet = flag;
  /** PkOtherTax field */
    if (!nonNullOnly || (PkOtherTax != null)) _PkOtherTaxSet = flag;
  /** pk_component_quote object */
  
    if (pk_component_quote != null) {
      for (int i = 0; i < pk_component_quote.length; i++) {
        if(pk_component_quote[i] != null) pk_component_quote[i].resetFlags(flag, nonNullOnly);
      }
    }
    
  }
}
