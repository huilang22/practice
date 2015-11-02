/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BalanceLineItemBulkAdjustmentGetOutputData.java
 * Definition File: Catalog/BalanceLineItemBulkAdjustment.xml
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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;

import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.format.FieldFormatMgr;

import com.csgsystems.api.enumeration.EnumeratedDataMgr;
import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;
import com.csgsystems.bp.data.*;
import com.csgsystems.bat.data.*;
import com.csgsystems.bp.data.*;
import com.csgsystems.bp.data.*;

/** class to support methods which have more than one output field. */
@XmlRootElement(namespace ="http://.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class BalanceLineItemBulkAdjustmentGetOutputData implements ArubaObjectData, Serializable
{
  /** _BulkAdjustment object */
  public BulkAdjustmentObjectData _BulkAdjustment = null;

  /** ___BatchRequest object */
  public BatchRequestObjectData ___BatchRequest = null;

  /** ______BalanceLineItem object */
  public BalanceLineItemObjectData[] ______BalanceLineItem = null;

  /** XMLFileName field */
  public    String XMLFileName  = null;
  protected boolean _XMLFileNameSet = false;
  /** CDFFileName field */
  public    String CDFFileName  = null;
  protected boolean _CDFFileNameSet = false;
  /** _BalanceLineItemQuery object */
  public BalanceLineItemQueryObjectData _BalanceLineItemQuery = null;

  private String _objName = "BalanceLineItemBulkAdjustmentGetOutputData";
  /** default constructor */
  public BalanceLineItemBulkAdjustmentGetOutputData ()
  {
  }
  /** copy constructor
   * @param other the object to copy.
   */
  public BalanceLineItemBulkAdjustmentGetOutputData (BalanceLineItemBulkAdjustmentGetOutputData other)
  {
    if (other == null) return;
    if (other._BulkAdjustment != null)
    {
      this._BulkAdjustment = new BulkAdjustmentObjectData (other._BulkAdjustment);
    }

    if (other.___BatchRequest != null)
    {
      this.___BatchRequest = new BatchRequestObjectData (other.___BatchRequest);
    }

    if (other.______BalanceLineItem != null)
    {
      this.______BalanceLineItem = new BalanceLineItemObjectData[other.______BalanceLineItem.length];
      for (int i = 0; other.______BalanceLineItem != null && i < other.______BalanceLineItem.length; i++)
      {
        if (other.______BalanceLineItem[i] != null)  this.______BalanceLineItem[i] = new BalanceLineItemObjectData (other.______BalanceLineItem[i]);
      }
    }

    this.XMLFileName = other.XMLFileName;
    this._XMLFileNameSet = other._XMLFileNameSet;
    this.CDFFileName = other.CDFFileName;
    this._CDFFileNameSet = other._CDFFileNameSet;
    if (other._BalanceLineItemQuery != null)
    {
      this._BalanceLineItemQuery = new BalanceLineItemQueryObjectData (other._BalanceLineItemQuery);
    }

  }
  /** get the object for BulkAdjustmentObject
   * @return BulkAdjustmentData the object
   */
  public BulkAdjustmentObjectData getBulkAdjustment ()
  {
    return this._BulkAdjustment;
  }
  /** set the object for BulkAdjustment
   * @param value the new object
   */
  public void setBulkAdjustment (BulkAdjustmentObjectData value)
  {
    this._BulkAdjustment = value;
  }
  /** get the object for BatchRequestObject
   * @return BatchRequestData the object
   */
  public BatchRequestObjectData getBatchRequest ()
  {
    return this.___BatchRequest;
  }
  /** set the object for BatchRequest
   * @param value the new object
   */
  public void setBatchRequest (BatchRequestObjectData value)
  {
    this.___BatchRequest = value;
  }
  /** get the object for BalanceLineItemObject
   * @return BalanceLineItemData[] the object
   */
  public BalanceLineItemObjectData[] getBalanceLineItem ()
  {
    return this.______BalanceLineItem;
  }
  /** set the object for BalanceLineItem
   * @param value the new object
   */
  public void setBalanceLineItem (BalanceLineItemObjectData[] value)
  {
    this.______BalanceLineItem = value;
  }
  /** set the fields value: XMLFileName
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setXMLFileName (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "XMLFileName", "setXMLFileName");
    }
    this.XMLFileName = value;
    this._XMLFileNameSet = true;
  }
  /** get the value of the field: XMLFileName
   * @return String the value
   */
  public String getXMLFileName ()
  {
    return this.XMLFileName;
  }
  /** Change the field to not being actively set: XMLFileName
   */
  public void unsetXMLFileName ()
  {
    this._XMLFileNameSet = false;
  }
  /** See if the field is actively set: XMLFileName
   * @return boolean whether the field is actively set
   */
  public boolean issetXMLFileName ()
  {
    return this._XMLFileNameSet;
  }

  /** Retrieves the XMLFileName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The XMLFileName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the XMLFileName field
   */
   public String getXMLFileNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getXMLFileNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getXMLFileNameAsFormattedString");
       return fmtMgr.formatString(this.getXMLFileName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("XMLFileName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getXMLFileNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the XMLFileName field from a formatted string
   *
   * @param _value the XMLFileName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the XMLFileName field
   */
   public void setXMLFileNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getXMLFileNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setXMLFileName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("XMLFileName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setXMLFileNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setXMLFileNameFromFormattedString");
   }

  /** set the fields value: CDFFileName
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCDFFileName (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CDFFileName", "setCDFFileName");
    }
    this.CDFFileName = value;
    this._CDFFileNameSet = true;
  }
  /** get the value of the field: CDFFileName
   * @return String the value
   */
  public String getCDFFileName ()
  {
    return this.CDFFileName;
  }
  /** Change the field to not being actively set: CDFFileName
   */
  public void unsetCDFFileName ()
  {
    this._CDFFileNameSet = false;
  }
  /** See if the field is actively set: CDFFileName
   * @return boolean whether the field is actively set
   */
  public boolean issetCDFFileName ()
  {
    return this._CDFFileNameSet;
  }

  /** Retrieves the CDFFileName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CDFFileName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CDFFileName field
   */
   public String getCDFFileNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCDFFileNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCDFFileNameAsFormattedString");
       return fmtMgr.formatString(this.getCDFFileName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CDFFileName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCDFFileNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the CDFFileName field from a formatted string
   *
   * @param _value the CDFFileName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CDFFileName field
   */
   public void setCDFFileNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCDFFileNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCDFFileName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CDFFileName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCDFFileNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCDFFileNameFromFormattedString");
   }

  /** get the object for BalanceLineItemQueryObject
   * @return BalanceLineItemQueryData the object
   */
  public BalanceLineItemQueryObjectData getBalanceLineItemQuery ()
  {
    return this._BalanceLineItemQuery;
  }
  /** set the object for BalanceLineItemQuery
   * @param value the new object
   */
  public void setBalanceLineItemQuery (BalanceLineItemQueryObjectData value)
  {
    this._BalanceLineItemQuery = value;
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
    
  /** _BulkAdjustment object */
  
      if (_BulkAdjustment != null) _BulkAdjustment.resetFlags(flag, nonNullOnly);
    
  /** ___BatchRequest object */
  
      if (___BatchRequest != null) ___BatchRequest.resetFlags(flag, nonNullOnly);
    
  /** ______BalanceLineItem object */
  
    if (______BalanceLineItem != null) {
      for (int i = 0; i < ______BalanceLineItem.length; i++) {
        if(______BalanceLineItem[i] != null) ______BalanceLineItem[i].resetFlags(flag, nonNullOnly);
      }
    }
    
  /** XMLFileName field */
    if (!nonNullOnly || (XMLFileName != null)) _XMLFileNameSet = flag;
  /** CDFFileName field */
    if (!nonNullOnly || (CDFFileName != null)) _CDFFileNameSet = flag;
  /** _BalanceLineItemQuery object */
  
      if (_BalanceLineItemQuery != null) _BalanceLineItemQuery.resetFlags(flag, nonNullOnly);
    
  }
}
