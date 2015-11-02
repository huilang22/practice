/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderStatusUpdateRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a OrderStatusUpdateRequest Udt Request
 *
 */

public class OrderStatusUpdateRequest extends OrderStatusSubRequestParent {
/**
 *
 * Constructor to create a  OrderStatusUpdateRequest
 * @param id Unique request name
 * @param OrderStatusUpdateIn OrderStatusObjectData for OrderStatusUpdateRequest
 *
 */
@JsonCreator
  public OrderStatusUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("OrderStatus")OrderStatusObjectData OrderStatusUpdateIn) {
    super(id, "OrderStatusUpdate");
    if (OrderStatusUpdateIn != null) {
      addInput("OrderStatus", OrderStatusObjectHelper.toMap(OrderStatusUpdateIn, new HashMap(), "OrderStatus").get("OrderStatus"));
    }
  }

/**
 *
 * Retrieves the OrderStatusObjectData that results from the OrderStatusUpdateRequest call
 * @return OrderStatusObjectData resulting from udt call
 *
 */

  public OrderStatusObjectData getOutput() {
    return OrderStatusObjectHelper.fromMap(outputMap, "OrderStatus");
  }
}
