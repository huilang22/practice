/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderLockNoOpRequest.java
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
 * NoOp class used to simulate a OrderLockNoOpRequest Udt Request/Response
 *
 */
public class OrderLockNoOpRequest extends OrderSubRequestParent {
/**
 *
 * Constructor to create a   OrderLockNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderLockNoOpRequest(String id, OrderObjectData noOpIn) {
    super(id, "OrderLockNoOpRequest");
    if (noOpIn != null) {
      addInput("Order", OrderObjectHelper.toMap(noOpIn, new HashMap(), "Order").get("Order"));
    }
  }
/**
 *
 * Retrieves the OrderObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderObjectData getOutput() {
    return OrderObjectHelper.fromMap(outputMap, "Order");
  }
}
