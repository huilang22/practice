/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderFindRequest.java
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
 * Class used to create a OrderFindRequest Udt Request
 *
 */

public class OrderFindRequest extends OrderRequest {
/**
 *
 * Constructor to create a  OrderFindRequest
 * @param id Unique request name
 * @param OrderFindIn OrderObjectFilter for OrderFindRequest
 *
 */
@JsonCreator
  public OrderFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Order")OrderObjectFilter OrderFindIn) {
    super(id, "OrderFind");
    if (OrderFindIn != null) {
      Integer index =  OrderFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Order", OrderObjectHelper.toMap(OrderFindIn, new HashMap(), "Order").get("Order"));
    }
  }

/**
 *
 * Retrieves the OrderObjectDataList that results from the OrderFindRequest call
 * @return OrderObjectDataList resulting from udt call
 *
 */

  public OrderObjectDataList getOutput() {
    return OrderObjectHelper.fromMapList(outputMap, "OrderList");
  }
}
