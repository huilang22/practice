/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InvoiceDetailBulkAdjustmentGetOutputHelper.java
 * Definition File: Catalog/InvoiceDetailBulkAdjustment.xml
 *----------------------------------------------------------------------------
 *----------------------------------------------------------------------------
 * Current generator limitations
 *----------------------------------------------------------------------------
 *---------------------------------------------------------------------------*/
/**----------------------------------------------------------------------------
 * Object Summary Information
 *----------------------------------------------------------------------------
 * Product    : BP
 *----------------------------------------------------------------------------
 *----------------------------------------------------------------------------
 * Copyright 2006 Comverse, Inc.  All Rights Reserved.
 *----------------------------------------------------------------------------
 */
package com.csgsystems.bp.data;

import java.math.BigInteger;
import java.util.*;

import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;
import com.csgsystems.bp.data.*;
import com.csgsystems.bat.data.*;
import com.csgsystems.bp.data.*;
import com.csgsystems.bp.data.*;


/** OutputHelper class to convert from a Map. */
public class InvoiceDetailBulkAdjustmentGetOutputHelper implements ArubaObjectHelper
{
  /** convert a Map to a InvoiceDetailBulkAdjustmentGetOutputData object.
   * @param record the map
   * @return InvoiceDetailBulkAdjustmentGetOutputData the output object.
   */
  public static InvoiceDetailBulkAdjustmentGetOutputData fromMap (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    InvoiceDetailBulkAdjustmentGetOutputData out = new InvoiceDetailBulkAdjustmentGetOutputData ();
    out.__BulkAdjustment = BulkAdjustmentObjectHelper.getObj ((Map) record.get ("BulkAdjustment"));
    out.____BatchRequest = BatchRequestObjectHelper.getObj ((Map) record.get ("BatchRequest"));

    list = (Object[]) record.get ("InvoiceDetailList");
    if (list != null)
    {
      out._____InvoiceDetail = new InvoiceDetailObjectData[list.length];
      for (int i = 0; i < list.length; i++)
      {
        out._____InvoiceDetail[i] = InvoiceDetailObjectHelper.getObj ((Map) list[i]);
      }
    }
    if ((obj = record.get ("XMLFileName")) != null)
    {
      out.XMLFileName = (String) obj;
    }
  
    if ((obj = record.get ("CDFFileName")) != null)
    {
      out.CDFFileName = (String) obj;
    }
      out.__InvoiceDetailQuery = InvoiceDetailQueryObjectHelper.getObj ((Map) record.get ("InvoiceDetailQuery"));

    return out;
  }
  /** convert a InvoiceDetailBulkAdjustmentGetOutputData object to a Map.
   * @param in the object InvoiceDetailBulkAdjustmentGetOutputData the output object.
   * @return the Map
   */
  public static Map toMap(InvoiceDetailBulkAdjustmentGetOutputData in)
  {
    Object[] list = null;
    Object obj = null;
    if (in == null) return null;
    //Map retVal = new HashMap();
    Map record = new HashMap();
BulkAdjustmentObjectData __BulkAdjustment = in.getBulkAdjustment();
    if (__BulkAdjustment != null) {
      record.put("BulkAdjustment", BulkAdjustmentObjectHelper.toMap(__BulkAdjustment, new HashMap(), "BulkAdjustment").get("BulkAdjustment"));
    }
  BatchRequestObjectData ____BatchRequest = in.getBatchRequest();
    if (____BatchRequest != null) {
      record.put("BatchRequest", BatchRequestObjectHelper.toMap(____BatchRequest, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  InvoiceDetailObjectData[] _____InvoiceDetail = in.getInvoiceDetail();
    if (_____InvoiceDetail != null) {
        Map[] mapArray = new HashMap[_____InvoiceDetail.length];
        for (int i = 0; i < _____InvoiceDetail.length; i++) {
          mapArray[i] = InvoiceDetailObjectHelper.toMap(_____InvoiceDetail[i], null);
        }
        record.put("InvoiceDetailList", mapArray);
    }
  
    if ((obj = in.getXMLFileName()) != null) {

      record.put("XMLFileName", obj);
  
    }

    if ((obj = in.getCDFFileName()) != null) {

      record.put("CDFFileName", obj);
  
    }
InvoiceDetailQueryObjectData __InvoiceDetailQuery = in.getInvoiceDetailQuery();
    if (__InvoiceDetailQuery != null) {
      record.put("InvoiceDetailQuery", InvoiceDetailQueryObjectHelper.toMap(__InvoiceDetailQuery, new HashMap(), "InvoiceDetailQuery").get("InvoiceDetailQuery"));
    }
  
    //retVal.put("InvoiceDetailBulkAdjustmentGetResponse", record);
    //return retVal;
    return record;
  }
}
