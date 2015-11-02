/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderLockRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a OrderLockRequest Udt Request
 *
 */

public class OrderLockRequest extends OrderSubRequestParent {
/**
 *
 * Constructor to create a  OrderLockRequest
 * @param id Unique request name
 * @param OrderLockIn OrderObjectKeyData for OrderLockRequest
 *
 */
@JsonCreator
  public OrderLockRequest(@JsonProperty("RequestId") String id, @JsonProperty("Order")OrderObjectKeyData OrderLockIn) {
    super(id, "OrderLock");
    if (OrderLockIn != null) {
      addInput("Order", OrderObjectKeyHelper.toMap(OrderLockIn, new HashMap(), "OrderObjectKeyData").get("OrderObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the OrderObjectData that results from the OrderLockRequest call
 * @return OrderObjectData resulting from udt call
 *
 */

  public OrderObjectData getOutput() {
    return OrderObjectHelper.fromMap(outputMap, "Order");
  }
}
