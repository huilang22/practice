/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderCancelRequest.java
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
 * Class used to create a OrderCancelRequest Udt Request
 *
 */

public class OrderCancelRequest extends OrderSubRequestParent {
/**
 *
 * Constructor to create a  OrderCancelRequest
 * @param id Unique request name
 * @param OrderCancelIn OrderObjectKeyData for OrderCancelRequest
 *
 */
@JsonCreator
  public OrderCancelRequest(@JsonProperty("RequestId") String id, @JsonProperty("Order")OrderObjectKeyData OrderCancelIn) {
    super(id, "OrderCancel");
    if (OrderCancelIn != null) {
      addInput("Order", OrderObjectKeyHelper.toMap(OrderCancelIn, new HashMap(), "OrderObjectKeyData").get("OrderObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the OrderObjectData that results from the OrderCancelRequest call
 * @return OrderObjectData resulting from udt call
 *
 */

  public OrderObjectData getOutput() {
    return OrderObjectHelper.fromMap(outputMap, "Order");
  }
}
