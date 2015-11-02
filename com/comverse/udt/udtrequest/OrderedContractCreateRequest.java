/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedContractCreateRequest.java
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
 * Class used to create a OrderedContractCreateRequest Udt Request
 *
 */

public class OrderedContractCreateRequest extends OrderedContractSubRequestParent {
/**
 *
 * Constructor to create a  OrderedContractCreateRequest
 * @param id Unique request name
 * @param occContractIn CustomerContractObjectData for OrderedContractCreateRequest
 * @param occOrderIn OrderObjectData for OrderedContractCreateRequest
 * @param occServiceOrderIn ServiceOrderObjectData for OrderedContractCreateRequest
 * @param WaiveActivation Boolean for OrderedContractCreateRequest
 * @param occFindExistingSO Boolean for OrderedContractCreateRequest
 * @param occVerboseResponse Boolean for OrderedContractCreateRequest
 *
 */
@JsonCreator
  public OrderedContractCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerContract")CustomerContractObjectData occContractIn, @JsonProperty("Order")OrderObjectData occOrderIn, @JsonProperty("ServiceOrder")ServiceOrderObjectData occServiceOrderIn, @JsonProperty("WaiveActivation")Boolean WaiveActivation, @JsonProperty("FindExistingSO")Boolean occFindExistingSO, @JsonProperty("VerboseResponse")Boolean occVerboseResponse) {
    super(id, "OrderedContractCreate");
    if (occContractIn != null) {
      addInput("CustomerContract", CustomerContractObjectHelper.toMap(occContractIn, new HashMap(), "OrderedContractCreateOutputData").get("OrderedContractCreateOutputData"));
    }
    if (occOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(occOrderIn, new HashMap(), "OrderedContractCreateOutputData").get("OrderedContractCreateOutputData"));
    }
    if (occServiceOrderIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(occServiceOrderIn, new HashMap(), "OrderedContractCreateOutputData").get("OrderedContractCreateOutputData"));
    }
    if (WaiveActivation != null) {
      addInput("WaiveActivation", WaiveActivation);
    }
    if (occFindExistingSO != null) {
      addInput("FindExistingSO", occFindExistingSO);
    }
    if (occVerboseResponse != null) {
      addInput("VerboseResponse", occVerboseResponse);
    }
  }

/**
 *
 * Retrieves the OrderedContractCreateOutputData that results from the OrderedContractCreateRequest call
 * @return OrderedContractCreateOutputData resulting from udt call
 *
 */

  public OrderedContractCreateOutputData getOutput() {
    return OrderedContractCreateOutputHelper.fromMap(outputMap);
  }
}
