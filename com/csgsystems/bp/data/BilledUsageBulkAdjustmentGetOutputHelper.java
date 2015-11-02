/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BilledUsageBulkAdjustmentGetOutputHelper.java
 * Definition File: Catalog/BilledUsageBulkAdjustment.xml
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
public class BilledUsageBulkAdjustmentGetOutputHelper implements ArubaObjectHelper
{
  /** convert a Map to a BilledUsageBulkAdjustmentGetOutputData object.
   * @param record the map
   * @return BilledUsageBulkAdjustmentGetOutputData the output object.
   */
  public static BilledUsageBulkAdjustmentGetOutputData fromMap (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BilledUsageBulkAdjustmentGetOutputData out = new BilledUsageBulkAdjustmentGetOutputData ();
    out.__BulkAdjustment = BulkAdjustmentObjectHelper.getObj ((Map) record.get ("BulkAdjustment"));
    out.____BatchRequest = BatchRequestObjectHelper.getObj ((Map) record.get ("BatchRequest"));

    list = (Object[]) record.get ("BilledUsageList");
    if (list != null)
    {
      out.______BilledUsage = new BilledUsageObjectData[list.length];
      for (int i = 0; i < list.length; i++)
      {
        out.______BilledUsage[i] = BilledUsageObjectHelper.getObj ((Map) list[i]);
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
      out.__BilledUsageQuery = BilledUsageQueryObjectHelper.getObj ((Map) record.get ("BilledUsageQuery"));

    return out;
  }
  /** convert a BilledUsageBulkAdjustmentGetOutputData object to a Map.
   * @param in the object BilledUsageBulkAdjustmentGetOutputData the output object.
   * @return the Map
   */
  public static Map toMap(BilledUsageBulkAdjustmentGetOutputData in)
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
  BilledUsageObjectData[] ______BilledUsage = in.getBilledUsage();
    if (______BilledUsage != null) {
        Map[] mapArray = new HashMap[______BilledUsage.length];
        for (int i = 0; i < ______BilledUsage.length; i++) {
          mapArray[i] = BilledUsageObjectHelper.toMap(______BilledUsage[i], null);
        }
        record.put("BilledUsageList", mapArray);
    }
  
    if ((obj = in.getXMLFileName()) != null) {

      record.put("XMLFileName", obj);
  
    }

    if ((obj = in.getCDFFileName()) != null) {

      record.put("CDFFileName", obj);
  
    }
BilledUsageQueryObjectData __BilledUsageQuery = in.getBilledUsageQuery();
    if (__BilledUsageQuery != null) {
      record.put("BilledUsageQuery", BilledUsageQueryObjectHelper.toMap(__BilledUsageQuery, new HashMap(), "BilledUsageQuery").get("BilledUsageQuery"));
    }
  
    //retVal.put("BilledUsageBulkAdjustmentGetResponse", record);
    //return retVal;
    return record;
  }
}
