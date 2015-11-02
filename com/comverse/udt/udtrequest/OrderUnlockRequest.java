/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderUnlockRequest.java
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
 * Class used to create a OrderUnlockRequest Udt Request
 *
 */

public class OrderUnlockRequest extends OrderSubRequestParent {
/**
 *
 * Constructor to create a  OrderUnlockRequest
 * @param id Unique request name
 * @param OrderUnlockIn OrderObjectKeyData for OrderUnlockRequest
 *
 */
@JsonCreator
  public OrderUnlockRequest(@JsonProperty("RequestId") String id, @JsonProperty("Order")OrderObjectKeyData OrderUnlockIn) {
    super(id, "OrderUnlock");
    if (OrderUnlockIn != null) {
      addInput("Order", OrderObjectKeyHelper.toMap(OrderUnlockIn, new HashMap(), "OrderObjectKeyData").get("OrderObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the OrderObjectData that results from the OrderUnlockRequest call
 * @return OrderObjectData resulting from udt call
 *
 */

  public OrderObjectData getOutput() {
    return OrderObjectHelper.fromMap(outputMap, "Order");
  }
}
