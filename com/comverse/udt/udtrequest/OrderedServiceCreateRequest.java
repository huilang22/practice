/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedServiceCreateRequest.java
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
 * Class used to create a OrderedServiceCreateRequest Udt Request
 *
 */

public class OrderedServiceCreateRequest extends OrderedServiceSubRequestParent {
/**
 *
 * Constructor to create a  OrderedServiceCreateRequest
 * @param id Unique request name
 * @param oscServiceIn ServiceObjectData for OrderedServiceCreateRequest
 * @param oscOrderIn OrderObjectData for OrderedServiceCreateRequest
 * @param oscVerboseResponse Boolean for OrderedServiceCreateRequest
 *
 */
@JsonCreator
  public OrderedServiceCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Service")ServiceObjectData oscServiceIn, @JsonProperty("Order")OrderObjectData oscOrderIn, @JsonProperty("VerboseResponse")Boolean oscVerboseResponse) {
    super(id, "OrderedServiceCreate");
    if (oscServiceIn != null) {
      addInput("Service", ServiceObjectHelper.toMap(oscServiceIn, new HashMap(), "OrderedServiceCreateOutputData").get("OrderedServiceCreateOutputData"));
    }
    if (oscOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(oscOrderIn, new HashMap(), "OrderedServiceCreateOutputData").get("OrderedServiceCreateOutputData"));
    }
    if (oscVerboseResponse != null) {
      addInput("VerboseResponse", oscVerboseResponse);
    }
  }

/**
 *
 * Retrieves the OrderedServiceCreateOutputData that results from the OrderedServiceCreateRequest call
 * @return OrderedServiceCreateOutputData resulting from udt call
 *
 */

  public OrderedServiceCreateOutputData getOutput() {
    return OrderedServiceCreateOutputHelper.fromMap(outputMap);
  }
}
