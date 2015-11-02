/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderLookupGetRequest.java
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
 * Class used to create a OrderLookupGetRequest Udt Request
 *
 */

public class OrderLookupGetRequest extends OrderLookupSubRequestParent {
/**
 *
 * Constructor to create a  OrderLookupGetRequest
 * @param id Unique request name
 * @param OrderLookupGetIn OrderLookupObjectKeyData for OrderLookupGetRequest
 *
 */
@JsonCreator
  public OrderLookupGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("OrderLookup")OrderLookupObjectKeyData OrderLookupGetIn) {
    super(id, "OrderLookupGet");
    if (OrderLookupGetIn != null) {
      addInput("OrderLookup", OrderLookupObjectKeyHelper.toMap(OrderLookupGetIn, new HashMap(), "OrderLookupObjectKeyData").get("OrderLookupObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the OrderLookupObjectData that results from the OrderLookupGetRequest call
 * @return OrderLookupObjectData resulting from udt call
 *
 */

  public OrderLookupObjectData getOutput() {
    return OrderLookupObjectHelper.fromMap(outputMap, "OrderLookup");
  }
}
