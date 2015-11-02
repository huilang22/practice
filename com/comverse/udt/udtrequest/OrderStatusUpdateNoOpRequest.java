/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderStatusUpdateNoOpRequest.java
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
 * NoOp class used to simulate a OrderStatusUpdateNoOpRequest Udt Request/Response
 *
 */
public class OrderStatusUpdateNoOpRequest extends OrderStatusSubRequestParent {
/**
 *
 * Constructor to create a   OrderStatusUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderStatusUpdateNoOpRequest(String id, OrderStatusObjectData noOpIn) {
    super(id, "OrderStatusUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderStatus", OrderStatusObjectHelper.toMap(noOpIn, new HashMap(), "OrderStatus").get("OrderStatus"));
    }
  }
/**
 *
 * Retrieves the OrderStatusObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderStatusObjectData getOutput() {
    return OrderStatusObjectHelper.fromMap(outputMap, "OrderStatus");
  }
}
