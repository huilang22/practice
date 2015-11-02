/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderCreateRequest.java
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
 * Class used to create a OrderCreateRequest Udt Request
 *
 */

public class OrderCreateRequest extends OrderSubRequestParent {
/**
 *
 * Constructor to create a  OrderCreateRequest
 * @param id Unique request name
 * @param OrderCreateIn OrderObjectData for OrderCreateRequest
 *
 */
@JsonCreator
  public OrderCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Order")OrderObjectData OrderCreateIn) {
    super(id, "OrderCreate");
    if (OrderCreateIn != null) {
      addInput("Order", OrderObjectHelper.toMap(OrderCreateIn, new HashMap(), "Order").get("Order"));
    }
  }

/**
 *
 * Retrieves the OrderObjectData that results from the OrderCreateRequest call
 * @return OrderObjectData resulting from udt call
 *
 */

  public OrderObjectData getOutput() {
    return OrderObjectHelper.fromMap(outputMap, "Order");
  }
}
