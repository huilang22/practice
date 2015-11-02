/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedProductDisconnectRequest.java
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
 * Class used to create a OrderedProductDisconnectRequest Udt Request
 *
 */

public class OrderedProductDisconnectRequest extends OrderedProductSubRequestParent {
/**
 *
 * Constructor to create a  OrderedProductDisconnectRequest
 * @param id Unique request name
 * @param opdProductIn ProductObjectData for OrderedProductDisconnectRequest
 * @param opdOrderIn OrderObjectData for OrderedProductDisconnectRequest
 * @param opdServiceOrderIn ServiceOrderObjectData for OrderedProductDisconnectRequest
 * @param InactiveDt Date for OrderedProductDisconnectRequest
 * @param opdFindExistingSOIn Boolean for OrderedProductDisconnectRequest
 * @param opdVerboseResponseIn Boolean for OrderedProductDisconnectRequest
 *
 */
@JsonCreator
  public OrderedProductDisconnectRequest(@JsonProperty("RequestId") String id, @JsonProperty("Product")ProductObjectData opdProductIn, @JsonProperty("Order")OrderObjectData opdOrderIn, @JsonProperty("ServiceOrder")ServiceOrderObjectData opdServiceOrderIn, @JsonProperty("InactiveDt")Date InactiveDt, @JsonProperty("FindExistingSO")Boolean opdFindExistingSOIn, @JsonProperty("VerboseResponse")Boolean opdVerboseResponseIn) {
    super(id, "OrderedProductDisconnect");
    if (opdProductIn != null) {
      addInput("Product", ProductObjectHelper.toMap(opdProductIn, new HashMap(), "OrderedProductDisconnectOutputData").get("OrderedProductDisconnectOutputData"));
    }
    if (opdOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(opdOrderIn, new HashMap(), "OrderedProductDisconnectOutputData").get("OrderedProductDisconnectOutputData"));
    }
    if (opdServiceOrderIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(opdServiceOrderIn, new HashMap(), "OrderedProductDisconnectOutputData").get("OrderedProductDisconnectOutputData"));
    }
    if (InactiveDt != null) {
      addInput("InactiveDt", InactiveDt);
    }
    if (opdFindExistingSOIn != null) {
      addInput("FindExistingSO", opdFindExistingSOIn);
    }
    if (opdVerboseResponseIn != null) {
      addInput("VerboseResponse", opdVerboseResponseIn);
    }
  }

/**
 *
 * Retrieves the OrderedProductDisconnectOutputData that results from the OrderedProductDisconnectRequest call
 * @return OrderedProductDisconnectOutputData resulting from udt call
 *
 */

  public OrderedProductDisconnectOutputData getOutput() {
    return OrderedProductDisconnectOutputHelper.fromMap(outputMap);
  }
}
