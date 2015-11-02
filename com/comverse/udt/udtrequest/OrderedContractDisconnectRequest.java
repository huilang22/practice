/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedContractDisconnectRequest.java
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
 * Class used to create a OrderedContractDisconnectRequest Udt Request
 *
 */

public class OrderedContractDisconnectRequest extends OrderedContractSubRequestParent {
/**
 *
 * Constructor to create a  OrderedContractDisconnectRequest
 * @param id Unique request name
 * @param ocdContractIn CustomerContractObjectData for OrderedContractDisconnectRequest
 * @param ocdOrderIn OrderObjectData for OrderedContractDisconnectRequest
 * @param ocdServiceOrderIn ServiceOrderObjectData for OrderedContractDisconnectRequest
 * @param WaiveTermination Boolean for OrderedContractDisconnectRequest
 * @param WaiveUnmetObligation Boolean for OrderedContractDisconnectRequest
 * @param InactiveDt Date for OrderedContractDisconnectRequest
 * @param ocdFindExistingSO Boolean for OrderedContractDisconnectRequest
 * @param ocdVerboseResponse Boolean for OrderedContractDisconnectRequest
 *
 */
@JsonCreator
  public OrderedContractDisconnectRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerContract")CustomerContractObjectData ocdContractIn, @JsonProperty("Order")OrderObjectData ocdOrderIn, @JsonProperty("ServiceOrder")ServiceOrderObjectData ocdServiceOrderIn, @JsonProperty("WaiveTermination")Boolean WaiveTermination, @JsonProperty("WaiveUnmetObligation")Boolean WaiveUnmetObligation, @JsonProperty("InactiveDt")Date InactiveDt, @JsonProperty("FindExistingSO")Boolean ocdFindExistingSO, @JsonProperty("VerboseResponse")Boolean ocdVerboseResponse) {
    super(id, "OrderedContractDisconnect");
    if (ocdContractIn != null) {
      addInput("CustomerContract", CustomerContractObjectHelper.toMap(ocdContractIn, new HashMap(), "OrderedContractDisconnectOutputData").get("OrderedContractDisconnectOutputData"));
    }
    if (ocdOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(ocdOrderIn, new HashMap(), "OrderedContractDisconnectOutputData").get("OrderedContractDisconnectOutputData"));
    }
    if (ocdServiceOrderIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(ocdServiceOrderIn, new HashMap(), "OrderedContractDisconnectOutputData").get("OrderedContractDisconnectOutputData"));
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
    if (ocdFindExistingSO != null) {
      addInput("FindExistingSO", ocdFindExistingSO);
    }
    if (ocdVerboseResponse != null) {
      addInput("VerboseResponse", ocdVerboseResponse);
    }
  }

/**
 *
 * Retrieves the OrderedContractDisconnectOutputData that results from the OrderedContractDisconnectRequest call
 * @return OrderedContractDisconnectOutputData resulting from udt call
 *
 */

  public OrderedContractDisconnectOutputData getOutput() {
    return OrderedContractDisconnectOutputHelper.fromMap(outputMap);
  }
}
