/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderExtendedDataFindNoOpRequest.java
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
 * NoOp class used to simulate a OrderExtendedDataFindNoOpRequest Udt Request/Response
 *
 */
public class OrderExtendedDataFindNoOpRequest extends OrderRequest {
/**
 *
 * Constructor to create a   OrderExtendedDataFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderExtendedDataFindNoOpRequest(String id, OrderEDObjectDataList noOpIn) {
    super(id, "OrderExtendedDataFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = OrderEDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("OrderExtendedData", noOpIn);
      }
      addInput("OrderExtendedData", mapList);
    }
  }
/**
 *
 * Retrieves the OrderEDObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public OrderEDObjectDataList getOutput() {
    return OrderEDObjectHelper.fromMapList(outputMap, "OrderExtendedDataList");
  }
}
