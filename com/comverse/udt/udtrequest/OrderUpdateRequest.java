/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderUpdateRequest.java
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
 * Class used to create a OrderUpdateRequest Udt Request
 *
 */

public class OrderUpdateRequest extends OrderSubRequestParent {
/**
 *
 * Constructor to create a  OrderUpdateRequest
 * @param id Unique request name
 * @param OrderUpdateIn OrderObjectData for OrderUpdateRequest
 *
 */
@JsonCreator
  public OrderUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Order")OrderObjectData OrderUpdateIn) {
    super(id, "OrderUpdate");
    if (OrderUpdateIn != null) {
      addInput("Order", OrderObjectHelper.toMap(OrderUpdateIn, new HashMap(), "Order").get("Order"));
    }
  }

/**
 *
 * Retrieves the OrderObjectData that results from the OrderUpdateRequest call
 * @return OrderObjectData resulting from udt call
 *
 */

  public OrderObjectData getOutput() {
    return OrderObjectHelper.fromMap(outputMap, "Order");
  }
}
