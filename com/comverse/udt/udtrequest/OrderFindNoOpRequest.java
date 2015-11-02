/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderFindNoOpRequest.java
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

import com.csgsystems.bp.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a OrderFindNoOpRequest Udt Request/Response
 *
 */
public class OrderFindNoOpRequest extends OrderRequest {
/**
 *
 * Constructor to create a   OrderFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderFindNoOpRequest(String id, OrderObjectDataList noOpIn) {
    super(id, "OrderFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = OrderObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Order", noOpIn);
      }
      addInput("Order", mapList);
    }
  }
/**
 *
 * Retrieves the OrderObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public OrderObjectDataList getOutput() {
    return OrderObjectHelper.fromMapList(outputMap, "OrderList");
  }
}
