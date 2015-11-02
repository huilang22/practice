/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemRouteFindNoOpRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ItemRouteFindNoOpRequest Udt Request/Response
 *
 */
public class ItemRouteFindNoOpRequest extends ItemRouteRequest {
/**
 *
 * Constructor to create a   ItemRouteFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ItemRouteFindNoOpRequest(String id, ItemRouteObjectDataList noOpIn) {
    super(id, "ItemRouteFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ItemRouteObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ItemRoute", noOpIn);
      }
      addInput("ItemRoute", mapList);
    }
  }
/**
 *
 * Retrieves the ItemRouteObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ItemRouteObjectDataList getOutput() {
    return ItemRouteObjectHelper.fromMapList(outputMap, "ItemRouteList");
  }
}
