/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedProductUpdateRequest.java
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
 * Class used to create a OrderedProductUpdateRequest Udt Request
 *
 */

public class OrderedProductUpdateRequest extends OrderedProductSubRequestParent {
/**
 *
 * Constructor to create a  OrderedProductUpdateRequest
 * @param id Unique request name
 * @param opuProductIn ProductObjectData for OrderedProductUpdateRequest
 * @param opuOrderIn OrderObjectData for OrderedProductUpdateRequest
 * @param opuServiceOrderIn ServiceOrderObjectData for OrderedProductUpdateRequest
 * @param opuFindExistingSOIn Boolean for OrderedProductUpdateRequest
 * @param opuVerboseResponseIn Boolean for OrderedProductUpdateRequest
 * @param opuEffectiveDtIn Date for OrderedProductUpdateRequest
 *
 */
@JsonCreator
  public OrderedProductUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Product")ProductObjectData opuProductIn, @JsonProperty("Order")OrderObjectData opuOrderIn, @JsonProperty("ServiceOrder")ServiceOrderObjectData opuServiceOrderIn, @JsonProperty("FindExistingSO")Boolean opuFindExistingSOIn, @JsonProperty("VerboseResponse")Boolean opuVerboseResponseIn, @JsonProperty("EffectiveDt")Date opuEffectiveDtIn) {
    super(id, "OrderedProductUpdate");
    if (opuProductIn != null) {
      addInput("Product", ProductObjectHelper.toMap(opuProductIn, new HashMap(), "OrderedProductUpdateOutputData").get("OrderedProductUpdateOutputData"));
    }
    if (opuOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(opuOrderIn, new HashMap(), "OrderedProductUpdateOutputData").get("OrderedProductUpdateOutputData"));
    }
    if (opuServiceOrderIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(opuServiceOrderIn, new HashMap(), "OrderedProductUpdateOutputData").get("OrderedProductUpdateOutputData"));
    }
    if (opuFindExistingSOIn != null) {
      addInput("FindExistingSO", opuFindExistingSOIn);
    }
    if (opuVerboseResponseIn != null) {
      addInput("VerboseResponse", opuVerboseResponseIn);
    }
    if (opuEffectiveDtIn != null) {
      addInput("EffectiveDt", opuEffectiveDtIn);
    }
  }

/**
 *
 * Retrieves the OrderedProductUpdateOutputData that results from the OrderedProductUpdateRequest call
 * @return OrderedProductUpdateOutputData resulting from udt call
 *
 */

  public OrderedProductUpdateOutputData getOutput() {
    return OrderedProductUpdateOutputHelper.fromMap(outputMap);
  }
}
