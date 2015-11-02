/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderStatusCreateRequest.java
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
 * Class used to create a OrderStatusCreateRequest Udt Request
 *
 */

public class OrderStatusCreateRequest extends OrderStatusSubRequestParent {
/**
 *
 * Constructor to create a  OrderStatusCreateRequest
 * @param id Unique request name
 * @param OrderStatusCreateIn OrderStatusObjectData for OrderStatusCreateRequest
 *
 */
@JsonCreator
  public OrderStatusCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("OrderStatus")OrderStatusObjectData OrderStatusCreateIn) {
    super(id, "OrderStatusCreate");
    if (OrderStatusCreateIn != null) {
      addInput("OrderStatus", OrderStatusObjectHelper.toMap(OrderStatusCreateIn, new HashMap(), "OrderStatus").get("OrderStatus"));
    }
  }

/**
 *
 * Retrieves the OrderStatusObjectData that results from the OrderStatusCreateRequest call
 * @return OrderStatusObjectData resulting from udt call
 *
 */

  public OrderStatusObjectData getOutput() {
    return OrderStatusObjectHelper.fromMap(outputMap, "OrderStatus");
  }
}
