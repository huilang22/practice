/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderLevelDeriveRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a OrderLevelDeriveRequest Udt Request
 *
 */

public class OrderLevelDeriveRequest extends OpenItemIdMapRequest {
/**
 *
 * Constructor to create a  OrderLevelDeriveRequest
 * @param id Unique request name
 * @param OrderLevelDeriveIn OpenItemIdMapObjectData for OrderLevelDeriveRequest
 *
 */
@JsonCreator
  public OrderLevelDeriveRequest(@JsonProperty("RequestId") String id, @JsonProperty("OpenItemIdMap")OpenItemIdMapObjectData OrderLevelDeriveIn) {
    super(id, "OrderLevelDerive");
    if (OrderLevelDeriveIn != null) {
      addInput("OpenItemIdMap", OpenItemIdMapObjectHelper.toMap(OrderLevelDeriveIn, new HashMap(), "OrderLevel").get("OrderLevel"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the OrderLevelDeriveRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("OrderLevel");
  }
}
