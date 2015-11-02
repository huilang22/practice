/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BalanceLineItemBulkAdjustmentGetOutputHelper.java
 * Definition File: Catalog/BalanceLineItemBulkAdjustment.xml
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
public class BalanceLineItemBulkAdjustmentGetOutputHelper implements ArubaObjectHelper
{
  /** convert a Map to a BalanceLineItemBulkAdjustmentGetOutputData object.
   * @param record the map
   * @return BalanceLineItemBulkAdjustmentGetOutputData the output object.
   */
  public static BalanceLineItemBulkAdjustmentGetOutputData fromMap (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BalanceLineItemBulkAdjustmentGetOutputData out = new BalanceLineItemBulkAdjustmentGetOutputData ();
    out._BulkAdjustment = BulkAdjustmentObjectHelper.getObj ((Map) record.get ("BulkAdjustment"));
    out.___BatchRequest = BatchRequestObjectHelper.getObj ((Map) record.get ("BatchRequest"));

    list = (Object[]) record.get ("BalanceLineItemList");
    if (list != null)
    {
      out.______BalanceLineItem = new BalanceLineItemObjectData[list.length];
      for (int i = 0; i < list.length; i++)
      {
        out.______BalanceLineItem[i] = BalanceLineItemObjectHelper.getObj ((Map) list[i]);
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
      out._BalanceLineItemQuery = BalanceLineItemQueryObjectHelper.getObj ((Map) record.get ("BalanceLineItemQuery"));

    return out;
  }
  /** convert a BalanceLineItemBulkAdjustmentGetOutputData object to a Map.
   * @param in the object BalanceLineItemBulkAdjustmentGetOutputData the output object.
   * @return the Map
   */
  public static Map toMap(BalanceLineItemBulkAdjustmentGetOutputData in)
  {
    Object[] list = null;
    Object obj = null;
    if (in == null) return null;
    //Map retVal = new HashMap();
    Map record = new HashMap();
BulkAdjustmentObjectData _BulkAdjustment = in.getBulkAdjustment();
    if (_BulkAdjustment != null) {
      record.put("BulkAdjustment", BulkAdjustmentObjectHelper.toMap(_BulkAdjustment, new HashMap(), "BulkAdjustment").get("BulkAdjustment"));
    }
  BatchRequestObjectData ___BatchRequest = in.getBatchRequest();
    if (___BatchRequest != null) {
      record.put("BatchRequest", BatchRequestObjectHelper.toMap(___BatchRequest, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  BalanceLineItemObjectData[] ______BalanceLineItem = in.getBalanceLineItem();
    if (______BalanceLineItem != null) {
        Map[] mapArray = new HashMap[______BalanceLineItem.length];
        for (int i = 0; i < ______BalanceLineItem.length; i++) {
          mapArray[i] = BalanceLineItemObjectHelper.toMap(______BalanceLineItem[i], null);
        }
        record.put("BalanceLineItemList", mapArray);
    }
  
    if ((obj = in.getXMLFileName()) != null) {

      record.put("XMLFileName", obj);
  
    }

    if ((obj = in.getCDFFileName()) != null) {

      record.put("CDFFileName", obj);
  
    }
BalanceLineItemQueryObjectData _BalanceLineItemQuery = in.getBalanceLineItemQuery();
    if (_BalanceLineItemQuery != null) {
      record.put("BalanceLineItemQuery", BalanceLineItemQueryObjectHelper.toMap(_BalanceLineItemQuery, new HashMap(), "BalanceLineItemQuery").get("BalanceLineItemQuery"));
    }
  
    //retVal.put("BalanceLineItemBulkAdjustmentGetResponse", record);
    //return retVal;
    return record;
  }
}
