/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: UnbilledUsageBulkAdjustmentGetOutputData.java
 * Definition File: Catalog/UnbilledUsageBulkAdjustment.xml
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
public class UnbilledUsageBulkAdjustmentGetOutputData implements ArubaObjectData, Serializable
{
  /** __BulkAdjustment object */
  public BulkAdjustmentObjectData __BulkAdjustment = null;

  /** ____BatchRequest object */
  public BatchRequestObjectData ____BatchRequest = null;

  /** ______UnbilledUsage object */
  public UnbilledUsageObjectData[] ______UnbilledUsage = null;

  /** XMLFileName field */
  public    String XMLFileName  = null;
  protected boolean _XMLFileNameSet = false;
  /** CDFFileName field */
  public    String CDFFileName  = null;
  protected boolean _CDFFileNameSet = false;
  /** __UnbilledUsageQuery object */
  public UnbilledUsageQueryObjectData __UnbilledUsageQuery = null;

  private String _objName = "UnbilledUsageBulkAdjustmentGetOutputData";
  /** default constructor */
  public UnbilledUsageBulkAdjustmentGetOutputData ()
  {
  }
  /** copy constructor
   * @param other the object to copy.
   */
  public UnbilledUsageBulkAdjustmentGetOutputData (UnbilledUsageBulkAdjustmentGetOutputData other)
  {
    if (other == null) return;
    if (other.__BulkAdjustment != null)
    {
      this.__BulkAdjustment = new BulkAdjustmentObjectData (other.__BulkAdjustment);
    }

    if (other.____BatchRequest != null)
    {
      this.____BatchRequest = new BatchRequestObjectData (other.____BatchRequest);
    }

    if (other.______UnbilledUsage != null)
    {
      this.______UnbilledUsage = new UnbilledUsageObjectData[other.______UnbilledUsage.length];
      for (int i = 0; other.______UnbilledUsage != null && i < other.______UnbilledUsage.length; i++)
      {
        if (other.______UnbilledUsage[i] != null)  this.______UnbilledUsage[i] = new UnbilledUsageObjectData (other.______UnbilledUsage[i]);
      }
    }

    this.XMLFileName = other.XMLFileName;
    this._XMLFileNameSet = other._XMLFileNameSet;
    this.CDFFileName = other.CDFFileName;
    this._CDFFileNameSet = other._CDFFileNameSet;
    if (other.__UnbilledUsageQuery != null)
    {
      this.__UnbilledUsageQuery = new UnbilledUsageQueryObjectData (other.__UnbilledUsageQuery);
    }

  }
  /** get the object for BulkAdjustmentObject
   * @return BulkAdjustmentData the object
   */
  public BulkAdjustmentObjectData getBulkAdjustment ()
  {
    return this.__BulkAdjustment;
  }
  /** set the object for BulkAdjustment
   * @param value the new object
   */
  public void setBulkAdjustment (BulkAdjustmentObjectData value)
  {
    this.__BulkAdjustment = value;
  }
  /** get the object for BatchRequestObject
   * @return BatchRequestData the object
   */
  public BatchRequestObjectData getBatchRequest ()
  {
    return this.____BatchRequest;
  }
  /** set the object for BatchRequest
   * @param value the new object
   */
  public void setBatchRequest (BatchRequestObjectData value)
  {
    this.____BatchRequest = value;
  }
  /** get the object for UnbilledUsageObject
   * @return UnbilledUsageData[] the object
   */
  public UnbilledUsageObjectData[] getUnbilledUsage ()
  {
    return this.______UnbilledUsage;
  }
  /** set the object for UnbilledUsage
   * @param value the new object
   */
  public void setUnbilledUsage (UnbilledUsageObjectData[] value)
  {
    this.______UnbilledUsage = value;
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

  /** get the object for UnbilledUsageQueryObject
   * @return UnbilledUsageQueryData the object
   */
  public UnbilledUsageQueryObjectData getUnbilledUsageQuery ()
  {
    return this.__UnbilledUsageQuery;
  }
  /** set the object for UnbilledUsageQuery
   * @param value the new object
   */
  public void setUnbilledUsageQuery (UnbilledUsageQueryObjectData value)
  {
    this.__UnbilledUsageQuery = value;
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
    
  /** __BulkAdjustment object */
  
      if (__BulkAdjustment != null) __BulkAdjustment.resetFlags(flag, nonNullOnly);
    
  /** ____BatchRequest object */
  
      if (____BatchRequest != null) ____BatchRequest.resetFlags(flag, nonNullOnly);
    
  /** ______UnbilledUsage object */
  
    if (______UnbilledUsage != null) {
      for (int i = 0; i < ______UnbilledUsage.length; i++) {
        if(______UnbilledUsage[i] != null) ______UnbilledUsage[i].resetFlags(flag, nonNullOnly);
      }
    }
    
  /** XMLFileName field */
    if (!nonNullOnly || (XMLFileName != null)) _XMLFileNameSet = flag;
  /** CDFFileName field */
    if (!nonNullOnly || (CDFFileName != null)) _CDFFileNameSet = flag;
  /** __UnbilledUsageQuery object */
  
      if (__UnbilledUsageQuery != null) __UnbilledUsageQuery.resetFlags(flag, nonNullOnly);
    
  }
}
