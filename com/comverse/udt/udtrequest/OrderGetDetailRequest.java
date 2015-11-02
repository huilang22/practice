/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderGetDetailRequest.java
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
 * Class used to create a OrderGetDetailRequest Udt Request
 *
 */

public class OrderGetDetailRequest extends OrderSubRequestParent {
/**
 *
 * Constructor to create a  OrderGetDetailRequest
 * @param id Unique request name
 * @param omOrderGetDetailOrderIn OrderObjectKeyData for OrderGetDetailRequest
 *
 */
@JsonCreator
  public OrderGetDetailRequest(@JsonProperty("RequestId") String id, @JsonProperty("Order")OrderObjectKeyData omOrderGetDetailOrderIn) {
    super(id, "OrderGetDetail");
    if (omOrderGetDetailOrderIn != null) {
      addInput("Order", OrderObjectKeyHelper.toMap(omOrderGetDetailOrderIn, new HashMap(), "OrderObjectKeyData").get("OrderObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the OrderGetDetailOutputData that results from the OrderGetDetailRequest call
 * @return OrderGetDetailOutputData resulting from udt call
 *
 */

  public OrderGetDetailOutputData getOutput() {
    return OrderGetDetailOutputHelper.fromMap(outputMap);
  }
}
