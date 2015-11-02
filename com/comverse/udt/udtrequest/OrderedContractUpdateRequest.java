/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedContractUpdateRequest.java
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
 * Class used to create a OrderedContractUpdateRequest Udt Request
 *
 */

public class OrderedContractUpdateRequest extends OrderedContractSubRequestParent {
/**
 *
 * Constructor to create a  OrderedContractUpdateRequest
 * @param id Unique request name
 * @param ocuContractIn CustomerContractObjectData for OrderedContractUpdateRequest
 * @param ocuOrderIn OrderObjectData for OrderedContractUpdateRequest
 * @param ocuServiceOrderIn ServiceOrderObjectData for OrderedContractUpdateRequest
 * @param EffectiveDt Date for OrderedContractUpdateRequest
 * @param ocuFindExistingSO Boolean for OrderedContractUpdateRequest
 * @param ocuVerboseResponse Boolean for OrderedContractUpdateRequest
 *
 */
@JsonCreator
  public OrderedContractUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerContract")CustomerContractObjectData ocuContractIn, @JsonProperty("Order")OrderObjectData ocuOrderIn, @JsonProperty("ServiceOrder")ServiceOrderObjectData ocuServiceOrderIn, @JsonProperty("EffectiveDt")Date EffectiveDt, @JsonProperty("FindExistingSO")Boolean ocuFindExistingSO, @JsonProperty("VerboseResponse")Boolean ocuVerboseResponse) {
    super(id, "OrderedContractUpdate");
    if (ocuContractIn != null) {
      addInput("CustomerContract", CustomerContractObjectHelper.toMap(ocuContractIn, new HashMap(), "OrderedContractUpdateOutputData").get("OrderedContractUpdateOutputData"));
    }
    if (ocuOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(ocuOrderIn, new HashMap(), "OrderedContractUpdateOutputData").get("OrderedContractUpdateOutputData"));
    }
    if (ocuServiceOrderIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(ocuServiceOrderIn, new HashMap(), "OrderedContractUpdateOutputData").get("OrderedContractUpdateOutputData"));
    }
    if (EffectiveDt != null) {
      addInput("EffectiveDt", EffectiveDt);
    }
    if (ocuFindExistingSO != null) {
      addInput("FindExistingSO", ocuFindExistingSO);
    }
    if (ocuVerboseResponse != null) {
      addInput("VerboseResponse", ocuVerboseResponse);
    }
  }

/**
 *
 * Retrieves the OrderedContractUpdateOutputData that results from the OrderedContractUpdateRequest call
 * @return OrderedContractUpdateOutputData resulting from udt call
 *
 */

  public OrderedContractUpdateOutputData getOutput() {
    return OrderedContractUpdateOutputHelper.fromMap(outputMap);
  }
}
