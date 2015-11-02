/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedProductCreateRequest.java
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
 * Class used to create a OrderedProductCreateRequest Udt Request
 *
 */

public class OrderedProductCreateRequest extends OrderedProductSubRequestParent {
/**
 *
 * Constructor to create a  OrderedProductCreateRequest
 * @param id Unique request name
 * @param opcProductIn ProductObjectData for OrderedProductCreateRequest
 * @param opcOrderIn OrderObjectData for OrderedProductCreateRequest
 * @param opcServiceOrderIn ServiceOrderObjectData for OrderedProductCreateRequest
 * @param opcFindExistingSOIn Boolean for OrderedProductCreateRequest
 * @param opcVerboseResponseIn Boolean for OrderedProductCreateRequest
 *
 */
@JsonCreator
  public OrderedProductCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Product")ProductObjectData opcProductIn, @JsonProperty("Order")OrderObjectData opcOrderIn, @JsonProperty("ServiceOrder")ServiceOrderObjectData opcServiceOrderIn, @JsonProperty("FindExistingSO")Boolean opcFindExistingSOIn, @JsonProperty("VerboseResponse")Boolean opcVerboseResponseIn) {
    super(id, "OrderedProductCreate");
    if (opcProductIn != null) {
      addInput("Product", ProductObjectHelper.toMap(opcProductIn, new HashMap(), "OrderedProductCreateOutputData").get("OrderedProductCreateOutputData"));
    }
    if (opcOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(opcOrderIn, new HashMap(), "OrderedProductCreateOutputData").get("OrderedProductCreateOutputData"));
    }
    if (opcServiceOrderIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(opcServiceOrderIn, new HashMap(), "OrderedProductCreateOutputData").get("OrderedProductCreateOutputData"));
    }
    if (opcFindExistingSOIn != null) {
      addInput("FindExistingSO", opcFindExistingSOIn);
    }
    if (opcVerboseResponseIn != null) {
      addInput("VerboseResponse", opcVerboseResponseIn);
    }
  }

/**
 *
 * Retrieves the OrderedProductCreateOutputData that results from the OrderedProductCreateRequest call
 * @return OrderedProductCreateOutputData resulting from udt call
 *
 */

  public OrderedProductCreateOutputData getOutput() {
    return OrderedProductCreateOutputHelper.fromMap(outputMap);
  }
}
