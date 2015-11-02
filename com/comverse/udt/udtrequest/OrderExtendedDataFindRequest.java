/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderExtendedDataFindRequest.java
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
 * Class used to create a OrderExtendedDataFindRequest Udt Request
 *
 */

public class OrderExtendedDataFindRequest extends OrderRequest {
/**
 *
 * Constructor to create a  OrderExtendedDataFindRequest
 * @param id Unique request name
 * @param OrderEDFindIn OrderObjectKeyData for OrderExtendedDataFindRequest
 *
 */
@JsonCreator
  public OrderExtendedDataFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Order")OrderObjectKeyData OrderEDFindIn) {
    super(id, "OrderExtendedDataFind");
    if (OrderEDFindIn != null) {
      addInput("Order", OrderObjectKeyHelper.toMap(OrderEDFindIn, new HashMap(), "OrderObjectKeyData").get("OrderObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the OrderEDObjectDataList that results from the OrderExtendedDataFindRequest call
 * @return OrderEDObjectDataList resulting from udt call
 *
 */

  public OrderEDObjectDataList getOutput() {
    return OrderEDObjectHelper.fromMapList(outputMap, "OrderExtendedDataList");
  }
}
