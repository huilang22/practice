/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedNrcDeleteRequest.java
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
 * Class used to create a OrderedNrcDeleteRequest Udt Request
 *
 */

public class OrderedNrcDeleteRequest extends OrderedNrcSubRequestParent {
/**
 *
 * Constructor to create a  OrderedNrcDeleteRequest
 * @param id Unique request name
 * @param ondNrcIn NrcObjectData for OrderedNrcDeleteRequest
 * @param ondOrderIn OrderObjectData for OrderedNrcDeleteRequest
 * @param ondServiceOrderIn ServiceOrderObjectData for OrderedNrcDeleteRequest
 * @param ondFindExistingSOIn Boolean for OrderedNrcDeleteRequest
 * @param ondVerboseResponseIn Boolean for OrderedNrcDeleteRequest
 *
 */
@JsonCreator
  public OrderedNrcDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("Nrc")NrcObjectData ondNrcIn, @JsonProperty("Order")OrderObjectData ondOrderIn, @JsonProperty("ServiceOrder")ServiceOrderObjectData ondServiceOrderIn, @JsonProperty("FindExistingSO")Boolean ondFindExistingSOIn, @JsonProperty("VerboseResponse")Boolean ondVerboseResponseIn) {
    super(id, "OrderedNrcDelete");
    if (ondNrcIn != null) {
      addInput("Nrc", NrcObjectHelper.toMap(ondNrcIn, new HashMap(), "OrderedNrcDeleteOutputData").get("OrderedNrcDeleteOutputData"));
    }
    if (ondOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(ondOrderIn, new HashMap(), "OrderedNrcDeleteOutputData").get("OrderedNrcDeleteOutputData"));
    }
    if (ondServiceOrderIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(ondServiceOrderIn, new HashMap(), "OrderedNrcDeleteOutputData").get("OrderedNrcDeleteOutputData"));
    }
    if (ondFindExistingSOIn != null) {
      addInput("FindExistingSO", ondFindExistingSOIn);
    }
    if (ondVerboseResponseIn != null) {
      addInput("VerboseResponse", ondVerboseResponseIn);
    }
  }

/**
 *
 * Retrieves the OrderedNrcDeleteOutputData that results from the OrderedNrcDeleteRequest call
 * @return OrderedNrcDeleteOutputData resulting from udt call
 *
 */

  public OrderedNrcDeleteOutputData getOutput() {
    return OrderedNrcDeleteOutputHelper.fromMap(outputMap);
  }
}
