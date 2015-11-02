/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderStatusGetNoOpRequest.java
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
 * NoOp class used to simulate a OrderStatusGetNoOpRequest Udt Request/Response
 *
 */
public class OrderStatusGetNoOpRequest extends OrderStatusSubRequestParent {
/**
 *
 * Constructor to create a   OrderStatusGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderStatusGetNoOpRequest(String id, OrderStatusObjectData noOpIn) {
    super(id, "OrderStatusGetNoOpRequest");
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
