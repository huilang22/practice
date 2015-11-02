/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedNrcUpdateRequest.java
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
 * Class used to create a OrderedNrcUpdateRequest Udt Request
 *
 */

public class OrderedNrcUpdateRequest extends OrderedNrcSubRequestParent {
/**
 *
 * Constructor to create a  OrderedNrcUpdateRequest
 * @param id Unique request name
 * @param onuNrcIn NrcObjectData for OrderedNrcUpdateRequest
 * @param onuOrderIn OrderObjectData for OrderedNrcUpdateRequest
 * @param onuServiceOrderIn ServiceOrderObjectData for OrderedNrcUpdateRequest
 * @param EffectiveDt Date for OrderedNrcUpdateRequest
 * @param onuFindExistingSOIn Boolean for OrderedNrcUpdateRequest
 * @param onuVerboseResponseIn Boolean for OrderedNrcUpdateRequest
 *
 */
@JsonCreator
  public OrderedNrcUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Nrc")NrcObjectData onuNrcIn, @JsonProperty("Order")OrderObjectData onuOrderIn, @JsonProperty("ServiceOrder")ServiceOrderObjectData onuServiceOrderIn, @JsonProperty("EffectiveDt")Date EffectiveDt, @JsonProperty("FindExistingSO")Boolean onuFindExistingSOIn, @JsonProperty("VerboseResponse")Boolean onuVerboseResponseIn) {
    super(id, "OrderedNrcUpdate");
    if (onuNrcIn != null) {
      addInput("Nrc", NrcObjectHelper.toMap(onuNrcIn, new HashMap(), "OrderedNrcUpdateOutputData").get("OrderedNrcUpdateOutputData"));
    }
    if (onuOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(onuOrderIn, new HashMap(), "OrderedNrcUpdateOutputData").get("OrderedNrcUpdateOutputData"));
    }
    if (onuServiceOrderIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(onuServiceOrderIn, new HashMap(), "OrderedNrcUpdateOutputData").get("OrderedNrcUpdateOutputData"));
    }
    if (EffectiveDt != null) {
      addInput("EffectiveDt", EffectiveDt);
    }
    if (onuFindExistingSOIn != null) {
      addInput("FindExistingSO", onuFindExistingSOIn);
    }
    if (onuVerboseResponseIn != null) {
      addInput("VerboseResponse", onuVerboseResponseIn);
    }
  }

/**
 *
 * Retrieves the OrderedNrcUpdateOutputData that results from the OrderedNrcUpdateRequest call
 * @return OrderedNrcUpdateOutputData resulting from udt call
 *
 */

  public OrderedNrcUpdateOutputData getOutput() {
    return OrderedNrcUpdateOutputHelper.fromMap(outputMap);
  }
}
