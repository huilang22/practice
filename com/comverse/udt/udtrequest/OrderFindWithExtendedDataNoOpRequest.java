/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderFindWithExtendedDataNoOpRequest.java
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
 * NoOp class used to simulate a OrderFindWithExtendedDataNoOpRequest Udt Request/Response
 *
 */
public class OrderFindWithExtendedDataNoOpRequest extends OrderRequest {
/**
 *
 * Constructor to create a   OrderFindWithExtendedDataNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderFindWithExtendedDataNoOpRequest(String id, OrderObjectDataList noOpIn) {
    super(id, "OrderFindWithExtendedDataNoOpRequest");
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
