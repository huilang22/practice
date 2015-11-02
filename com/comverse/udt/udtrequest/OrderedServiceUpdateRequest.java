/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedServiceUpdateRequest.java
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
 * Class used to create a OrderedServiceUpdateRequest Udt Request
 *
 */

public class OrderedServiceUpdateRequest extends OrderedServiceSubRequestParent {
/**
 *
 * Constructor to create a  OrderedServiceUpdateRequest
 * @param id Unique request name
 * @param osUpdateServiceIn ServiceObjectData for OrderedServiceUpdateRequest
 * @param osUpdateOrderIn OrderObjectData for OrderedServiceUpdateRequest
 * @param osUpdateServiceOrderIn ServiceOrderObjectData for OrderedServiceUpdateRequest
 * @param EffectiveDt Date for OrderedServiceUpdateRequest
 * @param osuFindExistingSO Boolean for OrderedServiceUpdateRequest
 * @param osuVerboseResponse Boolean for OrderedServiceUpdateRequest
 *
 */
@JsonCreator
  public OrderedServiceUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Service")ServiceObjectData osUpdateServiceIn, @JsonProperty("Order")OrderObjectData osUpdateOrderIn, @JsonProperty("ServiceOrder")ServiceOrderObjectData osUpdateServiceOrderIn, @JsonProperty("EffectiveDt")Date EffectiveDt, @JsonProperty("FindExistingSO")Boolean osuFindExistingSO, @JsonProperty("VerboseResponse")Boolean osuVerboseResponse) {
    super(id, "OrderedServiceUpdate");
    if (osUpdateServiceIn != null) {
      addInput("Service", ServiceObjectHelper.toMap(osUpdateServiceIn, new HashMap(), "OrderedServiceUpdateOutputData").get("OrderedServiceUpdateOutputData"));
    }
    if (osUpdateOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(osUpdateOrderIn, new HashMap(), "OrderedServiceUpdateOutputData").get("OrderedServiceUpdateOutputData"));
    }
    if (osUpdateServiceOrderIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(osUpdateServiceOrderIn, new HashMap(), "OrderedServiceUpdateOutputData").get("OrderedServiceUpdateOutputData"));
    }
    if (EffectiveDt != null) {
      addInput("EffectiveDt", EffectiveDt);
    }
    if (osuFindExistingSO != null) {
      addInput("FindExistingSO", osuFindExistingSO);
    }
    if (osuVerboseResponse != null) {
      addInput("VerboseResponse", osuVerboseResponse);
    }
  }

/**
 *
 * Retrieves the OrderedServiceUpdateOutputData that results from the OrderedServiceUpdateRequest call
 * @return OrderedServiceUpdateOutputData resulting from udt call
 *
 */

  public OrderedServiceUpdateOutputData getOutput() {
    return OrderedServiceUpdateOutputHelper.fromMap(outputMap);
  }
}
