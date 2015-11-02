/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderLookupFindRequest.java
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
 * Class used to create a OrderLookupFindRequest Udt Request
 *
 */

public class OrderLookupFindRequest extends OrderLookupRequest {
/**
 *
 * Constructor to create a  OrderLookupFindRequest
 * @param id Unique request name
 * @param OrderLookupFindIn OrderLookupObjectFilter for OrderLookupFindRequest
 *
 */
@JsonCreator
  public OrderLookupFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("OrderLookup")OrderLookupObjectFilter OrderLookupFindIn) {
    super(id, "OrderLookupFind");
    if (OrderLookupFindIn != null) {
      Integer index =  OrderLookupFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("OrderLookup", OrderLookupObjectHelper.toMap(OrderLookupFindIn, new HashMap(), "OrderLookup").get("OrderLookup"));
    }
  }

/**
 *
 * Retrieves the OrderLookupObjectDataList that results from the OrderLookupFindRequest call
 * @return OrderLookupObjectDataList resulting from udt call
 *
 */

  public OrderLookupObjectDataList getOutput() {
    return OrderLookupObjectHelper.fromMapList(outputMap, "OrderLookupList");
  }
}
