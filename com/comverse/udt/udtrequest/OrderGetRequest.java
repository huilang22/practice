/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderGetRequest.java
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
 * Class used to create a OrderGetRequest Udt Request
 *
 */

public class OrderGetRequest extends OrderSubRequestParent {
/**
 *
 * Constructor to create a  OrderGetRequest
 * @param id Unique request name
 * @param OrderGetIn OrderObjectKeyData for OrderGetRequest
 *
 */
@JsonCreator
  public OrderGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Order")OrderObjectKeyData OrderGetIn) {
    super(id, "OrderGet");
    if (OrderGetIn != null) {
      addInput("Order", OrderObjectKeyHelper.toMap(OrderGetIn, new HashMap(), "OrderObjectKeyData").get("OrderObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the OrderObjectData that results from the OrderGetRequest call
 * @return OrderObjectData resulting from udt call
 *
 */

  public OrderObjectData getOutput() {
    return OrderObjectHelper.fromMap(outputMap, "Order");
  }
}
