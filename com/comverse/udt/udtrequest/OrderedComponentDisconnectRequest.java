/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedComponentDisconnectRequest.java
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
 * Class used to create a OrderedComponentDisconnectRequest Udt Request
 *
 */

public class OrderedComponentDisconnectRequest extends OrderedComponentSubRequestParent {
/**
 *
 * Constructor to create a  OrderedComponentDisconnectRequest
 * @param id Unique request name
 * @param oCdComponentIn ComponentObjectData for OrderedComponentDisconnectRequest
 * @param oCdOrderIn OrderObjectData for OrderedComponentDisconnectRequest
 * @param oCdServiceOrderIn ServiceOrderObjectData for OrderedComponentDisconnectRequest
 * @param WaiveTermination Boolean for OrderedComponentDisconnectRequest
 * @param WaiveUnmetObligation Boolean for OrderedComponentDisconnectRequest
 * @param InactiveDt Date for OrderedComponentDisconnectRequest
 * @param oCdFindExistingSO Boolean for OrderedComponentDisconnectRequest
 * @param oCdVerboseResponse Boolean for OrderedComponentDisconnectRequest
 *
 */
@JsonCreator
  public OrderedComponentDisconnectRequest(@JsonProperty("RequestId") String id, @JsonProperty("Component")ComponentObjectData oCdComponentIn, @JsonProperty("Order")OrderObjectData oCdOrderIn, @JsonProperty("ServiceOrder")ServiceOrderObjectData oCdServiceOrderIn, @JsonProperty("WaiveTermination")Boolean WaiveTermination, @JsonProperty("WaiveUnmetObligation")Boolean WaiveUnmetObligation, @JsonProperty("InactiveDt")Date InactiveDt, @JsonProperty("FindExistingSO")Boolean oCdFindExistingSO, @JsonProperty("VerboseResponse")Boolean oCdVerboseResponse) {
    super(id, "OrderedComponentDisconnect");
    if (oCdComponentIn != null) {
      addInput("Component", ComponentObjectHelper.toMap(oCdComponentIn, new HashMap(), "OrderedComponentDisconnectOutputData").get("OrderedComponentDisconnectOutputData"));
    }
    if (oCdOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(oCdOrderIn, new HashMap(), "OrderedComponentDisconnectOutputData").get("OrderedComponentDisconnectOutputData"));
    }
    if (oCdServiceOrderIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(oCdServiceOrderIn, new HashMap(), "OrderedComponentDisconnectOutputData").get("OrderedComponentDisconnectOutputData"));
    }
    if (WaiveTermination != null) {
      addInput("WaiveTermination", WaiveTermination);
    }
    if (WaiveUnmetObligation != null) {
      addInput("WaiveUnmetObligation", WaiveUnmetObligation);
    }
    if (InactiveDt != null) {
      addInput("InactiveDt", InactiveDt);
    }
    if (oCdFindExistingSO != null) {
      addInput("FindExistingSO", oCdFindExistingSO);
    }
    if (oCdVerboseResponse != null) {
      addInput("VerboseResponse", oCdVerboseResponse);
    }
  }

/**
 *
 * Retrieves the OrderedComponentDisconnectOutputData that results from the OrderedComponentDisconnectRequest call
 * @return OrderedComponentDisconnectOutputData resulting from udt call
 *
 */

  public OrderedComponentDisconnectOutputData getOutput() {
    return OrderedComponentDisconnectOutputHelper.fromMap(outputMap);
  }
}
