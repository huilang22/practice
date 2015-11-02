/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: UnbilledUsageBulkAdjustmentGetOutputHelper.java
 * Definition File: Catalog/UnbilledUsageBulkAdjustment.xml
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
public class UnbilledUsageBulkAdjustmentGetOutputHelper implements ArubaObjectHelper
{
  /** convert a Map to a UnbilledUsageBulkAdjustmentGetOutputData object.
   * @param record the map
   * @return UnbilledUsageBulkAdjustmentGetOutputData the output object.
   */
  public static UnbilledUsageBulkAdjustmentGetOutputData fromMap (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    UnbilledUsageBulkAdjustmentGetOutputData out = new UnbilledUsageBulkAdjustmentGetOutputData ();
    out.__BulkAdjustment = BulkAdjustmentObjectHelper.getObj ((Map) record.get ("BulkAdjustment"));
    out.____BatchRequest = BatchRequestObjectHelper.getObj ((Map) record.get ("BatchRequest"));

    list = (Object[]) record.get ("UnbilledUsageList");
    if (list != null)
    {
      out.______UnbilledUsage = new UnbilledUsageObjectData[list.length];
      for (int i = 0; i < list.length; i++)
      {
        out.______UnbilledUsage[i] = UnbilledUsageObjectHelper.getObj ((Map) list[i]);
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
      out.__UnbilledUsageQuery = UnbilledUsageQueryObjectHelper.getObj ((Map) record.get ("UnbilledUsageQuery"));

    return out;
  }
  /** convert a UnbilledUsageBulkAdjustmentGetOutputData object to a Map.
   * @param in the object UnbilledUsageBulkAdjustmentGetOutputData the output object.
   * @return the Map
   */
  public static Map toMap(UnbilledUsageBulkAdjustmentGetOutputData in)
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
  UnbilledUsageObjectData[] ______UnbilledUsage = in.getUnbilledUsage();
    if (______UnbilledUsage != null) {
        Map[] mapArray = new HashMap[______UnbilledUsage.length];
        for (int i = 0; i < ______UnbilledUsage.length; i++) {
          mapArray[i] = UnbilledUsageObjectHelper.toMap(______UnbilledUsage[i], null);
        }
        record.put("UnbilledUsageList", mapArray);
    }
  
    if ((obj = in.getXMLFileName()) != null) {

      record.put("XMLFileName", obj);
  
    }

    if ((obj = in.getCDFFileName()) != null) {

      record.put("CDFFileName", obj);
  
    }
UnbilledUsageQueryObjectData __UnbilledUsageQuery = in.getUnbilledUsageQuery();
    if (__UnbilledUsageQuery != null) {
      record.put("UnbilledUsageQuery", UnbilledUsageQueryObjectHelper.toMap(__UnbilledUsageQuery, new HashMap(), "UnbilledUsageQuery").get("UnbilledUsageQuery"));
    }
  
    //retVal.put("UnbilledUsageBulkAdjustmentGetResponse", record);
    //return retVal;
    return record;
  }
}
