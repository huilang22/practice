/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedNrcCreateRequest.java
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
 * Class used to create a OrderedNrcCreateRequest Udt Request
 *
 */

public class OrderedNrcCreateRequest extends OrderedNrcSubRequestParent {
/**
 *
 * Constructor to create a  OrderedNrcCreateRequest
 * @param id Unique request name
 * @param oncNrcIn NrcObjectData for OrderedNrcCreateRequest
 * @param oncOrderIn OrderObjectData for OrderedNrcCreateRequest
 * @param oncServiceOrderIn ServiceOrderObjectData for OrderedNrcCreateRequest
 * @param oncFindExistingSOIn Boolean for OrderedNrcCreateRequest
 * @param oncVerboseResponseIn Boolean for OrderedNrcCreateRequest
 *
 */
@JsonCreator
  public OrderedNrcCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Nrc")NrcObjectData oncNrcIn, @JsonProperty("Order")OrderObjectData oncOrderIn, @JsonProperty("ServiceOrder")ServiceOrderObjectData oncServiceOrderIn, @JsonProperty("FindExistingSO")Boolean oncFindExistingSOIn, @JsonProperty("VerboseResponse")Boolean oncVerboseResponseIn) {
    super(id, "OrderedNrcCreate");
    if (oncNrcIn != null) {
      addInput("Nrc", NrcObjectHelper.toMap(oncNrcIn, new HashMap(), "OrderedNrcCreateOutputData").get("OrderedNrcCreateOutputData"));
    }
    if (oncOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(oncOrderIn, new HashMap(), "OrderedNrcCreateOutputData").get("OrderedNrcCreateOutputData"));
    }
    if (oncServiceOrderIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(oncServiceOrderIn, new HashMap(), "OrderedNrcCreateOutputData").get("OrderedNrcCreateOutputData"));
    }
    if (oncFindExistingSOIn != null) {
      addInput("FindExistingSO", oncFindExistingSOIn);
    }
    if (oncVerboseResponseIn != null) {
      addInput("VerboseResponse", oncVerboseResponseIn);
    }
  }

/**
 *
 * Retrieves the OrderedNrcCreateOutputData that results from the OrderedNrcCreateRequest call
 * @return OrderedNrcCreateOutputData resulting from udt call
 *
 */

  public OrderedNrcCreateOutputData getOutput() {
    return OrderedNrcCreateOutputHelper.fromMap(outputMap);
  }
}
