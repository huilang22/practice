/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderCommitRequest.java
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
 * Class used to create a OrderCommitRequest Udt Request
 *
 */

public class OrderCommitRequest extends OrderSubRequestParent {
/**
 *
 * Constructor to create a  OrderCommitRequest
 * @param id Unique request name
 * @param OrderCommitIn OrderObjectKeyData for OrderCommitRequest
 * @param Force Integer for OrderCommitRequest
 *
 */
@JsonCreator
  public OrderCommitRequest(@JsonProperty("RequestId") String id, @JsonProperty("Order")OrderObjectKeyData OrderCommitIn, @JsonProperty("Force")Integer Force) {
    super(id, "OrderCommit");
    if (OrderCommitIn != null) {
      addInput("Order", OrderObjectKeyHelper.toMap(OrderCommitIn, new HashMap(), "OrderObjectKeyData").get("OrderObjectKeyData"));
    }
    if (Force != null) {
      addInput("Force", Force);
    }
  }

/**
 *
 * Retrieves the OrderObjectData that results from the OrderCommitRequest call
 * @return OrderObjectData resulting from udt call
 *
 */

  public OrderObjectData getOutput() {
    return OrderObjectHelper.fromMap(outputMap, "Order");
  }
}
