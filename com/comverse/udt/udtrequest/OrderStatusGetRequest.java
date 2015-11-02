/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderStatusGetRequest.java
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
 * Class used to create a OrderStatusGetRequest Udt Request
 *
 */

public class OrderStatusGetRequest extends OrderStatusSubRequestParent {
/**
 *
 * Constructor to create a  OrderStatusGetRequest
 * @param id Unique request name
 * @param OrderStatusGetIn OrderStatusObjectKeyData for OrderStatusGetRequest
 *
 */
@JsonCreator
  public OrderStatusGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("OrderStatus")OrderStatusObjectKeyData OrderStatusGetIn) {
    super(id, "OrderStatusGet");
    if (OrderStatusGetIn != null) {
      addInput("OrderStatus", OrderStatusObjectKeyHelper.toMap(OrderStatusGetIn, new HashMap(), "OrderStatusObjectKeyData").get("OrderStatusObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the OrderStatusObjectData that results from the OrderStatusGetRequest call
 * @return OrderStatusObjectData resulting from udt call
 *
 */

  public OrderStatusObjectData getOutput() {
    return OrderStatusObjectHelper.fromMap(outputMap, "OrderStatus");
  }
}
