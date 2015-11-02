/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderStatusFindNoOpRequest.java
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
 * NoOp class used to simulate a OrderStatusFindNoOpRequest Udt Request/Response
 *
 */
public class OrderStatusFindNoOpRequest extends OrderStatusRequest {
/**
 *
 * Constructor to create a   OrderStatusFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderStatusFindNoOpRequest(String id, OrderStatusObjectDataList noOpIn) {
    super(id, "OrderStatusFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = OrderStatusObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("OrderStatus", noOpIn);
      }
      addInput("OrderStatus", mapList);
    }
  }
/**
 *
 * Retrieves the OrderStatusObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public OrderStatusObjectDataList getOutput() {
    return OrderStatusObjectHelper.fromMapList(outputMap, "OrderStatusList");
  }
}
