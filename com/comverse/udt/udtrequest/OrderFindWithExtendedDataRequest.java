/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderFindWithExtendedDataRequest.java
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
 * Class used to create a OrderFindWithExtendedDataRequest Udt Request
 *
 */

public class OrderFindWithExtendedDataRequest extends OrderRequest {
/**
 *
 * Constructor to create a  OrderFindWithExtendedDataRequest
 * @param id Unique request name
 * @param OrderFindWEDIn OrderObjectFilter for OrderFindWithExtendedDataRequest
 *
 */
@JsonCreator
  public OrderFindWithExtendedDataRequest(@JsonProperty("RequestId") String id, @JsonProperty("Order")OrderObjectFilter OrderFindWEDIn) {
    super(id, "OrderFindWithExtendedData");
    if (OrderFindWEDIn != null) {
      Integer index =  OrderFindWEDIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Order", OrderObjectHelper.toMap(OrderFindWEDIn, new HashMap(), "Order").get("Order"));
    }
  }

/**
 *
 * Retrieves the OrderObjectDataList that results from the OrderFindWithExtendedDataRequest call
 * @return OrderObjectDataList resulting from udt call
 *
 */

  public OrderObjectDataList getOutput() {
    return OrderObjectHelper.fromMapList(outputMap, "OrderList");
  }
}
