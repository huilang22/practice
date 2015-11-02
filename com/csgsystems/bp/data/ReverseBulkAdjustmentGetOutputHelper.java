/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ReverseBulkAdjustmentGetOutputHelper.java
 * Definition File: Catalog/ReverseBulkAdjustment.xml
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
import com.csgsystems.bat.data.*;


/** OutputHelper class to convert from a Map. */
public class ReverseBulkAdjustmentGetOutputHelper implements ArubaObjectHelper
{
  /** convert a Map to a ReverseBulkAdjustmentGetOutputData object.
   * @param record the map
   * @return ReverseBulkAdjustmentGetOutputData the output object.
   */
  public static ReverseBulkAdjustmentGetOutputData fromMap (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ReverseBulkAdjustmentGetOutputData out = new ReverseBulkAdjustmentGetOutputData ();
    out.__BatchRequest = BatchRequestObjectHelper.getObj ((Map) record.get ("BatchRequest"));

    if ((obj = record.get ("ReasonCode")) != null)
    {
      out.ReasonCode = (Integer) obj;
    }
  
    if ((obj = record.get ("OriginalRequestId")) != null)
    {
      out.OriginalRequestId = (BigInteger) obj;
    }
  
    return out;
  }
  /** convert a ReverseBulkAdjustmentGetOutputData object to a Map.
   * @param in the object ReverseBulkAdjustmentGetOutputData the output object.
   * @return the Map
   */
  public static Map toMap(ReverseBulkAdjustmentGetOutputData in)
  {
    Object[] list = null;
    Object obj = null;
    if (in == null) return null;
    //Map retVal = new HashMap();
    Map record = new HashMap();
BatchRequestObjectData __BatchRequest = in.getBatchRequest();
    if (__BatchRequest != null) {
      record.put("BatchRequest", BatchRequestObjectHelper.toMap(__BatchRequest, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  
    if ((obj = in.getReasonCode()) != null) {

      record.put("ReasonCode", obj);
  
    }

    if ((obj = in.getOriginalRequestId()) != null) {

      record.put("OriginalRequestId", obj);
  
    }

    //retVal.put("ReverseBulkAdjustmentGetResponse", record);
    //return retVal;
    return record;
  }
}
