/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderStatusFindRequest.java
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
 * Class used to create a OrderStatusFindRequest Udt Request
 *
 */

public class OrderStatusFindRequest extends OrderStatusRequest {
/**
 *
 * Constructor to create a  OrderStatusFindRequest
 * @param id Unique request name
 * @param OrderStatusFindIn OrderStatusObjectFilter for OrderStatusFindRequest
 *
 */
@JsonCreator
  public OrderStatusFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("OrderStatus")OrderStatusObjectFilter OrderStatusFindIn) {
    super(id, "OrderStatusFind");
    if (OrderStatusFindIn != null) {
      Integer index =  OrderStatusFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("OrderStatus", OrderStatusObjectHelper.toMap(OrderStatusFindIn, new HashMap(), "OrderStatus").get("OrderStatus"));
    }
  }

/**
 *
 * Retrieves the OrderStatusObjectDataList that results from the OrderStatusFindRequest call
 * @return OrderStatusObjectDataList resulting from udt call
 *
 */

  public OrderStatusObjectDataList getOutput() {
    return OrderStatusObjectHelper.fromMapList(outputMap, "OrderStatusList");
  }
}
